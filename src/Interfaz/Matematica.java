/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author juanb
 */
public class Matematica extends javax.swing.JFrame {

    /**
     * Creates new form Matematica
     */
    public Matematica() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(693, 588));
        setMinimumSize(new java.awt.Dimension(693, 588));
        setPreferredSize(new java.awt.Dimension(693, 588));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        jLabel1.setText("OPERACIONES MATEMATICAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 60, 542, 54);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setText("NÚMERO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 140, 190, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel3.setText("NÚMERO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 270, 200, 50);

        jTextFieldNumero1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextFieldNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumero1);
        jTextFieldNumero1.setBounds(60, 180, 200, 50);

        jTextFieldNumero2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getContentPane().add(jTextFieldNumero2);
        jTextFieldNumero2.setBounds(60, 320, 200, 50);

        jButtonAtras.setBackground(new java.awt.Color(102, 255, 51));
        jButtonAtras.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras);
        jButtonAtras.setBounds(0, 0, 170, 40);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 700, 90);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("SUMA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(400, 50, 150, 40);

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setText("RESTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(400, 100, 150, 40);

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton3.setText("MULTIPLICACION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(360, 150, 240, 40);

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton4.setText("DIVISIÓN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(400, 200, 150, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 130, 700, 300);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);

        jLabelResultado.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabelResultado.setText("Resultado:");
        jPanel3.add(jLabelResultado);
        jLabelResultado.setBounds(10, 10, 670, 90);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 430, 700, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int ValorUno = 0;
        int ValorDos = 0;
        int Resultado = 0;
        
        ValorUno = Integer.parseInt(jTextFieldNumero1.getText());
        ValorDos = Integer.parseInt(jTextFieldNumero2.getText());
        Resultado = ValorUno + ValorDos;
        
        jLabelResultado.setText("El resultado de la suma es: " + Resultado);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int ValorUno = 0;
        int ValorDos = 0;
        int Resultado = 0;
        
        ValorUno = Integer.parseInt(jTextFieldNumero1.getText());
        ValorDos = Integer.parseInt(jTextFieldNumero2.getText());
        Resultado = ValorUno - ValorDos;
        
        jLabelResultado.setText("El resultado de la suma es: " + Resultado);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int ValorUno = 0;
        int ValorDos = 0;
        int Resultado = 0;
        
        ValorUno = Integer.parseInt(jTextFieldNumero1.getText());
        ValorDos = Integer.parseInt(jTextFieldNumero2.getText());
        Resultado = ValorUno * ValorDos;
        
        jLabelResultado.setText("El resultado de la suma es: " + Resultado);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int ValorUno = 0;
        int ValorDos = 0;
        int Resultado = 0;
        
        ValorUno = Integer.parseInt(jTextFieldNumero1.getText());
        ValorDos = Integer.parseInt(jTextFieldNumero2.getText());
        Resultado = ValorUno / ValorDos;
        
        jLabelResultado.setText("El resultado de la suma es: " + Resultado);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Matematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matematica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    // End of variables declaration//GEN-END:variables
}
