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
public class ClaseRelaciones {

    /**
     * @param args the command line arguments
     */
    /*Relaciones basicas
    *asociacion
    *Dependencia
    *agregacion
    *herencia
    *composicion
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha fNacimiento = new Fecha(18, 06, 2000);
        Fecha fIngreso = new Fecha(20, 02, 2018);
        Empleado andres = new Empleado("Andres", "Cardenas", "M", "Fotosss", fNacimiento, fIngreso);
    }
    
}
