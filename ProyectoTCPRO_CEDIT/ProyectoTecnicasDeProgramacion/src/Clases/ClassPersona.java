
package CLASES;

public class ClassPersona {
    
    protected String nombres;
    protected String apellidos;
    protected int dni;
    protected String sexo;
    
    public ClassPersona(){
        
    }

    public ClassPersona(String nombres, String apellidos, int dni, String sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sexo = sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombres +" "+ apellidos + "\n Dni: " + dni;
    }
    
    public String ReporteFamiliar(){
        return nombres +" "+ apellidos + "\nDni: " + dni;
    }

}
