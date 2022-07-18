package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import projetoCompleto.DaoMotos;
import projetoCompleto.Moto;

public class ControleMoto {
	
	private DaoMotos dmt;
	private Moto mt;
	
	
	public void AdicionaMt(String id, String marca,String placa, String ano, String chasi, String valor) {
		
		dmt = new DaoMotos();
		mt = new Moto();

		mt.setID(Integer.parseInt(id));	
		mt.setMarca(marca);
		mt.setPlaca(placa);
		mt.setAno(Integer.parseInt(ano));
		mt.setChasi(chasi);
		mt.setValor(Double.parseDouble(valor));
		
		dmt.create(mt);
}


	public void BuscarMt(int id) {
		
		ArrayList<Moto> lista = new DaoMotos().listaMotos();
		//Fazendo um loop dentro da lista de ID'
		try {
				            				            			
			for (int num = 0; num < lista.size(); num ++) 
	
				{if(id == lista.get(num).getID()){
    		   				
	  				
    				JOptionPane.showMessageDialog(null, "ID: " +lista.get(num).getID() +	
    				"\n MARCA: " +lista.get(num).getMarca() + 
    				"\n PLACA: " +lista.get(num).getPlaca() +
    				"\n ANO: " +lista.get(num).getAno() +
    				"\n Chassi: " +lista.get(num).getChasi() +
    				"\n Valor: " +lista.get(num).getValor());
    				
				}else{
					System.out.println("ID nao encontrado");
				}
				}

    		}catch (Exception f) {
				// TODO: handle exception
			}

}
	
	
	public void excluir(int id) {
		
		DaoMotos dmt1 = new DaoMotos();
		
		dmt1.ExcluirMoto(id);
		
	}
	
	
	
	
}
	