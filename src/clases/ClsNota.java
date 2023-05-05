/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;

public class ClsNota {
   
   private double nota;
   private String estudiante;
   private String asignatura;

    public ClsNota( ClsEstudiante estudiante, ClsAsignatura asignatura,double nota) {
        this.nota = nota;
        this.estudiante = estudiante.getNombre();
        this.asignatura = asignatura.getNombre();
        estudiante.AgregarNota(this.asignatura, nota);
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

   
    
    
    
}
