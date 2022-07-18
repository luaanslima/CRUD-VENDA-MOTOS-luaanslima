package projetoCompleto;

/**
 *
 * @author luaan
 */
public class Cliente {
     
	int valorId;
    String nome;
    int id;
    int cpf;
    long rg;
    String sexo;
    long cep;
    String uf;
    String cidade;
    long contato;
    String logradouro;
    
    int numero;
    
    
    public Cliente(){  
} 

    public Cliente(int id, String nome, int cpf, long rg, String sexo, long cep, String uf, String cidade, long contato, String logradouro, int numero) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.contato = contato;
        this.logradouro = logradouro;
        this.numero = numero;
       
    }

    public int getValorId() {
		return valorId;
	}

	public void setValorId(int valorId) {
		this.valorId = valorId;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public long getContato() {
        return contato;
    }

    public void setContato(long contato) {
        this.contato = contato;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}    

