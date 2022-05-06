/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos;

/**
 *
 * @author JeanS
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     informacion inf= new informacion("jea silva","sitemas","3");
     
     String numcot = inf.getNombre()+""+inf.getCarrera()+""+inf.getSemestre()+"";
     System.out.println("datos del alumno  "+numcot);
             
     
    }
    
}
