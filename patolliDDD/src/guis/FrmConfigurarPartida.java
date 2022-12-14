/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author edw_v
 */
public class FrmConfigurarPartida extends javax.swing.JDialog {

    /**
     * Creates new form ConfigurarPartida
     */
    public FrmConfigurarPartida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

    }

    public boolean validaMonto(java.awt.event.KeyEvent evt) {
        try {
            txtPuntosApuesta.getText().trim();
            if (txtPuntosApuesta.getText().length() >= 7) {
                float maximo = 9999999;
                float fondoA = Float.parseFloat(txtPuntosApuesta.getText());
                if ((fondoA > 0 || fondoA >= maximo)) {

                    JOptionPane.showMessageDialog(null, "Se han validado los datos correctamente");
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Solo se aceptan números");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "LLene los datos solo con números");
            return false;
        }
        return false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPuntosApuesta1 = new javax.swing.JTextField();
        panelConfigurarPartida = new javax.swing.JPanel();
        lblNoJugadores = new javax.swing.JLabel();
        lblPuntosApuesta = new javax.swing.JLabel();
        lblCasillas = new javax.swing.JLabel();
        comboBoxCasillas = new javax.swing.JComboBox<>();
        comboBoxJugadores = new javax.swing.JComboBox<>();
        txtPuntosApuesta = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMontoApuesta = new javax.swing.JTextField();

        txtPuntosApuesta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuntosApuesta1KeyTyped(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNoJugadores.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNoJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txtNoJugadores.png"))); // NOI18N

        lblPuntosApuesta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPuntosApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txtPuntosApuesta.png"))); // NOI18N

        lblCasillas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCasillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txtCasillasTablero.png"))); // NOI18N

        comboBoxCasillas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "44", "48", "52" }));

        comboBoxJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));

        txtPuntosApuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuntosApuestaKeyTyped(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txtAceptar.png"))); // NOI18N

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txtCancelar.png"))); // NOI18N

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txtRegresar.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txtMontoApuesta.png"))); // NOI18N

        txtMontoApuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoApuestaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelConfigurarPartidaLayout = new javax.swing.GroupLayout(panelConfigurarPartida);
        panelConfigurarPartida.setLayout(panelConfigurarPartidaLayout);
        panelConfigurarPartidaLayout.setHorizontalGroup(
            panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                        .addComponent(lblPuntosApuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPuntosApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfigurarPartidaLayout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfigurarPartidaLayout.createSequentialGroup()
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCasillas)
                                    .addComponent(lblNoJugadores))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(19, 19, 19)))
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxCasillas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMontoApuesta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboBoxJugadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        panelConfigurarPartidaLayout.setVerticalGroup(
            panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCasillas)
                    .addComponent(comboBoxCasillas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoJugadores)
                    .addComponent(comboBoxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPuntosApuesta)
                    .addComponent(txtPuntosApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtMontoApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConfigurarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConfigurarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPuntosApuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntosApuestaKeyTyped
        validaMonto(evt);
    }//GEN-LAST:event_txtPuntosApuestaKeyTyped

    private void txtPuntosApuesta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntosApuesta1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntosApuesta1KeyTyped

    private void txtMontoApuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoApuestaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoApuestaKeyTyped

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
            java.util.logging.Logger.getLogger(FrmConfigurarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConfigurarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConfigurarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConfigurarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmConfigurarPartida dialog = new FrmConfigurarPartida(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboBoxCasillas;
    private javax.swing.JComboBox<String> comboBoxJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCasillas;
    private javax.swing.JLabel lblNoJugadores;
    private javax.swing.JLabel lblPuntosApuesta;
    private javax.swing.JPanel panelConfigurarPartida;
    private javax.swing.JTextField txtMontoApuesta;
    private javax.swing.JTextField txtPuntosApuesta;
    private javax.swing.JTextField txtPuntosApuesta1;
    // End of variables declaration//GEN-END:variables
}
