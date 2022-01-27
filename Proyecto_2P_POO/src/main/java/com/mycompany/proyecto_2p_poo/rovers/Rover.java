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
    public Rover(String nombre,double ubicacionx, double ubicaciony){
        this.nombre=nombre;
        this.ubicacionx=ubicacionx;
        this.ubicaciony=ubicaciony;
    }
    
}
