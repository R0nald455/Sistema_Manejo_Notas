/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;

public class ClsProfesor extends ClsPersona{
        
    private ClsAsignatura asignatura;

    public ClsProfesor(int Dni, String Nombre, String Apellido,ClsAsignatura asignatura) {
        super(Dni, Nombre, Apellido);
        this.asignatura=asignatura;
    }

}
