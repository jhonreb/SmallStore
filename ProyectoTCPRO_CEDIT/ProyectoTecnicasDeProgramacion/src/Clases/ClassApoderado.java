package CLASES;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClassApoderado extends ClassPersona{
    
    private String idApoderado;
    private int celular;
    private String direccion;
    private List<ClassAlumno> HijosMatriculados;
    
    public ClassApoderado(){
        
    }
    public ClassApoderado(String  IdApoderado, int celular, String direccion, String nombres, String apellidos, int dni, String sexo) {
        super(nombres, apellidos, dni, sexo);
        this.idApoderado = idApoderado;
        this.celular = celular;
        this.direccion = direccion;
    }
    public String getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(String idApoderado) {
        this.idApoderado = idApoderado;
    }
    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<ClassAlumno> getHijosMatriculados() {
        return HijosMatriculados;
    }

    public void setHijosMatriculados(List<ClassAlumno> HijosMatriculados) {
        this.HijosMatriculados = HijosMatriculados;
    }

    @Override
    public String toString() {
        return "\n Señor(a): "+super.toString()+"\n";
    }
    
    
     /*@Override
    public String toString() {
        return "Señor(a): "+super.toString() + ", HijosMatriculados=" + HijosMatriculados + '}';
    }*/
    
    public String FamiliaHijos() {
         return "Señor(a): "+super.toString() + ", HijosMatriculados=" + HijosMatriculados + '}';
    }
    
    public String DirectorioFamiliar(){
      return "Apoderado: "+ReporteFamiliar() + "\nDirección: " + direccion + "\nCelular: "+ celular;
    
    }
    
    
    
    
}