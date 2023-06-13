package com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanio ){
        this(); //llamada al constructor vacío para llevar la cuenta de monitores
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor {marca: " + marca + ", tamanio: " + tamanio + "}";
    }
}
