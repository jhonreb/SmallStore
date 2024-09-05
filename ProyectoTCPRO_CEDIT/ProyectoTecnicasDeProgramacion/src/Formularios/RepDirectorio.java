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
 * @author Usuario
 */
public class RepDirectorio extends javax.swing.JInternalFrame {
    ClassApoderado FamApodeX= new ClassApoderado();
    ClassAlumno FamAluX= new ClassAlumno();
    Concepto FamDeudaX= new Concepto();
    public static List<Integer>cartera;
    ArrayList<ClassAlumno>Ingresos;
    DefaultTableModel modeloTabla;
    int contador=100;
    String[] cabecera={"ID","Nombres","Apellidos","DNI","Sexo","Direccion",
         "Celular"};
    ClassFunciones busquedaApoderado = new ClassFunciones();
    DefaultTableModel modeloDefault=new DefaultTableModel(cabecera,Principal.apoderados.size());
    /**
     * Creates new form ListaApoderado
     */
    public RepDirectorio() {
        initComponents();
        transparencia();
        llenarTabla();
        CambiarTamañoColumnas();
        tablaApoderados.setEnabled(false);
        contador++;
    }
    
    public void transparencia(){
      
        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
        
        btnGenerar2.setOpaque(false);
        btnGenerar2.setContentAreaFilled(false);
        btnGenerar2.setBorderPainted(false);
        
    }

    private void llenarTabla(){
        //Generados el modelo de la tabla
        tablaApoderados.setModel(modeloDefault);
        TableModel modeloDatosApoderado=tablaApoderados.getModel();
        for(int i=0;i<Principal.apoderados.size();i++){
            ClassApoderado apoderado=Principal.apoderados.get(i);
            //fila i- columna 0
            modeloDatosApoderado.setValueAt(apoderado.getIdApoderado(),i,0);
            modeloDatosApoderado.setValueAt(apoderado.getNombres(),i,1);
            modeloDatosApoderado.setValueAt(apoderado.getApellidos(),i,2);
            modeloDatosApoderado.setValueAt(apoderado.getDni(),i,3);
            modeloDatosApoderado.setValueAt(apoderado.getSexo(),i,4);
            modeloDatosApoderado.setValueAt(apoderado.getDireccion(),i,5);
            modeloDatosApoderado.setValueAt(apoderado.getCelular(),i,6);
        } 
    }
    
    
    void limpiaMatriz() {
        for(int i=0;i<Principal.apoderados.size();i++){
            tablaApoderados.setValueAt("",i,0);
            tablaApoderados.setValueAt("",i,1);
            tablaApoderados.setValueAt("",i,2);
            tablaApoderados.setValueAt("",i,3);
            tablaApoderados.setValueAt("",i,4);
            tablaApoderados.setValueAt("",i,5);
            tablaApoderados.setValueAt("",i,6);
        }
    }
    
    void CambiarTamañoColumnas(){
    TableColumn column = null;
    //Cambio el ancho de las columnas de la tabla jtblDatos
    column=tablaApoderados.getColumnModel().getColumn(1);
    column.setPreferredWidth(170);
    column=tablaApoderados.getColumnModel().getColumn(2);
    column.setPreferredWidth(170);
    column=tablaApoderados.getColumnModel().getColumn(5);
    column.setPreferredWidth(200);
    }
    
    public static String fechaActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
    return formatoFecha.format(fecha); 
}

     public String CodigoReportNew(){ 
        Formatter obj = new Formatter();
        String numeroCeros = String.valueOf(obj.format("%04d", contador));
        return "Reporte "+numeroCeros;
    }
    
     public void generarPDF(){

        try{
            PdfPTable tabla= new PdfPTable(1);    
            for(int i=0;i<Principal.apoderados.size();i++){
            FamApodeX=Principal.apoderados.get(i);
            String data = FamApodeX.DirectorioFamiliar();
            String regex = "\\[|\\]"; 
            String regex2="\\,|\\]";
            data  = data .replaceAll(regex,"");
            data=data.replaceAll(regex2,"");
            PdfPCell datos= new PdfPCell(new Phrase("   "+""+"\n"+data+"\n"));
            tabla.addCell(datos);
            }
            Document documento= new Document(PageSize.A4,10,10,10,10);
            FileOutputStream archivo =new FileOutputStream(CodigoReportNew()+".pdf");
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
            File path= new File(CodigoReportNew()+".pdf");
            Desktop.getDesktop().open(path);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,  ex);
        } 
    }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaApoderados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnGenerar2 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        tablaApoderados.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tablaApoderados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaApoderados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 680, 300);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel4.setText("Lista Apoderados");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 20, 210, 30);

        btnGenerar2.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnGenerar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_book_and_pencil_100px.png"))); // NOI18N
        btnGenerar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar2);
        btnGenerar2.setBounds(20, 50, 100, 90);

        btnRegresar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_26px.png"))); // NOI18N
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(640, 10, 60, 50);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(240, 60, 220, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista 1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 720, 470);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel3.setText("Lista Apoderados");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 460, 210, 30);

        setBounds(0, 0, 720, 499);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGenerar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar2ActionPerformed

        generarPDF();
        abrirPDF();
    }//GEN-LAST:event_btnGenerar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar2;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JTable tablaApoderados;
    // End of variables declaration//GEN-END:variables
}
