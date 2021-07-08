package pacote01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class framePedidocadastro extends JFrame {
	

	private JPanel contentPane;
	private JTextField textCPnome;
	private JTextField textCPcodped;
	private JTextField textCPqtde;
	private JTextField textCPfrete;
	private JTextField textCPprecot;
	private JTextField textCPcep;
	private JTextField textCPlivro;

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
		setBounds(100, 100, 437, 539);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCPnome = new JTextField();
		textCPnome.setBounds(181, 120, 168, 26);
		contentPane.add(textCPnome);
		textCPnome.setColumns(10);
		
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
		
		textCPcodped = new JTextField();
		textCPcodped.setColumns(10);
		textCPcodped.setBounds(181, 83, 168, 26);
		contentPane.add(textCPcodped);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00BA Pedido");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(44, 83, 98, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textCPqtde = new JTextField();
		textCPqtde.setColumns(10);
		textCPqtde.setBounds(181, 196, 168, 26);
		contentPane.add(textCPqtde);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quantidade");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(44, 196, 127, 26);
		contentPane.add(lblNewLabel_1_2);
		
		textCPfrete = new JTextField();
		textCPfrete.setColumns(10);
		textCPfrete.setBounds(181, 270, 168, 26);
		contentPane.add(textCPfrete);
		
		JLabel lblNewLabel_1_3 = new JLabel("Frete");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(44, 270, 98, 26);
		contentPane.add(lblNewLabel_1_3);
		
		textCPprecot = new JTextField();
		textCPprecot.setColumns(10);
		textCPprecot.setBounds(181, 307, 168, 26);
		contentPane.add(textCPprecot);
		
		JLabel lblNewLabel_1_4 = new JLabel("Pre\u00E7o Total");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(44, 307, 98, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnCPconfirmar = new JButton("Confirmar ");
		btnCPconfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pedidocadastroexe a = new Pedidocadastroexe();
		        a.setCodpedido(Integer.parseInt(textCPcodped.getText()));
		        a.setNomecliente(textCPnome.getText());
		        a.setNomelivro(textCPlivro.getText());
		        a.setQtde(Integer.parseInt(textCPqtde.getText()));
		        a.setCep(Integer.parseInt(textCPcep.getText()));
		        a.setValorfrete(Float.parseFloat(textCPfrete.getText()));
		        a.setValortotal(Float.parseFloat(textCPprecot.getText()));
		        try {
		            a.Incluir();
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btnCPconfirmar.setForeground(Color.WHITE);		
		btnCPconfirmar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnCPconfirmar.setBackground(new Color(0, 153, 0));
		btnCPconfirmar.setBounds(44, 406, 127, 29);
		contentPane.add(btnCPconfirmar);
		
		JButton btnCPvoltar = new JButton("Voltar");
		btnCPvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCPvoltar.setForeground(Color.WHITE);
		btnCPvoltar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnCPvoltar.setBackground(new Color(0, 153, 255));
		btnCPvoltar.setBounds(228, 406, 121, 29);
		contentPane.add(btnCPvoltar);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("CEP");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(44, 233, 127, 26);
		contentPane.add(lblNewLabel_1_2_1);
		
		textCPcep = new JTextField();
		textCPcep.setColumns(10);
		textCPcep.setBounds(181, 233, 168, 26);
		contentPane.add(textCPcep);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Livro");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(44, 157, 127, 26);
		contentPane.add(lblNewLabel_1_2_2);
		
		textCPlivro = new JTextField();
		textCPlivro.setColumns(10);
		textCPlivro.setBounds(181, 157, 168, 26);
		contentPane.add(textCPlivro);
		
		JButton btnCPbuscacep = new JButton("New button");
		btnCPbuscacep.setBackground(new Color(0, 153, 255));
		btnCPbuscacep.setBounds(358, 236, 27, 23);
		contentPane.add(btnCPbuscacep);
	}
}