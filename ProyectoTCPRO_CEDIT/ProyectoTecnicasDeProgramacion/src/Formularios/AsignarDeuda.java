/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import CLASES.Concepto;
import CLASES.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AsignarDeuda extends javax.swing.JInternalFrame {

    /**
     * Creates new form AsignarDeuda
     */
    public AsignarDeuda() {
        initComponents();
        transparencia();
        llenarTablaInicial();
        llenarTablaGuarderia();
        llenarTablaReforzamiento();
        CambiarTamañoColumnas();
    }
    
 public static String AñoActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("YYYY");
    return formatoFecha.format(fecha); 
}
    
    public void transparencia(){

        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false); 
        
        btnSeleccionDeuda.setOpaque(false);
        btnSeleccionDeuda.setContentAreaFilled(false);
        btnSeleccionDeuda.setBorderPainted(false); 
        
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false); 
  
    }
 
  String[] cabecera={"ID","Año","Mes","Concepto","Nivel","Grado","Monto"};
   
    
   Concepto deuda=new Concepto();
   Concepto deudasSelec = new Concepto();
   Concepto deudaInicial=new Concepto();
   Concepto deudaReforzamiento=new Concepto();
   Concepto deudaGuarderia=new Concepto();
 /*    private void llenarTablaTodos(){
        //Generados el modelo de la tabla
        
        DefaultTableModel modeloDefault=new DefaultTableModel(cabecera,Principal.deudas.size());

        for(int i=0;i<Principal.deudas.size();i++){
           ListaDeudasCreadas.tabladeudas.setModel(modeloDefault);
           TableModel modeloDeuda=ListaDeudasCreadas.tabladeudas.getModel();
            deuda=Principal.deudas.get(i);
            //fila i- columna 0
            modeloDeuda.setValueAt(AñoActual(),i,0);
            modeloDeuda.setValueAt(deuda.getMes(),i,1);
            modeloDeuda.setValueAt(deuda.getConcepto(),i,2);
            modeloDeuda.setValueAt(deuda.getNivelConcepto(),i,3);
            modeloDeuda.setValueAt(deuda.getGradoConcepto(),i,4);
            modeloDeuda.setValueAt(deuda.getFechaVencimiento(),i,5);
            modeloDeuda.setValueAt(deuda.getMonto(),i,6);
            modeloDeuda.setValueAt(deuda.getMora(),i,7);
        }
}*/
   
    void CambiarTamañoColumnas(){
    TableColumn column = null;
    //Cambio el ancho de las columnas de la tabla jtblDatos
    column=tablaGuarderia.getColumnModel().getColumn(2);
    column.setPreferredWidth(160);
    column=tablaGuarderia.getColumnModel().getColumn(3);
    column.setPreferredWidth(120);
    column=tablaInicial.getColumnModel().getColumn(2);
    column.setPreferredWidth(160);
    column=tablaInicial.getColumnModel().getColumn(3);
    column.setPreferredWidth(120);
    column=tablaReforzamiento.getColumnModel().getColumn(2);
    column.setPreferredWidth(160);
    column=tablaReforzamiento.getColumnModel().getColumn(3);
    column.setPreferredWidth(120);
    }
   
   
   
     
private void llenarTablaInicial(){
        //Generados el modelo de la tabla
        
        DefaultTableModel modeloDefault2=new DefaultTableModel(cabecera,Principal.deudasInicial.size());

        for(int i=0;i<Principal.deudasInicial.size();i++){
           tablaInicial.setModel(modeloDefault2);
           TableModel modeloDeuda=tablaInicial.getModel();
            deudaInicial=Principal.deudasInicial.get(i);
            //fila i- columna 0
            modeloDeuda.setValueAt(deudaInicial.getIdDeuda(),i,0);
            modeloDeuda.setValueAt(AñoActual(),i,1);
            modeloDeuda.setValueAt(deudaInicial.getMes(),i,2);
            modeloDeuda.setValueAt(deudaInicial.getConcepto(),i,3);
            modeloDeuda.setValueAt(deudaInicial.getNivelConcepto(),i,4);
            modeloDeuda.setValueAt(deudaInicial.getGradoConcepto(),i,5);
            modeloDeuda.setValueAt(deudaInicial.getMonto(),i,6);
        }
}


