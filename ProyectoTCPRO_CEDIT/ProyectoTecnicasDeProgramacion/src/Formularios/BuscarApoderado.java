/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import CLASES.ClassApoderado;
import CLASES.Principal;
import CLASES.ClassAlumno;
import CLASES.ClassFunciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class BuscarApoderado extends javax.swing.JInternalFrame {

    int filaSeleccionada;
    
    String[] cabecera={"ID","Nombres","Apellidos","DNI","Sexo",
         "Celular","Direccion"};
    ClassApoderado apoderadoSelec = new ClassApoderado();
    
    ClassFunciones busquedaApoderado = new ClassFunciones();
    
    DefaultTableModel modelito=new DefaultTableModel(cabecera,Principal.apoderados.size());
    
    public BuscarApoderado() {
        initComponents();
        transparencia();
        llenarTabla();
        CambiarTamañoColumnas();
    }
    public void transparencia(){
        btnBuscar.setOpaque(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setBorderPainted(false);
        
        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
        
        btnSeleccionar.setOpaque(false);
        btnSeleccionar.setContentAreaFilled(false);
        btnSeleccionar.setBorderPainted(false);
        
    }

    private void llenarTabla(){
        //Generados el modelo de la tabla
     //   DefaultTableModel modelito=new DefaultTableModel(cabecera,Principal.apoderados.size());
        tablaApoderados2.setModel(modelito);
        TableModel modeloDatosApoderadoBuscando=tablaApoderados2.getModel();
        for(int i=0;i<Principal.apoderados.size();i++){
            ClassApoderado apoderado=Principal.apoderados.get(i);
            //fila i- columna 0
            modeloDatosApoderadoBuscando.setValueAt(apoderado.getIdApoderado(),i,0);
            modeloDatosApoderadoBuscando.setValueAt(apoderado.getNombres(),i,1);
            modeloDatosApoderadoBuscando.setValueAt(apoderado.getApellidos(),i,2);
            modeloDatosApoderadoBuscando.setValueAt(apoderado.getDni(),i,3);
            modeloDatosApoderadoBuscando.setValueAt(apoderado.getSexo(),i,4);
            modeloDatosApoderadoBuscando.setValueAt(apoderado.getCelular(),i,5);
            modeloDatosApoderadoBuscando.setValueAt(apoderado.getDireccion(),i,6);
        } 
    }
    void limpiaMatriz() {
        for(int i=0;i<Principal.apoderados.size();i++){
            tablaApoderados2.setValueAt("",i,0);
            tablaApoderados2.setValueAt("",i,1);
            tablaApoderados2.setValueAt("",i,2);
            tablaApoderados2.setValueAt("",i,3);
            tablaApoderados2.setValueAt("",i,4);
            tablaApoderados2.setValueAt("",i,5);
            tablaApoderados2.setValueAt("",i,6);
        }
    }
    
    void CambiarTamañoColumnas(){
    TableColumn column = null;
    //Cambio el ancho de las columnas de la tabla jtblDatos
    column=tablaApoderados2.getColumnModel().getColumn(0);
    column.setPreferredWidth(50);
    column=tablaApoderados2.getColumnModel().getColumn(1);
    column.setPreferredWidth(120);
    column=tablaApoderados2.getColumnModel().getColumn(2);
    column.setPreferredWidth(120);
    column=tablaApoderados2.getColumnModel().getColumn(3);
    column.setPreferredWidth(60);
    column=tablaApoderados2.getColumnModel().getColumn(4);
    column.setPreferredWidth(70);
    column=tablaApoderados2.getColumnModel().getColumn(5);
    column.setPreferredWidth(70);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaApoderados2 = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        txtBuscaDNI = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(null);

        tablaApoderados2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tablaApoderados2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaApoderados2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 740, 320);

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
        btnRegresar.setBounds(690, 10, 50, 50);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Apoderado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 30, 210, 21);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Buscar por DNI:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 90, 140, 30);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_26px.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(390, 90, 60, 35);

        btnSeleccionar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_checked_radio_button_48px_1.png"))); // NOI18N
        btnSeleccionar.setToolTipText("Seleccionar un apoderado de la lista.");
        btnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar);
        btnSeleccionar.setBounds(540, 100, 60, 50);

        txtBuscaDNI.setBackground(new java.awt.Color(206, 236, 255));
        txtBuscaDNI.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtBuscaDNI.setBorder(null);
        getContentPane().add(txtBuscaDNI);
        txtBuscaDNI.setBounds(180, 90, 180, 30);

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator11);
        jSeparator11.setBounds(270, 60, 230, 10);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(170, 130, 200, 20);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccionar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(534, 154, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 760, 530);

        setBounds(648, 0, 756, 547);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try{
            limpiaMatriz();
            int dniApoderado = Integer.parseInt(txtBuscaDNI.getText());

            ClassApoderado busq = busquedaApoderado.buscarApodedaro(dniApoderado);

            if (busq != null){
                tablaApoderados2.setValueAt(busq.getIdApoderado(), 0, 0);
                tablaApoderados2.setValueAt(busq.getNombres(), 0, 1);
                tablaApoderados2.setValueAt(busq.getApellidos(), 0, 2);
                tablaApoderados2.setValueAt(busq.getDni(), 0, 3);
                tablaApoderados2.setValueAt(busq.getSexo(), 0, 4);
                tablaApoderados2.setValueAt(busq.getCelular(), 0, 5);
                tablaApoderados2.setValueAt(busq.getDireccion(), 0, 6);
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

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:

        if(tablaApoderados2.getSelectedRow()>=0){
            try{
                DefaultTableModel tm = (DefaultTableModel)tablaApoderados2.getModel();
                String ID = String.valueOf(tm.getValueAt(tablaApoderados2.getSelectedRow(),0));

                String NOMBRE = String.valueOf(tm.getValueAt(tablaApoderados2.getSelectedRow(),1));
                String APELLIDO= String.valueOf(tm.getValueAt(tablaApoderados2.getSelectedRow(),2));

                int DNI = Integer.parseInt(String.valueOf(tm.getValueAt(tablaApoderados2.getSelectedRow(),3)));
                String SEXO=String.valueOf(tm.getValueAt(tablaApoderados2.getSelectedRow(),4));
                int CELULAR = Integer.parseInt(String.valueOf(tm.getValueAt(tablaApoderados2.getSelectedRow(),5)));
                String DIRECCION = String.valueOf(tm.getValueAt(tablaApoderados2.getSelectedRow(),6));

                DatosAlumno.txtidApoderado1.setText(ID);
                DatosAlumno.txtNombres1.setText(NOMBRE);
                DatosAlumno.txtApellidos1.setText(APELLIDO);

                apoderadoSelec.setIdApoderado(ID);
                apoderadoSelec.setNombres(NOMBRE);
                apoderadoSelec.setApellidos(APELLIDO);
                apoderadoSelec.setDni(DNI);
                apoderadoSelec.setSexo(SEXO);
                apoderadoSelec.setDireccion(DIRECCION);
                apoderadoSelec.setCelular(CELULAR);
                this.dispose();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"NO EXISTEN DATOS");
            }

        }else{
            JOptionPane.showMessageDialog(this,"DEBE SELECCIONAR UN APODERADO","SISTEMA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    public static javax.swing.JTable tablaApoderados2;
    private javax.swing.JTextField txtBuscaDNI;
    // End of variables declaration//GEN-END:variables
}
