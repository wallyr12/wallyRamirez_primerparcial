/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Wally Ramirez
 */
public class Libro {
    private String codigo;
    private String nombre;
    private String tipo;
    private String editoriall;
    private String años;
  
    
    public Libro(String codigo, String nombre, String tipos, String editorial, String año){
        this.codigo=codigo;
        this.nombre=nombre;
        this.tipo=tipos;
        this.editoriall=editorial;
        this.años=año;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editoriall;
    }

    public void setEditorial(String editorial) {
        this.editoriall = editorial;
    }

    public String getAño() {
        return años;
    }

    public void setAño(String año) {
        this.años = año;
    }

}