package clases;

import Interfaz.IHorarios;
import java.util.HashMap;
import java.util.Map;

public class ClsPersona implements IHorarios {
private int Dni;
private String Nombre;
private String Apellido;
private Map<String,String> horario;

    public ClsPersona(int Dni, String Nombre, String Apellido) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public void establecerHorario(String lunes, String martes, String miercoles, String jueves, String viernes) {
        Map<String,String> horario=new HashMap<>();
        horario.put("lunes",lunes);
        horario.put("Martes",martes);
        horario.put("miercoles",miercoles);
        horario.put("jueves",jueves);
        horario.put("viernes",viernes);
        this.horario=horario;
    }

    public void mostrarHorario() {
            for (Map.Entry<String, String> entrada : this.horario.entrySet()) {
            String dia = entrada.getKey();
            String asignatura = entrada.getValue();
            System.out.println("El " + dia + " tiene " + asignatura);
        }
    }
}
