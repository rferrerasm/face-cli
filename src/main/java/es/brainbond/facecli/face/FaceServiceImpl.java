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

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.brainbond.facecli.face.generated.AnularFacturaResponse;
import es.brainbond.facecli.face.generated.ConsultarAdminitracionesResponse;
import es.brainbond.facecli.face.generated.ConsultarEstadosResponse;
import es.brainbond.facecli.face.generated.ConsultarFacturaResponse;
import es.brainbond.facecli.face.generated.ConsultarListadoFactura;
import es.brainbond.facecli.face.generated.ConsultarListadoFacturaRequest;
import es.brainbond.facecli.face.generated.ConsultarListadoFacturaResponse;
import es.brainbond.facecli.face.generated.ConsultarRelacionesPorAdministracionResponse;
import es.brainbond.facecli.face.generated.ConsultarRelacionesResponse;
import es.brainbond.facecli.face.generated.EnviarFacturaRequest;
import es.brainbond.facecli.face.generated.EnviarFacturaResponse;
import es.brainbond.facecli.face.generated.Estado;
import es.brainbond.facecli.face.generated.FacturaFile;
import es.brainbond.facecli.face.generated.FacturaSSPPWebServiceProxyPort;
import es.brainbond.facecli.face.generated.OGUTOC;
import es.brainbond.facecli.face.generated.Resultado;
import es.brainbond.facecli.face.generated.UnidadDir3;

@Service
public class FaceServiceImpl implements FaceService {

    private FacturaSSPPWebServiceProxyPort face;
    
    @Autowired
    public FaceServiceImpl(FacturaSSPPWebServiceProxyPort face) {
        this.face = face;
    }
    
    @Override
    public EnviarFacturaResponse enviarFactura(String correo, String rutaFactura) {
        checkNotNull(correo);
        checkNotNull(rutaFactura);
        
        EnviarFacturaRequest request = new EnviarFacturaRequest();
        request.setCorreo(correo);
        
        Path path = Paths.get(rutaFactura);
        
        FacturaFile factura = new FacturaFile();
        factura.setFactura(toBase64(path));
        factura.setNombre(path.getFileName().toString());
        factura.setMime("application/xml");
        request.setFactura(factura);
        
        return face.enviarFactura(request);
    }
    
