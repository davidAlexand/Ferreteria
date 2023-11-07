/*@author David Alexander Romero I*/
package Vista;
import Datos.Elementos;

public class MenuPrincipal extends javax.swing.JFrame {
    private final Elementos Datos;
    /*Creates new form MenuPrincipal*/
    public MenuPrincipal() {
        initComponents();
         Datos = new Elementos ();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnregistroNuevoProducto = new javax.swing.JMenuItem();
        jMrefistroCliente = new javax.swing.JMenu();
        jMregistroCliente = new javax.swing.JMenuItem();
        jMfacturaTornilleria = new javax.swing.JMenu();
        jMconsultarFactura = new javax.swing.JMenuItem();

        menuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -40, 450, 300);
        jLabel2.getAccessibleContext().setAccessibleName("Menu principal");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 204, 0)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("Productos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mnregistroNuevoProducto.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        mnregistroNuevoProducto.setText("Registrar productos");
        mnregistroNuevoProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnregistroNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnregistroNuevoProductoActionPerformed(evt);
            }
        });
        jMenu1.add(mnregistroNuevoProducto);

        jMenuBar1.add(jMenu1);

        jMrefistroCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jMrefistroCliente.setForeground(new java.awt.Color(51, 51, 51));
        jMrefistroCliente.setText("Cliente");
        jMrefistroCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMregistroCliente.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jMregistroCliente.setText("Registrar Cliente");
        jMregistroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMregistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMregistroClienteActionPerformed(evt);
            }
        });
        jMrefistroCliente.add(jMregistroCliente);

        jMenuBar1.add(jMrefistroCliente);

        jMfacturaTornilleria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jMfacturaTornilleria.setForeground(new java.awt.Color(51, 51, 51));
        jMfacturaTornilleria.setText("Datos");
        jMfacturaTornilleria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMconsultarFactura.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jMconsultarFactura.setText("Consultar datos registrados");
        jMconsultarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMconsultarFacturaActionPerformed(evt);
            }
        });
        jMfacturaTornilleria.add(jMconsultarFactura);

        jMenuBar1.add(jMfacturaTornilleria);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mnregistroNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnregistroNuevoProductoActionPerformed
       RegistroProductos ventana = new RegistroProductos();
       ventana.setDatos(Datos);
       ventana.setLocationRelativeTo(this);
       ventana.setVisible(true);  
    }//GEN-LAST:event_mnregistroNuevoProductoActionPerformed
    private void jMconsultarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMconsultarFacturaActionPerformed
       System.out.println( Datos.getMapaDatosProductos());
       System.out.println( Datos.getMapaDatosClientes());
       ConsultarDatos ventana = new ConsultarDatos();
       ventana.setDatos( Datos); 
       ventana.setLocationRelativeTo(this);
       ventana.setVisible(true); 
    }//GEN-LAST:event_jMconsultarFacturaActionPerformed
    private void jMregistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMregistroClienteActionPerformed
       RegistroClientes ventana = new RegistroClientes();
       ventana.setFachada(Datos);
       ventana.setLocationRelativeTo(this);
       ventana.setVisible(true);
    }//GEN-LAST:event_jMregistroClienteActionPerformed
    /*@param args the command line arguments*/
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           new MenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMconsultarFactura;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMfacturaTornilleria;
    private javax.swing.JMenu jMrefistroCliente;
    private javax.swing.JMenuItem jMregistroCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuPrincipal;
    private javax.swing.JMenuItem mnregistroNuevoProducto;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
