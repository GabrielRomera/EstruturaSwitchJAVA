package exercicios2;
	import java.util.Scanner;
		public class switchexer4 {
			public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);

	int opcao;
	float nota1, nota2, nota3, notatotal, totalpond, totalarit;
	
				
	
	System.out.printf("Escolha: \n1 - Media aritmetica. \n2 - Media ponderada.\n");
	opcao = leitor.nextInt();
	
	System.out.printf("Digite a primeira nota: ");
	nota1 = leitor.nextInt();
	
	System.out.printf("Digite a segunda nota: ");
	nota2 = leitor.nextInt();
	
	System.out.printf("Digite a terceira nota: ");
	nota3 = leitor.nextInt();
	
	
	
	
	switch (opcao) {
	case 1:
		notatotal = nota1 + nota2 + nota3;
		totalarit = notatotal/3;
		System.out.printf("Sua nota: " + totalarit);
		break;
	
	case 2:
		notatotal = (nota1 * 3) + (nota2 * 3) + (nota3 * 4);
		totalpond = notatotal/10;
		System.out.printf("Sua nota: " + totalpond);
		break;
		
		
	default:
		System.out.println("Tente novamente.");
	
	
		}
	}
}