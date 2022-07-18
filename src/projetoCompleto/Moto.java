package projetoCompleto;

public class Moto {
    
	int ID;

    String marca;
    String placa;
    int ano;
    String chasi;
    double valor;

    public Moto(){ 
}
    
    public Moto(int id, String marca,String placa, int ano, String chasi, double valor){
        
    	this.valor = valor;
        this.ano = ano;
        this.marca = marca;
        this.placa = placa;
        this. chasi = chasi;
        this.ID = id;
        
    
}

    public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
      
  

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getChasi() {
        return chasi;
    }

    public void setChasi(String chasi) {
        this.chasi = chasi;
    }
}
