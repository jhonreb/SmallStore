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
import static Formularios.Menú.escritorio;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
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
import javax.swing.table.TableModel;
/**
 *
 * @author Usuario
 */
public class Caja extends javax.swing.JInternalFrame {

    ClassApoderado FamApodeX= new ClassApoderado();
    ClassAlumno FamAluX= new ClassAlumno();
    Concepto FamDeudaX= new Concepto();
    public static List<Integer>cartera;
    ArrayList<Concepto> ListaDePagos;
    DefaultTableModel modeloTabla;
    public boolean mostrar=false;
    float total=0;
    public String texto="";
    int contador=55;

    public Caja() {
        initComponents();
        transparencia();
        txtEmision1.setText(fechaActual());
        txtCorrelativo.setEditable(false);
        txtCorrelativo.setText(FamDeudaX.CorrelativoPagoBoleta());
        cartera=new ArrayList<Integer>();
        ListaDePagos = new ArrayList<>();
        txtGradoAlu.setEditable(false);
        txtNivelAlu.setEditable(false);
        txtNombreResponsable.setEditable(false);
        txtNombreAlumno.setEditable(false);
    }
 public void transparencia(){
        btnAgregarDeuda.setOpaque(false);
        btnAgregarDeuda.setContentAreaFilled(false);
        btnAgregarDeuda.setBorderPainted(false);
        
        btnEliminarDeuda.setOpaque(false);
        btnEliminarDeuda.setContentAreaFilled(false);
        btnEliminarDeuda.setBorderPainted(false);
        
        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
        
        btngrabarPago.setOpaque(false);
        btngrabarPago.setContentAreaFilled(false);
        btngrabarPago.setBorderPainted(false);
    }
         
