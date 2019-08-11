
package practicaunoteoria;

/**
 * JFrame donde se visualizan las opciones que tiene el usuario al inicio.
 * Entre esas opciones está salirse de la aplicación, poder ver una pequeña 
 * explicación de la aplicación, y la última poderse dirigir al generador 
 * del autómata.
 * 
 * @author Andrés Quintero
 * @author Juan Esteban Gutiérrez
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonExit = new java.awt.Button();
        buttonStart = new java.awt.Button();
        buttonAbout = new java.awt.Button();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonExit.setBackground(new java.awt.Color(229, 44, 45));
        buttonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 255, 255));
        buttonExit.setLabel("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 60));

        buttonStart.setBackground(new java.awt.Color(44, 64, 166));
        buttonStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonStart.setForeground(new java.awt.Color(255, 255, 255));
        buttonStart.setLabel("¡Let's start!");
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });
        getContentPane().add(buttonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 140, 60));

        buttonAbout.setBackground(new java.awt.Color(44, 64, 166));
        buttonAbout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonAbout.setForeground(new java.awt.Color(255, 255, 255));
        buttonAbout.setLabel("About AutomatonApp");
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 60));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicaunoteoria/resources/backgroundPrincipal.jpg"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Al presionar el botón se cierra la aplicación.
     * 
     * @param evt 
     */
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    /**
     * Al presionar el botón se cierra la pantalla actual y se abre la pantalla que explica brevemente 
     * el funcionamiento de la aplicación.
     * 
     * @param evt 
     */
    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed
        aboutAutomaton a = new aboutAutomaton();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonAboutActionPerformed

    /**
     * Al presionar el botón se cierra la pantalla actual y se abre la pantalla para generar el autómata.
     * 
     * @param evt 
     */
    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartActionPerformed
        GeneratorView g = new GeneratorView();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonStartActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonAbout;
    private java.awt.Button buttonExit;
    private java.awt.Button buttonStart;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables
}
