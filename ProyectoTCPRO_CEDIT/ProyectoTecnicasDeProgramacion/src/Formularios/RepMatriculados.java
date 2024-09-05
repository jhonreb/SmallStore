/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import CLASES.ClassAlumno;
import CLASES.ClassApoderado;
import CLASES.ClassFunciones;
import CLASES.Concepto;
import CLASES.Principal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Propietario
 */

public class RepMatriculados extends javax.swing.JInternalFrame {
    
    ClassApoderado FamApodeX= new ClassApoderado();
    ClassAlumno FamAluX= new ClassAlumno();
    Concepto FamDeudaX= new Concepto();
    public static List<Integer>cartera;
    ArrayList<ClassAlumno>Ingresos;
    DefaultTableModel modeloTabla;
    int contador=0;
    String[] cabecera={"ID","Nombres","Apellidos","DNI","Sexo","Nivel","Grado","Apoderado"};
    ClassFunciones busquedaAlumno = new ClassFunciones();
    ClassApoderado ApoderadoX;
    public RepMatriculados() {
        initComponents();
        transparencia();
        llenarTabla();
        contador++;
        tablaAlumnos.setEnabled(false);
    }
    public void transparencia(){
       
        btnGenerar1.setOpaque(false);
        btnGenerar1.setContentAreaFilled(false);
        btnGenerar1.setBorderPainted(false);

        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
        
    }

    private void llenarTabla(){
        //Generados el modelo de la tabla
        DefaultTableModel modeloDefault=new DefaultTableModel(cabecera,Principal.alumnos.size());
        tablaAlumnos.setModel(modeloDefault);
        TableModel modeloDatosAlumno=tablaAlumnos.getModel();
        for(int i=0;i<Principal.alumnos.size();i++){
            ClassAlumno alumno=Principal.alumnos.get(i);
            //fila i- columna 0
            modeloDatosAlumno.setValueAt(alumno.getIdAlumno(),i,0);
            modeloDatosAlumno.setValueAt(alumno.getNombres(),i,1);
            modeloDatosAlumno.setValueAt(alumno.getApellidos(),i,2);
            modeloDatosAlumno.setValueAt(alumno.getDni(),i,3);
            modeloDatosAlumno.setValueAt(alumno.getSexo(),i,4);
            modeloDatosAlumno.setValueAt(alumno.getNivel(),i,5);
            modeloDatosAlumno.setValueAt(alumno.getGrado(),i,6);
            modeloDatosAlumno.setValueAt(alumno.getApoderado().getNombres(),i,7);
        } 
    }
    
     void limpiaMatriz() {
        for(int i=0;i<Principal.alumnos.size();i++){
            tablaAlumnos.setValueAt("",i,0);
            tablaAlumnos.setValueAt("",i,1);
            tablaAlumnos.setValueAt("",i,2);
            tablaAlumnos.setValueAt("",i,3);
            tablaAlumnos.setValueAt("",i,4);
            tablaAlumnos.setValueAt("",i,5);
            tablaAlumnos.setValueAt("",i,6);
            tablaAlumnos.setValueAt("",i,7);
        }
    }
     public static String fechaActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
    return formatoFecha.format(fecha); 
}

     public String CodigoReportNew123(){ 
        Formatter obj = new Formatter();
        String numeroCeros = String.valueOf(obj.format("%04d", contador));
        return "Reporte "+numeroCeros;
    }
    
    
     public void generarPDF(){

        try{
            PdfPTable tabla= new PdfPTable(1);    
            for(int i=0;i<Principal.alumnos.size();i++){
            FamAluX=Principal.alumnos.get(i);
            String data = FamAluX.ReportAlumnosMatriculados();
            String regex = "\\[|\\]"; 
            String regex2="\\,|\\]";
            data  = data .replaceAll(regex,"");
            data=data.replaceAll(regex2,"");
            PdfPCell datos= new PdfPCell(new Phrase("   "+""+"\n"+data+"\n"));
            tabla.addCell(datos);
            }
            Document documento= new Document(PageSize.A4,10,10,10,10);
            FileOutputStream archivo =new FileOutputStream(CodigoReportNew123()+".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            Font fuente1 = new Font();
            fuente1.setStyle(1);
            fuente1.setStyle(Font.BOLD);
            Font fuente2 = new Font();
            fuente2.setStyle(1);
            fuente2.setSize(15);
            fuente2.setStyle(Font.BOLD);
            Image imagen = Image.getInstance("D:\\u\\logo.png");  
            imagen.scalePercent(25f);
            imagen.setAlignment(Element.ALIGN_LEFT);
            documento.add(imagen);
            documento.add(new Paragraph(fechaActual()));
            documento.add(new Paragraph("\n"));  
            tabla.setWidthPercentage(100);
            documento.add(tabla);
            documento.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 
    public void abrirPDF(){
        try{
            File path= new File(CodigoReportNew123()+".pdf");
            Desktop.getDesktop().open(path);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,  ex);
        } 
    }  

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnGenerar1 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(null);

        tablaAlumnos.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 680, 300);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Alumnos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 170, 29);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_26px.png"))); // NOI18N
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(640, 10, 50, 50);

        btnGenerar1.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnGenerar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_book_and_pencil_100px.png"))); // NOI18N
        btnGenerar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar1);
        btnGenerar1.setBounds(20, 50, 100, 90);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(270, 60, 190, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista 1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 720, 470);

        setBounds(0, 0, 720, 499);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGenerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar1ActionPerformed

        generarPDF();
        abrirPDF();
    }//GEN-LAST:event_btnGenerar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
