package SRC;

import java.util.Calendar;

public class Principal extends javax.swing.JFrame {

    static AdmonPersonal adp = new AdmonPersonal();
    public static Calendar cal = Calendar.getInstance();
    public static int añoActual = cal.get(Calendar.YEAR);
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        opcProfesorAltas = new javax.swing.JMenuItem();
        opcIntendenteAltas = new javax.swing.JMenuItem();
        opcModificaciones = new javax.swing.JMenuItem();
        opcBaja = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opcIndividual = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        opcPersonalTabla = new javax.swing.JMenuItem();
        opcProfesoresTabla = new javax.swing.JMenuItem();
        opcIntendenteTabla = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        opcSalir.setText("Salir");
        opcSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcSalirActionPerformed(evt);
            }
        });
        jMenu1.add(opcSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acciones");

        jMenu4.setText("Alta");

        opcProfesorAltas.setText("Profesor");
        opcProfesorAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcProfesorAltasActionPerformed(evt);
            }
        });
        jMenu4.add(opcProfesorAltas);

        opcIntendenteAltas.setText("Intendente");
        opcIntendenteAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcIntendenteAltasActionPerformed(evt);
            }
        });
        jMenu4.add(opcIntendenteAltas);

        jMenu2.add(jMenu4);

        opcModificaciones.setText("Modificacion");
        opcModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcModificacionesActionPerformed(evt);
            }
        });
        jMenu2.add(opcModificaciones);

        opcBaja.setText("Baja");
        opcBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcBajaActionPerformed(evt);
            }
        });
        jMenu2.add(opcBaja);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        opcIndividual.setText("Individual");
        jMenu3.add(opcIndividual);

        jMenu5.setText("General");

        opcPersonalTabla.setText("Personal");
        opcPersonalTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcPersonalTablaActionPerformed(evt);
            }
        });
        jMenu5.add(opcPersonalTabla);

        opcProfesoresTabla.setText("Profesores");
        opcProfesoresTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcProfesoresTablaActionPerformed(evt);
            }
        });
        jMenu5.add(opcProfesoresTabla);

        opcIntendenteTabla.setText("Intendentes");
        opcIntendenteTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcIntendenteTablaActionPerformed(evt);
            }
        });
        jMenu5.add(opcIntendenteTabla);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opcSalirActionPerformed

    private void opcProfesorAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcProfesorAltasActionPerformed
        FrmAltaProfesor alt = new FrmAltaProfesor(this, true);
        alt.setVisible(true);
    }//GEN-LAST:event_opcProfesorAltasActionPerformed

    private void opcIntendenteAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcIntendenteAltasActionPerformed
        FrmAltaIntendente alt = new FrmAltaIntendente(this, true);
        alt.setVisible(true);
    }//GEN-LAST:event_opcIntendenteAltasActionPerformed

    private void opcIntendenteTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcIntendenteTablaActionPerformed
        FrmConsGnrlIntendente alt = new FrmConsGnrlIntendente(this, true);
        alt.setVisible(true);
    }//GEN-LAST:event_opcIntendenteTablaActionPerformed

    private void opcPersonalTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcPersonalTablaActionPerformed
        FrmConsGnrlPersonal alt = new FrmConsGnrlPersonal(this, true);
        alt.setVisible(true);
    }//GEN-LAST:event_opcPersonalTablaActionPerformed

    private void opcProfesoresTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcProfesoresTablaActionPerformed
        FrmConsGnrlProfesor alt = new FrmConsGnrlProfesor(this, true);
        alt.setVisible(true);
    }//GEN-LAST:event_opcProfesoresTablaActionPerformed

    private void opcBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcBajaActionPerformed
        FrmBaja alt = new FrmBaja(this, true);
        alt.setVisible(true);
    }//GEN-LAST:event_opcBajaActionPerformed

    private void opcModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcModificacionesActionPerformed
        FrmModificacion alt = new FrmModificacion(this, true);
        alt.setVisible(true);
    }//GEN-LAST:event_opcModificacionesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opcBaja;
    private javax.swing.JMenuItem opcIndividual;
    private javax.swing.JMenuItem opcIntendenteAltas;
    private javax.swing.JMenuItem opcIntendenteTabla;
    private javax.swing.JMenuItem opcModificaciones;
    private javax.swing.JMenuItem opcPersonalTabla;
    private javax.swing.JMenuItem opcProfesorAltas;
    private javax.swing.JMenuItem opcProfesoresTabla;
    private javax.swing.JMenuItem opcSalir;
    // End of variables declaration//GEN-END:variables
}
