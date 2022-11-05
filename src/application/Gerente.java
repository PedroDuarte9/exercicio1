package application;

public class Gerente extends Funcionarios {
	
	private int senha;
	
	public String autentica(int senha) {
		if(this.senha == senha) {
			return "Passou";
		}
		else {
			return "Não passou";
		}
	}

	
	public double getBonificacao() {
		return super.salario;
		
		}
	
}
