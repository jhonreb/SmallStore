/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import CLASES.ClassApoderado;
import CLASES.ClassFunciones;
import CLASES.Principal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario
 */
public class ListaApoderado extends javax.swing.JInternalFrame {

    String[] cabecera={"ID","Nombres","Apellidos","DNI","Sexo","Direccion",
         "Celular"};
    ClassFunciones busquedaApoderado = new ClassFunciones();
    DefaultTableModel modeloDefault=new DefaultTableModel(cabecera,Principal.apoderados.size());
    /**
     * Creates new form ListaApoderado
     */
    public ListaApoderado() {
        initComponents();
        transparencia();
        llenarTabla();
        CambiarTamañoColumnas();
        tablaApoderados.setEnabled(false);
    }
    
    public void transparencia(){
        btnBuscar.setOpaque(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setBorderPainted(false);
        
        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
        
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
    column.setPreferredWidth(150);
    column=tablaApoderados.getColumnModel().getColumn(2);
    column.setPreferredWidth(150);
    column=tablaApoderados.getColumnModel().getColumn(3);
    column.setPreferredWidth(70);
    column=tablaApoderados.getColumnModel().getColumn(4);
    column.setPreferredWidth(75);
    column=tablaApoderados.getColumnModel().getColumn(5);
    column.setPreferredWidth(200);
    column=tablaApoderados.getColumnModel().getColumn(6);
    column.setPreferredWidth(80);
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
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBuscaDNI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBorder(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        tablaApoderados.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tablaApoderados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "DNI", "Sexo", "Direccion", "Celular"
            }
        ));
        jScrollPane1.setViewportView(tablaApoderados);
        if (tablaApoderados.getColumnModel().getColumnCount() > 0) {
            tablaApoderados.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 620, 780, 310);

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
        btnRegresar.setBounds(730, 10, 60, 50);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setText("Lista Apoderados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 460, 210, 30);

        btnBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_26px.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(560, 520, 80, 50);

        txtBuscaDNI.setBackground(new java.awt.Color(255, 251, 244));
        txtBuscaDNI.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtBuscaDNI.setBorder(null);
        txtBuscaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaDNIActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscaDNI);
        txtBuscaDNI.setBounds(260, 540, 140, 30);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Buscar por DNI:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 540, 140, 20);

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator11);
        jSeparator11.setBounds(250, 580, 170, 20);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(310, 490, 220, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona que firma.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 420);

        jPanel1.setBackground(new java.awt.Color(255, 251, 244));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 420, 800, 530);

        setBounds(600, 0, 801, 975);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            limpiaMatriz();
            int dniAporderado = Integer.parseInt(txtBuscaDNI.getText());

            ClassApoderado busq = busquedaApoderado.buscarApodedaro(dniAporderado);

            if (busq != null){
                tablaApoderados.setValueAt(busq.getIdApoderado(), 0, 0);
                tablaApoderados.setValueAt(busq.getNombres(), 0, 1);
                tablaApoderados.setValueAt(busq.getApellidos(), 0, 2);
                tablaApoderados.setValueAt(busq.getDni(), 0, 3);
                tablaApoderados.setValueAt(busq.getSexo(), 0, 4);
                tablaApoderados.setValueAt(busq.getDireccion(),0,5);
                tablaApoderados.setValueAt(busq.getCelular(),0,6);
            }else{
                llenarTabla();
                JOptionPane.showMessageDialog(null, "Apoderado NO encontrado",
                    "Confirmacion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error de Entrada de Datos",
                "Confirmacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaDNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JTable tablaApoderados;
    private javax.swing.JTextField txtBuscaDNI;
    // End of variables declaration//GEN-END:variables
}
