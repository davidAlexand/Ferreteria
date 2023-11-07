/*@author David Alexander Romero I*/
package Vista;
import Modelo.DatosClientes;
import Modelo.DatosProductos;
import Datos.Elementos;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

public class ConsultarDatos extends javax.swing.JFrame {
    private Elementos Datos;
    public ConsultarDatos() {
        initComponents();
          Datos = new Elementos();
    }
    public Elementos getDatos() {
        return Datos;
    }
    public void setDatos(Elementos Datos) {
        
        System.out.println(Datos.getMapaDatosProductos());
        System.out.println(Datos.getMapaDatosClientes());
    
        this.Datos = Datos;
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jBtipoDePagoC = new javax.swing.JLabel();
        jBtipoDePago = new javax.swing.JComboBox<>();
        jBNumeroReferenciaC = new javax.swing.JLabel();
        txtreferenciaF = new javax.swing.JTextField();
        jBConsultarF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBcantidadAg = new javax.swing.JLabel();
        jBcantidadTornilloLa = new javax.swing.JLabel();
        jBcantidadTuercaEnPlg = new javax.swing.JLabel();
        jBcantidadTuercaM = new javax.swing.JLabel();
        jBPrecioTornilloAg = new javax.swing.JLabel();
        jBprecioTornilloL = new javax.swing.JLabel();
        jBprecioTornilloEnPg = new javax.swing.JLabel();
        jBprecioTuercasM = new javax.swing.JLabel();
        txtConTornillosAglomerados = new javax.swing.JLabel();
        txtConTornillosLamina = new javax.swing.JLabel();
        txtConTuercasEnPulgadas = new javax.swing.JLabel();
        txtConTuercasMilimetricas = new javax.swing.JLabel();
        txtConcantidadTornillosAg = new javax.swing.JLabel();
        txtConCantidadTornillosL = new javax.swing.JLabel();
        txtConCantidadTuercasEnPulgada = new javax.swing.JLabel();
        txtConCantidadTuercasMilimetricas = new javax.swing.JLabel();
        txtConPrecioTornillosAg = new javax.swing.JLabel();
        txtCpnPrecioTornillosLamina = new javax.swing.JLabel();
        txtConPrecioTuercasEnPulgada = new javax.swing.JLabel();
        txtConPrecioTuercasMilimetricas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jBtipoDeDocumento = new javax.swing.JComboBox<>();
        jBtipoDePagoC1 = new javax.swing.JLabel();
        jBNumeroDeDocumento = new javax.swing.JLabel();
        txtnumeroDeDocumento = new javax.swing.JTextField();
        jBConsultarCliente = new javax.swing.JButton();
        jLbnombreCliente = new javax.swing.JLabel();
        jLbapellidoCliente = new javax.swing.JLabel();
        jLbdireccionCliente = new javax.swing.JLabel();
        jLbProfesionCliente = new javax.swing.JLabel();
        txtnombreCliente = new javax.swing.JLabel();
        txtapellidoCliente = new javax.swing.JLabel();
        txtdireccionCliente = new javax.swing.JLabel();
        txtprofesionCliente = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Factura");

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Consultar Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 26), new java.awt.Color(0, 0, 153)))); // NOI18N

        jBtipoDePagoC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtipoDePagoC.setText("Tipo de Pago");

        jBtipoDePago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtipoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Credito" }));
        jBtipoDePago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtipoDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtipoDePagoActionPerformed(evt);
            }
        });

        jBNumeroReferenciaC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBNumeroReferenciaC.setText("Referencia factura");

        txtreferenciaF.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtreferenciaF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jBConsultarF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jBConsultarF.setText("Consultar factura");
        jBConsultarF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBConsultarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tornillos aglomerados");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tornillos pan lamina");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tuerca en pulgadas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tuercas milimetricas");

        jBcantidadAg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBcantidadAg.setText("Cantidad");

        jBcantidadTornilloLa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBcantidadTornilloLa.setText("Cantidad");

        jBcantidadTuercaEnPlg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBcantidadTuercaEnPlg.setText("Cantidad");

        jBcantidadTuercaM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBcantidadTuercaM.setText("Cantidad");

        jBPrecioTornilloAg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBPrecioTornilloAg.setText("Precio");

        jBprecioTornilloL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBprecioTornilloL.setText("precio");
        jBprecioTornilloL.setToolTipText("");

        jBprecioTornilloEnPg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBprecioTornilloEnPg.setText("Precio");

        jBprecioTuercasM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBprecioTuercasM.setText("Precio");
        jBprecioTuercasM.setToolTipText("");

        txtConTornillosAglomerados.setBackground(new java.awt.Color(255, 255, 255));
        txtConTornillosAglomerados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConTornillosAglomerados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConTornillosAglomerados.setFocusable(false);
        txtConTornillosAglomerados.setOpaque(true);

        txtConTornillosLamina.setBackground(new java.awt.Color(255, 255, 255));
        txtConTornillosLamina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConTornillosLamina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConTornillosLamina.setFocusable(false);
        txtConTornillosLamina.setOpaque(true);

        txtConTuercasEnPulgadas.setBackground(new java.awt.Color(255, 255, 255));
        txtConTuercasEnPulgadas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConTuercasEnPulgadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConTuercasEnPulgadas.setFocusable(false);
        txtConTuercasEnPulgadas.setOpaque(true);

        txtConTuercasMilimetricas.setBackground(new java.awt.Color(255, 255, 255));
        txtConTuercasMilimetricas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConTuercasMilimetricas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConTuercasMilimetricas.setFocusable(false);
        txtConTuercasMilimetricas.setOpaque(true);

        txtConcantidadTornillosAg.setBackground(new java.awt.Color(255, 255, 255));
        txtConcantidadTornillosAg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConcantidadTornillosAg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConcantidadTornillosAg.setEnabled(false);
        txtConcantidadTornillosAg.setOpaque(true);

        txtConCantidadTornillosL.setBackground(new java.awt.Color(255, 255, 255));
        txtConCantidadTornillosL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConCantidadTornillosL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConCantidadTornillosL.setFocusable(false);
        txtConCantidadTornillosL.setOpaque(true);

        txtConCantidadTuercasEnPulgada.setBackground(new java.awt.Color(255, 255, 255));
        txtConCantidadTuercasEnPulgada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConCantidadTuercasEnPulgada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConCantidadTuercasEnPulgada.setOpaque(true);

        txtConCantidadTuercasMilimetricas.setBackground(new java.awt.Color(255, 255, 255));
        txtConCantidadTuercasMilimetricas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConCantidadTuercasMilimetricas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConCantidadTuercasMilimetricas.setFocusable(false);
        txtConCantidadTuercasMilimetricas.setOpaque(true);

        txtConPrecioTornillosAg.setBackground(new java.awt.Color(255, 255, 255));
        txtConPrecioTornillosAg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConPrecioTornillosAg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConPrecioTornillosAg.setFocusable(false);
        txtConPrecioTornillosAg.setOpaque(true);

        txtCpnPrecioTornillosLamina.setBackground(new java.awt.Color(255, 255, 255));
        txtCpnPrecioTornillosLamina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpnPrecioTornillosLamina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCpnPrecioTornillosLamina.setFocusable(false);
        txtCpnPrecioTornillosLamina.setOpaque(true);

        txtConPrecioTuercasEnPulgada.setBackground(new java.awt.Color(255, 255, 255));
        txtConPrecioTuercasEnPulgada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConPrecioTuercasEnPulgada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConPrecioTuercasEnPulgada.setFocusable(false);
        txtConPrecioTuercasEnPulgada.setOpaque(true);

        txtConPrecioTuercasMilimetricas.setBackground(new java.awt.Color(255, 255, 255));
        txtConPrecioTuercasMilimetricas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConPrecioTuercasMilimetricas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtConPrecioTuercasMilimetricas.setFocusable(false);
        txtConPrecioTuercasMilimetricas.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBtipoDePagoC)
                .addGap(18, 18, 18)
                .addComponent(jBtipoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jBNumeroReferenciaC)
                .addGap(18, 18, 18)
                .addComponent(txtreferenciaF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBConsultarF)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtConTornillosAglomerados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConTornillosLamina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConTuercasEnPulgadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConTuercasMilimetricas, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBcantidadTuercaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConCantidadTuercasMilimetricas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBcantidadAg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConcantidadTornillosAg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBcantidadTornilloLa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConCantidadTornillosL, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBcantidadTuercaEnPlg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConCantidadTuercasEnPulgada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jBprecioTornilloL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpnPrecioTornillosLamina, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBPrecioTornilloAg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConPrecioTornillosAg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBprecioTornilloEnPg, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBprecioTuercasM))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtConPrecioTuercasMilimetricas, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(txtConPrecioTuercasEnPulgada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtipoDePagoC)
                    .addComponent(jBtipoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNumeroReferenciaC)
                    .addComponent(txtreferenciaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConsultarF))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtConTornillosAglomerados, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBcantidadAg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtConcantidadTornillosAg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtConPrecioTornillosAg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBPrecioTornilloAg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConTornillosLamina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConCantidadTornillosL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jBcantidadTornilloLa)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCpnPrecioTornillosLamina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBprecioTornilloL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConPrecioTuercasEnPulgada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jBcantidadTuercaEnPlg)
                        .addComponent(txtConTuercasEnPulgadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConCantidadTuercasEnPulgada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBprecioTornilloEnPg)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConTuercasMilimetricas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBprecioTuercasM)
                    .addComponent(txtConPrecioTuercasMilimetricas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jBcantidadTuercaM)
                        .addComponent(txtConCantidadTuercasMilimetricas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Consultar cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 26), new java.awt.Color(0, 0, 153)))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jBtipoDeDocumento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtipoDeDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nit" }));
        jBtipoDeDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBtipoDeDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtipoDeDocumentoActionPerformed(evt);
            }
        });

        jBtipoDePagoC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtipoDePagoC1.setText("Tipo de documento");

        jBNumeroDeDocumento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBNumeroDeDocumento.setText("Numero de documento");

        txtnumeroDeDocumento.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtnumeroDeDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jBConsultarCliente.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jBConsultarCliente.setText("Consultar cliente");
        jBConsultarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarClienteActionPerformed(evt);
            }
        });

        jLbnombreCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbnombreCliente.setText("Nombre");

        jLbapellidoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbapellidoCliente.setText("Apellido");

        jLbdireccionCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbdireccionCliente.setText("Direccion cliente");

        jLbProfesionCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbProfesionCliente.setText("Profesion");

        txtnombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombreCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtnombreCliente.setFocusable(false);
        txtnombreCliente.setOpaque(true);

        txtapellidoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtapellidoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtapellidoCliente.setFocusable(false);
        txtapellidoCliente.setOpaque(true);

        txtdireccionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtdireccionCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdireccionCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtdireccionCliente.setFocusable(false);
        txtdireccionCliente.setOpaque(true);

        txtprofesionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtprofesionCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprofesionCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtprofesionCliente.setFocusable(false);
        txtprofesionCliente.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtipoDePagoC1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbnombreCliente)
                            .addComponent(jLbapellidoCliente)
                            .addComponent(jLbProfesionCliente)
                            .addComponent(jLbdireccionCliente))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jBtipoDeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBNumeroDeDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnumeroDeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jBConsultarCliente))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtprofesionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(txtdireccionCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtapellidoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtipoDePagoC1)
                    .addComponent(jBtipoDeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNumeroDeDocumento)
                    .addComponent(txtnumeroDeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConsultarCliente))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLbnombreCliente)
                    .addComponent(txtnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLbapellidoCliente)
                    .addComponent(txtapellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLbdireccionCliente)
                    .addComponent(txtdireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbProfesionCliente)
                    .addComponent(txtprofesionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jBConsultarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarFActionPerformed
        String tipoDePago = jBtipoDePago.getSelectedItem().toString();
        String referenciaFactura = txtreferenciaF.getText().trim();
        
        System.out.println(Datos.getMapaDatosProductos()); 
                             
        String llaveFactura = tipoDePago + "--" + referenciaFactura;
    
          Iterator it = Datos.getMapaDatosProductos().entrySet().iterator();
          while (it.hasNext()) {
          Map.Entry e = (Map.Entry)it.next();
          System.out.println(e.getKey() + " " + e.getValue());
          }    
          System.out.println("llave factura--->"+llaveFactura);
          System.out.println(Datos.getMapaDatosProductos().get(llaveFactura));
          DatosProductos productos = Datos.getMapaDatosProductos().get(llaveFactura); 
          
          if(productos!= null){
              //REFERENCIA PRODUCTOS
              txtConTornillosAglomerados.setText(productos.getTornillosAglomerados());
              txtConTornillosLamina.setText(productos.getTornillosPanLamina());
              txtConTuercasEnPulgadas.setText(productos.getTuercasEnPulgadas());
              txtConTuercasMilimetricas.setText(productos.getTuercasMilimetricas());
              //CANTIDAD PRODUCTOS
              txtConcantidadTornillosAg.setText(productos.getCantidadTTAglomerados());
              txtConCantidadTornillosL.setText(productos.getCantidadTTLamina());
              txtConCantidadTuercasEnPulgada.setText(productos.getCantidadTTPulgadas());
              txtConCantidadTuercasMilimetricas.setText(productos.getCantidadTTMilimetrica());
              //PRECIO PRODUCTOS
              txtConPrecioTornillosAg.setText(productos.getPrecioTAglomerados());
              txtCpnPrecioTornillosLamina.setText(productos.getPrecioTLamina());
              txtConPrecioTuercasEnPulgada.setText(productos.getPrecioTTPulgadas());
              txtConPrecioTuercasMilimetricas.setText(productos.getPrecioTTMilimetricas());
              }else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LA FACTURA"+llaveFactura,"ERROR",JOptionPane.ERROR_MESSAGE );
                }     
      // TODO add your handling code here:
    }//GEN-LAST:event_jBConsultarFActionPerformed

    private void jBtipoDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtipoDePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtipoDePagoActionPerformed

    private void jBtipoDeDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtipoDeDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtipoDeDocumentoActionPerformed

    private void jBConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarClienteActionPerformed
        String tipoDeDocumento = jBtipoDeDocumento.getSelectedItem().toString();
        String numeroDeDocumento = txtnumeroDeDocumento.getText().trim();
        System.out.println(Datos.getMapaDatosClientes());

        String llaveCliente = tipoDeDocumento + "--" + numeroDeDocumento;

        Iterator it = Datos.getMapaDatosClientes().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println("llave cliente--->"+llaveCliente);
        System.out.println(Datos.getMapaDatosClientes().get(llaveCliente));
        DatosClientes datosCliente = Datos.getMapaDatosClientes().get(llaveCliente);

        if(datosCliente != null){
            //REFERENCIA PRODUCTOS
            txtnombreCliente.setText(datosCliente.getNombreCliente());
            txtapellidoCliente.setText(datosCliente.getApellidoCliente());
            txtdireccionCliente.setText(datosCliente.getDireccionCliente());
            txtprofesionCliente.setText(datosCliente.getProfesionCliente());
            }else{
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LOS DATOS DEL CLIENTE"+llaveCliente,"ERROR",JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jBConsultarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultarCliente;
    private javax.swing.JButton jBConsultarF;
    private javax.swing.JLabel jBNumeroDeDocumento;
    private javax.swing.JLabel jBNumeroReferenciaC;
    private javax.swing.JLabel jBPrecioTornilloAg;
    private javax.swing.JLabel jBcantidadAg;
    private javax.swing.JLabel jBcantidadTornilloLa;
    private javax.swing.JLabel jBcantidadTuercaEnPlg;
    private javax.swing.JLabel jBcantidadTuercaM;
    private javax.swing.JLabel jBprecioTornilloEnPg;
    private javax.swing.JLabel jBprecioTornilloL;
    private javax.swing.JLabel jBprecioTuercasM;
    private javax.swing.JComboBox<String> jBtipoDeDocumento;
    private javax.swing.JComboBox<String> jBtipoDePago;
    private javax.swing.JLabel jBtipoDePagoC;
    private javax.swing.JLabel jBtipoDePagoC1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbProfesionCliente;
    private javax.swing.JLabel jLbapellidoCliente;
    private javax.swing.JLabel jLbdireccionCliente;
    private javax.swing.JLabel jLbnombreCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtConCantidadTornillosL;
    private javax.swing.JLabel txtConCantidadTuercasEnPulgada;
    private javax.swing.JLabel txtConCantidadTuercasMilimetricas;
    private javax.swing.JLabel txtConPrecioTornillosAg;
    private javax.swing.JLabel txtConPrecioTuercasEnPulgada;
    private javax.swing.JLabel txtConPrecioTuercasMilimetricas;
    private javax.swing.JLabel txtConTornillosAglomerados;
    private javax.swing.JLabel txtConTornillosLamina;
    private javax.swing.JLabel txtConTuercasEnPulgadas;
    private javax.swing.JLabel txtConTuercasMilimetricas;
    private javax.swing.JLabel txtConcantidadTornillosAg;
    private javax.swing.JLabel txtCpnPrecioTornillosLamina;
    private javax.swing.JLabel txtapellidoCliente;
    private javax.swing.JLabel txtdireccionCliente;
    private javax.swing.JLabel txtnombreCliente;
    private javax.swing.JTextField txtnumeroDeDocumento;
    private javax.swing.JLabel txtprofesionCliente;
    private javax.swing.JTextField txtreferenciaF;
    // End of variables declaration//GEN-END:variables
}
