package com.ciclo.modelo;

public class Bicicleta {
    private String tipoBici;
    private String tipoMantenimiento;
    private String detalle;
    private String numeroSerie;

    public Bicicleta() {
    }

    public Bicicleta(String tipoBici, String tipoMantenimiento, String detalle, String numeroSerie) {
        this.tipoBici = tipoBici;
        this.tipoMantenimiento = tipoMantenimiento;
        this.detalle = detalle;
        this.numeroSerie = numeroSerie;
    }

    public String getTipoBici() {
        return tipoBici;
    }

    public void setTipoBici(String tipoBici) {
        this.tipoBici = tipoBici;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipoBici='" + tipoBici + '\'' +
                ", tipoMantenimiento='" + tipoMantenimiento + '\'' +
                ", detalle='" + detalle + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}

