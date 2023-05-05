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
        //Se instancia un estudiante
        ClsEstudiante est1= new ClsEstudiante (1234568,"Jonathan","Coca","22/02/2005");
        ClsEstudiante est2= new ClsEstudiante (1789728978,"Fabio","Gomez","2/10/2000");
        ClsEstudiante est3= new ClsEstudiante (101600125,"Ronald","Charari","26/02/2005");
        
        //se instancian varias asignaturas
        ClsAsignatura Asig1= new ClsAsignatura ("Matematicas");
        ClsAsignatura Asig2= new ClsAsignatura ("Español");
        ClsAsignatura Asig3= new ClsAsignatura ("Calculo diferencial");
        ClsAsignatura Asig4= new ClsAsignatura ("Quimica");
        ClsAsignatura Asig5= new ClsAsignatura ("Ingles");
        
        
        //se instancia un profesor 
        ClsProfesor prof1= new ClsProfesor(13212321,"Kevin","Galeano",Asig1);
        
        //se pone nota a el estudiante  por  asignatura 
        ClsNota nota1=new ClsNota (est2,Asig4,1.8);
        ClsNota nota2=new ClsNota (est2,Asig5,2.5);
        
        ClsNota nota3=new ClsNota (est3,Asig1,3.5);
        ClsNota nota4=new ClsNota (est3,Asig2,1.0);
        ClsNota nota5=new ClsNota (est3,Asig3,2.5);
        
        ClsNota nota6=new ClsNota (est1,Asig1,3.0);
        ClsNota nota7=new ClsNota (est1,Asig4,4.5);
        
        //se establecen horarios tanto para profesor como para estudiante 
        prof1.establecerHorario(Asig1.getNombre(),"Libre","Libre", Asig1.getNombre(), Asig1.getNombre());
        est1.establecerHorario(Asig1.getNombre(), Asig4.getNombre(), Asig5.getNombre(), Asig2.getNombre(), Asig3.getNombre());
        
        
        //se  muestra la nota 
        System.out.println("el señor "+est1.getNombre()+" "+est1.getApellido()+" tiene las siguiente notas ");
        est1.mostrarNotas();
        
        //se muestra el horario del estudiante
        est1.mostrarHorario();
        
        
        // se muestran las notas de los estudiantes en las asignaturas
        System.out.println("\n\n\n\nel señor "+est2.getNombre()+" "+est2.getApellido()+" tiene las siguiente notas ");
        est2.mostrarNotas();
        
        System.out.println("\n\n\n\nel señor "+est3.getNombre()+" "+est3.getApellido()+" tiene las siguiente notas ");
        est3.mostrarNotas();
        
        
        System.out.println("\n\nEl horario del profesor "+prof1.getNombre()+" "+prof1.getApellido()+ " es: ");   
        prof1.mostrarHorario();
        
        
    }

}
