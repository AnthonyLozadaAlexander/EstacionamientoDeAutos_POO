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
    
    //public Auto(int puertas){
        //this.puertas = puertas;
    //}
    
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
       
    }
    
    // Metodo para el SubTotal que por el momento es el precio ingresado.
    public double Subtotal(){
        return precio;
    }
    
    // Metodo para calcular el porcentaje del IVA 15%
    public double calcularIVA(){ 
        return precio * IVA;
    }
    
    public double calcularTotal(String tipoPago){
        double total = Subtotal() + calcularIVA();
        if(tipoPago.equals("Credito")){
            JOptionPane.showMessageDialog(null, "Pago Realizado Por Credito Aumento De 100$");
            total = total + 100;
        }
        
        
        return total;
        
    }
    
    // Metodo Total sin la alerta
     public double Total(String tipoPago){
        double total = Subtotal() + calcularIVA();
        if(tipoPago.equals("Credito")){
      
            total = total + 100;
        }
        
        
        return total;
        
    }
    
    
    public void CompraRealizada(){
        JOptionPane.showMessageDialog(null, "Gracias Por Su Compra", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String mostrarInfo(String tipoPago){
        
        CompraRealizada();
        
        return "\nMarca/Auto: " + marca + "\nPrecio: " + precio + "\nPuertas: " + puertas + "\nSubTotal: " + Subtotal() + "\nIVA: " + calcularIVA() + "\nTotal: " + Total(tipoPago) + "\n";
        
        
    } 
    

}
