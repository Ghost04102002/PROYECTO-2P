/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2p_poo.rovers;

/**
 *
 * @author samu_
 */
public abstract class Rover implements RoverI {
    private String nombre;
    private double ubicacionx;
    private double ubicaciony;
    private int carga=100;
    public Rover(String nombre,double ubicacionx, double ubicaciony){
        this.nombre=nombre;
        this.ubicacionx=ubicacionx;
        this.ubicaciony=ubicaciony;
    }
   public String getNombre(){
       return nombre;
   }
   public double getUbicacionx(){
       return ubicacionx;
   }
   public double getUbicaciony(){
       return ubicaciony;
   }
   public void setUbicacionx(double ubicacionx){
       this.ubicacionx=ubicacionx;
   }
   public void setUbicaciony (double ubicaciony){
       this.ubicaciony=ubicaciony;
   }
   public int getCarga(){
       return carga;
   }
   public void setCarga(int carga){
       this.carga=carga;
   }
   public void descargar(int pixelesavan){
       this.carga=carga-(1*(pixelesavan/10));
   }
    
}
