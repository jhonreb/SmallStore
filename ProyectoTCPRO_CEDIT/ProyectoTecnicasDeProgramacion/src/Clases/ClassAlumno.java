
package CLASES;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class ClassAlumno extends ClassPersona{
    
    private String idAlumno;
    private String nivel;
    private String grado;
    ClassApoderado apoderado;// un alumno puede tener solo 1 apoderado
    static List<Integer>cartera;
    ArrayList<Concepto> ListaDePagos;// un alumno puede tener varios pagos

    
    public ClassAlumno(){
    }
    
    public ClassAlumno(String idAlumno, String nivel, String grado, String nombres, String apellidos, int dni, String sexo, 
            ClassApoderado apoderado) {
        super(nombres, apellidos, dni, sexo);
        this.idAlumno = idAlumno;
        this.nivel = nivel;
        this.grado = grado;
        this.apoderado = apoderado;
    }

    public ClassAlumno(String idAlumno, String nivel, String grado,ArrayList<Concepto> ListaDePagos, String nombres, String apellidos, int dni, String sexo) {
        super(nombres, apellidos, dni, sexo);
        this.idAlumno = idAlumno;
        this.nivel = nivel;
        this.grado = grado;
        this.ListaDePagos = ListaDePagos;
    }
    
    public ClassApoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(ClassApoderado apoderado) {
        this.apoderado = apoderado;
    }
    
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    public List<Concepto> getListaDePagos() {
        return ListaDePagos;
    }
    
    public void setListaDePagos(ArrayList<Concepto> ListaDePagos) {
        this.ListaDePagos = ListaDePagos;
    }

    
   /* @Override
    public String toString() {
        return "ClassAlumno{" +super.toString() + "idAlumno=" + idAlumno + ", nivel=" + nivel + ", grado=" + grado + ", apoderado=" + apoderado + "\n" + ListaDePagos + "\n" ;
    }*/
    
    @Override
    public String toString() {
        return " Alumno: " +super.toString()+ 
                "\n Nivel y Grado: " + nivel +" "+ grado+
                "\n_____________________________________________________________"
                + "_____________________________________________________________"+
                 "\n" + ListaDePagos + 
                "\n";
                
    }
    
    public String Mostrar(){
        return "ClassAlumno{" + "idAlumno=" + idAlumno + ", nivel=" + nivel + ", grado=" + grado + ", apoderado=" + apoderado + ", ListaDePagos=" + ListaDePagos + '}';
    }
    
    public String ReportAlumnosMatriculados() {
        return " Alumno: " +super.toString()+ 
                "\n Nivel y Grado: " + nivel +" "+ grado+"\n";
    }
    
    public String Ingresos(){
        
        return "ClassAlumno{" + "idAlumno=" + idAlumno + ", nivel=" + nivel + ", grado=" + grado + ", apoderado=" + apoderado + ", ListaDePagos=" + ListaDePagos + '}';
    }
           
     
     
}
 