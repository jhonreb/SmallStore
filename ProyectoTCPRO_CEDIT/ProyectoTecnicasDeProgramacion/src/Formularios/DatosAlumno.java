/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

package FORMULARIOS;
import CLASES.ClassAlumno;
import CLASES.ClassApoderado;
import CLASES.Principal;
import static CLASES.Principal.HijosMatriculados;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static Formularios.Menú.escritorio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Formatter;

/**
 *
 * @author Usuario
 */
public class DatosAlumno extends javax.swing.JInternalFrame {

    boolean registrar;
    ClassApoderado ApoderadoX= new ClassApoderado();
    public boolean mostrar=false;
  
    private ClassAlumno modificar;
    
    public DatosAlumno() {
        initComponents();
        transparencia();
        limpiarTextosAlumno();
        textosAlumno(false);
        controlesAlumno(true);
    }
    
     public void transparencia(){
        btnCancelarAlumno.setOpaque(false);
        btnCancelarAlumno.setContentAreaFilled(false);
        btnCancelarAlumno.setBorderPainted(false);
        
        btnEliminarAlumno.setOpaque(false);
        btnEliminarAlumno.setContentAreaFilled(false);
        btnEliminarAlumno.setBorderPainted(false);
        
        btnModificarAlumno.setOpaque(false);
        btnModificarAlumno.setContentAreaFilled(false);
        btnModificarAlumno.setBorderPainted(false);
        
        btnNuevoAlumno.setOpaque(false);
        btnNuevoAlumno.setContentAreaFilled(false);
        btnNuevoAlumno.setBorderPainted(false);
        
        btnRegistrarAlumno.setOpaque(false);
        btnRegistrarAlumno.setContentAreaFilled(false);
        btnRegistrarAlumno.setBorderPainted(false);
        
        btnReporteAlumno.setOpaque(false);
        btnReporteAlumno.setContentAreaFilled(false);
        btnReporteAlumno.setBorderPainted(false);
        
        
    }
     
    String barrn = File.separator;
    String CrearUbicacion = System.getProperty("user.dir") + barrn + "AlumnosTXT" + barrn;

