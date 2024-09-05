
package CLASES;

import Formularios.Menú;
import Formularios.Login;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static ArrayList<ClassApoderado> apoderados;
    public static ArrayList<Concepto> deudas;
    public static ArrayList<Concepto> deudasInicial;
    public static ArrayList<Concepto> deudasGuarderia;
    public static ArrayList<Concepto> deudasReforzamiento;
    public static ArrayList<ClassAlumno> alumnos;
       public static List<ClassAlumno> HijosMatriculados;
   // public static ArrayList<ClassAlumno> alumnos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        deudas= new ArrayList<>();
        deudasInicial= new ArrayList<>();
        deudasGuarderia= new ArrayList<>();
        deudasReforzamiento= new ArrayList<>();
        alumnos=new ArrayList<>();
        
        HijosMatriculados=new ArrayList<>();
        apoderados= new ArrayList<>();
     // alumnos=new ArrayList<>();
        
       Login ventana= new Login();
      // Menú ventana= new Menú();
       ventana.setVisible(true);
    }
}