package projetoCompleto;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ControleCliente;
import controle.ControleMoto;
import controle.ControleVendas;

public class Tela extends JFrame {
	
	
	//CAMPOS CLIENTE
	
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textId;
	private JTextField textCpf;
	private JTextField textRg;
	private JTextField textCep;
	private JTextField textUF;
	private JTextField textRua;
	private JTextField textCidade;
	private JTextField textContato;
	
	//CAMPOS MOTO	
	private JTextField textIdMoto;
	private JTextField textMarca;
	private JTextField textPlaca;
	private JTextField textAno;
	private JTextField textChasi;
	private JTextField textValor;
	private JTextField textCliid;
	private JTextField textMotoID;
	private JTextField textNomeV;
	private JTextField textCpfV;
	private JTextField textMarcaV;
	private JTextField textPlacaV;
	private JTextField textValorV;
	private JTextField textField;
	
	Venda vd = new Venda();
	ControleMoto ctrlmt = new ControleMoto();
	ControleCliente controle = new ControleCliente();
	ControleVendas ctv = new ControleVendas();
	Moto mt = new Moto();
	DaoMotos dtmt = new DaoMotos();
	DaoCliente daocli = new DaoCliente();
	Cliente cli = new Cliente();	
	ArrayList<Moto> lista = new DaoMotos().listaMotos();
	ArrayList<Cliente> lstcli = new DaoCliente().listaCliente();
	private JTextField textField_1;
	private JTextField textContatoV;
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}





	
	public Tela(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 5, 469, 310);
		contentPane.add(tabbedPane);
		
		JPanel AbaMoto = new JPanel();
		tabbedPane.addTab("Motos", null, AbaMoto, null);
		AbaMoto.setLayout(null);
		
		JLabel lblIdMoto = new JLabel("ID");
		lblIdMoto.setBounds(10, 24, 24, 14);
		AbaMoto.add(lblIdMoto);
		
		textIdMoto = new JTextField();
		textIdMoto.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				
				mt.setID(Integer.parseInt(textIdMoto.getText()));			}
		});
		textIdMoto.setBounds(61, 22, 41, 20);
		AbaMoto.add(textIdMoto);
		textIdMoto.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 68, 41, 14);
		AbaMoto.add(lblMarca);
		
		textMarca = new JTextField();
		textMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.setMarca(textMarca.getText());
				
			}
		});
		textMarca.setBounds(61, 65, 69, 20);
		AbaMoto.add(textMarca);
		textMarca.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(156, 68, 33, 14);
		AbaMoto.add(lblPlaca);
		
		textPlaca = new JTextField();
		textPlaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.setPlaca(textPlaca.getText());
			}
		});
		textPlaca.setBounds(209, 66, 86, 20);
		AbaMoto.add(textPlaca);
		textPlaca.setColumns(10);
		
		JLabel lblAnoMoto = new JLabel("Ano");
		lblAnoMoto.setBounds(10, 108, 24, 14);
		AbaMoto.add(lblAnoMoto);
		
		textAno = new JTextField();
		textAno.addActionListener(new ActionListener() {
			
		
			
			public void actionPerformed(ActionEvent e) {
				mt.setAno(Integer.parseInt(textAno.getText()));
				
			}
		});
		textAno.setBounds(61, 105, 69, 20);
		AbaMoto.add(textAno);
		textAno.setColumns(10);
		
		JLabel lblChasi = new JLabel("Chasi");
		lblChasi.setBounds(156, 108, 33, 14);
		AbaMoto.add(lblChasi);
		
		textChasi = new JTextField();
		textChasi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.setChasi(textChasi.getText());
			}
		});
		textChasi.setBounds(209, 106, 86, 17);
		AbaMoto.add(textChasi);
		textChasi.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		lblNewLabel_2.setBounds(10, 164, 33, 14);
		AbaMoto.add(lblNewLabel_2);
		
		textValor = new JTextField();
		textValor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.setValor(Double.parseDouble(textValor.getText()));
			}
		});
		textValor.setBounds(61, 162, 64, 17);
		AbaMoto.add(textValor);
		textValor.setColumns(10);
	
		
	// BOTAO ADICIONAR MOTO	
		JButton btnAddmt = new JButton("Adicionar");
		
		btnAddmt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				ctrlmt.AdicionaMt(textIdMoto.getText(), textMarca.getText(), textPlaca.getText(), textAno.getText(), textChasi.getText(), textValor.getText());
				
				
				JOptionPane.showMessageDialog(null, "Moto Adicionada");
				
				
			//LIMPANDO CAMPOS APOS INSERIR	
				textIdMoto.setText(null);
				textMarca.setText(null);
				textPlaca.setText(null);
				textAno.setText(null);
				textChasi.setText(null);
				textValor.setText(null);
				
			}
		});
		btnAddmt.setBounds(21, 237, 88, 23);		
		AbaMoto.add(btnAddmt);
		
		
		
		// BOTAO BUSCAR
		JButton btnBuscarMt = new JButton("Buscar");
		btnBuscarMt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                ctrlmt.BuscarMt(Integer.parseInt(textIdMoto.getText()));
			
			}
			});
		
		
		btnBuscarMt.setBounds(124, 237, 88, 23);
		AbaMoto.add(btnBuscarMt);
		
		
		// BOTAO LIMPAR
		JButton btnLimparMt = new JButton("Limpar");
		btnLimparMt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textIdMoto.setText("");
				textMarca.setText("");
				textPlaca.setText("");
				textAno.setText("");
				textChasi.setText("");
				textValor.setText("");
		
	
			}
		});
		btnLimparMt.setBounds(227, 237, 88, 23);
		AbaMoto.add(btnLimparMt);
		
		
	//BOTAO EXCLUIR MOTO	
		JButton btnExcluirMt = new JButton("Excluir");
		btnExcluirMt.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				ctrlmt.excluir(Integer.parseInt(textIdMoto.getText()));
				JOptionPane.showMessageDialog(null, "Moto Excluida");
			}
		});
		btnExcluirMt.setBounds(330, 237, 88, 23);
		AbaMoto.add(btnExcluirMt);
		

		
		
