
public class Produto {
	private int id;
	private String nome ;
	private String detalhes;
	private float pre�o;
	private float estoque;


public Produto(int _id , String _nome, String _detalhes, float _pre�o, float _estoque) {
	this.id = _id;
	this.nome = _nome;
	this.detalhes = _detalhes;
	this.pre�o = _pre�o;
	this.estoque = _estoque;


}

public Produto() {
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	if(id <= 0 ) {
		throw new RuntimeException("ID n�o pode ser menor ou igual a zero");
	}
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	if (nome == null || nome.length() == 0 ) {
		throw new RuntimeException("NOME n�o pode ser vazio");
	}
	this.nome = nome;
}
public String getDetalhes() {
	return detalhes;
}
public void setDetalhes(String detalhes) {
	if (detalhes == null || detalhes.length() == 0 ) {
		throw new RuntimeException("Detalhes n�o pode ser vazio");
	}
	this.detalhes = detalhes;
}
public float getPre�o() {
	return pre�o;
}
public void setPre�o(float pre�o) {
	if(pre�o <= 0) {
		throw new RuntimeException("O pre�o n�o pode ser menor ou igual a zero");
	}
	this.pre�o = pre�o;
}
public float getEstoque() {
	return estoque;
}
public void setEstoque(float estoque) {
	if(estoque < 0) {
		throw new RuntimeException("O estoque n�o pode estar vazio");
	}
	this.estoque = estoque;
} 

public String toString() {
	return this.id+";"+this.nome+"continua"+detalhes+",R$ "+ this.pre�o + "("+this.estoque+")";
}







}
