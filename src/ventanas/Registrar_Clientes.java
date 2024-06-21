/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author torut
 */
public class Registrar_Clientes extends javax.swing.JFrame {

    String usuario;
    
    /**
     * Creates new form Registrar_Clientes
     */
    public Registrar_Clientes() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconocacao.png")).getImage());
        
        
        usuario = Login.usuario;
        setTitle("Registrar nuevo cliente - Sesión de " + usuario);
        setSize(560, 498);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 93, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 121, 190, -1));

        txt_cedula.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 189, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Cedula:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 161, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 229, -1, -1));

        txt_telefono.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 257, 190, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Registro de Clientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel9.setText("Fecha");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        txt_valor.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jPanel1.add(txt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 190, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButton1.setText("Registrar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 240, 140));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad/Kilos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        txt_cantidad.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 190, -1));

        txtFecha.setDateFormatString("yyyy-MM-dd");
        txtFecha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 190, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setText("Valor del Kilo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setText("Direccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txt_direccion.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 570, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int validacion = 0;
        String nombre, cedula, telefono, direccion, cantidad, valor, fecha;
        Date fechaSeleccionada = txtFecha.getDate();
        
        nombre = txt_nombre.getText().trim();
        cedula = txt_cedula.getText().trim();
        telefono = txt_telefono.getText().trim();
        direccion = txt_direccion.getText().trim();
        cantidad = txt_cantidad.getText().trim();
        valor = txt_valor.getText().trim();
        
        
        if(nombre.equals("")){
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if(cedula.equals("")){
            txt_cedula.setBackground(Color.red);
            validacion++;
        }
        if(telefono.equals("")){
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
        if(direccion.equals("")){
            txt_direccion.setBackground(Color.red);
            validacion++;
        }
        if(cantidad.equals("")){
            txt_cantidad.setBackground(Color.red);
            validacion++;
        }
        if(valor.equals("")){
            txt_valor.setBackground(Color.red);
            validacion++;
        }
        if(txtFecha.getDate() == null){
            txtFecha.setBackground(Color.red);
            validacion++;
        }
        
        
        if (validacion == 0) {
            
            try {
                
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into clientes values (?,?,?,?,?,?,?,?)");
                
                pst.setInt(1, 0);
                pst.setString(2, nombre);
                pst.setString(3, cedula);
                pst.setString(4, telefono);
                pst.setString(5, direccion);
                pst.setString(6, cantidad);
                pst.setString(7, valor);
                pst.setDate(8, new java.sql.Date(fechaSeleccionada.getTime()));
                
                pst.executeUpdate();
                cn.close();
                
                Limpiar();
                
                txt_nombre.setBackground(Color.green);
                txt_cedula.setBackground(Color.green);
                txt_telefono.setBackground(Color.green);
                txt_direccion.setBackground(Color.green);
                txt_cantidad.setBackground(Color.green);
                txt_valor.setBackground(Color.green);
                txtFecha.setBackground(Color.green);
                
                JOptionPane.showMessageDialog(null, "Registro exitoso.");
                this.dispose();
                
            } catch (SQLException e) {
                System.out.println("Error en registrar cliente." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar cliente!!, contacte al administrador.");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    public void Limpiar(){
        txt_nombre.setText("");
        txt_cedula.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");
        txt_cantidad.setText("");
        txt_valor.setText("");
    }
    
}