//---------------------------------------------- ABA CLIENTE ----------------------------
		JPanel AbaCliente = new JPanel();
		tabbedPane.addTab("Cliente", null, AbaCliente, null);
		AbaCliente.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(7, 56, 39, 14);
		AbaCliente.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(60, 53, 196, 20);
		textNome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			cli.setNome(textNome.getText());
						
			}
		});
		AbaCliente.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(388, 11, 11, 14);
		AbaCliente.add(lblId);
		
		
		
		textId = new JTextField();
		textId.setBounds(409, 8, 45, 20);
		textId.addActionListener(new ActionListener() {
			
	
			public void actionPerformed(ActionEvent e) {						
			cli.setId(Integer.parseInt(textId.getText()));
			
			}
		});
		AbaCliente.add(textId);
		textId.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setBounds(320, 53, 134, 20);
		textCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cli.setCpf(Integer.parseInt(textCpf.getText()));
			}
		});
		AbaCliente.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(285, 56, 29, 14);
		AbaCliente.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(7, 97, 29, 14);
		AbaCliente.add(lblRg);
		
		textRg = new JTextField();
		textRg.setBounds(60, 94, 119, 20);
		textRg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cli.setRg(Integer.parseInt(textRg.getText()));
				
			}
		});
		AbaCliente.add(textRg);
		textRg.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(197, 97, 29, 14);
		AbaCliente.add(lblCep);
		
		textCep = new JTextField();
		textCep.setBounds(227, 94, 94, 20);
		textCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cli.setCep(Integer.parseInt(textCep.getText()));
			}
		});
		AbaCliente.add(textCep);
		textCep.setColumns(10);
		
		JLabel lblUF = new JLabel("UF");
		lblUF.setBounds(197, 135, 28, 14);
		AbaCliente.add(lblUF);
		
		textUF = new JTextField();
		textUF.setBounds(227, 132, 29, 20);
		textUF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cli.setUf(textUF.getText());
			}
		});
		AbaCliente.add(textUF);
		textUF.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(7, 135, 45, 14);
		AbaCliente.add(lblCidade);
		
		textCidade = new JTextField();
		textCidade.setBounds(60, 132, 123, 20);
		textCidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cli.setCidade(textCidade.getText());
			}
		});
		AbaCliente.add(textCidade);
		textCidade.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Rua");
		lblNewLabel.setBounds(7, 189, 34, 14);
		AbaCliente.add(lblNewLabel);
		
		textRua = new JTextField();
		textRua.setBounds(60, 186, 196, 20);
		textRua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cli.setLogradouro(textRua.getText());
	
			}
		});
		AbaCliente.add(textRua);
		textRua.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contato");
		lblNewLabel_1.setBounds(266, 189, 48, 14);
		AbaCliente.add(lblNewLabel_1);
		
		
		
		//--------------------------------------------------------------------------------------
		// TEXTO CONTATO
		
		textContato = new JTextField();
		textContato.setBounds(320, 186, 108, 20);
		AbaCliente.add(textContato);
		textContato.setColumns(10);
		textContato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cli.setContato(Integer.parseInt(textContato.getText()));				
			}
		});

		
		//--------------------------------------------------------------------------------------
		//BOTAO ADICIONAR CLIENTE
		
		JButton btnAdicionar = new JButton("Adicionar");
		AbaCliente.add(btnAdicionar);
		btnAdicionar.setBounds(21, 237, 88, 23);
		btnAdicionar.addActionListener(new ActionListener() {
			
						
			public void actionPerformed(ActionEvent e) {
				
				ControleCliente controle = new ControleCliente();
				
				controle.adicionar(textId.getText(), textNome.getText(), textCpf.getText(), textRg.getText(),textCep.getText(), textUF.getText(), textCidade.getText(), textRua.getText(), textContato.getText());
		
				
				//limpando tabela após finalizar
				
				textId.setText(null);
				textNome.setText(null);
				textCpf.setText(null);
				textRg.setText(null);
				textCep.setText(null);
				textUF.setText(null);
				textCidade.setText(null);
				textRua.setText(null);
				textContato.setText(null);
				
		
				JOptionPane.showMessageDialog(null, "Cliente Adicionado");
			
			}
		});

		
		
		//--------------------------------------------------------------------------------------
		//BOTAO BUSCAR
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(124, 237, 88, 23);
		AbaCliente.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
               
	         controle.buscar(Integer.parseInt(textId.getText()));
	         
	         
	         
		}});
		
		
		
		 //--------------------------------------------------------------------------------------
		//BOTAO LIMPAR
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(227, 237, 88, 23);
		AbaCliente.add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textId.setText(null);
				textNome.setText(null);
				textCpf.setText(null);
				textRg.setText(null);
				textCep.setText(null);
				textUF.setText(null);
				textCidade.setText(null);
				textRua.setText(null);
				textContato.setText(null);
			}
		});

		
		 //--------------------------------------------------------------------------------------
		//BOTAO EXLCUIR
		JButton btnExcluirCli = new JButton("Excluir");		
		btnExcluirCli.setBounds(330, 237, 88, 23);
		AbaCliente.add(btnExcluirCli);
		btnExcluirCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
											
				controle.excluir(Integer.parseInt(textId.getText()));
				JOptionPane.showMessageDialog(null,"Cliente Excluido!");				
			}
		});

		
		
		
		
		 //--------------------------------------------------------------------------------------
		 //--------------------------------------------------------------------------------------
		 //--ABA VENDA
		
		JPanel Venda = new JPanel();
		tabbedPane.addTab("Venda", null, Venda, null);
		Venda.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Cliente ID");
		lblNewLabel_3.setBounds(124, 11, 56, 14);
		Venda.add(lblNewLabel_3);
		
		 //--------------------------------------------------------------------------------------
		 // TEXTO ID CLIENTE VENDA
		textCliid = new JTextField();
		textCliid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vd.setId1(Integer.parseInt(textCliid.getText()));
			}
		});
		textCliid.setBounds(189, 8, 34, 20);
		Venda.add(textCliid);
		textCliid.setColumns(10);
		
		 //--------------------------------------------------------------------------------------
		 // LABEL MOTO ID VENDA
		JLabel lblMotoId = new JLabel("Moto ID");
		lblMotoId.setBounds(10, 11, 46, 14);
		Venda.add(lblMotoId);
		
		
		//TEXTO MOTO ID VENDA
		textMotoID = new JTextField();
		textMotoID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vd.setId2(Integer.parseInt(textMotoID.getText()));
			}
		});
		textMotoID.setBounds(66, 8, 34, 20);
		Venda.add(textMotoID);
		textMotoID.setColumns(10);
		
		//TEXTO NOME VENDA
		textNomeV = new JTextField();
		textNomeV.setEnabled(false);
		textNomeV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		textNomeV.setBounds(66, 53, 158, 20);
		Venda.add(textNomeV);
		textNomeV.setColumns(10);
		
		JLabel lblNomeV = new JLabel("Nome");
		lblNomeV.setBounds(10, 56, 46, 14);
		Venda.add(lblNomeV);
		
		JLabel lblCpfV = new JLabel("CPF");
		lblCpfV.setBounds(242, 97, 29, 14);
		Venda.add(lblCpfV);
		
		textCpfV = new JTextField();
		textCpfV.setEnabled(false);
		textCpfV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textCpfV.setBounds(281, 95, 157, 20);
		Venda.add(textCpfV);
		textCpfV.setColumns(10);
		
		JLabel lblMarcaV = new JLabel("Marca");
		lblMarcaV.setBounds(10, 141, 46, 14);
		Venda.add(lblMarcaV);
		
		textMarcaV = new JTextField();
		textMarcaV.setEnabled(false);
		textMarcaV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textMarcaV.setBounds(67, 138, 86, 20);
		Venda.add(textMarcaV);
		textMarcaV.setColumns(10);
		
		JLabel lblPlacaV = new JLabel("Placa");
		lblPlacaV.setBounds(163, 141, 39, 14);
		Venda.add(lblPlacaV);
		
		textPlacaV = new JTextField();
		textPlacaV.setEnabled(false);
		textPlacaV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		textPlacaV.setBounds(242, 138, 86, 20);
		Venda.add(textPlacaV);
		textPlacaV.setColumns(10);
		
		JLabel lblValorV = new JLabel("Valor");
		lblValorV.setBounds(10, 190, 34, 14);
		Venda.add(lblValorV);
		
		textValorV = new JTextField();
		textValorV.setEnabled(false);
		textValorV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		textValorV.setBounds(67, 187, 86, 20);
		Venda.add(textValorV);
		textValorV.setColumns(10);
		
		JButton btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {         
				
				
				ctv.ControleVenda(Integer.parseInt(textCliid.getText()), Integer.parseInt(textMotoID.getText()), cli.getNome(), cli.getCpf(), cli.getContato(), mt.getMarca(), mt.getMarca(), mt.getValor());
				ctrlmt.excluir(Integer.parseInt(textMotoID.getText()));
			}
		});
		btnVender.setBounds(21, 237, 89, 23);
		Venda.add(btnVender);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnConsultar.setBounds(124, 237, 89, 23);
		Venda.add(btnConsultar);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.setBounds(227, 237, 89, 23);
		Venda.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Excluir");
		btnNewButton_3.setBounds(330, 237, 89, 23);
		Venda.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("NF");
		lblNewLabel_4.setBounds(335, 11, 22, 14);
		Venda.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
			}
		});
		textField.setBounds(357, 9, 81, 20);
		Venda.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Data Venda");
		lblNewLabel_5.setBounds(163, 190, 81, 14);
		Venda.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
		
			}
		});
		textField_1.setBounds(242, 187, 86, 20);
		Venda.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContato = new JLabel("Contato");
		lblContato.setBounds(10, 97, 46, 14);
		Venda.add(lblContato);
		
		textContatoV = new JTextField();
		textContatoV.setEnabled(false);
		textContatoV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textContatoV.setBounds(67, 94, 124, 20);
		Venda.add(textContatoV);
		textContatoV.setColumns(10);
	}
}
