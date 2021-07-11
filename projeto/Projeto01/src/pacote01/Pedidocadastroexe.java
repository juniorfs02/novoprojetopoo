package pacote01;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class Pedidocadastroexe {
	private int codpedido, qtde, cep, codlivro, anolivro, qtdeestq;
    private String nomecliente, nomelivro, editoralivro, generolivro;
    private float valorfrete,  precount;
    private float valortotal = ((precount*qtde) + valorfrete);
    
	
	
	public void Incluir() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_projetopoo";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "insert into tbteste values(" + getCodpedido() + ",'" 
                + getNomecliente() + "','" + getNomelivro() + "','" + getQtde() + "','" + getCep()  + "','" + getValorfrete() + "'," + getValortotal()  + ")";
        
       
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Pedido Cadastrado");
    }
	
	public void Incluir1() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_projetopoo";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "insert into tbestoque values(" + getCodlivro() + ",'" 
                + getEditoralivro() + "','" + getGenerolivro() + "','" + getAnolivro() + "','" + getNomelivro()  + "','" + getPrecount() + "'," + getQtdeestq()  + ")";
       
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Pedido Cadastrado");
    }
	
	

	public void Consultar() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_pooprojeto";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "select * from tbteste";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        ArrayList<String> registros = new ArrayList<>();
        while(resultado.next())
        {
            registros.add(resultado.getString("codpedido") + 
                    " " + resultado.getString("nomecliente") + 
                    " " + resultado.getString("nomelivro") + 
                    " " + resultado.getString("qtde") + 
                    " " + resultado.getString("cep") + 
                    " " + resultado.getString("valorfrete") + 
                    " " + resultado.getString("valortotal"));
        }
        String lista = "";
        int j;
        for(j=0; j<registros.size(); j++) {
            lista = lista + registros.get(j) + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
        resultado.close();
        comando.close();
        conn.close();
    }
    
	public void Pesquisar() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_projetopoo";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "select * from tbteste where xnpedido = " + getCodpedido();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setNomecliente(resultado.getString("xncliente"));
        setNomelivro(resultado.getString("xnlivro"));
        setQtde(resultado.getInt("xqtd"));
        setCep(resultado.getInt("xcep"));
        setValorfrete(Float.parseFloat(resultado.getString("xfrete")));
        setValortotal(Float.parseFloat(resultado.getString("xprecot")));
        resultado.close();
        comando.close();
        conn.close();
    }
	
	public void PesquisarEstq() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_projetopoo";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom1 = "select * from tbestoque where codLivro  = " + getCodlivro();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom1);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setCodlivro(resultado.getInt("codLivro"));
        setEditoralivro(resultado.getString("editoraLivro"));
        setGenerolivro(resultado.getString("generoLivro"));
        setAnolivro(resultado.getInt("anoLivro"));
        setNomelivro(resultado.getString("nomeLivro"));
        setPrecount(Float.parseFloat(resultado.getString("preco")));
        setQtdeestq(resultado.getInt("qtde"));
        resultado.close();
        comando.close();
        conn.close();
    }
	
	
	
	public void Excluir() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_projetopoo";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "delete from tbteste where xnpedido = " + getCodpedido();
        if(JOptionPane.showConfirmDialog(null, "Realizar edição?", "Atenção", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        	comando.execute();
        	comando.close();       
        	JOptionPane.showMessageDialog(null,"Clique no botão verde para confirmar a edição");
        }
        else
        	JOptionPane.showMessageDialog(null,"Edição cancelada");
    }
	
	public void Excluir1() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_projetopoo";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "delete from tbteste where xnpedido = " + getCodpedido();
        if(JOptionPane.showConfirmDialog(null, "Confirmar Exclusão?", "Atenção", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        	comando.execute();
        	comando.close();       
        	JOptionPane.showMessageDialog(null,"Exclusão feita com sucesso");
        }
        else
        	JOptionPane.showMessageDialog(null,"Exclusão cancelada");
    }
	
	public void Excluir2() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/db_projetopoo";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "delete from tbestoque where codLivro = " + getCodlivro();
        if(JOptionPane.showConfirmDialog(null, "Realizar Edição?", "Atenção", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        	comando.execute();
        	comando.close();       
        	JOptionPane.showMessageDialog(null,"Clique no botão verde para confirmar a edição");
        }
        else
        	JOptionPane.showMessageDialog(null,"Edição cancelada");
    }
	
	public int getCodpedido() {
		return codpedido;
	}


	public void setCodpedido(int codpedido) {
		this.codpedido = codpedido;
	}


	public String getNomecliente() {
		return nomecliente;
	}


	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}


	public String getNomelivro() {
		return nomelivro;
	}


	public void setNomelivro(String nomelivro) {
		this.nomelivro = nomelivro;
	}


	public float getValorfrete() {
		return valorfrete;
	}


	public void setValorfrete(float valorfrete) {
		this.valorfrete = valorfrete;
	}


	public float getValortotal() {
		return valortotal;
	}


	public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}


	public int getQtde() {
		return qtde;
	}


	public void setQtde(int qtde) {
		this.qtde = qtde;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getCodlivro() {
		return codlivro;
	}

	public void setCodlivro(int codlivro) {
		this.codlivro = codlivro;
	}

	public int getAnolivro() {
		return anolivro;
	}

	public void setAnolivro(int anolivro) {
		this.anolivro = anolivro;
	}

	public int getQtdeestq() {
		return qtdeestq;
	}

	public void setQtdeestq(int qtdeestq) {
		this.qtdeestq = qtdeestq;
	}

	public String getEditoralivro() {
		return editoralivro;
	}

	public void setEditoralivro(String editoralivro) {
		this.editoralivro = editoralivro;
	}

	public String getGenerolivro() {
		return generolivro;
	}

	public void setGenerolivro(String generolivro) {
		this.generolivro = generolivro;
	}

	public float getPrecount() {
		return precount;
	}

	public void setPrecount(float precount) {
		this.precount = precount;
	}


	
}
