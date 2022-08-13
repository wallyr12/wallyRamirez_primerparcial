/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Wally Ramirez
 */

  public class LibrosController {
      Libro[] tablaALumno;
    int indiceArray;
    
    public LibrosController(){
        this.tablaALumno = new Libro[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno(Libro libro){
        this.tablaALumno[this.indiceArray]=libro;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public Libro[] getAlumnos(){
        return this.tablaALumno;
    }
    
}  

