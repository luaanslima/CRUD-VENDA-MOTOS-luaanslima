package projetoCompleto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class DaoVenda {

private DaoMotos dmt;

private Moto mt;

	public void CriarVenda(Venda vd){
		
		
		String sql = "INSERT INTO venda(NF, IdCliente, IdMoto, marca, placa, valor, Cliente, Cpf, Contato, Data) VALUES (?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		
	
		int NF = 0;
		
		
		try {
			
			con = Conexao.getConnection();
			
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, NF ++);
			stmt.setInt(2,(vd.getId1()));
			stmt.setInt(3, (vd.getId2()));
			stmt.setString(4, vd.getMarca());
			stmt.setString(5, vd.getPlaca());
			stmt.setDouble(6, (vd.getValor()));	
			stmt.setString(7, vd.getNome());
			stmt.setInt(8, (vd.getCpf()));
			stmt.setLong(9, (vd.getContato()));
			stmt.setDate(10, null);
			
			
			
		
			
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
	



	public ArrayList<Venda> listaVendas() {
		
		String sql5 = "SELECT * FROM venda";
		
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		ResultSet rset = null;
		
		try {
			con = Conexao.getConnection();
			
			stmt = con.prepareStatement(sql5);
			
			rset = stmt.executeQuery(sql5);
			
			while (rset.next()) {
				
				Venda ven = new Venda();
				
				ven.setId1(rset.getInt("IdCliente"));
				ven.setId2(rset.getInt("IdMoto"));
				ven.setMarca(rset.getNString("marca"));				
				ven.setPlaca(rset.getNString("placa"));
				ven.setValor(rset.getDouble("Valor"));
				ven.setNome(rset.getNString("Cliente"));
				ven.setCpf(rset.getInt("Cpf"));
				ven.setContato(rset.getLong("Contato"));

				vendas.add(ven);
			
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
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}	
		
		return vendas;
		}	
	
	
	public void ExcluirVenda(int NF) {
				
		
		String sql4 = "DELETE FROM venda WHERE id = ?";
		
		try {

			Connection con = null;
			PreparedStatement stmt = null;
			
			
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql4);
			stmt.setInt(1, NF);
			
			stmt.execute();
		
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

		

		
	}}