/*@author David Alexander Romero I*/
package Vista;
import Controlador.Validacion;
import Modelo.DatosClientes;
import Datos.Elementos;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class RegistroClientes extends javax.swing.JFrame {

    private Elementos fachada;
    /** Creates new form RegistroClientes*/
    public RegistroClientes() {
        initComponents();
        //CODIGO PARA UBICAR EL FORMULARIO AL CENTRO DE LA PANTALLA
        this.setLocationRelativeTo(null);
        fachada = new Elementos();
    }
    public Elementos getFachada() {
        return fachada;
    }
    public void setFachada(Elementos fachada) {
        this.fachada = fachada;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jLbnombreCliente = new javax.swing.JLabel();
        jLbapellidoCliente = new javax.swing.JLabel();
        jLbdireccion = new javax.swing.JLabel();
        jLbTprofesion = new javax.swing.JLabel();
        txtnombreCliente = new javax.swing.JTextField();
        txtdireccionCliente = new javax.swing.JTextField();
        txtprofesionCliente = new javax.swing.JTextField();
        jBRegistroCliente = new javax.swing.JButton();
        jLbnumeroDeDocumento = new javax.swing.JLabel();
        txtNumeroDeDocumento = new javax.swing.JTextField();
        jLbtipoDeDocumento = new javax.swing.JLabel();
        jBtipoDeDocumento = new javax.swing.JComboBox<>();
        txtapellidoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FERRETERIA LA QUINTA");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(716, 349));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Registro Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 26), new java.awt.Color(204, 0, 0)))); // NOI18N

        jLbnombreCliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbnombreCliente.setText("Nombre");

        jLbapellidoCliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbapellidoCliente.setText("Apellido");

        jLbdireccion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbdireccion.setText("Direccion");

        jLbTprofesion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbTprofesion.setText("Profesion");

        txtnombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombreCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtnombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreClienteActionPerformed(evt);
            }
        });

        txtdireccionCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdireccionCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtprofesionCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprofesionCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jBRegistroCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBRegistroCliente.setText("Registrar");
        jBRegistroCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistroClienteActionPerformed(evt);
            }
        });

        jLbnumeroDeDocumento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbnumeroDeDocumento.setText("Numero de documento");

        txtNumeroDeDocumento.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNumeroDeDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtNumeroDeDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDeDocumentoActionPerformed(evt);
            }
        });

        jLbtipoDeDocumento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbtipoDeDocumento.setText("Tipo de documento");

        jBtipoDeDocumento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtipoDeDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nit" }));
        jBtipoDeDocumento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtipoDeDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtipoDeDocumentoActionPerformed(evt);
            }
        });

        txtapellidoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtapellidoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        txtapellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLbtipoDeDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtipoDeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLbnumeroDeDocumento)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroDeDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbdireccion)
                            .addComponent(jLbnombreCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLbTprofesion)
                                .addGap(18, 18, 18)
                                .addComponent(txtprofesionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLbapellidoCliente)
                                .addGap(27, 27, 27)
                                .addComponent(txtapellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jBRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbnumeroDeDocumento)
                    .addComponent(txtNumeroDeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbtipoDeDocumento)
                    .addComponent(jBtipoDeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbnombreCliente)
                    .addComponent(txtnombreCliente)
                    .addComponent(jLbapellidoCliente)
                    .addComponent(txtapellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbdireccion)
                    .addComponent(txtdireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbTprofesion)
                    .addComponent(txtprofesionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jBRegistroCliente)
                .addGap(99, 99, 99))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 700, 310);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 700, 310);

        getAccessibleContext().setAccessibleName("Registro ");

        pack();
    }// </editor-fold>//GEN-END:initComponents
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    private void txtapellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoClienteActionPerformed
    private void jBtipoDeDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtipoDeDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtipoDeDocumentoActionPerformed
    private void txtNumeroDeDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDeDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDeDocumentoActionPerformed
    private void jBRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistroClienteActionPerformed
        // CAPTURA DE LA INFORMACION DE CLIENTE REGISTRADO
        //CLIENTE
        String tipoDeDocumento = jBtipoDeDocumento.getSelectedItem().toString();
        String numeroDeDocumento = txtNumeroDeDocumento.getText().trim();
        //VALIDACIONES DATOS CLIENTE
        if(numeroDeDocumento.length()>0 && numeroDeDocumento.length()<9 ){
            if(Validacion.esNumericoDocumento(numeroDeDocumento)){
            }else{
                JOptionPane.showMessageDialog(this, "EL DOCUMENTO DEBE CONTENER MAS DE UN DIGITO Y MENOR A NUEVE NIGITOS","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "EN EL NUMERO DE DOCUMENTO SOLO SE PERMITEN DATOS NUMERICOS","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        //CAPTURA DE DATOS DEL CLIENTE
        String nombreCliente = txtnombreCliente.getText().trim();
        String apellidoCliente = txtapellidoCliente.getText().trim();
        String direccionCliente = txtdireccionCliente.getText().trim();
        String profesionCliente = txtprofesionCliente.getText().trim();
           
        DatosClientes datosCliente = new DatosClientes();
        datosCliente.setNumeroDeDocumento(numeroDeDocumento);
        //VALIDACIONES(DATOS CLIENTE) 
        if(nombreCliente.length()>0 ){
            if(apellidoCliente.length()>0 ){
                if(direccionCliente.length() >0 ){
                    if(profesionCliente.length()>0){
                        //VALIDACIONES(TIPO DE DATO) CLIENTE
                        if(Validacion.esTextoNombre(nombreCliente)){
                            if(Validacion.esTextoApellido(apellidoCliente)){
                                if(Validacion.esTextoProfesion(profesionCliente)){
                                    System.out.println(datosCliente);
                                        //GUARDAR LA INFORMACION  INGRESADA
                                        datosCliente.setNombreCliente(nombreCliente);
                                        datosCliente.setApellidoCliente(apellidoCliente);
                                        datosCliente.setDireccionCliente(direccionCliente);
                                        datosCliente.setProfesionCliente(profesionCliente);
                                            System.out.println(nombreCliente);
                                            System.out.println(apellidoCliente);
                                            System.out.println(direccionCliente);
                                            System.out.println(profesionCliente);
                                    }else{
                                        JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS DE TEXTO Y SIN ESPACIO EN PROFESION","ERROR",JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS DE TEXTO Y SIN ESPACIO EN APELLIDO","ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS DE TEXTO Y SIN ESPACIO EN NOMBRE","ERROR",JOptionPane.ERROR_MESSAGE);
                            }
                    }else{
                        JOptionPane.showMessageDialog(this, "REGISTRE LA DIRECCION DEL CLIENTE","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "REGISTRE EL APELLIDO DEL CLIENTE","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "REGISTRE EL NOMBRE DEL CLIENTE","ERROR",JOptionPane.ERROR_MESSAGE);
            }

               HashMap<String, DatosClientes> mapDatosCliente = new HashMap<String, DatosClientes>();
                                     mapDatosCliente.put(tipoDeDocumento+"--"+datosCliente.getNumeroDeDocumento(), datosCliente);                                                    
                                     fachada.setMapaDatosClientes(mapDatosCliente);
       }                                  
    }//GEN-LAST:event_jBRegistroClienteActionPerformed
    private void txtnombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreClienteActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegistroCliente;
    private javax.swing.JComboBox<String> jBtipoDeDocumento;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbTprofesion;
    private javax.swing.JLabel jLbapellidoCliente;
    private javax.swing.JLabel jLbdireccion;
    private javax.swing.JLabel jLbnombreCliente;
    private javax.swing.JLabel jLbnumeroDeDocumento;
    private javax.swing.JLabel jLbtipoDeDocumento;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtNumeroDeDocumento;
    private javax.swing.JTextField txtapellidoCliente;
    private javax.swing.JTextField txtdireccionCliente;
    private javax.swing.JTextField txtnombreCliente;
    private javax.swing.JTextField txtprofesionCliente;
    // End of variables declaration//GEN-END:variables
}
