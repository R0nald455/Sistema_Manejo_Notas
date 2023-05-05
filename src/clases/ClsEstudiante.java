

package clases;

import java.util.HashMap;
import java.util.Map;

public class ClsEstudiante extends ClsPersona {
        private String FecNac;
        private Map<String,Double> notas;



    public ClsEstudiante(int Dni, String Nombre, String Apellido,String FecNac) {
            super(Dni, Nombre, Apellido);
            Map<String,Double> notas=new HashMap<>();
            this.notas=notas;
            this.FecNac = FecNac;
        }
    
    public void AgregarNota(String asignatura,double nota){
        notas.put(asignatura,nota);
    }
    
    
    public void mostrarNotas() {
            for (Map.Entry<String, Double> entrada : this.notas.entrySet()) {
            String asignatura = entrada.getKey();
            Double nota = entrada.getValue();
            System.out.println("sus notas son " + asignatura + " tiene " + nota);
        }
    }
    }
    
       