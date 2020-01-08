public class Televisao {
//informações sobre uma tv 
	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;
	
	public Televisao(String marca, int voltagem, int tamanho) {
		System.out.println("este método é chamado no momento qie é dado new na classe. ");
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.volume = 5;
		this.canal = 1;
		
	}
	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getVoltagem() {
		return voltagem;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getTamanho() {
		return tamanho;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public boolean isligada() {
		return this.ligada;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getCanal() {
		return canal;
	}
	
		
	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV "+marca+" esta " + ((ligada) ? "ligada" : "desligada"));
		//operador ternario de atribuição condicional
		/*
		(testelogico) ? "valor caso true" : "valor caso false")
		*/
	}
	void aumentarVolume() {
		if(ligada) {
			if(volume!=100) {
				volume++;
				System.out.println("A TV "+ marca +" esta no volume"+volume);
			}else {
				System.out.println("MAX");
			}
		}else {
			System.out.println("A TV Ta desliga seu noia");
		}	
	}
	
	void diminuirVolume() {
		if(ligada) {
			if(volume!=1) {
				volume--;
				System.out.println("A TV "+ marca +" esta no volume"+volume);
			}else {
				System.out.println("MUTE");
			}
		}else {
			System.out.println("A TV Ta desliga seu noia");
		}	
	}
	void avancarcanal() {
		if(ligada) {
			canal ++;
			if(canal > 10) {
				canal = 1;
			}
			System.out.println("A TV "+ marca +" esta no canal"+canal);
		}else {
			System.out.println("A TV Ta desliga seu noia");
		}
		
	}
	void voltarcanal() {
		if(ligada) {
			canal --;
			if(canal < 1) {
				canal = 10 ;
				
			}
			System.out.println("A TV "+ marca +" esta no canal"+canal);
		}else {
			System.out.println("A TV Ta desliga seu noia");
		}
		
	}
	
}
