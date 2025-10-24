package fag.objetos;

public class Carro {
	
	private String nome;
	private String modelo;
	private String cor;
	private int vaga;
	

	public Carro() {	
	}

	public int getVaga() {
		return vaga;
	}

	public void setVaga(int vaga) {
		if (vaga > 0 && vaga <= 12) {
			this.vaga = vaga;
		}else {
			System.out.println("\nVaga inválida!\n");
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!nome.isBlank() && nome != null) {
			this.nome = nome;
		}else {
			System.out.println("\nNome inválido!\n");
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (!modelo.isBlank() && modelo != null) {
			this.modelo = modelo;
	}else {
		System.out.println("\nModelo inválido!\n");
	}
}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if (!cor.isBlank() && cor != null) {
			this.cor = cor;
		}else {
			System.out.println("\nCor inválida!\n");
		}
	}
	public void listar() {
		System.out.printf("Vaga: %d | %s | %s | %s\n", vaga, nome, modelo, cor);
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", modelo=" + modelo + ", cor=" + cor + ", vaga=" + vaga + "]";
	}

	


	

	
	
}
