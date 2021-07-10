package pacote01;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Aleatorio01 {
	private int codpedidordm, qtderdm, ceprdm, precotrdm, freterdm;
	private String p, l, Pessoa;
	private int in = 2;
	private int fm = 4;
	
	public void Incluir1() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_projetopoo";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "insert into tbteste values(" + getCodpedidordm() + ",'" 
                + getP() + "','" + getL() + "','" + getQtderdm() + "','" + getCeprdm()  + "','" + getFreterdm() + "'," + getPrecotrdm()  + ")";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Pedido Cadastrado");
    }
	
	
	public void Aleatoriox() {
		Random aleatorio = new Random();
		codpedidordm = aleatorio.nextInt(1000) + 1;
		qtderdm = aleatorio.nextInt(10) + 1;
		ceprdm = aleatorio.nextInt((19999999 - 10000001) + 1) + 10000001;
		freterdm = aleatorio.nextInt((3) + 2) *5 ;
		precotrdm = (qtderdm * 10 + freterdm);
		String Pessoa[] = { "João Felipe Medeiros", "Pedro Costa", "Caio Mazola Hatae", "Sabrina Ferraz", "Damaris Santos", "Evelyn Reis", "Nilza Virginia", "Francisco Matarazzo"  };
		String Livrordm[] = { "O Homem de Giz", "A Garota do Lago", "Duna", "O Colecionador", "O Hobbit", "Dom Quixote", "Pessoas Normais", "Um Conto de Duas Cidades"  };
		
		 p = Pessoa[aleatorio.nextInt(Pessoa.length)];
		 l = Livrordm[aleatorio.nextInt(Livrordm.length)];
		
	}

	public int getCodpedidordm() {
		return codpedidordm;
	}

	public void setCodpedidordm(int codpedidordm) {
		this.codpedidordm = codpedidordm;
	}

	public int getQtderdm() {
		return qtderdm;
	}

	public void setQtderdm(int qtderdm) {
		this.qtderdm = qtderdm;
	}

	public int getCeprdm() {
		return ceprdm;
	}

	public void setCeprdm(int ceprdm) {
		this.ceprdm = ceprdm;
	}

	public int getFreterdm() {
		return freterdm;
	}

	public void setFreterdm(int freterdm) {
		this.freterdm = freterdm;
	}

	public int getPrecotrdm() {
		return precotrdm;
	}

	public void setPrecotrdm(int precotrdm) {
		this.precotrdm = precotrdm;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}

	public String getPessoa() {
		return Pessoa;
	}

	public void setPessoa(String pessoa) {
		Pessoa = pessoa;
	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public int getFm() {
		return fm;
	}

	public void setFm(int fm) {
		this.fm = fm;
	}
}
