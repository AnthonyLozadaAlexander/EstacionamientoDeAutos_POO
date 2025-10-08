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
public class Moto extends VehiculoPadre {
    private double Cilindraje;
    private final double IVA = 0.15;
    
    public Moto(){
        
    }
    
    public Moto(String marca, Double precio, double cilindraje){
        super(marca, precio);
        this.Cilindraje = cilindraje;
    }

    public void setCilindraje(double Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public void setPrecio(double precio) {
        if(precio > 0){
            JOptionPane.showMessageDialog(null, "Precio Ingresado: " + precio, "Info", JOptionPane.INFORMATION_MESSAGE);
        this.precio = precio;
        }
      
    }
    
    public double SubTotal(){
        return precio;
    }
    
  
    public double calcularIVA(){
        return SubTotal() * IVA;
    }
    
    public double calcularTotal(String tipoPago){
        double total = SubTotal() + calcularIVA();
        if(tipoPago.equals("Credito")){
            JOptionPane.showMessageDialog(null, "Pago Realizado Por Credito Aumento De 100$");
            total = total + 100;
        }
        
        return total;   
        
    }
    
    // Metodo Total sin la alerta
     public double Total(String tipoPago){
        double total = SubTotal() + calcularIVA();
        if(tipoPago.equals("Credito")){
      
            total = total + 100;
        }
        
        
        return total;
        
    }
    
    public void compraRealizada(){
        JOptionPane.showMessageDialog(null, "Compra Realizada Exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    
    public String mostrarInfo(String tipoPago) {
        compraRealizada();
        
        return "\nMarca/Moto: " + marca + "\nCilindraje: " + Cilindraje + "\nSubTotal: " + SubTotal() + "\nIVA: " + calcularIVA() + "\nTotal: " + Total(tipoPago) + "\n";
    }
    
    
}
