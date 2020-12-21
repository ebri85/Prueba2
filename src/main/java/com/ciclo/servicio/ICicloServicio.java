package com.ciclo.servicio;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface ICicloServicio {
    public Response agregaCliente(String _cliente);
    public Response agregaBicicleta(int idC, String bicicleta);





    public Response obtieneBicicletasCliente(int idC);
    public Response obtieneClientes();


}
