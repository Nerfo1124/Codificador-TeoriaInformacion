package co.com.udistrital.teoria.presentacion;

import co.com.udistrital.teoria.logica.ValidacionCadenaCircuitos;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JPanel pconvenciones;
    private JTextField TFCircuito1;
    private JTextField TFCircuito2;
    private JTextField TFCircuito3;
    ValidacionCadenaCircuitos Val = new ValidacionCadenaCircuitos();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Principal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1037, 657);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel pprotoboard = new JPanel();
        pprotoboard.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese los circuitos"));
        pprotoboard.setBounds(24, 78, 429, 265);
        contentPane.add(pprotoboard);
        pprotoboard.setLayout(null);

        TFCircuito1 = new JTextField();
        TFCircuito1.setEnabled(false);
        TFCircuito1.setBounds(111, 47, 140, 27);
        pprotoboard.add(TFCircuito1);
        TFCircuito1.setColumns(10);

        TFCircuito2 = new JTextField();
        TFCircuito2.setEnabled(false);
        TFCircuito2.setColumns(10);
        TFCircuito2.setBounds(111, 97, 140, 27);
        pprotoboard.add(TFCircuito2);

        TFCircuito3 = new JTextField();
        TFCircuito3.setEnabled(false);
        TFCircuito3.setColumns(10);
        TFCircuito3.setBounds(111, 149, 140, 27);
        pprotoboard.add(TFCircuito3);

        //HABILITA EL CAMPO DE TEXTO PARA INGRESAR EL CIRCUITO DE LA PRIMERA SALIDA
        JCheckBox cbSalida1 = new JCheckBox("Salida 1", false);
        //validaci�n de entradas de texto en la caja TFCircuito1
        cbSalida1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JCheckBox cbSalida1 = (JCheckBox) e.getSource();
                if (cbSalida1.isSelected()) {
                    JOptionPane.showMessageDialog(null, "ESCRIBA EL CIRCUITO PARA LA SALIDA 1");
                    TFCircuito1.setEnabled(true);
                } else {
                    TFCircuito1.setEnabled(false);
                }
            }
        });

        //Fuentes
        cbSalida1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cbSalida1.setBounds(278, 49, 97, 23);
        pprotoboard.add(cbSalida1);

        //HABILITA EL CAMPO DE TEXTO PARA INGRESAR EL CIRCUITO DE LA SEGUNDA SALIDA
        JCheckBox cbSalida2 = new JCheckBox("Salida 2", false);

        //Habilita acci�n
        cbSalida2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JCheckBox cbSalida2 = (JCheckBox) e.getSource();
                if (cbSalida2.isSelected()) {
                    JOptionPane.showMessageDialog(null, "ESCRIBA EL CIRCUITO PARA LA SALIDA 2");
                    TFCircuito2.setEnabled(true);
                } else {
                    TFCircuito2.setEnabled(false);
                }
            }
        });

        //Fuentes
        cbSalida2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cbSalida2.setBounds(278, 99, 97, 23);
        pprotoboard.add(cbSalida2);

        //HABILITA EL CAMPO DE TEXTO PARA INGRESAR EL CIRCUITO DE LA TERCERA SALIDA
        JCheckBox cbSalida3 = new JCheckBox("Salida 3", false);
        cbSalida3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JCheckBox cbSalida3 = (JCheckBox) e.getSource();
                if (cbSalida3.isSelected()) {
                    JOptionPane.showMessageDialog(null, "ESCRIBA EL CIRCUITO PARA LA SALIDA 3");
                    TFCircuito3.setEnabled(true);
                } else {
                    TFCircuito3.setEnabled(false);
                }
            }
        });

        //Fuentes
        cbSalida3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cbSalida3.setBounds(278, 151, 97, 23);
        pprotoboard.add(cbSalida3);

        //PASA EL TEXTO INGRESADO EN LOS TEXTFIELDS A LABELS
        JButton btnImprimir = new JButton("Imprimir circuitos");
        btnImprimir.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                int resp = JOptionPane.showConfirmDialog(null, "�DESEA IMPRIMIR LOS CIRCUITOS INGRESADOS?");
                if (JOptionPane.OK_OPTION == resp) {
                    //Guarda el texto en variables
                    System.out.println("llama a la clase Logica para leer circuitos");

                    if (cbSalida1.isSelected()) {
                        Val.Circuito1(TFCircuito1.getText());
                    }

                    if (cbSalida2.isSelected()) {
                        Val.Circuito2(TFCircuito2.getText());
                    }

                    if (cbSalida3.isSelected()) {
                        Val.Circuito3(TFCircuito3.getText());
                    }

                } else {
                    System.out.println("continua escribiendo los circuitos");
                }

            }
        });
        btnImprimir.setBounds(52, 209, 150, 23);
        pprotoboard.add(btnImprimir);

        //LIMPIA EL TEXTO INGRESADO EN LOS TEXTFIELDS
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int resp = JOptionPane.showConfirmDialog(null, "�DESEA LIMPIAR LOS CAMPOS DE TEXTO?");
                if (JOptionPane.OK_OPTION == resp) {
                    System.out.println("Limpia campos de texto");

                    TFCircuito1.setText("");
                    TFCircuito2.setText("");
                    TFCircuito3.setText("");

                } else {
                    System.out.println("No limpia nada");
                }
            }
        });
        btnLimpiar.setBounds(236, 209, 150, 23);
        pprotoboard.add(btnLimpiar);

        //LABEL QUE INDICA DONDE ENTRA LA INFORMACION
        JLabel lblEntrada = new JLabel("ENTRADA");
        lblEntrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEntrada.setBounds(10, 101, 142, 14);
        pprotoboard.add(lblEntrada);

        //TABLA PARA PINTAR LA TABLA DE ESTADOS
        table = new JTable();
        table.setBounds(499, 336, 484, 254);
        contentPane.add(table);

        //TEXTO DE CONVENCIONES, INDICA COMO SE DEBEN INGRESAR LOS COMANDOS PARA QUE LOS CIRCUITOS SEAN LEIDOS
        pconvenciones = new JPanel();
        pconvenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Convenciones"));
        pconvenciones.setBounds(24, 354, 268, 192);
        contentPane.add(pconvenciones);
        pconvenciones.setLayout(null);

        JLabel l1 = new JLabel("M1: para memoria 1");
        l1.setFont(new Font("Arial", Font.PLAIN, 9));
        l1.setBounds(23, 59, 142, 14);
        pconvenciones.add(l1);

        JLabel l2 = new JLabel("M2: para memoria 2");
        l2.setFont(new Font("Arial", Font.PLAIN, 9));
        l2.setBounds(23, 84, 142, 14);
        pconvenciones.add(l2);

        JLabel lblMParaMemoria = new JLabel("M3: para memoria 3");
        lblMParaMemoria.setFont(new Font("Arial", Font.PLAIN, 9));
        lblMParaMemoria.setBounds(23, 109, 142, 14);
        pconvenciones.add(lblMParaMemoria);

        JLabel lblUseLasSiguientes = new JLabel("Use las siguientes instrucciones para escribir el circuito");
        lblUseLasSiguientes.setFont(new Font("Arial", Font.PLAIN, 9));
        lblUseLasSiguientes.setBounds(10, 29, 292, 19);
        pconvenciones.add(lblUseLasSiguientes);

        JLabel lblXorParaOperador = new JLabel("XOR: para operador l\u00F3gico (Solo puede usar 3)");
        lblXorParaOperador.setFont(new Font("Arial", Font.PLAIN, 9));
        lblXorParaOperador.setBounds(23, 134, 235, 14);
        pconvenciones.add(lblXorParaOperador);

        JLabel lblNotaUtiliceEl = new JLabel("NOTA: Utilice espacio (\" \") para unir cada componente");
        lblNotaUtiliceEl.setFont(new Font("Arial", Font.PLAIN, 9));
        lblNotaUtiliceEl.setBounds(23, 159, 235, 14);
        pconvenciones.add(lblNotaUtiliceEl);
    }
}
