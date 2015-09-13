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

package es.brainbond.facecli.face;

import java.util.List;

import es.brainbond.facecli.face.generated.ArrayOfSSPPResultadoConsultarFactura;
import es.brainbond.facecli.face.generated.ArrayOfSSPPUnidadDir;
import es.brainbond.facecli.face.generated.SSPPEstados;
import es.brainbond.facecli.face.generated.SSPPResultadoAnularFactura;
import es.brainbond.facecli.face.generated.SSPPResultadoConsultarFactura;
import es.brainbond.facecli.face.generated.SSPPResultadoConsultarUnidades;
import es.brainbond.facecli.face.generated.SSPPResultadoEnviarFactura;

public interface FaceService {

    public SSPPResultadoEnviarFactura enviarFactura(
            String correo,
            String rutaFactura);
    
    public void printSSPPResultadoEnviarFactura(SSPPResultadoEnviarFactura response);
    
    public SSPPResultadoConsultarFactura consultarFactura(String codigoRegistro);
    
    public void printSSPPResultadoConsultarFactura(SSPPResultadoConsultarFactura response);
    
    public SSPPResultadoAnularFactura anularFactura(String numeroRegistro, String motivo);
    
    public void printSSPPResultadoAnularFactura(SSPPResultadoAnularFactura response);
    
    public SSPPEstados estados();
    
    public void printSSPPEstados(SSPPEstados response);
    
    public SSPPResultadoConsultarUnidades unidades();
    
    public void printSSPPResultadoConsultarUnidades(SSPPResultadoConsultarUnidades response);
    
    public ArrayOfSSPPUnidadDir administraciones();
    
    public void printArrayOfSSPPUnidadDir(ArrayOfSSPPUnidadDir response);
    
    public SSPPResultadoConsultarUnidades unidadesPorAdministracion(String codigoDir);

    public ArrayOfSSPPResultadoConsultarFactura consultarListadoFacturas(
            List<String> codigosRegistro);

    public void printArrayOfSSPPResultadoConsultarFactura(
            ArrayOfSSPPResultadoConsultarFactura response);
}
