
public class Quest�oSimples {
	protected String enunciado;
	protected String resposta;

	public Quest�oSimples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;

	}

	public String aplicarQuestao() {
		return this.enunciado;
	}

	public boolean corrigir(String respostauser) {
		return resposta.equals(respostauser);
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
