/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package notascolegio;

import clases.ClsAsignatura;
import clases.ClsEstudiante;
import clases.ClsNota;
import clases.ClsProfesor;

public class Notas_Colegio {
    public static void main(String[] args) {
        ClsEstudiante coca= new ClsEstudiante (1234568,"Jonathan","Coca","22/02/2005");
        ClsAsignatura Asig1= new ClsAsignatura ("Matematicas");
        ClsAsignatura Asig2= new ClsAsignatura ("Español");
        ClsAsignatura Asig3= new ClsAsignatura ("Calculo diferencial");
        ClsAsignatura Asig4= new ClsAsignatura ("Quimica");
        ClsAsignatura Asig5= new ClsAsignatura ("Ingles");
        ClsProfesor kevin= new ClsProfesor(13212321,"Kevin","Galeano",Asig1);
        ClsNota nota1=new ClsNota (coca,Asig1,4.5);
        kevin.establecerHorario(Asig1.getNombre(),"Libre","Libre", Asig1.getNombre(), Asig1.getNombre());
        coca.establecerHorario(Asig1.getNombre(), Asig4.getNombre(), Asig5.getNombre(), Asig2.getNombre(), Asig3.getNombre());
        
        System.out.println("el señor "+nota1.getEstudiante()+" saco una nota de "+nota1.getNota()+" en la asignatura de: "+nota1.getAsignatura()+"\ny su horario es: ");
        coca.mostrarHorario();
        
        
        
        
        
        System.out.println("\n\nEl horario del profesor "+kevin.getNombre()+" "+kevin.getApellido()+ " es: ");   
        kevin.mostrarHorario();
        
        
    }

}
