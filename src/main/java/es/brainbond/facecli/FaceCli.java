/*
 * Copyright (C) 2015 Brainbond Ingeniería Informática SL.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.brainbond.facecli;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import es.brainbond.facecli.config.FaceCliConfiguration;
import es.brainbond.facecli.face.FaceService;

public class FaceCli {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(FaceCliConfiguration.class);
        app.setShowBanner(false);
        ApplicationContext ctx = app.run(args);
        
        FaceService faceService = ctx.getBean(FaceService.class);
        
        if (!validarOpciones(args)) {
            ayuda();
            System.exit(1);
        }
        
        switch (args[0]) {
        case "enviarFactura":
            faceService.printEnviarFacturaResponse(
                    faceService.enviarFactura(args[1], args[2]));
            break;
            
        case "consultarFactura":
            faceService.printConsultarFacturaResponse(
                    faceService.consultarFactura(args[1]));
            break;

        case "anularFactura":
            faceService.printAnularFacturaResponse(
                    faceService.anularFactura(args[1], args[2]));
            break;
            
        case "estados":
            faceService.printConsultarEstadosResponse(
                    faceService.estados());
            break;
            
        case "unidades":
            faceService.printConsultarRelacionesResponse(
                    faceService.unidades());
            break;
            
        case "administraciones":
            faceService.printConsultarAdminitracionesResponse(
                    faceService.administraciones());
            break;
            
        case "unidadesPorAdministracion":
            faceService.printConsultarRelacionesPorAdministracionResponse(
                    faceService.unidadesPorAdministracion(args[1]));
            break;
            
        case "consultarListadoFacturas":
            faceService.printConsultarListadoFacturaResponse(
                    faceService.consultarListadoFacturas(
                            splitCodigosRegistro(args[1])));
            break;
            
        case "ayuda":
            ayuda();
            break;
        }
    }
    
    private static boolean validarOpciones(String[] args) {
        if (args.length < 1) {
            return false;
        }
        
        switch (args[0]) {
        case "enviarFactura":
            if (args.length != 3) {
                return false;
            }
            
            if (!args[2].endsWith(".xsig")) {
                return false;
            }
            
            return true;
            
        case "consultarFactura":
            return args.length == 2;

        case "anularFactura":
            if (args.length != 3) {
                return false;
            }
            
            if (args[2].length() > 255) {
                return false;
            }
            
            return true;
            
        case "estados":
            return args.length == 1;
            
        case "unidades":
            return args.length == 1;
            
        case "administraciones":
            return args.length == 1;
            
        case "unidadesPorAdministracion":
            return args.length == 2;
            
        case "consultarListadoFacturas":
            if (args.length != 2) {
                return false;
            }
            
            int numeroFacturas = splitCodigosRegistro(args[1]).size();
            
            if (numeroFacturas < 1 || numeroFacturas > 500) {
                return false;
            }
            
            return true;
            
        case "ayuda":
            return args.length == 1;
            
        default:
            return false;
        }
    }
    
    private static List<String> splitCodigosRegistro(String codigosRegistro) {
        return Arrays.asList(codigosRegistro.split(","));
    }
    
    private static void ayuda() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("Uso de la aplicación:\n\n");
        sb.append("face-cli\n");
        sb.append("    enviarFactura <correo> <factura.xsig>\n");
        sb.append("    consultarFactura <codigoRegistro>\n");
        sb.append("    anularFactura <numeroRegistro> <motivo>\n");
        sb.append("    estados\n");
        sb.append("    unidades\n");
        sb.append("    administraciones\n");
        sb.append("    unidadesPorAdministracion <codigoDir>\n");
        sb.append("    consultarListadoFacturas <numeroRegistro1,...>\n");
        sb.append("    ayuda\n");
        
        System.out.print(sb.toString());
    }
}
