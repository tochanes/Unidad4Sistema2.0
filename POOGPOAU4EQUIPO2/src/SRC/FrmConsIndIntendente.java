package SRC;
import javax.swing.ImageIcon;
public class FrmConsIndIntendente extends javax.swing.JDialog {
    Personal per;
    
    public FrmConsIndIntendente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/logoITCG.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAñoIngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtNivel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUtilidad = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtClave.setEditable(false);
        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 48, 325, -1));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 87, 325, -1));

        txtAñoIngreso.setEditable(false);
        txtAñoIngreso.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(txtAñoIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 126, 325, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel1.setText("CLAVE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel3.setText("AÑO DE INGRESO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel7.setText("AREA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, -1, -1));

        txtArea.setEditable(false);
        txtArea.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 165, 325, -1));

        txtNivel.setEditable(false);
        txtNivel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(txtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 204, 325, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel8.setText("NIVEL:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel4.setText("CONSULTA INDIVIDUAL INTENDENTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel5.setText("UTILIDAD:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        txtUtilidad.setEditable(false);
        txtUtilidad.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(txtUtilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 325, -1));

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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.jpg"))); // NOI18N
        fondo.setText(" ");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-520, -520, 970, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    public void showMe(int celda){
        per = Principal.adp.getPersonal(celda);
        txtClave.setText(Integer.toString(per.getClave()));
        txtNombre.setText(per.getNombre());
        txtAñoIngreso.setText(Integer.toString(per.getAñoIngreso()));
        txtArea.setText(((Intendente)per).getArea());
        txtNivel.setText(Integer.toString(((Intendente)per).getNivel()));
        txtUtilidad.setText(Float.toString(per.calcularUtilidad()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtAñoIngreso;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUtilidad;
    // End of variables declaration//GEN-END:variables
}
