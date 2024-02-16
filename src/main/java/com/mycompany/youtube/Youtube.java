/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author tamal
 */
public class Youtube {

    public static void main(String[] args) {
        Usuario usuario=new Usuario("taide");
        Video video = new Video( "aprendiendo java ", 2400, "http;//taide.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();

    }
    
 }
   
    
