package exercicios2;
	import java.util.Scanner;
		public class switchexer2 {
			public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);

	int prod, qtd;
	double total = 0;
				
	
	System.out.printf("Digite o codigo do produto: ");
	prod = leitor.nextInt();
	
	System.out.printf("Digite a quantidade: ");
	qtd = leitor.nextInt();
	
	
	switch (prod) {
		case 100:
			
			System.out.printf("Produto: Cachorro Quente. ");
			total= qtd * 3.2;
			break;
			
		case 101:
			System.out.println("Produto: Bauru simples. ");
			total= qtd * 4.3;
			break;
			
			
		case 102:
			System.out.println("Produto escolhido: Bauru com ovo.");
			total= qtd * 5.5;
			break;
			
			
		case 103:
			System.out.println("Produto escolhido: Hamburger.");
			total= qtd * 3.2;
			break;
			
			
		case 104:
			System.out.println("Produto escolhido: Cheeseburguer.");
			total= qtd * 4.3;
			break;
			
			
		case 105:
			System.out.println("Produto escolhido: Refrigerante.");
			total= qtd * 4.0;
			break;
			
		default:
			System.out.println("Tente novamente.");
			}
	
	
System.out.println("\nValor total: " +total+ " Reais.");
	}
}
