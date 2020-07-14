package Package;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Kauan:");
		Funcionario f1 = new Funcionario("Júlia:", "kauanxD@gmail.com");
		Gerente g1 = new Gerente ("Davy:", "KauanxD@gmail.com", "12345678");
		
		System.out.println(p1.getNome() + p1.oi());
		System.out.println(f1.getNome() + f1.ola());
		System.out.println(g1.getNome() + g1.ei());
		System.out.println(f1.getNome() + f1.amigo());
		System.out.println(g1.getNome() + g1.confus());
		}
}
