
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Profesor {
    private String nombre;
    private String titulo;
    private String codigo;
    private Departamento departamento;
    ArrayList<Curso> listaCursos= new ArrayList<>();
    
    public void agregarCursos(Curso curso){
        listaCursos.add(curso);
        JOptionPane.showMessageDialog(null, "REGISTRADO E CURSO");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
