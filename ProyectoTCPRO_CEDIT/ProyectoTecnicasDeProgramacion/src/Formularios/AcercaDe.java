/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author Usuario
 */
public class AcercaDe extends javax.swing.JInternalFrame {

    /**
     * Creates new form AcercaDe
     */
    public AcercaDe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_certificate_100px.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 350, 210, 170);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\nDesarrollado por:\n\n * Alarcón Tapia Enrique Luis German  \n * Campos Vegas Aarón Nabile \n * Ramírez Pinillos Adriana Alexandra\n * Solórzano García Alessandro del Piero \n\nDocente : \n\n * Esther Tarmeño Juscamaita. ");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 320, 370, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reunion.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 300);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/21.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 300, 640, 310);

        setBounds(0, 0, 640, 635);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
