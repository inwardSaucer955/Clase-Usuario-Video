/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author tamal
 */
public class Usuario {
   public String nombre;
   public Video videoSubido;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    Usuario(String me_gusta_tu_video_uwu, Usuario usuario2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Video getVideoSubido() {
        return videoSubido;
    }

    public void subirVideo(Video videoSubido) {
        this.videoSubido = videoSubido;
    }
   
   public void mostrarInfoUsuario (){
       System.out.println("Usuario "+ nombre);
       if (videoSubido != null){
           System.out.println("ultimo video subido" + videoSubido.getTitulo());
       } else{
               System.out.println( "Aun no se han subido video");
      }
             
   }
   
}
