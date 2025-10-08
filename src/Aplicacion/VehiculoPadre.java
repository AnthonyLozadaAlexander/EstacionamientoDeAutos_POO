/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

/**
 *
 * @author USUARIO
 */
public class VehiculoPadre {
    
    protected String marca;
    protected double precio;
    
    public VehiculoPadre(){
        
    }
    
    public VehiculoPadre(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String mostrarInfo(){
        return "Marca; " + marca + "\n" + "Precio: " + precio + "\n";
    }
    
}
