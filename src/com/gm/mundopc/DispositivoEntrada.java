package com.gm.mundopc;

class DispositivoEntrada{
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada: {tipoEntrada: " + this.tipoEntrada + ", marca: " + this.marca + "}";
    }
} 