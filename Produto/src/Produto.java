
public class Produto {
	private int id;
	private String nome ;
	private String detalhes;
	private float preço;
	private float estoque;


public Produto(int _id , String _nome, String _detalhes, float _preço, float _estoque) {
	this.id = _id;
	this.nome = _nome;
	this.detalhes = _detalhes;
	this.preço = _preço;
	this.estoque = _estoque;


}

public Produto() {
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	if(id <= 0 ) {
		throw new RuntimeException("ID não pode ser menor ou igual a zero");
	}
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	if (nome == null || nome.length() == 0 ) {
		throw new RuntimeException("NOME não pode ser vazio");
	}
	this.nome = nome;
}
public String getDetalhes() {
	return detalhes;
}
public void setDetalhes(String detalhes) {
	if (detalhes == null || detalhes.length() == 0 ) {
		throw new RuntimeException("Detalhes não pode ser vazio");
	}
	this.detalhes = detalhes;
}
public float getPreço() {
	return preço;
}
public void setPreço(float preço) {
	if(preço <= 0) {
		throw new RuntimeException("O preço não pode ser menor ou igual a zero");
	}
	this.preço = preço;
}
public float getEstoque() {
	return estoque;
}
public void setEstoque(float estoque) {
	if(estoque < 0) {
		throw new RuntimeException("O estoque não pode estar vazio");
	}
	this.estoque = estoque;
} 

public String toString() {
	return this.id+";"+this.nome+"continua"+detalhes+",R$ "+ this.preço + "("+this.estoque+")";
}







}
