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
    public void avanzar(int d){
        double angulo=img.getRotate();
        double ubx=d*Math.cos(angulo);
        double uby=d*Math.sin(angulo);
        setUbicacionx(getUbicacionx()+ubx);
        setUbicaciony(getUbicaciony()+uby);
        img.setX(getUbicacionx()+ubx);
        img.setY(getUbicacionx()+ubx);
    }
    public void girar(double grados){
        grados=Math.toRadians(grados);
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
                    angulo=img.getRotate()+Math.toRadians(90);
                    girar(angulo);
                }
            }
                
        }
    }
    //public String sensar(){
        
    //}
    
}
