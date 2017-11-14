/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallaboratorio;

/**
 *
 * @author Alejandro
 */
public class Equipo {
    String serial;
    String marca;
    String marcaBoard;
    String referenciaBoard;
    String ram;
    String disco;
    String procesador;
    String monitor;
    String teclado;
    String serialMonitor;
    String serialTeclado;
    
    public Equipo(){
        
    }

    public Equipo(String serial, String marca, String ram, String disco, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.ram = ram;
        this.disco = disco;
        this.procesador = procesador;
    }
    
    

    public String getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public String getRam() {
        return ram;
    }

    public String getDisco() {
        return disco;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    
    
    
}
