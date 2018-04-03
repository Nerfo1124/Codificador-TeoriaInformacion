package co.com.udistrital.teoria.presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import co.com.udistrital.teoria.vo.MachineStatesVO;
import co.com.udistrital.teoria.vo.StatesVO;

/**
 *
 * @author mhiguera
 */
public class Principal extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Maquina de Estados
     */
    private MachineStatesVO machine;

    /**
     * Variables auxiliares para almacenar las ecuaciones de la Maquina de
     * Estados.
     */
    private String ecuacion1;
    private String ecuacion2;
    private String ecuacion3;

    private Integer numMemorias;

    /**
     * Variable para almacenar la palabra en binario
     */
    private String binario;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.numMemorias = 0;
    }

    /**
     * Constructor que inicializa los componentes del formulario.
     */
    private void initComponents() {

        Jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFCircuito1 = new javax.swing.JTextField();
        TFCircuito2 = new javax.swing.JTextField();
        TFCircuito3 = new javax.swing.JTextField();
        cbSalida1 = new javax.swing.JCheckBox();

        cbSalida2 = new javax.swing.JCheckBox();

        cbSalida3 = new javax.swing.JCheckBox();

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAMaquinaestados = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Panelcod = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btncodifica = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TFPalabra = new javax.swing.JTextField();
        TFImprimebinario = new javax.swing.JTextField();
        TFIpalabracod = new javax.swing.JTextField();
        TFEstados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel principal");

        Jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese los circuitos"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ENTRADA");

        TFCircuito1.setEditable(false);
        TFCircuito2.setEditable(false);
        TFCircuito3.setEditable(false);

        cbSalida1.setText("SALIDA 1");
        cbSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalida1ActionPerformed(evt);
            }
        });

        cbSalida2.setText("SALIDA 2");
        cbSalida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalida2ActionPerformed(evt);
            }
        });

        cbSalida3.setText("SALIDA 3");
        cbSalida3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalida3ActionPerformed(evt);
            }
        });

        jButton1.setText("IMPRIMIR CIRCUITOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPIAR");

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JpanelLayout.createSequentialGroup().addGroup(JpanelLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JpanelLayout.createSequentialGroup().addGap(115, 115, 115).addComponent(TFCircuito2,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JpanelLayout.createSequentialGroup().addGap(26, 26, 26).addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addGroup(JpanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TFCircuito1, javax.swing.GroupLayout.DEFAULT_SIZE, 172,
                                                Short.MAX_VALUE)
                                        .addComponent(TFCircuito3))))
                        .addGap(29, 29, 29)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbSalida2).addComponent(cbSalida1).addComponent(cbSalida3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(JpanelLayout.createSequentialGroup().addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)));
        JpanelLayout.setVerticalGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JpanelLayout.createSequentialGroup().addGap(32, 32, 32)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TFCircuito1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSalida1))
                        .addGap(32, 32, 32)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TFCircuito3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbSalida2)))
                        .addGap(31, 31, 31)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TFCircuito2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSalida3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1).addComponent(jButton2))
                        .addGap(49, 49, 49)));

        jScrollPane1.setToolTipText("");
        jScrollPane1
                .setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TAMaquinaestados.setEditable(false);
        TAMaquinaestados.setColumns(20);
        TAMaquinaestados.setRows(5);
        jScrollPane1.setViewportView(TAMaquinaestados);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Maquina de estados");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Convensiones"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Use las siguientes instrucciones para escribir el circuito");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("M1: para memoria 1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("M2: para memoria 2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("M3: para memoria 3");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("XOR: para operador lógico (Solo puede usar 3)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("NOTA: Utilice espacio (\" \") para unir cada componente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8).addComponent(jLabel7).addComponent(jLabel6).addComponent(jLabel5)
                                .addComponent(jLabel4).addComponent(jLabel3))
                        .addContainerGap(45, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel7)
                        .addGap(18, 18, 18).addComponent(jLabel8).addContainerGap(55, Short.MAX_VALUE)));

        Panelcod.setBorder(javax.swing.BorderFactory.createTitledBorder("Codificacion de mensaje"));
        Panelcod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Estados:");
        Panelcod.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jLabel10.setText("Palabra codificada:");
        Panelcod.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel11.setText("Ingrese la palabra a codificar");
        Panelcod.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel12.setText("Palabra en binario:");
        Panelcod.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btncodifica.setText("Codificar");
        btncodifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncodificaActionPerformed(evt);
            }
        });
        Panelcod.add(btncodifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jButton4.setText("Limpiar");
        Panelcod.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));
        Panelcod.add(TFPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 250, -1));

        TFImprimebinario.setEditable(false);
        Panelcod.add(TFImprimebinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 250, -1));

        TFIpalabracod.setEditable(false);
        TFIpalabracod.addActionListener(this::TFIpalabracodActionPerformed);
        Panelcod.add(TFIpalabracod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 250, -1));

        TFEstados.setEditable(false);
        Panelcod.add(TFEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(498, 498, 498).addComponent(jLabel2,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(13, 13, 13).addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                605, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup().addGap(0, 42, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146).addComponent(Panelcod, javax.swing.GroupLayout.PREFERRED_SIZE,
                                624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(22, 22, 22)
                .addComponent(
                        jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18).addComponent(Panelcod, javax.swing.GroupLayout.PREFERRED_SIZE, 187,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE)));
        pack();
    }

    // HABILITA EL CAMPO DE TEXTO PARA INGRESAR EL CIRCUITO DE LA PRIMERA SALIDA
    private void cbSalida1ActionPerformed(java.awt.event.ActionEvent evt) {
        // validación de entradas de texto en la caja TFCircuito1
        cbSalida1.setSelected(true);
        if (cbSalida1.isSelected()) {
            TFCircuito1.setEditable(true);
        } else {
            TFCircuito1.setEditable(false);
        }
    }

    private void cbSalida2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbSalida2ActionPerformed
        // validación de entradas de texto en la caja TFCircuito2
        cbSalida2.setSelected(true);

        if (cbSalida2.isSelected()) {
            TFCircuito2.setEditable(true);

        } else {
            TFCircuito2.setEditable(false);
        }
    }

    private void cbSalida3ActionPerformed(java.awt.event.ActionEvent evt) {
        // validación de entradas de texto en la caja TFCircuito3
        cbSalida3.setSelected(true);
        if (cbSalida3.isSelected()) {
            TFCircuito3.setEditable(true);

        } else {
            TFCircuito3.setEditable(false);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int resp = JOptionPane.showConfirmDialog(null, "¿DESEA IMPRIMIR LOS CIRCUITOS INGRESADOS?");
        if (JOptionPane.OK_OPTION == resp) {
            // Guarda el texto en variables
            String val1 = null, val2 = null, val3 = null;
            System.out.println("llama a la clase Logica para leer circuitos");

            if (JOptionPane.OK_OPTION == resp) {
                // Guarda el texto en variables
                System.out.println("llama a la clase Logica para leer circuitos");
                if (cbSalida1.isSelected()) {
                    val1 = TFCircuito1.getText();
                    numMemorias = getNumMemoriasByOperation(numMemorias, val1);
                }
                if (cbSalida2.isSelected()) {
                    val2 = TFCircuito2.getText();
                    numMemorias = getNumMemoriasByOperation(numMemorias, val2);
                }
                if (cbSalida3.isSelected()) {
                    val3 = TFCircuito3.getText();
                    numMemorias = getNumMemoriasByOperation(numMemorias, val3);
                }
                setCircuitos(val1, val3, val2);
                String area = execute();
                TAMaquinaestados.setText(area);
            }
        }
    }

    private void btncodificaActionPerformed(java.awt.event.ActionEvent evt) {
        // Envio de texto para cambiar a binario
        binario = TFPalabra.getText();
        System.out.println("Palabra: " + binario);

        List<String> binSecEstCod = codificarPalabra(binario);

        TFIpalabracod.setText(binSecEstCod.get(0));
        TFIpalabracod.setEditable(Boolean.TRUE);

        TFImprimebinario.setText(binSecEstCod.get(1));
        TFImprimebinario.setEditable(Boolean.TRUE);

        TFEstados.setText(binSecEstCod.get(2));
        TFEstados.setEditable(Boolean.TRUE);
    }

    private void TFIpalabracodActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JPanel Panelcod;
    private javax.swing.JTextArea TAMaquinaestados;
    private javax.swing.JTextField TFCircuito1;
    private javax.swing.JTextField TFCircuito2;
    private javax.swing.JTextField TFCircuito3;
    private javax.swing.JTextField TFEstados;
    private javax.swing.JTextField TFImprimebinario;
    private javax.swing.JTextField TFIpalabracod;
    private javax.swing.JTextField TFPalabra;
    private javax.swing.JButton btncodifica;
    private javax.swing.JCheckBox cbSalida1;
    private javax.swing.JCheckBox cbSalida2;
    private javax.swing.JCheckBox cbSalida3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;

    /**
     * Asignacion de las ecuaciones de la Maquina de Estados.
     *
     * @param c1
     * @param c2
     * @param c3
     */
    public void setCircuitos(String c1, String c2, String c3) {
        this.ecuacion1 = c1;
        this.ecuacion2 = c2;
        this.ecuacion3 = c3;
    }

    /**
     * Metodo encargado de construir la maquina de estados.
     *
     * @return
     */
    public String execute() {
        String response = "";
        String responseHead = "E\t";
        String responseBody = "";

        Integer numEstados = (int) Math.pow(2, this.numMemorias);

        machine = new MachineStatesVO();
        if (this.ecuacion1 != null) {
            machine.addOperacion(this.ecuacion1);
        }
        if (this.ecuacion2 != null) {
            machine.addOperacion(this.ecuacion2);
        }
        if (this.ecuacion3 != null) {
            machine.addOperacion(this.ecuacion3);
        }
        for (int i = 0; i < numEstados; i++) {
            if ((this.numMemorias - Integer.toBinaryString(i).length()) > 0) {
                String regex = "%0" + (this.numMemorias - Integer.toBinaryString(i).length()) + "d";
                machine.addEstado(new StatesVO("S" + i, String.format(regex, 0) + Integer.toBinaryString(i)));
            } else {
                machine.addEstado(new StatesVO("S" + i, Integer.toBinaryString(i)));
            }
        }

        for (int i = 0; i < this.numMemorias; i++) {
            responseHead += "M" + (i + 1) + "\t";
        }
        for (int i = 0; i < this.numMemorias; i++) {
            responseHead += "M" + (i + 1) + "+\t";
        }
        for (int i = 0; i < machine.getOperaciones().size(); i++) {
            responseHead += "O" + (i + 1) + "\t";
        }
        responseHead += "S" + "\t";
        responseHead += "S+" + "\t";

        Integer[] entrada = {0, 1};
        for (StatesVO estado : machine.getEstados()) {
            for (Integer in : entrada) {
                responseBody += in + "\t";
                char[] auxC1 = estado.valuesToString().toCharArray();
                for (char c : auxC1) {
                    responseBody += c + "\t";
                }
                char[] auxC2 = estado.nextValues(in).toCharArray();
                for (char c : auxC2) {
                    responseBody += c + "\t";
                }
                for (Integer salida : estado.getSalidas(in)) {
                    responseBody += salida + "\t";
                }
                responseBody += estado.getName() + "\t";
                for (StatesVO est : machine.getEstados()) {
                    if (est.valuesToString().equals(estado.nextValues(in))) {
                        responseBody += est.getName() + "\t";
                        break;
                    }
                }
                responseBody += "\n";
            }
        }
        response += responseHead + "\n";
        response += responseBody;
        return response;
    }

    /**
     * Metodo encargado de codificar una palabra a partir de la maquina de
     * estados.
     *
     * @param palabra
     * @return
     */
    public List<String> codificarPalabra(String palabra) {
        List<String> response = new ArrayList<>();
        String palabraBinario = wordToBinary(palabra);
        System.out.println("Palabra en Binario: " + palabraBinario);

        response.add(palabraBinario);
        // Creacion de un array con los bits a codificar
        char[] bin = palabraBinario.toCharArray();
        // Codificacion de la palabra
        String codificacion = "";
        String printEstados = "";
        String estInicial = String.format("%0" + (this.numMemorias) + "d", 0);
        for (char c : bin) {
            Integer input = Integer.parseInt("" + c);
            for (StatesVO estado : machine.getEstados()) {
                if (estado.valuesToString().equals(estInicial)) {
                    printEstados += estado.getName() + ",";
                    codificacion += estado.salidasToString(input);
                    estInicial = estado.nextValues(input);
                    break;
                }
            }
        }
        System.out.println(printEstados);
        response.add(printEstados);
        System.out.println("Palabra codificada: " + codificacion);
        response.add(codificacion);
        return response;
    }

    /**
     * Metodo encargado de convertir una palabra a binario.
     *
     * @param word
     * @return
     */
    public static String wordToBinary(String word) {
        String response = "";
        char[] array = word.toCharArray();
        for (char c : array) {
            response += Integer.toBinaryString(c);
        }
        return response;
    }

    /**
     * Metodo encargado de obtener el numero de elementos de memoria a partir de
     * las ecuaciones de la maquina de estados
     *
     * @param numMemorias
     * @param operation
     * @return
     */
    public Integer getNumMemoriasByOperation(Integer numMemorias, String operation) {
        // Busqueda del numero de memorias a utilizar segun la ecuacion de salida
        String[] objs = operation.replaceAll(" +", "").trim().toUpperCase().split("XOR");
        for (String obj : objs) {
            if (obj.contains("M")) {
                Integer aux = Integer.parseInt(obj.replace("M", ""));
                if (aux > numMemorias) {
                    numMemorias = aux;
                }
            }
        }
        return numMemorias;
    }
}
