package pacote01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class framePedidocadastro extends JFrame {
	

	private JPanel contentPane;
	private JTextField textCodPedido;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framePedidocadastro frame = new framePedidocadastro();
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
	public framePedidocadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 539);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCodPedido = new JTextField();
		textCodPedido.setBounds(181, 120, 168, 26);
		contentPane.add(textCodPedido);
		textCodPedido.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Pedido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 377, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Cliente");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1.setBounds(44, 120, 98, 26);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(181, 83, 168, 26);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00BA Pedido");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(44, 83, 98, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 196, 168, 26);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quantidade");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(44, 196, 127, 26);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 270, 168, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Frete");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(44, 270, 98, 26);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(181, 307, 168, 26);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Pre\u00E7o Total");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(44, 307, 98, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnpcConfirmar = new JButton("Confirmar ");
		btnpcConfirmar.setForeground(Color.WHITE);
		btnpcConfirmar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnpcConfirmar.setBackground(new Color(0, 153, 0));
		btnpcConfirmar.setBounds(44, 406, 127, 29);
		contentPane.add(btnpcConfirmar);
		
		JButton btnpcVoltar = new JButton("Voltar");
		btnpcVoltar.setForeground(Color.WHITE);
		btnpcVoltar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnpcVoltar.setBackground(new Color(0, 153, 255));
		btnpcVoltar.setBounds(228, 406, 121, 29);
		contentPane.add(btnpcVoltar);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("CEP");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(44, 233, 127, 26);
		contentPane.add(lblNewLabel_1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(181, 233, 168, 26);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Livro");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(44, 157, 127, 26);
		contentPane.add(lblNewLabel_1_2_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(181, 157, 168, 26);
		contentPane.add(textField_5);
	}
}