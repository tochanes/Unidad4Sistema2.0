package SRC;
import javax.swing.ImageIcon;
public class FrmAcercaDe extends javax.swing.JDialog {
    Personal per;
    
    public FrmAcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       banner1.setVisible(false);
       banner2.setVisible(false);
       banner3.setVisible(false);
       banner4.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/logoITCG.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        banner3 = new javax.swing.JLabel();
        banner1 = new javax.swing.JLabel();
        banner2 = new javax.swing.JLabel();
        banner4 = new javax.swing.JLabel();
        banner = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(530, 350));
        setPreferredSize(new java.awt.Dimension(530, 350));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jLabel1.setText("Unidad 4 Sistema de Registro de Personal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Programadores:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel3.setText("Juan Pablo Solis Guzman");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel7.setText("Alvaro Rosales Damian");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel8.setText("Jose Manuel Gomez Diaz");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 22)); // NOI18N
        jLabel4.setText("ACERCA DE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 2, 9)); // NOI18N
        jLabel5.setText("Sistema Unidad 4, Registro de Personal Tecnologico de Zapotlan, All Rights Reserved 2019 ©");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        btnVolver.setFont(new java.awt.Font("Century Gothic", 2, 11)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vlv.png"))); // NOI18N
        btnVolver.setText(" ");
        btnVolver.setToolTipText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel6.setText("Originarios de ¡¡¡ TUXPAN !!!");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        banner3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        banner3.setText("Lo queremos mucho Profe :3");
        banner3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(banner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        banner1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        banner1.setText("Se podra con un .jar? :u");
        banner1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(banner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        banner2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        banner2.setText("Felices Fiestas Tochanas!!!");
        banner2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(banner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 20));

        banner4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        banner4.setText("Sacamos 100? :y");
        banner4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(banner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        banner.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        banner.setText(" Gracias");
        banner.setToolTipText("Click Me!");
        banner.setBorderPainted(false);
        banner.setContentAreaFilled(false);
        banner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        banner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bannerActionPerformed(evt);
            }
        });
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/banner.jpeg"))); // NOI18N
        fondo.setText(" ");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, -280, 970, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void bannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bannerActionPerformed
       banner1.setVisible(true);
       banner2.setVisible(true);
       banner3.setVisible(true);
       banner4.setVisible(true);
       
    }//GEN-LAST:event_bannerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton banner;
    private javax.swing.JLabel banner1;
    private javax.swing.JLabel banner2;
    private javax.swing.JLabel banner3;
    private javax.swing.JLabel banner4;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
