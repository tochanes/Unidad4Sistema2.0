package SRC;
import java.util.ArrayList;
import javax.swing.ImageIcon;
public class FrmConsGnrlIntendente extends javax.swing.JDialog {
    
    ArrayList<Personal>personal = new ArrayList<>();

    public FrmConsGnrlIntendente(java.awt.Frame parent, boolean modal) {
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPersonal.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Area"
            }
        ));
        tablaPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaPersonal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 780, 275));

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
            if(personal.get(x) instanceof Intendente)
            {
                pers[posicion][0] = clave;
                pers[posicion][1] = personal.get(x).getNombre();
                pers[posicion][2] = ((Intendente)personal.get(x)).getArea();
                posicion += 1;
            }
            
        }
        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            pers,
            new String [] {
                "Clave", "Nombre", "Area"
            }
        ));
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonal;
    // End of variables declaration//GEN-END:variables
}
