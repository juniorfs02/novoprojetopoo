package pacote01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class frameProximoped extends JFrame {

	private JPanel contentPane;
	private JTextField textCodPedido;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameProximoped frame = new frameProximoped();
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
	public frameProximoped() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 590);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCodPedido = new JTextField();
		textCodPedido.setEditable(false);
		textCodPedido.setBounds(181, 120, 168, 26);
		contentPane.add(textCodPedido);
		textCodPedido.setColumns(10);
		
		JButton btnppProxpedido = new JButton("Pr\u00F3ximo");
		btnppProxpedido.setForeground(Color.WHITE);
		btnppProxpedido.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnppProxpedido.setBackground(new Color(0, 153, 255));
		btnppProxpedido.setBounds(44, 378, 127, 29);
		contentPane.add(btnppProxpedido);
		
		JLabel lblNewLabel = new JLabel("Pr\u00F3ximo Pedido");
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblNewLabel.setBounds(65, 11, 284, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Cliente");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1.setBounds(44, 120, 111, 26);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(181, 83, 168, 26);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00BA Pedido");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(44, 83, 98, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(181, 157, 168, 102);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Descri\u00E7\u00E3o Pedido");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(44, 157, 127, 26);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(181, 270, 168, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Frete");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(44, 270, 98, 26);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(181, 307, 168, 26);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Pre\u00E7o Total");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(44, 307, 98, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnppConfirmar = new JButton("Confirmar ");
		btnppConfirmar.setForeground(Color.WHITE);
		btnppConfirmar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnppConfirmar.setBackground(new Color(0, 153, 0));
		btnppConfirmar.setBounds(222, 378, 127, 29);
		contentPane.add(btnppConfirmar);
		
		JButton btnppCancelar = new JButton("Cancelar");
		btnppCancelar.setForeground(Color.WHITE);
		btnppCancelar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnppCancelar.setBackground(Color.RED);
		btnppCancelar.setBounds(222, 428, 127, 29);
		contentPane.add(btnppCancelar);
		
		JButton btnppAbastecer = new JButton("Abastecer");
		btnppAbastecer.setForeground(Color.WHITE);
		btnppAbastecer.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnppAbastecer.setBackground(new Color(0, 153, 255));
		btnppAbastecer.setBounds(44, 428, 127, 29);
		contentPane.add(btnppAbastecer);
		
		JButton btnppVoltar = new JButton("Voltar");
		btnppVoltar.setForeground(Color.WHITE);
		btnppVoltar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnppVoltar.setBackground(new Color(0, 153, 255));
		btnppVoltar.setBounds(138, 482, 121, 29);
		contentPane.add(btnppVoltar);
	}
}
