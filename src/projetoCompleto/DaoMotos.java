package projetoCompleto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DaoMotos {

	public void create(Moto moto){
		
		
		String sql = "INSERT INTO moto(id, marca, placa, ano, chasi, valor) VALUES (?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			
			con = Conexao.getConnection();
			
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, moto.getID());
			stmt.setString(2, moto.getMarca());
			stmt.setString(3, moto.getPlaca());
			stmt.setInt(4, moto.getAno());
			stmt.setString(5, moto.getChasi());
			stmt.setDouble(6, moto.getValor());			
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
			
			
		
		}
	}



	public ArrayList<Moto> listaMotos() {
		
		String sql2 = "SELECT * FROM moto";
		
		ArrayList<Moto> motos = new ArrayList<Moto>();
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		ResultSet rset = null;
		
		try {
			con = Conexao.getConnection();
			
			stmt = con.prepareStatement(sql2);
			
			rset = stmt.executeQuery(sql2);
			
			while (rset.next()) {
				
				Moto mt1 = new Moto();
				
				mt1.setID(rset.getInt("id"));
				mt1.setMarca(rset.getNString("marca"));				
				mt1.setPlaca(rset.getNString("placa"));
				mt1.setAno(rset.getInt("ano"));
				mt1.setChasi(rset.getNString("chasi"));
				mt1.setValor(rset.getDouble("Valor"));
				
				motos.add(mt1);
			
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
		
		return motos;
		}	
	
	
	public void ExcluirMoto(int id) {
				
		
		String sql4 = "DELETE FROM moto WHERE id = ?";
		
		try {

			Connection con = null;
			PreparedStatement stmt = null;
			
			
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql4);
			stmt.setInt(1, id);
			
			stmt.execute();
		
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

		

		
	}}