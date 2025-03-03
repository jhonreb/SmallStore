/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import CLASES.ClassAlumno;
import CLASES.ClassApoderado;
import CLASES.Concepto;
import CLASES.Principal;
import static java.lang.String.format;
import static java.text.MessageFormat.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario
 */
public class ListaDeudasCreadas extends javax.swing.JInternalFrame {

    ClassAlumno AlumnoDebe= new ClassAlumno();
    ClassApoderado ApoderadoDebe= new ClassApoderado();

    String[] cabecera={"ID","AÑO","Mes","Concepto","Nivel","Grado",
         "Monto"};
    
    DefaultTableModel modeloDefault1=new DefaultTableModel(cabecera,Principal.deudas.size());
    
    public ListaDeudasCreadas() {
        initComponents();
        transparencia();
        llenarTabla();
        CambiarTamañoColumnas();
        tabladeudas.setEnabled(false);
    }
    public void transparencia(){
        btnregresar.setOpaque(false);
        btnregresar.setContentAreaFilled(false);
        btnregresar.setBorderPainted(false);
        
        btnAgregar.setOpaque(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setBorderPainted(false);
        
    }
    
   public static String AñoActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("YYYY");
    return formatoFecha.format(fecha); 
}
    void CambiarTamañoColumnas(){
    TableColumn column = null;
    //Cambio el ancho de las columnas de la tabla jtblDatos
    column=tabladeudas.getColumnModel().getColumn(1);
    column.setPreferredWidth(20);
    column=tabladeudas.getColumnModel().getColumn(3);
    column.setPreferredWidth(110);
    column=tabladeudas.getColumnModel().getColumn(6);
    column.setPreferredWidth(110);
    }
    
     void limpiar(){
        for(int i=0;i<contadorLim;i++){
            tabladeudas.setValueAt("",i,0);
            tabladeudas.setValueAt("",i,1);
            tabladeudas.setValueAt("",i,2);
            tabladeudas.setValueAt("",i,3);
            tabladeudas.setValueAt("",i,4);
            tabladeudas.setValueAt("",i,5);
            tabladeudas.setValueAt("",i,6);
        }
    }
     
    Concepto deuda;
    int contadorLim=0;
     private void llenarTabla(){
        //Generados el modelo de la tabla
        tabladeudas.setModel(modeloDefault1);
        TableModel modeloDeuda=tabladeudas.getModel();
        for(int i=0;i<Principal.deudas.size();i++){
            deuda=Principal.deudas.get(i);
            //fila i- columna 0
            modeloDeuda.setValueAt(deuda.getIdDeuda(),i,0);
            modeloDeuda.setValueAt(AñoActual(),i,1);
            modeloDeuda.setValueAt(deuda.getMes(),i,2);
            modeloDeuda.setValueAt(deuda.getConcepto(),i,3);
            modeloDeuda.setValueAt(deuda.getNivelConcepto(),i,4);
            modeloDeuda.setValueAt(deuda.getGradoConcepto(),i,5);
            modeloDeuda.setValueAt(deuda.getMonto(),i,6);
            contadorLim++;
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
        tabladeudas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(null);

        tabladeudas.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tabladeudas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabladeudas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 810, 330);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_new_copy_40px.png"))); // NOI18N
        btnAgregar.setToolTipText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(70, 80, 80, 70);

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_26px.png"))); // NOI18N
        btnregresar.setToolTipText("Regresar");
        btnregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar);
        btnregresar.setBounds(760, 10, 70, 50);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setText("Lista Deudas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 20, 170, 29);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(340, 50, 190, 20);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agregar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 150, 80, 21);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado_x1000.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 850, 580);

        setBounds(0, 0, 848, 566);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        
        
        CrearDeuda frm10=new  CrearDeuda();
        Menú.escritorio.add(frm10);
        frm10.show();
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator12;
    public static javax.swing.JTable tabladeudas;
    // End of variables declaration//GEN-END:variables
}
