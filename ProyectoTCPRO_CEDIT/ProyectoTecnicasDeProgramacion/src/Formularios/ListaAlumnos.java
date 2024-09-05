/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import CLASES.ClassAlumno;
import CLASES.ClassApoderado;
import CLASES.ClassFunciones;
import CLASES.Principal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class ListaAlumnos extends javax.swing.JInternalFrame {

    String[] cabecera={"ID","Nombres","Apellidos","DNI","Sexo","Nivel","Grado","Apoderado"};
    ClassFunciones busquedaAlumno = new ClassFunciones();
    ClassApoderado ApoderadoX;
    public ListaAlumnos() {
        initComponents();
        
        transparencia();
        llenarTabla();
        CambiarTamañoColumnas();
        tablaAlumnos.setEnabled(false);
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
     void CambiarTamañoColumnas(){
    TableColumn column = null;
    //Cambio el ancho de las columnas de la tabla jtblDatos
    column=tablaAlumnos.getColumnModel().getColumn(0);
    column.setPreferredWidth(60);
    column=tablaAlumnos.getColumnModel().getColumn(1);
    column.setPreferredWidth(120);
    column=tablaAlumnos.getColumnModel().getColumn(2);
    column.setPreferredWidth(120);
    column=tablaAlumnos.getColumnModel().getColumn(3);
    column.setPreferredWidth(70);
    column=tablaAlumnos.getColumnModel().getColumn(4);
    column.setPreferredWidth(70);
    column=tablaAlumnos.getColumnModel().getColumn(5);
    column.setPreferredWidth(110);
    column=tablaAlumnos.getColumnModel().getColumn(7);
    column.setPreferredWidth(100);
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBuscaDNI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(null);

        tablaAlumnos.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
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
        jScrollPane1.setBounds(10, 610, 780, 320);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_26px.png"))); // NOI18N
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(720, 20, 50, 50);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Alumnos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 430, 170, 29);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_26px.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(590, 520, 70, 40);

        txtBuscaDNI.setBackground(new java.awt.Color(255, 251, 244));
        txtBuscaDNI.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtBuscaDNI.setBorder(null);
        txtBuscaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaDNIActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscaDNI);
        txtBuscaDNI.setBounds(280, 520, 180, 40);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Buscar por DNI:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(120, 530, 140, 20);

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator11);
        jSeparator11.setBounds(270, 570, 210, 20);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(320, 460, 190, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/niños.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 420);

        jPanel1.setBackground(new java.awt.Color(255, 251, 244));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 420, 800, 540);

        setBounds(600, 0, 800, 982);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            limpiaMatriz();
            int dniAlumno = Integer.parseInt(txtBuscaDNI.getText());

            ClassAlumno busq = busquedaAlumno.buscarAlumno(dniAlumno);

            if (busq != null){
                tablaAlumnos.setValueAt(busq.getIdAlumno(), 0, 0);
                tablaAlumnos.setValueAt(busq.getNombres(), 0, 1);
                tablaAlumnos.setValueAt(busq.getApellidos(), 0, 2);
                tablaAlumnos.setValueAt(busq.getDni(), 0, 3);
                tablaAlumnos.setValueAt(busq.getSexo(), 0, 4);
                tablaAlumnos.setValueAt(busq.getNivel(), 0, 5);
                tablaAlumnos.setValueAt(busq.getGrado(), 0, 6);
                tablaAlumnos.setValueAt(busq.getApoderado().getNombres(), 0, 7);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField txtBuscaDNI;
    // End of variables declaration//GEN-END:variables
}
