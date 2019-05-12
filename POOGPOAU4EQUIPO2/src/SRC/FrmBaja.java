package SRC;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class FrmBaja extends javax.swing.JDialog {

    public FrmBaja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/logoITCG.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel1.setText("CLAVE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/bsq.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 30, 30));

        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtClave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel2.setText("BAJAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 11, -1, -1));

        btnVolver.setFont(new java.awt.Font("Century Gothic", 2, 11)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vlv.png"))); // NOI18N
        btnVolver.setText(" ");
        btnVolver.setToolTipText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/mini.jpg"))); // NOI18N
        fondo.setText(" ");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 400, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{    
            int clave =Integer.parseInt(txtClave.getText());
            if(clave >= 101 && clave <= 999){
                int celda = Principal.adp.getCelda(clave);
                if(celda != -1){
                    if(Principal.adp.getPersonal(celda) instanceof Profesor){
                        FrmBajaProfesor bp = new FrmBajaProfesor(null, true);
                        bp.showMe(celda);
                        this.dispose();
                        bp.setVisible(true);
                    }
                    else {
                        FrmBajaIntendente bi = new FrmBajaIntendente(null, true);
                        bi.showMe(celda);
                        this.dispose();
                        bi.setVisible(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Esa clave no esta registrada", 
                            "CLAVE INEXISTENTE", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Ingrese una clave de 101 a 999", 
                            "CLAVE FUERA DE RANGO", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros enteros ", 
                            "CARÁCTER INVALIDO", JOptionPane.ERROR_MESSAGE);  
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(this, "Situacion anomala en tiempo de ejecución, vuelve a intentarlo", 
                            "SITUACIÓN ANOMALA", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtClave.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables
}
