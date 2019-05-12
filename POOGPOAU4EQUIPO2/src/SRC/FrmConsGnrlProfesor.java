package SRC;

import java.util.ArrayList;
import javax.swing.ImageIcon;
public class FrmConsGnrlProfesor extends javax.swing.JDialog {
    
    ArrayList<Personal>personal = new ArrayList<>();

    public FrmConsGnrlProfesor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/logoITCG.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaPersonal.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Departamento"
            }
        ));
        jScrollPane1.setViewportView(tablaPersonal);

        fondo.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(fondo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(fondo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int cont = Principal.adp.getCont();
        int posicion = 0;
        String pers[][] = new String[cont][3];
        String clave;
        Personal ads;
        
        for(int x = 0; x < cont; x++)
        {
            ads = Principal.adp.getPersonal(x);
            personal.add(ads);
            clave = Integer.toString(personal.get(x).getClave());
            if(personal.get(x) instanceof Profesor)
            {
                pers[posicion][0] = clave;
                pers[posicion][1] = personal.get(x).getNombre();
                pers[posicion][2] = ((Profesor)personal.get(x)).getDepartamento();
                posicion += 1;
            }
            
        }
        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            pers,
            new String [] {
                "Clave", "Nombre", "Departamento"
            }
        ));
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonal;
    // End of variables declaration//GEN-END:variables
}
