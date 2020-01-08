
public class Livro {
	private String titulo;
	private String autor;	
	private String categoria;
	private int ano;
	private int estante;
	private int prateleira;
	private boolean emprestado;
	
	
	
	public Livro(String titulo, String autor, String categoria, int ano, int estante, int prateleira,
			boolean emprestado) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.ano = ano;
		this.estante = estante;
		this.prateleira = prateleira;
		this.emprestado = emprestado;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCategoria() {
		return categoria;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
	
	public void setEstante(int estante) {
		this.estante = estante;
	}
	public int getEstante() {
		return estante;
	}
	
	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}
	public int getPrateleira() {
		return prateleira;
	}
	
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public boolean isemprestado() {
		return this.emprestado;
	}
	
	
	
	
	void emprestarlivro() {
		if(emprestado == false) {
			 emprestado = !emprestado;
			 System.out.println("Livro emprestado com sucesso");
			 
			}else {
				System.out.println("O livro ja esta emprestado ");
			}
				
			}
	
	void devolver() {
		if(emprestado == true) {
			 emprestado = !emprestado;
			 System.out.println("Livro devolvido com sucesso");
			 
			}else {
				System.out.println("O livro ja foi devolvido  ");
			}
		
	}
	
		
	
}
