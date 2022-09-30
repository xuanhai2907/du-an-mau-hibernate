package Views;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.UIManager;

public class WelcomeDialog extends javax.swing.JDialog {

    public WelcomeDialog(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        runLoadingBar();
        setLocationRelativeTo(parent);
    }

    private void runLoadingBar() {
        class Loading extends Thread {

            @Override
            public void run() {

                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(20);
                        lblLoadingValue.setText(i + "%");
                        progressBar.setValue(i);
                        if (i == 100) {
                            dispose();
                            new LoginJDialog(new javax.swing.JFrame(), true).setVisible(true);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WelcomeDialog.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        Loading l = new Loading();
        l.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        lblLoadingValue = new javax.swing.JLabel();
        lblLoading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setForeground(new java.awt.Color(102, 255, 102));
        jPanel2.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 730, 10));

        lblLoadingValue.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        lblLoadingValue.setForeground(new java.awt.Color(0, 204, 204));
        lblLoadingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoadingValue.setText("0%");
        jPanel2.add(lblLoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 50, -1));

        lblLoading.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(0, 204, 204));
        lblLoading.setText("Loading...");
        jPanel2.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please, waiting...");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ranh\\demoSampleProject\\src\\main\\resources\\icons\\FPT_Software_Logo.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 460, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\ranh\\demoSampleProject\\src\\main\\resources\\icons\\step-heart.gif")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 310, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WelcomeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WelcomeDialog dialog = new WelcomeDialog(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblLoadingValue;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
