package pacote01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class frameConsultacod extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameConsultacod frame = new frameConsultacod();
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
	public frameConsultacod() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 131, 77, 26);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 131, 77, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(184, 131, 77, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(271, 131, 77, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(358, 131, 77, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(447, 131, 77, 26);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(536, 131, 77, 26);
		contentPane.add(textField_6);
		
		JLabel lblCdigo_4_2 = new JLabel("Qtde");
		lblCdigo_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo_4_2.setForeground(Color.WHITE);
		lblCdigo_4_2.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblCdigo_4_2.setBounds(536, 78, 69, 42);
		contentPane.add(lblCdigo_4_2);
		
		JLabel lblCdigo_4_1 = new JLabel("Pre\u00E7o");
		lblCdigo_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo_4_1.setForeground(Color.WHITE);
		lblCdigo_4_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblCdigo_4_1.setBounds(447, 78, 69, 42);
		contentPane.add(lblCdigo_4_1);
		
		JLabel lblLivro = new JLabel("Livro");
		lblLivro.setHorizontalAlignment(SwingConstants.CENTER);
		lblLivro.setForeground(Color.WHITE);
		lblLivro.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblLivro.setBounds(358, 78, 69, 42);
		contentPane.add(lblLivro);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblAno.setBounds(271, 78, 69, 42);
		contentPane.add(lblAno);
		
		JLabel lblGnero_1 = new JLabel("G\u00EAnero");
		lblGnero_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGnero_1.setForeground(Color.WHITE);
		lblGnero_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblGnero_1.setBounds(184, 78, 69, 42);
		contentPane.add(lblGnero_1);
		
		JLabel lblGnero = new JLabel("Editora");
		lblGnero.setHorizontalAlignment(SwingConstants.CENTER);
		lblGnero.setForeground(Color.WHITE);
		lblGnero.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblGnero.setBounds(97, 78, 69, 42);
		contentPane.add(lblGnero);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo ");
		lblCdigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo.setForeground(Color.WHITE);
		lblCdigo.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblCdigo.setBounds(18, 78, 69, 42);
		contentPane.add(lblCdigo);
		
		JButton btnNewButton_8 = new JButton("Voltar");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnNewButton_8.setBackground(new Color(0, 153, 255));
		btnNewButton_8.setBounds(284, 208, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(new Color(0, 153, 0));
		btnNewButton.setBounds(630, 133, 43, 23);
		contentPane.add(btnNewButton);
	}

}
