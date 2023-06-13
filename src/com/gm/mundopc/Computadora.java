package com.gm.mundopc;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorComputadoras;

    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    } 
    
    public Teclado getTeclado() {
        return this.teclado;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    @Override
    public String toString() {
        return "Computadora {idComputadora: " + idComputadora + ", nombre: " + nombre + ", monitor: " +  monitor + ", teclado: " + teclado + ", mouse: " + mouse + "}";
    }

}
