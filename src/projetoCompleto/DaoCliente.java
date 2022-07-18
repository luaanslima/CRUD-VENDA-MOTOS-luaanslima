package projetoCompleto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DaoCliente {
	

	public void create(Cliente cliente){
		
		
		String sql = "INSERT INTO cliente(Id, Nome, CPF, RG, CEP, UF,Cidade, Contato, Rua) VALUES (?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			
			con = Conexao.getConnection();
			
			
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, cliente.getId());
			stmt.setString(2, cliente.getNome());
			stmt.setInt(3, cliente.getCpf());
			stmt.setLong(4, cliente.getRg());		
			stmt.setLong(5, cliente.getCep());
			stmt.setString(6, cliente.getUf());
			stmt.setString(7, cliente.getCidade());
			stmt.setLong(8, cliente.getContato());
			stmt.setString(9, cliente.getLogradouro());
			
			
			stmt.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try { 
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		

}}
	


	@SuppressWarnings("finally")
	public ArrayList<Cliente> listaCliente() {
	
	String sql2 = "SELECT * FROM cliente";
	
	ArrayList<Cliente> listcli = new ArrayList<Cliente>();
	
	
	Connection con = null;
	PreparedStatement stmt = null;
	
	ResultSet rset = null;
	
	try {
		con = Conexao.getConnection();
		
		stmt = con.prepareStatement(sql2);
		
		rset = stmt.executeQuery(sql2);
		
		while (rset.next()) {
			
			Cliente clii = new Cliente();
			
			clii.setId(rset.getInt("id"));
			clii.setNome(rset.getNString("Nome"));				
			clii.setCpf(rset.getInt("CPF"));
			clii.setRg(rset.getInt("RG"));
			clii.setCep(rset.getInt("CEP"));	
			clii.setUf(rset.getNString("UF"));
			clii.setCidade(rset.getNString("Cidade"));
			clii.setContato(rset.getInt("Contato"));
			clii.setLogradouro(rset.getNString("Rua"));
			
			listcli.add(clii);
		
		}
	}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if ( rset != null) {
					rset.close();
			}
		
				if(stmt != null) {
					stmt.close();
				}
	}catch (final Exception e) {
		// TODO: handle exception
	}
	
	
	
	return listcli;
	}}

	
	
	public void ExcluirCliente(int id) {
				

			
		
		String sql3 = "DELETE FROM cliente WHERE id = ?";
		
		try {

			Connection con = null;
			PreparedStatement stmt = null;
			
			
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql3);
			stmt.setInt(1, id);
			
			stmt.execute();
		
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

		

		
	}}