private void llenarTablaGuarderia(){
        //Generados el modelo de la tabla
        
        DefaultTableModel modeloDefault3=new DefaultTableModel(cabecera,Principal.deudasGuarderia.size());

        for(int i=0;i<Principal.deudasGuarderia.size();i++){
           tablaGuarderia.setModel(modeloDefault3);
           TableModel modeloDeuda=tablaGuarderia.getModel();
            deudaGuarderia=Principal.deudasGuarderia.get(i);
            //fila i- columna 0
            modeloDeuda.setValueAt(deudaGuarderia.getIdDeuda(),i,0);
            modeloDeuda.setValueAt(AñoActual(),i,1);
            modeloDeuda.setValueAt(deudaGuarderia.getMes(),i,2);
            modeloDeuda.setValueAt(deudaGuarderia.getConcepto(),i,3);
            modeloDeuda.setValueAt(deudaGuarderia.getNivelConcepto(),i,4);
            modeloDeuda.setValueAt(deudaGuarderia.getGradoConcepto(),i,5);
            modeloDeuda.setValueAt(deudaGuarderia.getMonto(),i,6);
        }
}

private void llenarTablaReforzamiento(){
        //Generados el modelo de la tabla
        
        DefaultTableModel modeloDefault4=new DefaultTableModel(cabecera,Principal.deudasReforzamiento.size());
        for(int i=0;i<Principal.deudasReforzamiento.size();i++){
           tablaReforzamiento.setModel(modeloDefault4);
           TableModel modeloDeuda=tablaReforzamiento.getModel();
            deudaReforzamiento=Principal.deudasReforzamiento.get(i);
            //fila i- columna 0
            modeloDeuda.setValueAt(deudaReforzamiento.getIdDeuda(),i,0);
            modeloDeuda.setValueAt(AñoActual(),i,1);
            modeloDeuda.setValueAt(deudaReforzamiento.getMes(),i,2);
            modeloDeuda.setValueAt(deudaReforzamiento.getConcepto(),i,3);
            modeloDeuda.setValueAt(deudaReforzamiento.getNivelConcepto(),i,4);
            modeloDeuda.setValueAt(deudaReforzamiento.getGradoConcepto(),i,5);
            modeloDeuda.setValueAt(deudaReforzamiento.getMonto(),i,6);
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGuarderia = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaInicial = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaReforzamiento = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSeleccionDeuda = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(null);

        jTabbedPane2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jPanel6.setLayout(null);

        tablaGuarderia.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tablaGuarderia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaGuarderia);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 620, 300);

        jTabbedPane2.addTab("Guardería", jPanel6);

        jPanel8.setLayout(null);

        tablaInicial.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaInicial);

        jPanel8.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 620, 300);

        jTabbedPane2.addTab("Inicial", jPanel8);

        jPanel9.setLayout(null);

        tablaReforzamiento.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tablaReforzamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaReforzamiento);

        jPanel9.add(jScrollPane4);
        jScrollPane4.setBounds(10, 10, 620, 300);

        jTabbedPane2.addTab("Reforzamiento", jPanel9);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(40, 200, 650, 350);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel4.setText("Eliminar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 180, 100, 20);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Asignar Deudas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 30, 190, 29);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_26px.png"))); // NOI18N
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(650, 10, 59, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_trash_48px_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 120, 60, 50);

        btnSeleccionDeuda.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        btnSeleccionDeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_checked_radio_button_48px_1.png"))); // NOI18N
        btnSeleccionDeuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSeleccionDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionDeudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionDeuda);
        btnSeleccionDeuda.setBounds(460, 120, 60, 50);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(270, 60, 190, 10);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setText("Seleccionar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 180, 100, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado_x1000.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 560);

        setBounds(0, 0, 726, 587);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSeleccionDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionDeudaActionPerformed

      ///   try{
            if(tablaGuarderia.getSelectedRow()>=0||tablaInicial.getSelectedRow()>=0||tablaReforzamiento.getSelectedRow()>=0){
                TableModel modeloG= tablaGuarderia.getModel();
                TableModel modeloI= tablaInicial.getModel();
                TableModel modeloR= tablaReforzamiento.getModel();
                int []filasG=tablaGuarderia.getSelectedRows();
                int []filasI=tablaInicial.getSelectedRows();
                int []filasR=tablaReforzamiento.getSelectedRows();
                Object[]row= new Object[8];

                DefaultTableModel modeloDA=(DefaultTableModel)Caja.tablaDeudasXAlumno.getModel();

                for(int i=0;i<filasG.length;i++){
                    row[0]=modeloG.getValueAt(filasG[i],0);
                    row[1]=modeloG.getValueAt(filasG[i],1);
                    row[2]=modeloG.getValueAt(filasG[i],2);
                    row[3]=modeloG.getValueAt(filasG[i],3);
                    row[4]=modeloG.getValueAt(filasG[i],4);
                    row[5]=modeloG.getValueAt(filasG[i],5);
                    row[6]=modeloG.getValueAt(filasG[i],6);
                    modeloDA.addRow(row);
                    deudasSelec.setIdDeuda((int)row[0]);
                    deudasSelec.setMes(String.valueOf(row[2]));
                    deudasSelec.setConcepto(String.valueOf(row[3]));
                    deudasSelec.setNivelConcepto(String.valueOf(row[4]));
                    deudasSelec.setGradoConcepto(String.valueOf(row[5]));
                    deudasSelec.setMonto((Float)(row[6]));
                }

                for(int i=0;i<filasI.length;i++){
                    row[0]=modeloI.getValueAt(filasI[i],0);
                    row[1]=modeloI.getValueAt(filasI[i],1);
                    row[2]=modeloI.getValueAt(filasI[i],2);
                    row[3]=modeloI.getValueAt(filasI[i],3);
                    row[4]=modeloI.getValueAt(filasI[i],4);
                    row[5]=modeloI.getValueAt(filasI[i],5);
                    row[6]=modeloI.getValueAt(filasI[i],6);
                    modeloDA.addRow(row);
                    deudasSelec.setIdDeuda((int)row[0]);
                    deudasSelec.setMes(String.valueOf(row[2]));
                    deudasSelec.setConcepto(String.valueOf(row[3]));
                    deudasSelec.setNivelConcepto(String.valueOf(row[4]));
                    deudasSelec.setGradoConcepto(String.valueOf(row[5]));
                    deudasSelec.setMonto((Float)(row[6]));
                }

                for(int i=0;i<filasR.length;i++){
                    row[0]=modeloR.getValueAt(filasR[i],0);
                    row[1]=modeloR.getValueAt(filasR[i],1);
                    row[2]=modeloR.getValueAt(filasR[i],2);
                    row[3]=modeloR.getValueAt(filasR[i],3);
                    row[4]=modeloR.getValueAt(filasR[i],4);
                    row[5]=modeloR.getValueAt(filasR[i],5);
                    row[6]=modeloR.getValueAt(filasR[i],6);
                    modeloDA.addRow(row);
                    deudasSelec.setIdDeuda((int)row[0]);
                    deudasSelec.setMes(String.valueOf(row[2]));
                    deudasSelec.setConcepto(String.valueOf(row[3]));
                    deudasSelec.setNivelConcepto(String.valueOf(row[4]));
                    deudasSelec.setGradoConcepto(String.valueOf(row[5]));
                    deudasSelec.setMonto((Float)(row[6]));
                }
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this,"No has seleccionado un registro");
            }
            /*     }catch(Exception e){
            JOptionPane.showMessageDialog(this,"NO EXISTEN DATOS");
        }*/
    }//GEN-LAST:event_btnSeleccionDeudaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(tablaGuarderia.getSelectedRow()>=0||tablaInicial.getSelectedRow()>=0||tablaReforzamiento.getSelectedRow()>=0){
            DefaultTableModel modeloG = (DefaultTableModel) tablaGuarderia.getModel();
            DefaultTableModel modeloI= (DefaultTableModel)tablaInicial.getModel();
            DefaultTableModel modeloR= (DefaultTableModel)tablaReforzamiento.getModel();
            int []filasG=tablaGuarderia.getSelectedRows();
            int []filasI=tablaInicial.getSelectedRows();
            int []filasR=tablaReforzamiento.getSelectedRows();

            for (int i=0; i<filasG.length; i++){
                Principal.deudasGuarderia.remove(i);
                modeloG.removeRow(filasG[i]);
            }
            for (int i=0; i<filasI.length; i++){
                Principal.deudasInicial.remove(i);
                modeloI.removeRow(filasI[i]);
            }
            for (int i=0; i<filasR.length; i++){
                Principal.deudasReforzamiento.remove(i);
                modeloR.removeRow(filasR[i]);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSeleccionDeuda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tablaGuarderia;
    private javax.swing.JTable tablaInicial;
    private javax.swing.JTable tablaReforzamiento;
    // End of variables declaration//GEN-END:variables
}
