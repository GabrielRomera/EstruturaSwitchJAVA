package exercicios2;
	import java.util.Scanner;
		public class switchexer1 {
				public static void main(String[]Args) {
	
Scanner leitor = new Scanner(System.in);
	int num;
	
	System.out.printf("Digite o codigo do produto:");
	num = leitor.nextInt();
	
	switch (num) {
		case 1:
			System.out.println("Produto escolhido: Parafuso.");
			break;
			
		case 2:
			System.out.println("Produto escolhido: Porca.");
			break;
			
		case 3:
			System.out.println("Produto escolhido: Prego.");
			break;
			
		case 4:
			System.out.println("Produto escolhido: Ferramenta.");
			break;
			
		default:
			System.out.println("Produto escolhido: Diversos.");
	
	
		}
	}
}