/*@author David Alexander Romero I*/
package Vista;
import Controlador.Validacion;
import Modelo.DatosProductos;
import Datos.Elementos;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class RegistroProductos extends javax.swing.JFrame {
    private Elementos Datos;
    /*Creates new form RegistroProductos*/
    public RegistroProductos() {
        initComponents();
        //CODIGO PARA UBICAR EL FORMULARIO AL CENTRO DE LA PANTALLA
        this.setLocationRelativeTo(null);
        Datos = new Elementos();
    }
    public Elementos getDatos() {
        return Datos;
    }
    public void setDatos(Elementos Datos) {
        this.Datos = Datos;
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLbAglomerados = new javax.swing.JLabel();
        jLbLamina = new javax.swing.JLabel();
        jLbTPulgadas = new javax.swing.JLabel();
        jLbTMilimetricas = new javax.swing.JLabel();
        txtAglomerados = new javax.swing.JTextField();
        txtTPulgadas = new javax.swing.JTextField();
        txtTMilimetricas = new javax.swing.JTextField();
        jLbPrecioAglomerados = new javax.swing.JLabel();
        jLbPrecioLamina = new javax.swing.JLabel();
        jLbPrecioTPulgadas = new javax.swing.JLabel();
        jLPrecioTMilimetricos = new javax.swing.JLabel();
        txtPrecioTTAglomerados = new javax.swing.JTextField();
        txtPrecioTTLamina = new javax.swing.JTextField();
        txtPrecioTTPulgadas = new javax.swing.JTextField();
        txtPrecioTTMilimetricas = new javax.swing.JTextField();
        jBRegistroTornilleria = new javax.swing.JButton();
        jLbCantidadTAglomerados = new javax.swing.JLabel();
        jLbCantidadTLamina = new javax.swing.JLabel();
        jLbCantidadTPulgadas = new javax.swing.JLabel();
        jLbCantidadTMlimetricas = new javax.swing.JLabel();
        txtCantidadTTAglomerados = new javax.swing.JTextField();
        txtCantidadTTLamina = new javax.swing.JTextField();
        txtCantidadTTPulgadas = new javax.swing.JTextField();
        txtCantidadTTMilimetricas = new javax.swing.JTextField();
        jLbreferenciaF = new javax.swing.JLabel();
        txtreferenciaF = new javax.swing.JTextField();
        jLbtipoDePago = new javax.swing.JLabel();
        jBtipoDePago = new javax.swing.JComboBox<>();
        txttornilloLamina = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FERRETERIA LA QUINTA");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("PRODUCTOS TORNILLERIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 20));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)), javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Catalogo productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 26)))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tornillos aglomerados");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1724               6x1/2              $ 50", "1136               6x3/4              $50", "1365               6x1                 $100", "1678               6x1-1/2          $100", "1589               6x2                 $150", "1986               6x2-1/2          $150", "1456               6x3                 $200", " " }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Codigo  |  Tornillo   |   Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tornillos pan lamina");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2356                8x1/2               $50", "2978                8x3/4               $50", "2692                8x/1                 $50", "2154                8x1-1/2            $100", "2078                8x2                  $150", "2881                8x2-1/2           $150", "2465                8x3                  $200", " " }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Codigo   |  Tornillo   |   Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Tuercas en pulgadas");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3576                1/4                  $50", "3398                5/16                $100", "3298                3/8                  $100", "3145                7/16                $150", "3066                1/2                  $200", "3978                5/8                  $350", " " }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Codigo   |   Tuerca   |   Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tuercas milimetricas");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4803                  4                    $50", "4202                  5                    $100", "4761                  6                    $100", "4134                  8                    $200", "4609                 10                   $200" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Codigo    |   Tuerca   |  Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 320));

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4)), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Registrar productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 26)))); // NOI18N

        jLbAglomerados.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbAglomerados.setText("Tornillos aglomerados");

        jLbLamina.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbLamina.setText("Tornillos pan lamina");

        jLbTPulgadas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbTPulgadas.setText("Tuercas en pulgadas");

        jLbTMilimetricas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbTMilimetricas.setText("Tuercas milimetricas");

        txtAglomerados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAglomerados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtAglomerados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAglomeradosActionPerformed(evt);
            }
        });

        txtTPulgadas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTPulgadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtTMilimetricas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTMilimetricas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLbPrecioAglomerados.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbPrecioAglomerados.setText("Precio");

        jLbPrecioLamina.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbPrecioLamina.setText("Precio");

        jLbPrecioTPulgadas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbPrecioTPulgadas.setText("Precio");

        jLPrecioTMilimetricos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLPrecioTMilimetricos.setText("Precio");

        txtPrecioTTAglomerados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioTTAglomerados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPrecioTTAglomerados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTTAglomeradosActionPerformed(evt);
            }
        });

        txtPrecioTTLamina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioTTLamina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPrecioTTLamina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTTLaminaActionPerformed(evt);
            }
        });

        txtPrecioTTPulgadas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioTTPulgadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPrecioTTPulgadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTTPulgadasActionPerformed(evt);
            }
        });

        txtPrecioTTMilimetricas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioTTMilimetricas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jBRegistroTornilleria.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBRegistroTornilleria.setText("Registrar");
        jBRegistroTornilleria.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jBRegistroTornilleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistroTornilleriaActionPerformed(evt);
            }
        });

        jLbCantidadTAglomerados.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbCantidadTAglomerados.setText("Cantidad");

        jLbCantidadTLamina.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbCantidadTLamina.setText("Cantidad");

        jLbCantidadTPulgadas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbCantidadTPulgadas.setText("Cantidad");

        jLbCantidadTMlimetricas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbCantidadTMlimetricas.setText("Cantidad");

        txtCantidadTTAglomerados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidadTTAglomerados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCantidadTTAglomerados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadTTAglomeradosMouseClicked(evt);
            }
        });
        txtCantidadTTAglomerados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadTTAglomeradosActionPerformed(evt);
            }
        });

        txtCantidadTTLamina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidadTTLamina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCantidadTTPulgadas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidadTTPulgadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCantidadTTPulgadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadTTPulgadasActionPerformed(evt);
            }
        });

        txtCantidadTTMilimetricas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidadTTMilimetricas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLbreferenciaF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbreferenciaF.setForeground(new java.awt.Color(204, 0, 0));
        jLbreferenciaF.setText("Referencia factura");

        txtreferenciaF.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtreferenciaF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtreferenciaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreferenciaFActionPerformed(evt);
            }
        });

        jLbtipoDePago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbtipoDePago.setForeground(new java.awt.Color(204, 0, 0));
        jLbtipoDePago.setText("Tipo de pago");

        jBtipoDePago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtipoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Credito" }));
        jBtipoDePago.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jBtipoDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtipoDePagoActionPerformed(evt);
            }
        });

        txttornilloLamina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttornilloLamina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txttornilloLamina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttornilloLaminaActionPerformed(evt);
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbTPulgadas)
                            .addComponent(jLbTMilimetricas)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLbtipoDePago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtipoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLbreferenciaF))
                            .addComponent(jLbLamina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                        .addComponent(txtreferenciaF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLbAglomerados)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtAglomerados, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLbCantidadTAglomerados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidadTTAglomerados, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLbPrecioAglomerados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecioTTAglomerados, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txttornilloLamina, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLbCantidadTLamina))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTMilimetricas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLbCantidadTPulgadas)
                                            .addComponent(jLbCantidadTMlimetricas))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtCantidadTTPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLbPrecioTPulgadas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecioTTPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtCantidadTTMilimetricas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLPrecioTMilimetricos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecioTTMilimetricas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtCantidadTTLamina, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLbPrecioLamina)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecioTTLamina, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jBRegistroTornilleria, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtipoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbtipoDePago)
                    .addComponent(jLbreferenciaF)
                    .addComponent(txtreferenciaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbAglomerados)
                    .addComponent(txtAglomerados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbCantidadTAglomerados)
                    .addComponent(txtCantidadTTAglomerados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbPrecioAglomerados)
                    .addComponent(txtPrecioTTAglomerados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbLamina)
                    .addComponent(txttornilloLamina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbCantidadTLamina)
                    .addComponent(txtCantidadTTLamina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbPrecioLamina)
                    .addComponent(txtPrecioTTLamina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTPulgadas)
                    .addComponent(txtTPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbCantidadTPulgadas)
                    .addComponent(txtCantidadTTPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbPrecioTPulgadas)
                    .addComponent(txtPrecioTTPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTMilimetricas)
                    .addComponent(txtTMilimetricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbCantidadTMlimetricas)
                    .addComponent(txtCantidadTTMilimetricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrecioTMilimetricos)
                    .addComponent(txtPrecioTTMilimetricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBRegistroTornilleria, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, 320));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 460, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void txttornilloLaminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttornilloLaminaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttornilloLaminaActionPerformed

    private void jBtipoDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtipoDePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtipoDePagoActionPerformed

    private void txtreferenciaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreferenciaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreferenciaFActionPerformed

    private void jBRegistroTornilleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistroTornilleriaActionPerformed
        // CAPTURA DE LA INFORMACION DE LA TORNILLERIA REGISTRADA
        //REFERENCIA FACTURA
        String tipoDePago = jBtipoDePago.getSelectedItem().toString();
        String referenciaFactura = txtreferenciaF.getText().trim();
        //VALIDACIONES REFERENCIA FACTURA
        if(referenciaFactura.length()>0 && referenciaFactura.length()<5 ){
            if(Validacion.esNumericoRefernciaF(referenciaFactura)){
            }else{
                JOptionPane.showMessageDialog(this, "EN LA REFERENCIA D ELA FACTURA SOLO SE PERMITEN DATOS NUMERICOS NO MAYOR A CUATRO DIGITOS","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "EN LA REFERENCIA DE LA FACTURA SOLO SE PERMITEN CUATRO DATOS NUMERICOS","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        //CAPTURA DE DATOS DE LOS PRODUCTOS REGISTRADOS
        String tornillosAglomerados = txtAglomerados.getText().trim();
        String tornillosLamina = txttornilloLamina.getText().trim();
        String tuercasEnPulgadas = txtTPulgadas.getText().trim();
        String tuercasMilimetricas = txtTMilimetricas.getText().trim();
        DatosProductos productos = new DatosProductos();
        productos.setReferenciaF(referenciaFactura); 
        //VALIDACIONES(CANTIDAD DE DATOS) CODIGO DE PRODUCTOS
        if(tornillosAglomerados.length()>3 && tornillosAglomerados.length()<5 ){
            if(tornillosLamina.length()>3 && tornillosLamina.length()<5 ){
                if(tuercasEnPulgadas.length() >3 && tuercasEnPulgadas.length()<5 ){
                    if(tuercasMilimetricas.length()>3 && tuercasMilimetricas.length()<5){
                        //VALIDACIONES(TIPO DE DATO) CODIGO DE PRODUCTOS
                        if(Validacion.esNumericoCodigo(tornillosAglomerados)){
                            if(Validacion.esNumericoCodigo(tornillosLamina)){
                                if(Validacion.esNumericoCodigo(tuercasEnPulgadas)){
                                    if(Validacion.esNumericoCodigo(tuercasMilimetricas)){
                                        //GUARDAR LA INFORMACION  INGRESADA
                                        productos.setTornillosAglomerados(tornillosAglomerados);
                                        productos.setTornillosPanLamina(tornillosLamina);
                                        productos.setTuercasEnPulgadas(tuercasEnPulgadas);
                                        productos.setTuercasMilimetricas(tuercasMilimetricas);
                                        }else{
                                            JOptionPane.showMessageDialog(this, "EN LA REFERENCIA TUERCAS MILIMETRICAS SOLO SE PERMITEN CUATRO  DATOS NUMERICOS Y SIN ESPACIOS","ERROR",JOptionPane.ERROR_MESSAGE);
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(this, "EN LA REFERENCIA TUERCAS EN PULGADA SOLO SE PERMITEN CUATRO DATOS NUMERICOS Y SIN ESPACIOS","ERROR",JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(this, "EN LA REFERENCIA TORNILLOS LAMINA SOLO SE PERMITEN CUATRO DATOS NUMERICOS Y SIN ESPACIOS","ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "EN LA REFERNCIA TORNILLOS AGLOMERADOS SOLO SE PERMITEN CUATRO DATOS NUMERICOS Y SIN ESPACIOS","ERROR",JOptionPane.ERROR_MESSAGE);
                            }

                        }else{
                            JOptionPane.showMessageDialog(this, "REGISTRE LA REFERENCIA DE LA TUERCA MILIMETRICA","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "REGISTRE LA REFERENCIA DE LA TUERCA EN PULGADAS","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "REGISTRE LA REFERENCIA DEL TORNILLO LAMINA","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "REGISTRE LA REFERENCIA DEL TORNILLO AGLOMERADO","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //CAPTURA DE DATOS DE LA CANTIDAD DE PRODUCTOS
            String cantidadTTornillosAglomerados = txtCantidadTTAglomerados.getText().trim();
            String cantidadTTornillosLamina = txtCantidadTTLamina.getText().trim();
            String cantidadTTuercasEnPulgadas = txtCantidadTTPulgadas.getText().trim();
            String cantidadTTuercasMilimetricas = txtCantidadTTMilimetricas.getText().trim();
            //VALIDACIONES(CANTIDAD DE DATOS) DE LA CANTIDAD DE PRODUCTOS
            if(cantidadTTornillosAglomerados.length()>0){
                if(cantidadTTornillosLamina.length()>0){
                    if(cantidadTTuercasEnPulgadas.length()>0){
                        if(cantidadTTuercasMilimetricas.length()>0){
                            //VALIDACIONES(TIPO DE DATO) DE LA CANTIDAD DE PRODUCTOS
                            if(Validacion.esNumericoCantidad(cantidadTTornillosAglomerados)){
                                if(Validacion.esNumericoCantidad(cantidadTTornillosLamina)){
                                    if(Validacion.esNumericoCantidad(cantidadTTuercasEnPulgadas)){
                                        if(Validacion.esNumericoCantidad(cantidadTTuercasMilimetricas)){
                                        //GUARDAR DATOS INGRESADOS CANTIDAD
                                        productos.setCantidadTTAglomerados(cantidadTTornillosAglomerados);
                                        productos.setCantidadTTLamina(cantidadTTornillosLamina);
                                        productos.setCantidadTTPulgadas(cantidadTTuercasEnPulgadas);
                                        productos.setCantidadTTMilimetrica(cantidadTTuercasMilimetricas);
                                        }else{
                                            JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS NUMERICOS (TUERCAS MILIMETRICAS)","ERROR",JOptionPane.ERROR_MESSAGE);
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS NUMERICOS (TUERCAS EN PULGADA)","ERROR",JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS NUMERICOS (TORNILLOS LAMINA)","ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS NUMERICOS (TORNILLOS AGLOMERADOS)","ERROR",JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "REGISTRE LA CANTIDAD DE LAS TUERCAS MILIMETRICAS","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "REGISTRE LA CATIDAD DE LAS TUERCAS EN PULGADAS","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "REGISTRE LA CANTIDAD DEL TORNILLO LAMINA","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "REGISTRE LA CANTIDAD DEL TORNILLO AGLOMERADO","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //CAPTURA DE DATOS PRECIO DE  PRODUCTOS
            String precioTTornillosAglomerados = txtPrecioTTAglomerados.getText().trim();
            String precioTTornillosLamina = txtPrecioTTLamina.getText().trim();
            String precioTTuercasEnPulgadas = txtPrecioTTPulgadas.getText().trim();
            String precioTTuercasMilimetricas = txtPrecioTTMilimetricas.getText().trim();
            //VALIDACIONES (CANTIDAD DE DATOS) PRECIO DE LOS PRODUCTOS
            if(precioTTornillosAglomerados.length()>0){
                if(precioTTornillosLamina.length()>0){
                    if(precioTTuercasEnPulgadas.length()>0){
                        if(precioTTuercasMilimetricas.length()>0){
                            //VALIDACIONES(TIPO DE DATO) PRECIO DE PRODUCTOS
                            if(Validacion.esNumericoPrecio(precioTTornillosAglomerados)){
                                if(Validacion.esNumericoPrecio(precioTTornillosLamina)){
                                    if(Validacion.esNumericoPrecio(precioTTuercasEnPulgadas)){
                                        if(Validacion.esNumericoPrecio(precioTTuercasMilimetricas)){
                                        //GUARDAR DATOS INGRESADOS PRECIO   
                                        productos.setPrecioTAglomerados(precioTTornillosAglomerados);
                                        productos.setPrecioTLamina(precioTTornillosLamina);
                                        productos.setPrecioTTPulgadas(precioTTuercasEnPulgadas );
                                        productos.setPrecioTTMilimetricas(precioTTuercasMilimetricas );
                                        }else{
                                            JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS NUMERICOS (TUERCAS MILIMETRICAS)","ERROR",JOptionPane.ERROR_MESSAGE);
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS NUMERICOS (TUERCAS EN PULGADAS)","ERROR",JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS NUMERICOS (TORNILLOS LAMINA)","ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "SOLO SE PERMITEN DATOS NUMERICOS (TORNILLOS AGLOMERADOS)","ERROR",JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "REGISTRE El PRECIO TOTAL DE LA TUERCAS MILIMETRICAS","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "REGISTRE EL PRECIO TOTAL DE LAS TUERCAS EN PULGADAS","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "REGISTRE EL PRECIO TOTAL DEL TORNILLO LAMINA","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "REGISTRE El PRECIO TOTAL DEL TORNILLO AGLOMERADO","ERROR",JOptionPane.ERROR_MESSAGE);

            }
               HashMap<String, DatosProductos> mapDatosProductos = new HashMap<String, DatosProductos>();
                                        mapDatosProductos.put(tipoDePago+"--"+productos.getReferenciaF(),productos);  
                                        Datos.setMapaDatosProductos(mapDatosProductos);
                                         
    }//GEN-LAST:event_jBRegistroTornilleriaActionPerformed

    private void txtPrecioTTPulgadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioTTPulgadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioTTPulgadasActionPerformed

    private void txtPrecioTTLaminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioTTLaminaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioTTLaminaActionPerformed

    private void txtPrecioTTAglomeradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioTTAglomeradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioTTAglomeradosActionPerformed

    private void txtAglomeradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAglomeradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAglomeradosActionPerformed

    private void txtCantidadTTAglomeradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadTTAglomeradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadTTAglomeradosActionPerformed

    private void txtCantidadTTAglomeradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadTTAglomeradosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadTTAglomeradosMouseClicked

    private void txtCantidadTTPulgadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadTTPulgadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadTTPulgadasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegistroTornilleria;
    private javax.swing.JComboBox<String> jBtipoDePago;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLPrecioTMilimetricos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbAglomerados;
    private javax.swing.JLabel jLbCantidadTAglomerados;
    private javax.swing.JLabel jLbCantidadTLamina;
    private javax.swing.JLabel jLbCantidadTMlimetricas;
    private javax.swing.JLabel jLbCantidadTPulgadas;
    private javax.swing.JLabel jLbLamina;
    private javax.swing.JLabel jLbPrecioAglomerados;
    private javax.swing.JLabel jLbPrecioLamina;
    private javax.swing.JLabel jLbPrecioTPulgadas;
    private javax.swing.JLabel jLbTMilimetricas;
    private javax.swing.JLabel jLbTPulgadas;
    private javax.swing.JLabel jLbreferenciaF;
    private javax.swing.JLabel jLbtipoDePago;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAglomerados;
    public javax.swing.JTextField txtCantidadTTAglomerados;
    private javax.swing.JTextField txtCantidadTTLamina;
    private javax.swing.JTextField txtCantidadTTMilimetricas;
    private javax.swing.JTextField txtCantidadTTPulgadas;
    private javax.swing.JTextField txtPrecioTTAglomerados;
    private javax.swing.JTextField txtPrecioTTLamina;
    private javax.swing.JTextField txtPrecioTTMilimetricas;
    private javax.swing.JTextField txtPrecioTTPulgadas;
    private javax.swing.JTextField txtTMilimetricas;
    private javax.swing.JTextField txtTPulgadas;
    private javax.swing.JTextField txtreferenciaF;
    private javax.swing.JTextField txttornilloLamina;
    // End of variables declaration//GEN-END:variables
}
