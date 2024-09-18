
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Universidad {
    private String nombre;
    public ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
    ArrayList<Estudiante> listaMatriculados = new ArrayList<>();
    
    public Universidad(){
        nombre = "Colegio San Buenaventura";
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarDepartamento(Departamento dep){
        listaDepartamentos.add(dep);
        JOptionPane.showMessageDialog(null, "REGISTRADO EL DEPARTAMENTO");
    }
    
    public void matricularEstudiante(Estudiante estu){
        listaMatriculados.add(estu);
        JOptionPane.showMessageDialog(null, "ESTUDIANTE MATRICULADO");
    }
    
    public void imprimmirMatriculados(JTextArea area){
        area.setText("Estudiantes matriculados");
        for(int pos =0; pos<listaMatriculados.size();pos++){
            area.append("\nNombre-> "+listaMatriculados.get(pos).getNombre());
            area.append("\nCodigo-> "+ listaMatriculados.get(pos).getCodigo());
        }
    } 
}
