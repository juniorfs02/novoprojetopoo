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
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.util.Random;
public class frameProximoped extends JFrame {

	private JPanel contentPane;
	private JTextField textPPnome;
	private JTextField textPPcodped;
	private JTextField textPPlivro;
	private JTextField textPPfrete;
	private JTextField textPPprecot;
	private JTextField textPPqtde;
	private JTextField textPPcep;

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
		
		textPPnome = new JTextField();
		textPPnome.setEditable(false);
		textPPnome.setBounds(181, 120, 168, 26);
		contentPane.add(textPPnome);
		textPPnome.setColumns(10);
		
		JButton btnppProxpedido = new JButton("Pr\u00F3ximo");
		btnppProxpedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aleatorio01 x = new Aleatorio01();
				if(textPPcodped.getText().trim().isEmpty())
	                x.setCodpedidordm(0);
	            else
	                x.setCodpedidordm(Integer.parseInt(textPPcodped.getText()));
	        x.Aleatoriox();
			textPPcodped.setText(Integer.toString(x.getCodpedidordm()));
			textPPnome.setText(x.getP());
			textPPlivro.setText(x.getL());
			textPPqtde.setText(String.valueOf(x.getQtderdm()));
			textPPcep.setText(String.valueOf(x.getCeprdm()));
			textPPfrete.setText(String.valueOf(x.getFreterdm()));
			textPPprecot.setText(String.valueOf(x.getPrecotrdm()));
	            
			}
		});
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
		
		textPPcodped = new JTextField();
		textPPcodped.setEditable(false);
		textPPcodped.setColumns(10);
		textPPcodped.setBounds(181, 83, 168, 26);
		contentPane.add(textPPcodped);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00BA Pedido");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(44, 83, 98, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textPPlivro = new JTextField();
		textPPlivro.setEditable(false);
		textPPlivro.setColumns(10);
		textPPlivro.setBounds(181, 157, 168, 26);
		contentPane.add(textPPlivro);
		
		JLabel lblNewLabel_1_2 = new JLabel("Livro");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(44, 157, 127, 26);
		contentPane.add(lblNewLabel_1_2);
		
		textPPfrete = new JTextField();
		textPPfrete.setEditable(false);
		textPPfrete.setColumns(10);
		textPPfrete.setBounds(181, 270, 168, 26);
		contentPane.add(textPPfrete);
		
		JLabel lblNewLabel_1_3 = new JLabel("Frete");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(44, 270, 98, 26);
		contentPane.add(lblNewLabel_1_3);
		
		textPPprecot = new JTextField();
		textPPprecot.setEditable(false);
		textPPprecot.setColumns(10);
		textPPprecot.setBounds(181, 307, 168, 26);
		contentPane.add(textPPprecot);
		
		JLabel lblNewLabel_1_4 = new JLabel("Pre\u00E7o Total");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(44, 307, 98, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnppConfirmar = new JButton("Confirmar ");
		btnppConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Aleatorio01 a = new Aleatorio01();
		        a.setCodpedidordm(Integer.parseInt(textPPcodped.getText()));
		        a.setP(textPPnome.getText());
		        a.setL(textPPlivro.getText());
		        a.setQtderdm(Integer.parseInt(textPPqtde.getText()));
		        a.setCeprdm(Integer.parseInt(textPPcep.getText()));
		        a.setFreterdm(Integer.parseInt(textPPfrete.getText()));
		        a.setPrecotrdm(Integer.parseInt(textPPprecot.getText()));
		        try {
		            a.Incluir1();
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btnppConfirmar.setForeground(Color.WHITE);
		btnppConfirmar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnppConfirmar.setBackground(new Color(0, 153, 0));
		btnppConfirmar.setBounds(222, 378, 127, 29);
		contentPane.add(btnppConfirmar);
		
		JButton btnppVoltar = new JButton("Voltar");
		btnppVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnppVoltar.setForeground(Color.WHITE);
		btnppVoltar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnppVoltar.setBackground(new Color(0, 153, 255));
		btnppVoltar.setBounds(136, 429, 127, 29);
		contentPane.add(btnppVoltar);
		
		textPPqtde = new JTextField();
		textPPqtde.setEditable(false);
		textPPqtde.setColumns(10);
		textPPqtde.setBounds(181, 194, 168, 26);
		contentPane.add(textPPqtde);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Quantidade");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(44, 194, 127, 26);
		contentPane.add(lblNewLabel_1_2_1);
		
		textPPcep = new JTextField();
		textPPcep.setEditable(false);
		textPPcep.setColumns(10);
		textPPcep.setBounds(181, 231, 168, 26);
		contentPane.add(textPPcep);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Cep");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(44, 231, 127, 26);
		contentPane.add(lblNewLabel_1_2_2);
	}
}
