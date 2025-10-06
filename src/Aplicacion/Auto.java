/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Auto extends VehiculoPadre {
    private int puertas;
    private final double IVA = 0.15;
    
    public Auto(){
        
    }
    
    public Auto(int puertas){
        this.puertas = puertas;
    }
    
    public Auto(String marca, double precio, int puertas){
        super(marca, precio);
        this.puertas = puertas;
    }
    
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    
    public boolean esPrecioValido(double precio){
        return precio > 0;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setPrecio(double precio){
        if(esPrecioValido(precio)){
            JOptionPane.showMessageDialog(null, "Precio Ingresado: " + precio,"Informacion", JOptionPane.INFORMATION_MESSAGE);
            this.precio = precio;
        }
        else{
             JOptionPane.showMessageDialog(null, "Precio Ingresado Invalido: " + precio,"ERROR", JOptionPane.ERROR_MESSAGE);
            this.precio = 0;
            return;
        }
    }
    
    public double Subtotal(){
        return precio;
    }
    
    public double calcularIVA(){
        return precio * IVA;
    }
    
    public double calcularTotal(String tipoPago){
        double total = Subtotal() + calcularIVA();
        if(tipoPago.equals("Credito")){
            total = total + 100;
        }
        
        return total;
        
    }
    

}
