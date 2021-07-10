package pacote01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class frameConsultapedido extends JFrame {

	private JPanel contentPane;
	private JTextField textCOnome;
	private JTextField textCOpedido;
	private JTextField textCOlivro;
	private JTextField textCOfrete;
	private JTextField textCOprecot;
	private JTextField textCOqtde;
	private JTextField textCOcep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameConsultapedido frame = new frameConsultapedido();
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
	public frameConsultapedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 561);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCOnome = new JTextField();
		textCOnome.setEditable(false);
		textCOnome.setBounds(181, 120, 168, 26);
		contentPane.add(textCOnome);
		textCOnome.setColumns(10);
		
		JButton btncpBuscarpedido = new JButton("Buscar");
		btncpBuscarpedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pedidocadastroexe a = new Pedidocadastroexe();
				if(textCOpedido.getText().trim().isEmpty())
	                a.setCodpedido(0);
	            else
	                a.setCodpedido(Integer.parseInt(textCOpedido.getText()));
	        try {
	            a.Pesquisar();
	            textCOpedido.setEnabled(true);
	            textCOnome.setText(a.getNomecliente());
	            textCOlivro.setText(a.getNomelivro());
	            textCOqtde.setText(String.valueOf(a.getQtde()));
	            textCOcep.setText(String.valueOf(a.getCep()));
	            textCOfrete.setText(String.valueOf(a.getValorfrete()));
	            textCOprecot.setText(String.valueOf(a.getValortotal()));
	           
	            
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	            
	        }
		}
	});
			
		btncpBuscarpedido.setForeground(Color.WHITE);
		btncpBuscarpedido.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btncpBuscarpedido.setBackground(new Color(0, 153, 0));
		btncpBuscarpedido.setBounds(44, 378, 127, 29);
		contentPane.add(btncpBuscarpedido);
		
		JLabel lblNewLabel = new JLabel("Consultar Pedido");
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblNewLabel.setBounds(65, 11, 284, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Cliente");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1.setBounds(44, 120, 98, 26);
		contentPane.add(lblNewLabel_1);
		
		textCOpedido = new JTextField();
		textCOpedido.setColumns(10);
		textCOpedido.setBounds(181, 83, 168, 26);
		contentPane.add(textCOpedido);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00BA Pedido");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(44, 83, 98, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textCOlivro = new JTextField();
		textCOlivro.setEditable(false);
		textCOlivro.setColumns(10);
		textCOlivro.setBounds(181, 157, 168, 26);
		contentPane.add(textCOlivro);
		
		JLabel lblNewLabel_1_2 = new JLabel("Livro");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(44, 157, 127, 26);
		contentPane.add(lblNewLabel_1_2);
		
		textCOfrete = new JTextField();
		textCOfrete.setEditable(false);
		textCOfrete.setColumns(10);
		textCOfrete.setBounds(181, 270, 168, 26);
		contentPane.add(textCOfrete);
		
		JLabel lblNewLabel_1_3 = new JLabel("Frete");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(44, 269, 98, 26);
		contentPane.add(lblNewLabel_1_3);
		
		textCOprecot = new JTextField();
		textCOprecot.setEditable(false);
		textCOprecot.setColumns(10);
		textCOprecot.setBounds(181, 307, 168, 26);
		contentPane.add(textCOprecot);
		
		JLabel lblNewLabel_1_4 = new JLabel("Pre\u00E7o Total");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(44, 307, 98, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnppConfirmar = new JButton("Editar");
		btnppConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pedidocadastroexe a = new Pedidocadastroexe();
		        a.setCodpedido(Integer.parseInt(textCOpedido.getText()));
		        try {
		            a.Excluir();
		            textCOnome.setEditable(true);
		            textCOfrete.setEditable(true);
		            textCOprecot.setEditable(true);
		            textCOlivro.setEditable(true);
		            textCOcep.setEditable(true);
		            textCOqtde.setEditable(true);
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
		        
			
			}
		});
		btnppConfirmar.setForeground(Color.WHITE);
		btnppConfirmar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btnppConfirmar.setBackground(new Color(0, 153, 255));
		btnppConfirmar.setBounds(228, 378, 121, 29);
		contentPane.add(btnppConfirmar);
		
		JButton btncpVoltar = new JButton("Voltar");
		btncpVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncpVoltar.setForeground(Color.WHITE);
		btncpVoltar.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btncpVoltar.setBackground(new Color(0, 153, 255));
		btncpVoltar.setBounds(228, 442, 121, 29);
		contentPane.add(btncpVoltar);
		
		JButton btncpExcluir = new JButton("Excluir");
		btncpExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedidocadastroexe a = new Pedidocadastroexe();
		        a.setCodpedido(Integer.parseInt(textCOpedido.getText()));
		        try {
		            a.Excluir1();
		            textCOnome.setEditable(true);
		            textCOfrete.setEditable(true);
		            textCOprecot.setEditable(true);
		            textCOlivro.setEditable(true);
		            textCOcep.setEditable(true);
		            textCOqtde.setEditable(true);
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btncpExcluir.setForeground(Color.WHITE);
		btncpExcluir.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		btncpExcluir.setBackground(Color.RED);
		btncpExcluir.setBounds(44, 442, 121, 29);
		contentPane.add(btncpExcluir);
		
		JButton btncpConfirmaredt = new JButton("");
		btncpConfirmaredt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedidocadastroexe a = new Pedidocadastroexe();
		        a.setCodpedido(Integer.parseInt(textCOpedido.getText()));
		        a.setNomecliente(textCOnome.getText());
		        a.setNomelivro(textCOlivro.getText());
		        a.setQtde(Integer.parseInt(textCOqtde.getText()));
		        a.setCep(Integer.parseInt(textCOcep.getText()));
		        a.setValorfrete(Float.parseFloat(textCOfrete.getText()));
		        a.setValortotal(Float.parseFloat(textCOprecot.getText()));
		        try {
		            a.Incluir();
		            
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btncpConfirmaredt.setIcon(null);
		btncpConfirmaredt.setSelectedIcon(null);
		btncpConfirmaredt.setForeground(Color.WHITE);
		btncpConfirmaredt.setFont(new Font("Bookman Old Style", Font.BOLD, 10));
		btncpConfirmaredt.setBackground(new Color(0, 153, 0));
		btncpConfirmaredt.setBounds(353, 378, 34, 29);
		contentPane.add(btncpConfirmaredt);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Quantidade");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(44, 194, 127, 26);
		contentPane.add(lblNewLabel_1_2_1);
		
		textCOqtde = new JTextField();
		textCOqtde.setEditable(false);
		textCOqtde.setColumns(10);
		textCOqtde.setBounds(181, 194, 168, 26);
		contentPane.add(textCOqtde);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("CEP");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(44, 231, 127, 26);
		contentPane.add(lblNewLabel_1_2_2);
		
		textCOcep = new JTextField();
		textCOcep.setEditable(false);
		textCOcep.setColumns(10);
		textCOcep.setBounds(181, 231, 168, 26);
		contentPane.add(textCOcep);
	}
}