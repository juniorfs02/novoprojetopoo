package pacote01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frameConsultaEstq extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
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
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JButton btnNewButton_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameConsultaEstq frame = new frameConsultaEstq();
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
	public frameConsultaEstq() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 536);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta Estoque");
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 34));
		lblNewLabel.setBounds(179, 11, 337, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo ");
		lblCdigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo.setForeground(Color.WHITE);
		lblCdigo.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblCdigo.setBounds(18, 86, 69, 42);
		contentPane.add(lblCdigo);
		
		JLabel lblGnero = new JLabel("Editora");
		lblGnero.setHorizontalAlignment(SwingConstants.CENTER);
		lblGnero.setForeground(Color.WHITE);
		lblGnero.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblGnero.setBounds(97, 86, 69, 42);
		contentPane.add(lblGnero);
		
		JLabel lblGnero_1 = new JLabel("G\u00EAnero");
		lblGnero_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGnero_1.setForeground(Color.WHITE);
		lblGnero_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblGnero_1.setBounds(184, 86, 69, 42);
		contentPane.add(lblGnero_1);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblAno.setBounds(271, 86, 69, 42);
		contentPane.add(lblAno);
		
		JLabel lblLivro = new JLabel("Livro");
		lblLivro.setHorizontalAlignment(SwingConstants.CENTER);
		lblLivro.setForeground(Color.WHITE);
		lblLivro.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblLivro.setBounds(358, 86, 69, 42);
		contentPane.add(lblLivro);
		
		JLabel lblCdigo_4_1 = new JLabel("Pre\u00E7o");
		lblCdigo_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo_4_1.setForeground(Color.WHITE);
		lblCdigo_4_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblCdigo_4_1.setBounds(447, 86, 69, 42);
		contentPane.add(lblCdigo_4_1);
		
		JLabel lblCdigo_4_2 = new JLabel("Qtde");
		lblCdigo_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo_4_2.setForeground(Color.WHITE);
		lblCdigo_4_2.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblCdigo_4_2.setBounds(536, 86, 69, 42);
		contentPane.add(lblCdigo_4_2);
		
		textField = new JTextField();
		textField.setBounds(10, 139, 77, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 139, 77, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(184, 139, 77, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(271, 139, 77, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(358, 139, 77, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(447, 139, 77, 26);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(536, 139, 77, 26);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 176, 77, 26);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(97, 176, 77, 26);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(184, 176, 77, 26);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(271, 176, 77, 26);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(358, 176, 77, 26);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(447, 176, 77, 26);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(536, 176, 77, 26);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(10, 213, 77, 26);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(97, 213, 77, 26);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(184, 213, 77, 26);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(271, 213, 77, 26);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(358, 213, 77, 26);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(447, 213, 77, 26);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(536, 213, 77, 26);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(10, 250, 77, 26);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(97, 250, 77, 26);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(184, 250, 77, 26);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(271, 250, 77, 26);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(358, 250, 77, 26);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(447, 250, 77, 26);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(536, 250, 77, 26);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(10, 287, 77, 26);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(97, 287, 77, 26);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(184, 287, 77, 26);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(271, 287, 77, 26);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(358, 287, 77, 26);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(447, 287, 77, 26);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(536, 287, 77, 26);
		contentPane.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(10, 324, 77, 26);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(97, 324, 77, 26);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(184, 324, 77, 26);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(271, 324, 77, 26);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(358, 324, 77, 26);
		contentPane.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(447, 324, 77, 26);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(536, 324, 77, 26);
		contentPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(10, 361, 77, 26);
		contentPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(97, 361, 77, 26);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(184, 361, 77, 26);
		contentPane.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(271, 361, 77, 26);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(358, 361, 77, 26);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(447, 361, 77, 26);
		contentPane.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(536, 361, 77, 26);
		contentPane.add(textField_48);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(new Color(0, 153, 0));
		btnNewButton.setBounds(639, 141, 43, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBackground(new Color(0, 153, 0));
		btnNewButton_1.setBounds(639, 178, 43, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setBackground(new Color(0, 153, 0));
		btnNewButton_2.setBounds(639, 215, 43, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.setBackground(new Color(0, 153, 0));
		btnNewButton_3.setBounds(639, 252, 43, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setBackground(new Color(0, 153, 0));
		btnNewButton_4.setBounds(639, 289, 43, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("+");
		btnNewButton_5.setBackground(new Color(0, 153, 0));
		btnNewButton_5.setBounds(639, 326, 43, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.setBackground(new Color(0, 153, 0));
		btnNewButton_6.setBounds(639, 363, 43, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Alterar");
		btnNewButton_7.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(new Color(0, 153, 255));
		btnNewButton_7.setBounds(427, 437, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Voltar");
		btnNewButton_8.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(new Color(0, 153, 255));
		btnNewButton_8.setBounds(524, 437, 89, 23);
		contentPane.add(btnNewButton_8);
		
		textField_49 = new JTextField();
		textField_49.setBounds(27, 438, 116, 20);
		contentPane.add(textField_49);
		textField_49.setColumns(10);
		
		btnNewButton_9 = new JButton("Buscar C\u00F3digo");
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		btnNewButton_9.setBackground(new Color(0, 153, 0));
		btnNewButton_9.setBounds(164, 437, 130, 26);
		contentPane.add(btnNewButton_9);
	}

}
