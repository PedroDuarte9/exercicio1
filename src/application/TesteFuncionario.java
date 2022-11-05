package application;

public class TesteFuncionario {
	public static void main(String[] args) {
		
//		Funcionarios pedro = new Funcionarios();
//		pedro.setNome("Pedro Duarte");
//		pedro.setCpf("036.237.802-94");
//		pedro.setSalario(2950.00);
//			
//		
//		System.out.println(pedro.getNome());
//		System.out.println(pedro.getBonificacao());
//		System.out.println(pedro.somaSalarioMaisBonificacao());
//		
		Gerente carlos = new Gerente();
		carlos.setNome("Carlos Gonçalves");
		carlos.setCpf("012.654.239-61");
		
		String senha = carlos.autentica(2526);
		
		System.out.println(carlos.getNome());
		System.out.println(senha);
		
	}
}
