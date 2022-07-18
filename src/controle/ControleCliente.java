package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import projetoCompleto.Cliente;
import projetoCompleto.DaoCliente;



public class ControleCliente {
	
	DaoCliente daocli = new DaoCliente();
	
	
	private Cliente cliente;
	
	public void adicionar (String id, String nome, String cpf, String rg, String Cep, String uf, String Cidade,  String rua, String numero) {

		cliente = new Cliente();
		
		cliente.setId(Integer.parseInt(id));
		cliente.setNome(nome);
		cliente.setCpf(Integer.parseInt(cpf));
		cliente.setRg(Integer.parseInt(rg));
		cliente.setCep(Integer.parseInt(Cep));
		cliente.setUf(uf);
		cliente.setCidade(Cidade);
		cliente.setLogradouro(rua);
		cliente.setContato(Integer.parseInt(numero));
		
		daocli.create(cliente);
				

}
	
	
	public void buscar (int id) {
		
		
		ArrayList<Cliente> lstcli = new DaoCliente().listaCliente();

		
		try {
			
			
			for (int num = 0; num < lstcli.size(); num ++){ 
				
				if (id == lstcli.get(num).getId()){
    		
					JOptionPane.showMessageDialog(null, "Cliente: "  +lstcli.get(num).getNome() +                 
					("\n CPF: " +lstcli.get(num).getCpf()) +
                    ("\n RG: " +lstcli.get(num).getRg()) +                 
                    ("\n CEP: " +lstcli.get(num).getCep()) +
                    ("\n UF: " +lstcli.get(num).getUf()) +		
                    ("\n Cidade: " +lstcli.get(num).getCidade()) + 
                    ("\n Rua: " +lstcli.get(num).getLogradouro()) +
                    ("\n Telefone: " +lstcli.get(num).getContato()));
					
				
				}else{
					System.out.println("ID nao encontrado");
				}
				}
    			

    		}catch (Exception f) {
				// TODO: handle exception
			}

}
		
	
		
	public void excluir (int valorId) {
	
		daocli.ExcluirCliente(valorId);
		
	}

	}