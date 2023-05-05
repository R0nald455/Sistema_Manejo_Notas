/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;

public class ClsNota {
   
   private double nota;
   private ClsEstudiante estudiante;
   private ClsAsignatura asignatura;

    public ClsNota( ClsEstudiante estudiante, ClsAsignatura asignatura,double nota) {
        this.nota = nota;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getEstudiante() {
        return estudiante.getNombre();
    }

    public void setEstudiante(ClsEstudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getAsignatura() {
        return asignatura.getNombre();
    }
    
    public void setAsignatura(ClsAsignatura asignatura) {
        this.asignatura = asignatura;
    }
   
   
    
    
    
}
