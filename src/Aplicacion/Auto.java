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
    
    public void setPrecio(double precio){
        if(precio > 0){
            alerta(precio);
        this.precio = precio;
        }
        else{
            alerta(precio);
            this.precio = 0;
            return;
        }
    }
    
    public void alerta(double precio){
        if(precio < 0){
        JOptionPane.showMessageDialog(null,"Precio Ingresado Invalido: " + precio, "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{   
            JOptionPane.showMessageDialog(null,"Precio Ingresado: " + precio, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }

}
