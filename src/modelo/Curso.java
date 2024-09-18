
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Curso {
    private String nombre;
    private String codigo;
    private Profesor profe;
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    
    public void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
        JOptionPane.showMessageDialog(null, "ESTUDIANTE REGISTRADO");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }
    
}
