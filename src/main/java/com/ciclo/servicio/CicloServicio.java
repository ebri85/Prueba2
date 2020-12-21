package com.ciclo.servicio;

import com.ciclo.modelo.*;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.swing.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/ciclo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CicloServicio implements ICicloServicio {

    private static List<Ciclo> clientes = new ArrayList<Ciclo>();

    public CicloServicio() {

    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response Mensaje(@Context HttpHeaders headers) {
        String mensaje =
                "<h1>Este es el servicio Restful de Ciclo_Bikers</h1>\n" +
                        "<a href='http://localhost:8080/Ciclo-1/ciclo/clientes'>Obtiene Todas los clientes</a>";
        return Response.status(Response.Status.OK).entity(mensaje).build();
    }


    @Override
    @POST
    @Path("/agregaCliente")
    public Response agregaCliente(String _cliente) {
        int encontro = 0;
        Jsonb jsonB = JsonbBuilder.create();
        Ciclo ct = jsonB.fromJson(_cliente, Ciclo.class);

        for (Ciclo c : this.clientes) {
            encontro += (c.getIdCliente() == ct.getIdCliente()) ? 1 : 0;
        }
        if (encontro == 0 || this.clientes.isEmpty()) {
            this.clientes.add(ct);

            return Response.status(Response.Status.CREATED).entity(_cliente).build();
        } else {
            return Response.status(Response.Status.CONFLICT).entity("La receta ya existe").build();
        }
    }

    @Override
    @POST
    @Path("/agregaBicicleta/{idC}")
    public Response agregaBicicleta(@PathParam("idC") int idC, String bicicleta) {
        int encontro = 0;
        int i = 0;
        Jsonb jsonB = JsonbBuilder.create();
        Response respuesta;

        Bicicleta bici = jsonB.fromJson(bicicleta, Bicicleta.class);

        i = buscaCliente(idC);

        if (this.clientes.isEmpty()) {
            String mensaje = "El Ciclo no contiene clientes en este momento";
            return Response.status(Response.Status.NOT_FOUND).entity(mensaje).build();
        }
        if (i > 0) {

            Ciclo c = clientes.get(i);
            c.setBicicletas(bici);
            clientes.set(i, c);
        }
        String cliente = (i >= 0) ? jsonB.toJson(clientes.get(i)) : null;
        respuesta = (cliente == null) ?
                Response.status(Response.Status.NOT_FOUND).entity("No existe cliente con esa identificacion").build() :
                Response.status(Response.Status.FOUND).entity(cliente).build();

        return respuesta;

    }


    @Override
    @GET
    @Path("/clientes")
    public Response obtieneClientes() {

        Jsonb jsonB = JsonbBuilder.create();

        String listaTipos = jsonB.toJson(clientes);


        Response respuesta;

        if (this.clientes.isEmpty()) {
            String mensaje = "El Ciclo no contiene clientes en este momento";
            return Response.status(Response.Status.NOT_FOUND).entity(mensaje).build();
        }
        respuesta = (listaTipos == null) ?
                Response.status(Response.Status.NOT_FOUND).entity("No existe ese tipo de receta").build() :
                Response.status(Response.Status.FOUND).entity(listaTipos).build();


        return respuesta;
    }

    @Override
    @GET
    @Path("/obtieneBicicletasCliente/{idC}")
    public Response obtieneBicicletasCliente(@PathParam("idC") int idC) {
        int encontro = 0;
        int i = 0;
        i = buscaCliente(idC);

        Ciclo c = clientes.get(i);
        ArrayList<Bicicleta> bicis = c.getBicicletas();


        Response respuesta;
        Jsonb jsonB = JsonbBuilder.create();
        String listaTipos = jsonB.toJson(bicis);

        if (this.clientes.isEmpty()) {
            String mensaje = "El Ciclo no contiene clientes en este momento";
            return Response.status(Response.Status.NOT_FOUND).entity(mensaje).build();
        }
        respuesta = (listaTipos == null) ?
                Response.status(Response.Status.NOT_FOUND).entity("No existe ese tipo de receta").build() :
                Response.status(Response.Status.FOUND).entity(listaTipos).build();
        return respuesta;
    }


    public int buscaCliente(int i) {
        Ciclo _r[] = new Ciclo[clientes.size()];
        _r = clientes.toArray(_r);

        for (int j = 0; j < _r.length; j++) {

            if (_r[j].getIdCliente() == i) {

                return j;
            }
        }
        return -1;
    }


}
