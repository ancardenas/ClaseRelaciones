/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claserelaciones;

/**
 *
 * @author Estudiante
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String genero;
    private String foto;
    private Fecha fNacimiento;
    private Fecha fIngreso;

    public Empleado(String nombre, String apellido, String genero, String foto, Fecha fNacimiento, Fecha fIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.foto = foto;
        this.fNacimiento = fNacimiento;
        this.fIngreso = fIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getFoto() {
        return foto;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public Fecha getfIngreso() {
        return fIngreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setfIngreso(Fecha fIngreso) {
        this.fIngreso = fIngreso;
    }
    
    

    
}
