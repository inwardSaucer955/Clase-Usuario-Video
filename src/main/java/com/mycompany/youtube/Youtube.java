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
        Usuario usuario1=new Usuario("taide");
        Video video1 = new Video( " aprendiendo java ", 2400, "http;//taide.com");
        usuario1.subirVideo(video1);
        usuario1.mostrarInfoUsuario();
        System.out.println();
        
        Usuario usu2 = new Usuario("rene limon");
        Comentarios comentario1 = new Comentarios (" me encanto tu video uwu", usu2 );
        System.out.println(" el usuario: " + usu2.getNombre()+ " realizo un comentario: " + comentario1.getContenido());
       
    }
      
 }
   
    
