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

import es.brainbond.facecli.face.generated.AnularFacturaResponse;
import es.brainbond.facecli.face.generated.ConsultarAdminitracionesResponse;
import es.brainbond.facecli.face.generated.ConsultarEstadosResponse;
import es.brainbond.facecli.face.generated.ConsultarFacturaResponse;
import es.brainbond.facecli.face.generated.ConsultarListadoFacturaResponse;
import es.brainbond.facecli.face.generated.ConsultarRelacionesPorAdministracionResponse;
import es.brainbond.facecli.face.generated.ConsultarRelacionesResponse;
import es.brainbond.facecli.face.generated.EnviarFacturaResponse;

public interface FaceService {

    public EnviarFacturaResponse enviarFactura(
            String correo,
            String rutaFactura);
    
    public void printEnviarFacturaResponse(EnviarFacturaResponse response);
    
    public ConsultarFacturaResponse consultarFactura(String codigoRegistro);
    
    public void printConsultarFacturaResponse(ConsultarFacturaResponse response);
    
    public AnularFacturaResponse anularFactura(String numeroRegistro, String motivo);
    
    public void printAnularFacturaResponse(AnularFacturaResponse response);
    
    public ConsultarEstadosResponse estados();
    
    public void printConsultarEstadosResponse(ConsultarEstadosResponse response);
    
    public ConsultarRelacionesResponse unidades();
    
    public void printConsultarRelacionesResponse(ConsultarRelacionesResponse response);
    
    public ConsultarAdminitracionesResponse administraciones();
    
    public void printConsultarAdminitracionesResponse(ConsultarAdminitracionesResponse response);
    
    public ConsultarRelacionesPorAdministracionResponse unidadesPorAdministracion(String codigoDir);

    public void printConsultarRelacionesPorAdministracionResponse(
            ConsultarRelacionesPorAdministracionResponse response);
    
    public ConsultarListadoFacturaResponse consultarListadoFacturas(
            List<String> numerosRegistro);

    public void printConsultarListadoFacturaResponse(
            ConsultarListadoFacturaResponse response);
}
