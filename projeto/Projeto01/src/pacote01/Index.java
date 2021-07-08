package pacote01;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setTitle("EDITORA\r\n");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 404);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 153, 204));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("PEDIDOS");
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		JMenu mnPedidopedido = new JMenu("PR\u00D3XIMO PEDIDO");
		mnPedidopedido.setHorizontalAlignment(SwingConstants.CENTER);
		mnPedidopedido.addMouseListener(new MouseAdapter (){
			@Override
			public void mouseClicked(MouseEvent e) {
				frameProximoped fp = new frameProximoped();
				fp.setVisible(true);
			}
		});
		mnNewMenu.add(mnPedidopedido);
		
		JMenu mnPedidocad = new JMenu("CADASTRAR PEDIDO");
		mnPedidocad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framePedidocadastro fc = new framePedidocadastro();
				fc.setVisible(true);
			}
		});
		mnNewMenu.add(mnPedidocad);
		
		JMenu mnNewMenu_1 = new JMenu("CONSULTA");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnConsupedido = new JMenu("PEDIDO");
		mnConsupedido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frameConsultapedido cp = new frameConsultapedido();
				cp.setVisible(true);
			}
		});
		mnNewMenu_1.add(mnConsupedido);
		
		JMenu mnConsuestoque = new JMenu("ESTOQUE");
		mnConsuestoque.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frameConsultaEstq cc = new frameConsultaEstq();
			cc.setVisible(true);
			}
		});
		mnNewMenu_1.add(mnConsuestoque);
		
		JMenu mnSair = new JMenu("SAIR");
		mnSair.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		mnSair.setHorizontalAlignment(SwingConstants.CENTER);
		mnSair.setForeground(Color.BLACK);
		menuBar.add(mnSair);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("----- EDITORA ADS -----");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		
		JLabel label = new JLabel("New label");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lblNewLabel_2 = new JLabel("");
		Image imagens = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(imagens));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 956, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 654, GroupLayout.PREFERRED_SIZE)
							.addGap(0))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(536)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
							.addGap(1022))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(1315)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(116)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1366, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

