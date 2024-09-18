
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Departamento {
    private String nombre;
    private Universidad universidad;
    ArrayList<Profesor> listaProfesores = new ArrayList<>();
    
    public void agregarProfesor(Profesor profesor){
        listaProfesores.add(profesor);
        JOptionPane.showMessageDialog(null, "PROFESOR AGREGADO AL DEPARTAMENTO");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    
    
}
