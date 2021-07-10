package pacote01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class frameConsultaEstq extends JFrame {

	private JPanel contentPane;
	private JTextField textcod1;
	private JTextField textedit1;
	private JTextField textgen1;
	private JTextField textano1;
	private JTextField textlivro1;
	private JTextField textpreco1;
	private JTextField textqtde1;
	private JTextField textbuscacod;
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
		setBounds(100, 100, 708, 303);
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
		
		textcod1 = new JTextField();
		textcod1.setEditable(false);
		textcod1.setBounds(10, 139, 77, 26);
		contentPane.add(textcod1);
		textcod1.setColumns(10);
		
		textedit1 = new JTextField();
		textedit1.setEditable(false);
		textedit1.setColumns(10);
		textedit1.setBounds(97, 139, 77, 26);
		contentPane.add(textedit1);
		
		textgen1 = new JTextField();
		textgen1.setEditable(false);
		textgen1.setColumns(10);
		textgen1.setBounds(184, 139, 77, 26);
		contentPane.add(textgen1);
		
		textano1 = new JTextField();
		textano1.setEditable(false);
		textano1.setColumns(10);
		textano1.setBounds(271, 139, 77, 26);
		contentPane.add(textano1);
		
		textlivro1 = new JTextField();
		textlivro1.setEditable(false);
		textlivro1.setColumns(10);
		textlivro1.setBounds(358, 139, 77, 26);
		contentPane.add(textlivro1);
		
		textpreco1 = new JTextField();
		textpreco1.setEditable(false);
		textpreco1.setColumns(10);
		textpreco1.setBounds(447, 139, 77, 26);
		contentPane.add(textpreco1);
		
		textqtde1 = new JTextField();
		textqtde1.setEditable(false);
		textqtde1.setColumns(10);
		textqtde1.setBounds(536, 139, 77, 26);
		contentPane.add(textqtde1);
		
		JButton btnadd1 = new JButton("+");
		btnadd1.setBackground(new Color(0, 153, 0));
		btnadd1.setBounds(639, 141, 43, 23);
		contentPane.add(btnadd1);
		
		JButton btnNewButton_7 = new JButton("Alterar");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedidocadastroexe a = new Pedidocadastroexe();
		        a.setCodlivro(Integer.parseInt(textbuscacod.getText()));
		        try {
		            a.Excluir2();
		            textcod1.setEditable(true);
		            textedit1.setEditable(true);
		            textgen1.setEditable(true);
		            textano1.setEditable(true);
		            textlivro1.setEditable(true);
		            textpreco1.setEditable(true);
		            textqtde1.setEditable(true);
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btnNewButton_7.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(new Color(0, 153, 255));
		btnNewButton_7.setBounds(445, 211, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Voltar");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_8.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(new Color(0, 153, 255));
		btnNewButton_8.setBounds(542, 211, 89, 23);
		contentPane.add(btnNewButton_8);
		
		textbuscacod = new JTextField();
		textbuscacod.setBounds(47, 211, 116, 20);
		contentPane.add(textbuscacod);
		textbuscacod.setColumns(10);
		
		btnNewButton_9 = new JButton("Buscar C\u00F3digo");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedidocadastroexe a = new Pedidocadastroexe();
				if(textbuscacod.getText().trim().isEmpty())
	                a.setCodlivro(0);
	            else
	                a.setCodlivro(Integer.parseInt(textbuscacod.getText()));
	        try {
	            a.PesquisarEstq();
	            textcod1.setText(String.valueOf(a.getCodlivro()));
	            textedit1.setText(a.getEditoralivro());
	            textgen1.setText(a.getGenerolivro());
	            textano1.setText(String.valueOf(a.getAnolivro()));
	            textlivro1.setText(a.getNomelivro());
	            textpreco1.setText(String.valueOf(a.getPrecount()));
	            textqtde1.setText(String.valueOf(a.getQtdeestq()));
	           
	            
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	            
	        }
			}
		});
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		btnNewButton_9.setBackground(new Color(0, 153, 0));
		btnNewButton_9.setBounds(184, 210, 130, 26);
		contentPane.add(btnNewButton_9);
		
		JButton btncpConfirmaredt = new JButton("");
		btncpConfirmaredt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedidocadastroexe a = new Pedidocadastroexe();
		        a.setCodlivro(Integer.parseInt(textcod1.getText()));
		        a.setEditoralivro(textedit1.getText());
		        a.setGenerolivro(textgen1.getText());
		        a.setAnolivro(Integer.parseInt(textano1.getText()));
		        a.setNomelivro(textlivro1.getText());
		        a.setPrecount(Float.parseFloat(textpreco1.getText()));
		        a.setQtdeestq(Integer.parseInt(textqtde1.getText()));
		        try {
		            a.Incluir1();
		            
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		btncpConfirmaredt.setForeground(Color.WHITE);
		btncpConfirmaredt.setFont(new Font("Bookman Old Style", Font.BOLD, 10));
		btncpConfirmaredt.setBackground(new Color(0, 153, 0));
		btncpConfirmaredt.setBounds(401, 211, 34, 29);
		contentPane.add(btncpConfirmaredt);
	}
}
