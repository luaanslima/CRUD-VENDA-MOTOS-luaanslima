package controle;

import java.util.ArrayList;

import projetoCompleto.Cliente;
import projetoCompleto.DaoCliente;
import projetoCompleto.DaoMotos;
import projetoCompleto.DaoVenda;
import projetoCompleto.Moto;
import projetoCompleto.Venda;

public class ControleVendas {
	
	private Moto mt;
	private Cliente cli;
	
	
	public void ControleVenda(int id1, int id2, String nome, int cpf, Long Contato, String marca, String Placa, Double valor) {
		
		ArrayList<Cliente> list1 = new DaoCliente().listaCliente();
		ArrayList<Moto> list2 = new DaoMotos().listaMotos();
		//Fazendo um loop dentro da lista de ID'
		try {
				            				            			
			for (int num = 0; num < list1.size(); num ++) 
			for (int num2 = 0; num2 < list2.size(); num2 ++) 
						
				{if(id1 == list1.get(num).getId() && (id2 == list2.get(num2).getID())) {
		
					Venda vd = new Venda();
					DaoVenda dv = new DaoVenda();
					
					vd.setId1(id1);
					vd.setId2(id2);
					vd.setNome(list1.get(num).getNome());
					vd.setCpf(list1.get(num).getCpf());
					vd.setMarca(list2.get(num2).getMarca());
					vd.setPlaca(list2.get(num2).getPlaca());
					vd.setValor(list2.get(num2).getValor());
					vd.setContato(list1.get(num).getContato());
					
					dv.CriarVenda(vd);
				
					
					
				}else{
					System.out.println("ID nao encontrado");
				}
				}

    		}catch (Exception f) {
				// TODO: handle exception
			}
		
}}
				
	