    public static String fechaActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
    return formatoFecha.format(fecha); 
}
    
     public String CodigoReportNew2(){ 
        Formatter obj = new Formatter();
        String numeroCeros = String.valueOf(obj.format("%04d", contador));
        return "Reporte Ingresos"+numeroCeros;
    }
   

     public void generarPDF2(){

        try{
            Document documento= new Document(PageSize.A4,10,10,10,10);
            FileOutputStream archivo =new FileOutputStream(CodigoReportNew2()+".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            com.itextpdf.text.Font fuente1 = new com.itextpdf.text.Font();
            fuente1.setStyle(1);
            fuente1.setStyle(com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Font fuente2 = new com.itextpdf.text.Font();
            fuente2.setStyle(1);
            fuente2.setSize(15);
            fuente2.setStyle(com.itextpdf.text.Font.BOLD);
            Image imagen = Image.getInstance("D:\\u\\logo.png");  
            imagen.scalePercent(25f);
            imagen.setAlignment(Element.ALIGN_LEFT);
            documento.add(imagen);
            documento.add(new Paragraph(fechaActual()));
            for(int i=0;i<FamAluX.getListaDePagos().size();i++){
                 texto=""+FamAluX.getListaDePagos().get(i);
                documento.add(new Paragraph(""+FamAluX.getListaDePagos().get(i)));}
            documento.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 
    public void abrirPDF2(){
        try{
            File path= new File(CodigoReportNew2()+".pdf");
            Desktop.getDesktop().open(path);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,  ex);
        } 
    }  

    
    public void generarPDF(){
        try{
        FileOutputStream archivo =new FileOutputStream(FamAluX.getApellidos()+", "+ FamAluX.getNombres()+" "+txtCorrelativo.getText()+ ".pdf");
        Document documento= new Document(PageSize.A4.rotate(),10,10,10,10);
        PdfWriter.getInstance(documento, archivo);
        documento.open();
            com.itextpdf.text.Font fuente1 = new com.itextpdf.text.Font();
            fuente1.setStyle(1);
            fuente1.setSize(12);
            com.itextpdf.text.Font fuente3 = new com.itextpdf.text.Font();
            fuente3.setStyle(1);
            fuente3.setSize(15);
            fuente3.setStyle(com.itextpdf.text.Font.BOLD);
            fuente1.setStyle(com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Font fuente2 = new com.itextpdf.text.Font();
            fuente2.setStyle(1);
            fuente2.setSize(18);
            fuente2.setStyle(com.itextpdf.text.Font.BOLD);
            Image imagen = Image.getInstance("D:\\u\\logo.png");  
            imagen.scalePercent(37f);
            imagen.setAlignment(Element.ALIGN_LEFT);
            imagen.setAbsolutePosition(20f, 420f);
            documento.add(imagen);
            documento.add(new Paragraph("\n\n"));  
            PdfPTable tabla2= new PdfPTable(1);
            tabla2.setWidthPercentage(new float[] {170}, PageSize.LETTER);
            tabla2.setHorizontalAlignment(Element.ALIGN_RIGHT);
            PdfPCell datos2= new PdfPCell(new Phrase("       RUC 20607197971      \n\n      BOLETA DE VENTA     \n\n"+"             "+txtCorrelativo.getText()+"\n", fuente2));
            tabla2.addCell(datos2);
            documento.add(tabla2);  
            SimpleDateFormat dFormat= new SimpleDateFormat("dd/MM/yyyy");
                 String date=dFormat.format(Fecha.getDate());
            documento.add(new Paragraph("\n\n\nCEDIT MAGIA DE LOS NIÑOS E.I.R.L."
                    +"                          "
                    + "                                                     "
                    + "                                                   "
                    + "Fecha de emision: "+ fechaActual(),fuente1));
            
            documento.add(new Paragraph("Salaverry, Calle Libertad #312"  +"                       "
                    + "                                                            "
                    + "                                                         "
                    + "   "
                    +"Fecha de pago: "+date,fuente1));

            String data = FamAluX.toString();
            String regex = "\\[|\\]"; 
            String regex2="\\,|\\]";
            data  = data .replaceAll(regex,"");
            data=data.replaceAll(regex2,"");
            PdfPTable tabla= new PdfPTable(1);
            tabla.setWidthPercentage(100);
            PdfPCell datos= new PdfPCell(new Phrase("   "+""+FamApodeX.toString()+"\n"+data));
            tabla.addCell(datos);
            documento.add(new Paragraph("\n"));  
            documento.add(tabla);
            Paragraph impTotal= new Paragraph("Total: S/"+total, fuente3);
            documento.add(impTotal);
            documento.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
 
    public void abrirPDF(){
        try{
            File path= new File(FamAluX.getApellidos()+", "+ FamAluX.getNombres()+" "+txtCorrelativo.getText()+ ".pdf");
            Desktop.getDesktop().open(path);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,  ex);
        } 
    }  

    public static String AñoActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("YYYY");
    return formatoFecha.format(fecha); 
}
    
    String[] cabecera={"ID","Año","Mes","Concepto","Nivel","Grado","Monto"};
    
   private void llenarTabla2(){
        //Generados el modelo de la tabla
        DefaultTableModel modeloDefault=new DefaultTableModel(cabecera,Principal.deudas.size());
        tablaDeudasXAlumno.setModel(modeloDefault);
        TableModel modeloTesoreria=tablaDeudasXAlumno.getModel();
        for(int i=0;i<Principal.deudas.size();i++){
            FamDeudaX=Principal.deudas.get(i);
            //fila i- columna 0
            modeloTesoreria.setValueAt(FamDeudaX.getIdDeuda(),i,0);
            modeloTesoreria.setValueAt(AñoActual(),i,1);
            modeloTesoreria.setValueAt(FamDeudaX.getMes(),i,2);
            modeloTesoreria.setValueAt(FamDeudaX.getConcepto(),i,3);
            modeloTesoreria.setValueAt(FamDeudaX.getNivelConcepto(),i,4);
            modeloTesoreria.setValueAt(FamDeudaX.getGradoConcepto(),i,5);
            modeloTesoreria.setValueAt(FamDeudaX.getMonto(),i,6);
        } 
    }
   
   private void limpiarCaja(){
       txtNombreAlumno.setText("");
       txtNivelAlu.setText("");
       txtGradoAlu.setText("");
       txtNombreResponsable.setText("");
   }
   
    void limpiaMatriz() {
        for(int i=0;i<Principal.deudas.size();i++){
            tablaDeudasXAlumno.setValueAt("",i,0);
            tablaDeudasXAlumno.setValueAt("",i,1);
            tablaDeudasXAlumno.setValueAt("",i,2);
            tablaDeudasXAlumno.setValueAt("",i,3);
            tablaDeudasXAlumno.setValueAt("",i,4);
            tablaDeudasXAlumno.setValueAt("",i,5);
            tablaDeudasXAlumno.setValueAt("",i,6);
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
        tablaDeudasXAlumno = new javax.swing.JTable();
        btngrabarPago = new javax.swing.JButton();
        btnAgregarDeuda = new javax.swing.JButton();
        btnEliminarDeuda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorrelativo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreResponsable = new javax.swing.JTextField();
        buscarFam = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmision1 = new javax.swing.JTextField();
        txtNivelAlu = new javax.swing.JTextField();
        txtGradoAlu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        jSeparator12 = new javax.swing.JSeparator();
        lbEliminar = new javax.swing.JLabel();
        lbAgregarDeuda = new javax.swing.JLabel();
        lbPagar = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(null);

        tablaDeudasXAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tablaDeudasXAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Año", "Mes", "Concepto", "Nivel", "Grado", "Monto"
            }
        ));
        jScrollPane1.setViewportView(tablaDeudasXAlumno);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 390, 1140, 370);

        btngrabarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_64px.png"))); // NOI18N
        btngrabarPago.setToolTipText("Pagar");
        btngrabarPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btngrabarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarPagoActionPerformed(evt);
            }
        });
        getContentPane().add(btngrabarPago);
        btngrabarPago.setBounds(730, 260, 80, 60);

        btnAgregarDeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_debt_64px.png"))); // NOI18N
        btnAgregarDeuda.setToolTipText("Agregar Deuda");
        btnAgregarDeuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDeudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarDeuda);
        btnAgregarDeuda.setBounds(590, 260, 80, 60);

        btnEliminarDeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_trash_48px_1.png"))); // NOI18N
        btnEliminarDeuda.setToolTipText("Eliminar");
        btnEliminarDeuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDeudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarDeuda);
        btnEliminarDeuda.setBounds(450, 260, 90, 60);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel5.setText("Boleta de Venta");
        jPanel3.add(jLabel5);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(880, 130, 180, 30);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel6.setText("RUC   20607197971");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(890, 100, 160, 19);

        txtCorrelativo.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtCorrelativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorrelativoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorrelativo);
        txtCorrelativo.setBounds(880, 170, 180, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(840, 70, 260, 170);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_26px.png"))); // NOI18N
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(1060, 10, 80, 50);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 100, 80, 30);

        txtNombreAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(txtNombreAlumno);
        txtNombreAlumno.setBounds(160, 100, 120, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setText("Responsable");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 180, 90, 30);

        txtNombreResponsable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(txtNombreResponsable);
        txtNombreResponsable.setBounds(160, 180, 440, 30);

        buscarFam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_26px.png"))); // NOI18N
        buscarFam.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscarFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFamActionPerformed(evt);
            }
        });
        getContentPane().add(buscarFam);
        buscarFam.setBounds(640, 90, 60, 40);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel4.setText("Fec. Emisión");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(132, 173, 216));
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(114, 35, 189)), "Datos Principales:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 16), new java.awt.Color(0, 0, 1))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 60, 740, 180);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setText("Fec. Pago");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 140, 70, 30);

        txtEmision1.setEditable(false);
        txtEmision1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(txtEmision1);
        txtEmision1.setBounds(160, 140, 150, 30);

        txtNivelAlu.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNivelAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivelAluActionPerformed(evt);
            }
        });
        getContentPane().add(txtNivelAlu);
        txtNivelAlu.setBounds(340, 100, 100, 30);

        txtGradoAlu.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(txtGradoAlu);
        txtGradoAlu.setBounds(520, 100, 80, 30);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel8.setText("Grado");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 100, 50, 30);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel9.setText("Nivel");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 100, 50, 30);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel11.setText("REGISTRO DE PAGOS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(450, 20, 250, 30);

        Fecha.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        getContentPane().add(Fecha);
        Fecha.setBounds(420, 140, 180, 30);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(440, 50, 260, 20);

        lbEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbEliminar);
        lbEliminar.setBounds(450, 340, 90, 30);

        lbAgregarDeuda.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbAgregarDeuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbAgregarDeuda);
        lbAgregarDeuda.setBounds(570, 340, 130, 30);

        lbPagar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbPagar);
        lbPagar.setBounds(710, 340, 120, 30);

        jCheckBox1.setBackground(new java.awt.Color(208, 213, 255));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jCheckBox1.setText("Mostrar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(860, 280, 100, 27);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado_x1000.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1160, 780);

        setBounds(0, 0, 1156, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void btngrabarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarPagoActionPerformed

       try{
                txtCorrelativo.setText(FamDeudaX.CorrelativoPagoBoleta());
                if(txtNombreAlumno.getText().isEmpty()|| txtNivelAlu.getText().isEmpty() || 
                   txtGradoAlu.getText().isEmpty() || txtNombreResponsable.getText().isEmpty()){
             JOptionPane.showMessageDialog(this,"Completa todos los datos");
             return;
         }else{  
                     
               int resp1 = JOptionPane.showConfirmDialog(this,"Esta seguro de registrar el pago?","Message",JOptionPane.YES_NO_OPTION );
               if(resp1 == JOptionPane.YES_OPTION){
                ListaDePagos=new ArrayList<>();

                FamApodeX.getIdApoderado();FamApodeX.getNombres();FamApodeX.getApellidos();
                FamApodeX.getCelular();FamApodeX.getDireccion();FamApodeX.getSexo();FamApodeX.getDni();
                
                FamDeudaX.getConcepto();FamDeudaX.getGradoConcepto();FamDeudaX.getNivelConcepto();
                FamDeudaX.getMes(); FamDeudaX.getMonto();FamDeudaX.getIdDeuda();
               
                for (int i = 0; i < tablaDeudasXAlumno.getRowCount(); i++) {   
                     
                     DefaultTableModel modelotabla=(DefaultTableModel) tablaDeudasXAlumno.getModel();
                     int id=(int)modelotabla.getValueAt(i, 0);
                     String año=(String) modelotabla.getValueAt(i, 1);
                     String mes=(String)modelotabla.getValueAt(i, 2);
                     String concepto=(String)modelotabla.getValueAt(i, 3);
                     String nivel=(String)modelotabla.getValueAt(i, 4);
                     String grado=(String)modelotabla.getValueAt(i, 5);
                     float monto=(float)modelotabla.getValueAt(i, 6);
                     total=total+(float)modelotabla.getValueAt(i, 6);
                     ListaDePagos.add(new Concepto(concepto,mes,monto,nivel,grado,id));
                     
             }
                FamAluX.getApoderado();FamAluX.getIdAlumno();FamAluX.getNombres();FamAluX.getApellidos();
                FamAluX.getSexo(); FamAluX.getDni();FamAluX.getNivel();FamAluX.getGrado();
                FamAluX.setListaDePagos((ArrayList<Concepto>) ListaDePagos);
                generarPDF();
                int resp2 = JOptionPane.showConfirmDialog(this,"Comprobante registrado correctamente\n¿Desea imprimir la boleta?","Aviso",JOptionPane.YES_NO_OPTION );
                if(resp2 == JOptionPane.YES_OPTION){abrirPDF();}
            } 
        }limpiarCaja();   
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
//limpiarCaja();
//limpiaMatriz();
    }//GEN-LAST:event_btngrabarPagoActionPerformed

    private void btnAgregarDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDeudaActionPerformed

        AsignarDeuda deuda=new  AsignarDeuda();
        escritorio.add(deuda);
        deuda.show();

    }//GEN-LAST:event_btnAgregarDeudaActionPerformed

    private void btnEliminarDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDeudaActionPerformed

        try{
            DefaultTableModel modelo = (DefaultTableModel) tablaDeudasXAlumno.getModel();
            int fila = tablaDeudasXAlumno.getSelectedRow();
            if (fila >= 0) {
                int[] filasselec  = tablaDeudasXAlumno.getSelectedRows();
                for (int i=0; i<filasselec.length; i++){
                    modelo.removeRow(filasselec[i]);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarDeudaActionPerformed

    private void txtCorrelativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorrelativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorrelativoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void buscarFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFamActionPerformed

        BuscarFamilia bFamilia = new BuscarFamilia();
        FamApodeX= bFamilia.apoderadoSelec;
        FamAluX=bFamilia.alumnoSelec;
        escritorio.add(bFamilia);
        bFamilia.show();

        
    }//GEN-LAST:event_buscarFamActionPerformed

    private void txtNivelAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivelAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivelAluActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        if(mostrar){
        lbAgregarDeuda.setText("");
        lbEliminar.setText("");
        lbPagar.setText("");
        
        mostrar=false;
        }else{
        lbAgregarDeuda.setText("Agregar Deuda");
        lbEliminar.setText("Eliminar");
        lbPagar.setText("Grabar Pago");
        mostrar=true;
        }
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton btnAgregarDeuda;
    private javax.swing.JButton btnEliminarDeuda;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btngrabarPago;
    private javax.swing.JButton buscarFam;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JLabel lbAgregarDeuda;
    private javax.swing.JLabel lbEliminar;
    private javax.swing.JLabel lbPagar;
    public static javax.swing.JTable tablaDeudasXAlumno;
    private javax.swing.JTextField txtCorrelativo;
    public static javax.swing.JTextField txtEmision1;
    public static javax.swing.JTextField txtGradoAlu;
    public static javax.swing.JTextField txtNivelAlu;
    public static javax.swing.JTextField txtNombreAlumno;
    public static javax.swing.JTextField txtNombreResponsable;
    // End of variables declaration//GEN-END:variables
}
