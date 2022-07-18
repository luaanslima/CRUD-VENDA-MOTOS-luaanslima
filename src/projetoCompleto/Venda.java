package projetoCompleto;

public class Venda {
	
	

	private int id1;
	private int id2;
	private String nome;
	private int cpf;
	private String marca;
	private String Placa;
	private Double valor;
	private Long Contato;
	
	public Venda() {}
	
	private Venda(int id1, int id2, String nome, int cpf, Long Contato, String marca, String Placa, Double valor){
		
		

	
		super();
		this.id1 = id1;
		this.id2 = id2;
		this.nome = nome;
		this.cpf = cpf;
		this.marca = marca;
		this.Placa = Placa;
		this.valor = valor;
		this.Contato = Contato;

	}
	public Long getContato() {
		return Contato;
	}
	public void setContato(Long contato) {
		Contato = contato;
	}
	public int getId1() {
		return id1;
	}


	public void setId1(int id1) {
		this.id1 = id1;
	}


	public int getId2() {
		return id2;
	}


	public void setId2(int id2) {
		this.id2 = id2;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String placa) {
		Placa = placa;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}

	
}