    private void crear() {
        String archivo = getidAlumno() + ".txt";
        File CrearUbi = new File(CrearUbicacion);
        File CrearArchi = new File(CrearUbicacion + archivo);

        try {
            CrearUbi.mkdirs();
            Formatter CrearForma = new Formatter(CrearUbicacion + archivo);
            
            CrearForma.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", "ID= " + getidAlumno(),
                    "NOMBRE= " + getNombresAlumno(), "APELLIDO= "
                    + getApellidosAlumno(), "GRADO= " + getGradoAlumno(),
                    "DNI= " + getDniAlumno(), "NIVEL= " + getNivelAlumno(), "SEXO= " + getSexoAlumno());
            CrearForma.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Registro incorrecto");
        }


    }

    String getidAlumno(){return "AA00"+(Principal.alumnos.size()+100);}
    String getNombresAlumno(){return txtNombresAlumno.getText();}
    String getApellidosAlumno(){return txtApellidosAlumno.getText();}
    int getDniAlumno(){return Integer.parseInt(txtDniAlumno.getText());}
    String getSexoAlumno(){return cboSexoAlumno.getSelectedItem().toString();}
    String getNivelAlumno(){return cboNivelAlumno.getSelectedItem().toString();}
    String getGradoAlumno(){return cboGradoAlumno.getSelectedItem().toString();}
    
    
    void limpiarTextosAlumno(){
      
        txtNombresAlumno.setText("");
        txtApellidosAlumno.setText("");
        txtDniAlumno.setText("");
        cboSexoAlumno.setSelectedIndex(0);
        cboNivelAlumno.setSelectedIndex(0);
        cboGradoAlumno.setSelectedIndex(0);
        txtidApoderado1.setText("");
        txtNombres1.setText("");
        txtApellidos1.setText("");
        
    }
   void textosAlumno(boolean tf){
        //txtidAlumno.setEditable(tf);
        txtNombresAlumno.setEditable(tf);
        txtApellidosAlumno.setEditable(tf);
        cboSexoAlumno.setEnabled(tf);
        txtDniAlumno.setEditable(tf);
        cboNivelAlumno.setEnabled(tf);
        cboGradoAlumno.setEnabled(tf);           
    }
    void controlesAlumno(boolean tf){
        btnNuevoAlumno.setEnabled(tf);
        btnRegistrarAlumno.setEnabled(!tf);
        btnCancelarAlumno.setEnabled(!tf);
        btnReporteAlumno.setEnabled(tf);
        btnEliminarAlumno.setEnabled(tf);
        btnModificarAlumno.setEnabled(tf);
        btnBuscarApoderado.setEnabled(!tf);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtApellidos1 = new javax.swing.JTextField();
        txtidApoderado1 = new javax.swing.JTextField();
        txtNombres1 = new javax.swing.JTextField();
        btnBuscarApoderado = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtNombresAlumno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtApellidosAlumno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDniAlumno = new javax.swing.JTextField();
        btnModificarAlumno = new javax.swing.JButton();
        btnRegistrarAlumno = new javax.swing.JButton();
        btnEliminarAlumno = new javax.swing.JButton();
        btnCancelarAlumno = new javax.swing.JButton();
        cboGradoAlumno = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cboSexoAlumno = new javax.swing.JComboBox();
        cboNivelAlumno = new javax.swing.JComboBox();
        btnNuevoAlumno = new javax.swing.JButton();
        btnReporteAlumno = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        lbNuevo = new javax.swing.JLabel();
        lbModificar = new javax.swing.JLabel();
        lbReporte = new javax.swing.JLabel();
        lbCancelar = new javax.swing.JLabel();
        lbEliminar = new javax.swing.JLabel();
        lbRegistrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Apoderado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 24))); // NOI18N
        jPanel3.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel15.setText("idApoderado:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(24, 80, 100, 19);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel16.setText("Apellidos:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(30, 140, 80, 19);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel17.setText("Nombres:");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(32, 110, 70, 19);

        txtApellidos1.setEditable(false);
        txtApellidos1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPanel3.add(txtApellidos1);
        txtApellidos1.setBounds(120, 140, 228, 25);

        txtidApoderado1.setEditable(false);
        txtidApoderado1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPanel3.add(txtidApoderado1);
        txtidApoderado1.setBounds(160, 70, 130, 30);

        txtNombres1.setEditable(false);
        txtNombres1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPanel3.add(txtNombres1);
        txtNombres1.setBounds(120, 104, 228, 30);

        btnBuscarApoderado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_26px.png"))); // NOI18N
        btnBuscarApoderado.setToolTipText("Buscar");
        btnBuscarApoderado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarApoderado.setEnabled(false);
        btnBuscarApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarApoderadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarApoderado);
        btnBuscarApoderado.setBounds(360, 60, 50, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(110, 10, 450, 200);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nombres");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(120, 350, 90, 30);

        txtNombresAlumno.setBackground(new java.awt.Color(206, 236, 255));
        txtNombresAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtNombresAlumno.setBorder(null);
        txtNombresAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombresAlumno);
        txtNombresAlumno.setBounds(60, 380, 200, 50);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Apellidos:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 350, 100, 30);

        txtApellidosAlumno.setBackground(new java.awt.Color(206, 236, 255));
        txtApellidosAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtApellidosAlumno.setBorder(null);
        txtApellidosAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidosAlumno);
        txtApellidosAlumno.setBounds(340, 380, 240, 50);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Grado");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 550, 70, 20);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DNI");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 450, 53, 20);

        txtDniAlumno.setBackground(new java.awt.Color(206, 236, 255));
        txtDniAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtDniAlumno.setBorder(null);
        txtDniAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniAlumnoActionPerformed(evt);
            }
        });
        txtDniAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txtDniAlumno);
        txtDniAlumno.setBounds(350, 480, 160, 40);

        btnModificarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_pencil_40px.png"))); // NOI18N
        btnModificarAlumno.setToolTipText("Modificar");
        btnModificarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarAlumno);
        btnModificarAlumno.setBounds(260, 690, 130, 80);

        btnRegistrarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_add_user_group_woman_man_48px.png"))); // NOI18N
        btnRegistrarAlumno.setToolTipText("Registrar");
        btnRegistrarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarAlumno);
        btnRegistrarAlumno.setBounds(80, 820, 130, 90);

        btnEliminarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_trash_48px_1.png"))); // NOI18N
        btnEliminarAlumno.setToolTipText("Eliminar");
        btnEliminarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarAlumno);
        btnEliminarAlumno.setBounds(260, 820, 130, 90);

        btnCancelarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_cancel_40px.png"))); // NOI18N
        btnCancelarAlumno.setToolTipText("Cancelar");
        btnCancelarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarAlumno);
        btnCancelarAlumno.setBounds(440, 820, 130, 90);

        cboGradoAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cboGradoAlumno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>", "2 años", "3 años", "4 años", "5 años", "6 años", "7 años" }));
        cboGradoAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboGradoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGradoAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(cboGradoAlumno);
        cboGradoAlumno.setBounds(70, 480, 190, 50);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sexo");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(430, 550, 60, 20);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Nivel");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(130, 440, 60, 30);

        cboSexoAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cboSexoAlumno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>", "Masculino", "Femenino" }));
        cboSexoAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboSexoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(cboSexoAlumno);
        cboSexoAlumno.setBounds(370, 590, 190, 50);

        cboNivelAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cboNivelAlumno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>", "Guardería", "Inicial", "Reforzamiento" }));
        cboNivelAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(cboNivelAlumno);
        cboNivelAlumno.setBounds(70, 590, 190, 50);

        btnNuevoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_new_40px.png"))); // NOI18N
        btnNuevoAlumno.setToolTipText("Nuevo");
        btnNuevoAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoAlumno);
        btnNuevoAlumno.setBounds(80, 690, 130, 80);

        btnReporteAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_file_submodule_40px.png"))); // NOI18N
        btnReporteAlumno.setToolTipText("Reporte");
        btnReporteAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReporteAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporteAlumno);
        btnReporteAlumno.setBounds(430, 690, 150, 80);

        jSeparator11.setBackground(new java.awt.Color(71, 133, 239));
        jSeparator11.setForeground(new java.awt.Color(71, 133, 239));
        getContentPane().add(jSeparator11);
        jSeparator11.setBounds(330, 440, 260, 20);

        jSeparator12.setBackground(new java.awt.Color(71, 133, 239));
        jSeparator12.setForeground(new java.awt.Color(71, 133, 239));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(40, 540, 250, 20);

        jSeparator13.setBackground(new java.awt.Color(71, 133, 239));
        jSeparator13.setForeground(new java.awt.Color(71, 133, 239));
        getContentPane().add(jSeparator13);
        jSeparator13.setBounds(340, 540, 250, 20);

        jSeparator14.setBackground(new java.awt.Color(71, 133, 239));
        jSeparator14.setForeground(new java.awt.Color(71, 133, 239));
        getContentPane().add(jSeparator14);
        jSeparator14.setBounds(40, 650, 250, 20);

        jSeparator15.setBackground(new java.awt.Color(71, 133, 239));
        jSeparator15.setForeground(new java.awt.Color(71, 133, 239));
        getContentPane().add(jSeparator15);
        jSeparator15.setBounds(340, 650, 250, 20);

        jSeparator16.setBackground(new java.awt.Color(71, 133, 239));
        jSeparator16.setForeground(new java.awt.Color(71, 133, 239));
        getContentPane().add(jSeparator16);
        jSeparator16.setBounds(40, 440, 250, 20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_son_48px.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 270, 80, 80);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos del Alumno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 220, 210, 40);

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator17);
        jSeparator17.setBounds(200, 260, 220, 20);

        jCheckBox1.setBackground(new java.awt.Color(206, 236, 255));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jCheckBox1.setText("Mostrar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(110, 660, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bebe.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(670, 0, 730, 950);

        lbNuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbNuevo);
        lbNuevo.setBounds(110, 770, 80, 30);

        lbModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbModificar);
        lbModificar.setBounds(290, 910, 70, 30);

        lbReporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbReporte);
        lbReporte.setBounds(470, 770, 70, 30);

        lbCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbCancelar);
        lbCancelar.setBounds(470, 910, 80, 30);

        lbEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbEliminar);
        lbEliminar.setBounds(290, 770, 80, 30);

        lbRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbRegistrar);
        lbRegistrar.setBounds(110, 910, 70, 30);

        jLabel3.setBackground(new java.awt.Color(0, 14, 28));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 670, 950);

        setBounds(0, 0, 1398, 979);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarApoderadoActionPerformed

        BuscarApoderado buscarApoderado = new BuscarApoderado();
        escritorio.add(buscarApoderado);
        ApoderadoX = buscarApoderado.apoderadoSelec;
        buscarApoderado.show();
        
        
    }//GEN-LAST:event_btnBuscarApoderadoActionPerformed

    private void txtNombresAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresAlumnoKeyTyped

        char c = evt.getKeyChar();
        if((c<'a'||c>'z') &&(c<'A'||c>'Z') && c!=KeyEvent.VK_SPACE && (c!='ñ')
           && (c!='Ñ') && (c!='á') && (c!='é') && (c!='í') && (c!='ó') && (c!='ú'))evt.consume();
    }//GEN-LAST:event_txtNombresAlumnoKeyTyped

    private void txtApellidosAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosAlumnoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a'||c>'z') &&(c<'A'||c>'Z') && c!=KeyEvent.VK_SPACE && (c!='ñ')
           && (c!='Ñ') && (c!='á') && (c!='é') && (c!='í') && (c!='ó') && (c!='ú'))evt.consume();
    }//GEN-LAST:event_txtApellidosAlumnoKeyTyped

    private void txtDniAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniAlumnoActionPerformed

    private void txtDniAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniAlumnoKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9') && c!=KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_txtDniAlumnoKeyTyped

    private void btnModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlumnoActionPerformed

        modificar=null;
        String enrique=JOptionPane.showInputDialog(this,"Ingrese Id del alumno a modificar:","Modificar",JOptionPane.OK_CANCEL_OPTION);

        for(ClassAlumno a: Principal.alumnos){
            if(a.getIdAlumno().equalsIgnoreCase(enrique)){
                modificar=a;
                break;
            }
        }

        if(modificar!=null){// si no esta vacio es porque si existe

            int resp = JOptionPane.showConfirmDialog(this,"Modificar?","Modificar Dato",JOptionPane.YES_NO_OPTION );
            if(resp == JOptionPane.YES_OPTION){

                txtNombresAlumno.setText(modificar.getNombres());
                txtApellidosAlumno.setText(modificar.getApellidos());
                txtDniAlumno.setText(String.valueOf(modificar.getDni()));
                cboSexoAlumno.setSelectedItem(modificar.getSexo());
                cboNivelAlumno.setSelectedItem(modificar.getNivel());
                cboGradoAlumno.setSelectedItem(modificar.getGrado());
                textosAlumno(true);
                controlesAlumno(false);
                registrar=false;
            }if(resp == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(this,"cancelando..");
            }

        }else{
            try{
                if(enrique.equalsIgnoreCase(null)){}
                else JOptionPane.showMessageDialog(this,"Error en la entrada de datos");
            }
            catch(Exception e){JOptionPane.showMessageDialog(null,"Cancelando procedimiento","Mensaje",JOptionPane.ERROR_MESSAGE);}
        }
    }//GEN-LAST:event_btnModificarAlumnoActionPerformed

    private void btnRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlumnoActionPerformed
