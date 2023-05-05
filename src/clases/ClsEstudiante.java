

package clases;

public class ClsEstudiante extends ClsPersona {
private String FecNac;
    public ClsEstudiante(int Dni, String Nombre, String Apellido,String FecNac) {
        super(Dni, Nombre, Apellido);
        this.FecNac = FecNac;
    
    }
}
        