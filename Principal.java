package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField TF11;
	private JTextField TF21;
	private JTextField TF31;
	private JTextField TF41;
	private JTextField TF51;
	private JTextField TF61;
	private JTextField TF12;
	private JTextField TF13;
	private JTextField TF14;
	private JTextField TF15;
	private JTextField TF16;
	private JTextField TF22;
	private JTextField TF23;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

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
		setBounds(100, 100, 1015, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(141, 32, 155, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese el mensaje");
		lblNewLabel.setBounds(24, 29, 119, 30);
		contentPane.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(javax.swing.BorderFactory.createTitledBorder("Protoboard"));
		panel_3.setBounds(98, 96, 493, 478);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 21, 465, 444);
		panel_3.add(panel);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(25, 11, 60, 60);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		TF11 = new JTextField();
		TF11.setBounds(10, 11, 40, 38);
		panel_4.add(TF11);
		TF11.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_5.setBounds(25, 80, 60, 60);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		TF21 = new JTextField();
		TF21.setColumns(10);
		TF21.setBounds(10, 11, 40, 38);
		panel_5.add(TF21);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_6.setBounds(25, 150, 60, 60);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		TF31 = new JTextField();
		TF31.setColumns(10);
		TF31.setBounds(10, 11, 40, 38);
		panel_6.add(TF31);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_19.setBounds(25, 220, 60, 60);
		panel.add(panel_19);
		panel_19.setLayout(null);
		
		TF41 = new JTextField();
		TF41.setColumns(10);
		TF41.setBounds(10, 11, 40, 38);
		panel_19.add(TF41);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_20.setBounds(25, 290, 60, 60);
		panel.add(panel_20);
		panel_20.setLayout(null);
		
		TF51 = new JTextField();
		TF51.setColumns(10);
		TF51.setBounds(10, 11, 40, 38);
		panel_20.add(TF51);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_7.setBounds(95, 11, 60, 60);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		TF12 = new JTextField();
		TF12.setColumns(10);
		TF12.setBounds(10, 11, 40, 38);
		panel_7.add(TF12);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8.setBounds(95, 80, 60, 60);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		TF22 = new JTextField();
		TF22.setColumns(10);
		TF22.setBounds(10, 11, 40, 38);
		panel_8.add(TF22);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_9.setBounds(95, 150, 60, 60);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 11, 40, 38);
		panel_9.add(textField_8);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_10.setBounds(95, 220, 60, 60);
		panel.add(panel_10);
		panel_10.setLayout(null);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(10, 11, 40, 38);
		panel_10.add(textField_9);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_11.setBounds(95, 290, 60, 60);
		panel.add(panel_11);
		panel_11.setLayout(null);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(10, 11, 40, 38);
		panel_11.add(textField_14);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_12.setBounds(165, 11, 60, 60);
		panel.add(panel_12);
		panel_12.setLayout(null);
		
		TF13 = new JTextField();
		TF13.setColumns(10);
		TF13.setBounds(10, 11, 40, 38);
		panel_12.add(TF13);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_13.setBounds(165, 80, 60, 60);
		panel.add(panel_13);
		panel_13.setLayout(null);
		
		TF23 = new JTextField();
		TF23.setColumns(10);
		TF23.setBounds(10, 11, 40, 38);
		panel_13.add(TF23);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_14.setBounds(165, 150, 60, 60);
		panel.add(panel_14);
		panel_14.setLayout(null);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 11, 40, 38);
		panel_14.add(textField_7);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_15.setBounds(165, 220, 60, 60);
		panel.add(panel_15);
		panel_15.setLayout(null);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 11, 40, 38);
		panel_15.add(textField_10);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_16.setBounds(165, 290, 60, 60);
		panel.add(panel_16);
		panel_16.setLayout(null);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(10, 11, 40, 38);
		panel_16.add(textField_15);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_17.setBounds(235, 11, 60, 60);
		panel.add(panel_17);
		panel_17.setLayout(null);
		
		TF14 = new JTextField();
		TF14.setColumns(10);
		TF14.setBounds(10, 11, 40, 38);
		panel_17.add(TF14);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_18.setBounds(235, 80, 60, 60);
		panel.add(panel_18);
		panel_18.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 11, 40, 38);
		panel_18.add(textField_1);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_21.setBounds(235, 150, 60, 60);
		panel.add(panel_21);
		panel_21.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 11, 40, 38);
		panel_21.add(textField_6);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_22.setBounds(235, 220, 60, 60);
		panel.add(panel_22);
		panel_22.setLayout(null);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(10, 11, 40, 38);
		panel_22.add(textField_11);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_23.setBounds(235, 290, 60, 60);
		panel.add(panel_23);
		panel_23.setLayout(null);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(10, 11, 40, 38);
		panel_23.add(textField_16);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_24.setBounds(305, 11, 60, 60);
		panel.add(panel_24);
		panel_24.setLayout(null);
		
		TF15 = new JTextField();
		TF15.setColumns(10);
		TF15.setBounds(10, 11, 40, 38);
		panel_24.add(TF15);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_25.setBounds(305, 80, 60, 60);
		panel.add(panel_25);
		panel_25.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 11, 40, 38);
		panel_25.add(textField_2);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_26.setBounds(305, 150, 60, 60);
		panel.add(panel_26);
		panel_26.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 11, 40, 38);
		panel_26.add(textField_5);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_27.setBounds(305, 220, 60, 60);
		panel.add(panel_27);
		panel_27.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(10, 11, 40, 38);
		panel_27.add(textField_12);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_28.setBounds(305, 290, 60, 60);
		panel.add(panel_28);
		panel_28.setLayout(null);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(10, 11, 40, 38);
		panel_28.add(textField_17);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(25, 361, 60, 60);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		TF61 = new JTextField();
		TF61.setColumns(10);
		TF61.setBounds(10, 11, 40, 38);
		panel_1.add(TF61);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(95, 361, 60, 60);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(10, 11, 40, 38);
		panel_2.add(textField_19);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_29.setBounds(165, 361, 60, 60);
		panel.add(panel_29);
		panel_29.setLayout(null);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(10, 11, 40, 38);
		panel_29.add(textField_20);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_30.setBounds(235, 361, 60, 60);
		panel.add(panel_30);
		panel_30.setLayout(null);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(10, 11, 40, 38);
		panel_30.add(textField_21);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_31.setBounds(305, 361, 60, 60);
		panel.add(panel_31);
		panel_31.setLayout(null);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(10, 11, 40, 38);
		panel_31.add(textField_22);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_32.setBounds(375, 11, 60, 60);
		panel.add(panel_32);
		panel_32.setLayout(null);
		
		TF16 = new JTextField();
		TF16.setColumns(10);
		TF16.setBounds(10, 11, 40, 38);
		panel_32.add(TF16);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_33.setBounds(375, 80, 60, 60);
		panel.add(panel_33);
		panel_33.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 11, 40, 38);
		panel_33.add(textField_3);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_34.setBounds(375, 150, 60, 60);
		panel.add(panel_34);
		panel_34.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 11, 40, 38);
		panel_34.add(textField_4);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_35.setBounds(375, 220, 60, 60);
		panel.add(panel_35);
		panel_35.setLayout(null);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(10, 11, 40, 38);
		panel_35.add(textField_13);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_36.setBounds(375, 290, 60, 60);
		panel.add(panel_36);
		panel_36.setLayout(null);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(10, 11, 40, 38);
		panel_36.add(textField_18);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_37.setBounds(375, 361, 60, 60);
		panel.add(panel_37);
		panel_37.setLayout(null);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(10, 11, 40, 38);
		panel_37.add(textField_23);
		
		JButton btnCodificarMensaje = new JButton("Codificar mensaje");
		btnCodificarMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCodificarMensaje.setBounds(678, 65, 195, 23);
		contentPane.add(btnCodificarMensaje);
		
		JLabel lblEntrada = new JLabel("Entrada 1");
		lblEntrada.setBounds(24, 298, 64, 14);
		contentPane.add(lblEntrada);
	}
}
