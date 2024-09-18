
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estudiante {
    private String nombre;
    private String codigo;
    private Universidad universidad;
    ArrayList<Curso> listaCursos = new ArrayList<>();
    
    public void agregarCurso(Curso curso){
        listaCursos.add(curso);
        JOptionPane.showMessageDialog(null, "MATERIA AGREGADA");
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

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    
    
}
