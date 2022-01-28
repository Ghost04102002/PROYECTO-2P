/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2p_poo.rovers;

import javafx.scene.image.ImageView;

/**
 *
 * @author samu_
 */
public abstract class RoversEnergiaSolar extends Rover{
    private ImageView img=null;
    public RoversEnergiaSolar(String nombre,double ubicacionx, double ubicaciony){
        super(nombre,ubicacionx,ubicaciony);
    }
    public void avanzar(){
        double angulo=img.getRotate();
        double ubx=2*Math.cos(angulo);
        double uby=2*Math.sin(angulo);
        setUbicacionx(ubx);
        setUbicaciony(uby);
        img.setX(ubx);
        img.setY(uby);
    }
    public void girar(double grados){
        double angulo=img.getRotate();
        double nuevo=angulo-grados;
        img.setRotate(nuevo);
    }
    public void dirigirse(double x, double y){
        Moverse move= new Moverse(x,y);
        move.run();
    }
    class Moverse implements Runnable{
        private double x;
        private double y;
        Moverse(double x, double y){
            this.x=x;
            this.y=y;
        }
        public void run(){
            double angulo= Math.atan(y/x)+img.getRotate();
            girar(angulo);
            while (x!=img.getX() & y!=img.getY()){
                avanzar();
                if (x==img.getX()){
                    angulo=img.getRotate()+90;
                    girar(angulo);
                }
            }
                
        }
    }
    
}