    private String toBase64(Path path) {
        try {
            return Base64.getEncoder().encodeToString(Files.readAllBytes(path));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printEnviarFacturaResponse(EnviarFacturaResponse response) {
        checkNotNull(response);
        
        System.out.println("Resultado envío factura:");
        
        StringBuilder sb = new StringBuilder();
        printResultado(response.getResultado(), sb);
        sb.append("    Factura:\n");
        sb.append("        Número registro: ");
        sb.append(response.getFactura().getNumeroRegistro());
        sb.append('\n');
        sb.append("        Órgano gestor: ");
        sb.append(response.getFactura().getOrganoGestor());
        sb.append('\n');
        sb.append("        Unidad tramitadora: ");
        sb.append(response.getFactura().getUnidadTramitadora());
        sb.append('\n');
        sb.append("        Oficina contable: ");
        sb.append(response.getFactura().getOficinaContable());
        sb.append('\n');
        sb.append("        Identificador emisor: ");
        sb.append(response.getFactura().getIdentificadorEmisor());
        sb.append('\n');
        sb.append("        Número factura: ");
        sb.append(response.getFactura().getNumeroFactura());
        sb.append('\n');
        sb.append("        Serie factura: ");
        sb.append(response.getFactura().getSerieFactura());
        sb.append('\n');
        sb.append("        Fecha recepción: ");
        sb.append(response.getFactura().getFechaRecepcion());
        sb.append('\n');
        
        System.out.print(sb.toString());
    }

    @Override
    public ConsultarFacturaResponse consultarFactura(String codigoRegistro) {
        checkNotNull(codigoRegistro);
        
        return face.consultarFactura(codigoRegistro);
    }

    @Override
    public void printConsultarFacturaResponse(ConsultarFacturaResponse response) {
        checkNotNull(response);
        
        System.out.println("Resultado consultar factura:");
        
        StringBuilder sb = new StringBuilder();
        printResultado(response.getResultado(), sb);
        sb.append("    Factura:\n");
        sb.append("        Número registro: ");
        sb.append(response.getFactura().getNumeroRegistro());
        sb.append('\n');
        sb.append("        Tramitación: \n");
        sb.append("            Código: ");
        sb.append(response.getFactura().getTramitacion().getCodigo());
        sb.append('\n');
        sb.append("            Descripción: ");
        sb.append(response.getFactura().getTramitacion().getDescripcion());
        sb.append('\n');
        sb.append("            Motivo: ");
        sb.append(response.getFactura().getTramitacion().getMotivo());
        sb.append('\n');
        sb.append("        Anulación: \n");
        sb.append("            Código: ");
        sb.append(response.getFactura().getTramitacion().getCodigo());
        sb.append('\n');
        sb.append("            Descripción: ");
        sb.append(response.getFactura().getTramitacion().getDescripcion());
        sb.append('\n');
        sb.append("            Motivo: ");
        sb.append(response.getFactura().getTramitacion().getMotivo());
        sb.append('\n');
        
        System.out.print(sb.toString());
    }
    
    @Override
    public AnularFacturaResponse anularFactura(String numeroRegistro, String motivo) {
        checkNotNull(numeroRegistro);
        checkNotNull(motivo);
        
        return face.anularFactura(numeroRegistro, motivo);
    }
    
    @Override
    public void printAnularFacturaResponse(AnularFacturaResponse response) {
        checkNotNull(response);
        
        System.out.println("Resultado anular factura:");
        
        StringBuilder sb = new StringBuilder();
        printResultado(response.getResultado(), sb);
        sb.append("    Factura:\n");
        sb.append("        Número registro: ");
        sb.append(response.getFactura().getNumeroRegistro());
        sb.append('\n');
        sb.append("        Mensaje: ");
        sb.append(response.getFactura().getMensaje());
        sb.append('\n');
        
        System.out.print(sb.toString());
    }
    
    @Override
    public ConsultarEstadosResponse estados() {
        return face.consultarEstados();
    }

    @Override
    public void printConsultarEstadosResponse(ConsultarEstadosResponse response) {
        checkNotNull(response);
        
        System.out.println("Estados:");
        
        StringBuilder sb = new StringBuilder();
        printResultado(response.getResultado(), sb);
        sb.append("    Estados:\n");
        
        for (Estado estado: response.getEstados().getEstado()) {
            sb.append("        ");
            sb.append(estado.getNombre());
            sb.append(", ");
            sb.append(estado.getCodigo());
            sb.append(", ");
            sb.append(estado.getDescripcion());
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }

    @Override
    public ConsultarRelacionesResponse unidades() {
        return face.consultarUnidades();
    }

    @Override
    public void printConsultarRelacionesResponse(ConsultarRelacionesResponse response) {
        checkNotNull(response);
        
        System.out.println("Unidades:");
        
        StringBuilder sb = new StringBuilder();
        printResultado(response.getResultado(), sb);
        sb.append("    Unidades:\n");
        
        for (OGUTOC unidad: response.getRelaciones().getRelacion()) {
            sb.append("        - Órgano Gestor: ");
            sb.append(unidad.getOrganoGestor().getCodigo());
            sb.append(", ");
            sb.append(unidad.getOrganoGestor().getNombre());
            sb.append('\n');
            sb.append("          Unidad Tramitadora: ");
            sb.append(unidad.getUnidadTramitadora().getCodigo());
            sb.append(", ");
            sb.append(unidad.getUnidadTramitadora().getNombre());
            sb.append('\n');
            sb.append("          Oficina Contable: ");
            sb.append(unidad.getOficinaContable().getCodigo());
            sb.append(", ");
            sb.append(unidad.getOficinaContable().getNombre());
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }

    @Override
    public ConsultarAdminitracionesResponse administraciones() {
        return face.consultarAdministraciones();
    }

    @Override
    public void printConsultarAdminitracionesResponse(ConsultarAdminitracionesResponse response) {
        checkNotNull(response);
        
        System.out.println("Administraciones:");
        
        StringBuilder sb = new StringBuilder();
        printResultado(response.getResultado(), sb);
        sb.append("    Administraciones:\n");
        
        for (UnidadDir3 unidad: response.getAdministraciones().getAdministracion()) {
            sb.append("        ");
            sb.append(unidad.getCodigo());
            sb.append(", ");
            sb.append(unidad.getNombre());
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }

    @Override
    public ConsultarRelacionesPorAdministracionResponse unidadesPorAdministracion(String codigoDir) {
        checkNotNull(codigoDir);
        
        return face.consultarUnidadesPorAdministracion(codigoDir);
    }

    @Override
    public void printConsultarRelacionesPorAdministracionResponse(
            ConsultarRelacionesPorAdministracionResponse response) {
        
        checkNotNull(response);
        
        System.out.println("Unidades:");
        
        StringBuilder sb = new StringBuilder();
        printResultado(response.getResultado(), sb);
        sb.append("    Unidades:\n");
        
        for (OGUTOC unidad: response.getRelaciones().getRelacion()) {
            sb.append("        - Órgano Gestor: ");
            sb.append(unidad.getOrganoGestor().getCodigo());
            sb.append(", ");
            sb.append(unidad.getOrganoGestor().getNombre());
            sb.append('\n');
            sb.append("          Unidad Tramitadora: ");
            sb.append(unidad.getUnidadTramitadora().getCodigo());
            sb.append(", ");
            sb.append(unidad.getUnidadTramitadora().getNombre());
            sb.append('\n');
            sb.append("          Oficina Contable: ");
            sb.append(unidad.getOficinaContable().getCodigo());
            sb.append(", ");
            sb.append(unidad.getOficinaContable().getNombre());
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }

    @Override
    public ConsultarListadoFacturaResponse consultarListadoFacturas(
            List<String> numerosRegistro) {
        
        checkNotNull(numerosRegistro);
        
        ConsultarListadoFacturaRequest request = new ConsultarListadoFacturaRequest();
        
        numerosRegistro.forEach(cr -> request.getNumeroRegistro().add(cr));
        
        return face.consultarListadoFacturas(request);
    }

    @Override
    public void printConsultarListadoFacturaResponse(
            ConsultarListadoFacturaResponse response) {
        
        checkNotNull(response);
        
        System.out.println("Resultado consultar facturas:");
        
        StringBuilder sb = new StringBuilder();
        printResultado(response.getResultado(), sb);
        sb.append("    Facturas:\n");
        
        for (ConsultarListadoFactura factura: response.getFacturas().getConsultarListadoFactura()) {
            sb.append("    - Código ");
            sb.append(factura.getCodigo());
            sb.append('\n');
            sb.append("      Descripción ");
            sb.append(factura.getDescripcion());
            sb.append('\n');
            sb.append("      Factura:\n");
            sb.append("          Número registro: ");
            sb.append(factura.getFactura().getNumeroRegistro());
            sb.append('\n');
            sb.append("          Tramitación: \n");
            sb.append("              Código: ");
            sb.append(factura.getFactura().getTramitacion().getCodigo());
            sb.append('\n');
            sb.append("              Descripción: ");
            sb.append(factura.getFactura().getTramitacion().getDescripcion());
            sb.append('\n');
            sb.append("              Motivo: ");
            sb.append(factura.getFactura().getTramitacion().getMotivo());
            sb.append('\n');
            sb.append("          Anulación: \n");
            sb.append("              Código: ");
            sb.append(factura.getFactura().getTramitacion().getCodigo());
            sb.append('\n');
            sb.append("              Descripción: ");
            sb.append(factura.getFactura().getTramitacion().getDescripcion());
            sb.append('\n');
            sb.append("              Motivo: ");
            sb.append(factura.getFactura().getTramitacion().getMotivo());
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }
    
    private void printResultado(Resultado resultado, StringBuilder sb) {
        sb.append("    Resultado:\n");
        sb.append("        Código: ");
        sb.append(resultado.getCodigo());
        sb.append('\n');
        sb.append("        Descripción: ");
        sb.append(resultado.getDescripcion());
        sb.append('\n');
        sb.append("        Código seguimiento: ");
        sb.append(resultado.getCodigoSeguimiento());
        sb.append('\n');
    }
}
