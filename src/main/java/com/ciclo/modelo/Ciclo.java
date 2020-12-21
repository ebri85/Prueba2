package com.ciclo.modelo;

import java.util.ArrayList;

public class Ciclo {
    private int idCliente;
    private  String nombreCliente;
    private String direccion;
    private String estadoOrden;
    private String horario;
    private String telefono;
    private ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();

    public Ciclo() {
    }

    public Ciclo(int idCliente, String nombreCliente, String direccion, String estadoOrden, String horario, String telefono, ArrayList<Bicicleta> bicicletas) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.estadoOrden = estadoOrden;
        this.horario = horario;
        this.telefono = telefono;
        this.bicicletas = bicicletas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(String estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(Bicicleta bicicleta) {
        this.bicicletas.add(bicicleta);
    }

    @Override
    public String toString() {
        return "Ciclo{" +
                "idCliente='" + idCliente + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estadoOrden='" + estadoOrden + '\'' +
                ", horario='" + horario + '\'' +
                ", telefono='" + telefono + '\'' +
                ", bicicletas=" + bicicletas +
                '}';
    }
}