crear();
if(registrar){
            try{
                if(txtNombresAlumno.getText().isEmpty()|| txtApellidosAlumno.getText().isEmpty() ||
                    txtDniAlumno.getText().isEmpty() || cboGradoAlumno.getSelectedIndex()== 0
                    || cboNivelAlumno.getSelectedIndex()==0 || cboSexoAlumno.getSelectedIndex()==0 ){
                    JOptionPane.showMessageDialog(this,"Completa todos los datos");
                    return;
                }else{

                    if(txtidApoderado1.getText().compareTo("")==0 && txtNombres1.getText().compareTo("")==0
                        && txtApellidos1.getText().compareTo("")==0){
                        JOptionPane.showMessageDialog(this,"ALUMNO SIN APODERADO","No se ingreso apoderado",JOptionPane.WARNING_MESSAGE);
                        return;
                    }else{
                        ClassAlumno alumno= new ClassAlumno(getidAlumno(),getNivelAlumno(), getGradoAlumno(),
                            getNombresAlumno(), getApellidosAlumno(), getDniAlumno(), getSexoAlumno(),ApoderadoX);

                        ApoderadoX.getIdApoderado();
                        ApoderadoX.getNombres();
                        ApoderadoX.getApellidos();
                        ApoderadoX.getCelular();
                        ApoderadoX.getDireccion();
                        ApoderadoX.getSexo();
                        ApoderadoX.getDni();
                        
                        alumno.setApoderado(ApoderadoX);
                        alumno.setIdAlumno(getidAlumno());
                        alumno.setNombres(getNombresAlumno());
                        alumno.setApellidos(getApellidosAlumno());
                        alumno.setDni(getDniAlumno());
                        alumno.setSexo(getSexoAlumno());
                        alumno.setNivel(getNivelAlumno());
                        alumno.setGrado(getGradoAlumno());

                        JOptionPane.showMessageDialog(this,"Alumno registrado con el id:"+(getidAlumno()));
                        Principal.alumnos.add(alumno);}
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            try{
                modificar.setNombres(getNombresAlumno());
                modificar.setApellidos(getApellidosAlumno());
                modificar.setDni(getDniAlumno());
                modificar.setSexo(getSexoAlumno());
                modificar.setNivel(getNivelAlumno());
                modificar.setGrado(getGradoAlumno());

                JOptionPane.showMessageDialog(this, "El alumno se a modificado correctamente..");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        limpiarTextosAlumno();
        textosAlumno(false);
        controlesAlumno(true);      
    }//GEN-LAST:event_btnRegistrarAlumnoActionPerformed

    private void btnEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumnoActionPerformed

        String aaron=JOptionPane.showInputDialog(this,"Ingrese Id del alumno a eliminar:","Eliminar",JOptionPane.OK_CANCEL_OPTION);
        int i=-1;
        for(int j=0;j<Principal.apoderados.size();j++){
            if(Principal.alumnos.get(j).getIdAlumno().equalsIgnoreCase(aaron)){
                i=j;
                break;
            }
        }
        if(i>=0){// si no es -1 significa q si tenemos que eliminar

            int resp = JOptionPane.showConfirmDialog(this,"Deseas Eliminarlo ","Eliminar Dato",JOptionPane.YES_NO_OPTION );

            if(resp == JOptionPane.YES_OPTION ){
                JOptionPane.showMessageDialog(this,"Registro eliminado");
                Principal.alumnos.remove(i);
            }
            if(resp == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(this,"cancelando..");
            }
        }
        else{
            try{
                if(aaron.equalsIgnoreCase(null)){}
                else JOptionPane.showMessageDialog(this,"Error en la entrada de datos");
            }
            catch(Exception e){JOptionPane.showMessageDialog(null,"Cancelando procedimiento","Mensaje",JOptionPane.ERROR_MESSAGE);}
        }
    }//GEN-LAST:event_btnEliminarAlumnoActionPerformed

    private void btnCancelarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlumnoActionPerformed

        limpiarTextosAlumno();
        textosAlumno(false);
        controlesAlumno(true);
    }//GEN-LAST:event_btnCancelarAlumnoActionPerformed

    private void cboGradoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGradoAlumnoActionPerformed

    }//GEN-LAST:event_cboGradoAlumnoActionPerformed

    private void cboSexoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoAlumnoActionPerformed

    }//GEN-LAST:event_cboSexoAlumnoActionPerformed

    private void btnNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAlumnoActionPerformed

        registrar=true;
        limpiarTextosAlumno();
        textosAlumno(true);
        controlesAlumno(false);

        //   txtidApoderado.setVisible(false);
        //   txtidApoderado.requestFocus();
    }//GEN-LAST:event_btnNuevoAlumnoActionPerformed

    private void btnReporteAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteAlumnoActionPerformed
        
        ListaAlumnos frm3=new  ListaAlumnos();
        escritorio.add(frm3);
        frm3.show();
        
    }//GEN-LAST:event_btnReporteAlumnoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       
                                              
        
        if(mostrar){
        lbCancelar.setText("");
        lbModificar.setText("");
        lbEliminar.setText("");
        lbNuevo.setText("");
        lbRegistrar.setText("");
        lbReporte.setText("");
        mostrar=false;
        }else{
        lbCancelar.setText("Cancelar");
        lbModificar.setText("Eliminar");
        lbEliminar.setText("Modificar");
        lbNuevo.setText("Nuevo");
        lbRegistrar.setText("Registrar");
        lbReporte.setText("Reporte");
        mostrar=true;
        }
        
    
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarApoderado;
    private javax.swing.JButton btnCancelarAlumno;
    private javax.swing.JButton btnEliminarAlumno;
    private javax.swing.JButton btnModificarAlumno;
    private javax.swing.JButton btnNuevoAlumno;
    private javax.swing.JButton btnRegistrarAlumno;
    private javax.swing.JButton btnReporteAlumno;
    private javax.swing.JComboBox cboGradoAlumno;
    private javax.swing.JComboBox cboNivelAlumno;
    private javax.swing.JComboBox cboSexoAlumno;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JLabel lbCancelar;
    private javax.swing.JLabel lbEliminar;
    private javax.swing.JLabel lbModificar;
    private javax.swing.JLabel lbNuevo;
    private javax.swing.JLabel lbRegistrar;
    private javax.swing.JLabel lbReporte;
    public static javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtApellidosAlumno;
    private javax.swing.JTextField txtDniAlumno;
    public static javax.swing.JTextField txtNombres1;
    private javax.swing.JTextField txtNombresAlumno;
    public static javax.swing.JTextField txtidApoderado1;
    // End of variables declaration//GEN-END:variables
}
