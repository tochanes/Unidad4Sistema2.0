package SRC;
import java.util.ArrayList;
import javax.swing.ImageIcon;
public class FrmConsGnrlPersonal extends javax.swing.JDialog {
    
    ArrayList<Personal>personal = new ArrayList<>();

    public FrmConsGnrlPersonal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/logoITCG.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
                "Clave", "Nombre", "Departamento/Area"
            }
        ));
        jScrollPane1.setViewportView(tablaPersonal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int cont = Principal.adp.getCont();
        String pers[][] = new String[cont][3];
        String clave;
        Personal ads;
        
        for(int x = 0; x < cont; x++)
        {
            ads = Principal.adp.getPersonal(x);
            personal.add(ads);
            clave = Integer.toString(personal.get(x).getClave());
            pers[x][0] = clave;
            pers[x][1] = personal.get(x).getNombre();
            if(personal.get(x) instanceof Profesor)
            {
                pers[x][2] = ((Profesor)personal.get(x)).getDepartamento();
            }
            else
            {
                pers[x][2] = ((Intendente)personal.get(x)).getArea();
            }
            
            tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            pers,
            new String [] {
                "Clave", "Nombre", "Departamento/Area"
            }
        ));
            
        }
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonal;
    // End of variables declaration//GEN-END:variables
}
