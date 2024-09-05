package CLASES;

public class ClassFunciones {
      public ClassApoderado buscarApodedaro(int num){
        for(ClassApoderado f: Principal.apoderados)
            if(f.getDni()==num)
                return f;
        return null;
    }
      
    public ClassApoderado idbuscarApod(String num){
        for(ClassApoderado f: Principal.apoderados)
            if(f.getIdApoderado().equalsIgnoreCase(num))
                return f;
        return null;
    }
    
    public ClassAlumno idbuscarAlum(String num){
        for(ClassAlumno f: Principal.alumnos)
            if(f.getIdAlumno().equalsIgnoreCase(num))
                return f;
        return null;
    }
    public ClassAlumno nombreFamilia(String num){
        for(ClassAlumno f: Principal.alumnos)
            if(f.getNombres().equalsIgnoreCase(num))
                return f;
        return null;
    }
    
     public ClassAlumno buscarAlumno(int num){
        for(ClassAlumno f: Principal.alumnos)
            if(f.getDni()==num)
                return f;
        return null;
    }
  
}