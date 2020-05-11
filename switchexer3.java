package exercicios2;
	import java.util.Scanner;
		public class switchexer3 {
			public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);

	int opcao;
	
				
	
	System.out.printf("| Opções |             Mensagem                    | \n");
	System.out.printf("|--------------------------------------------------| \n");
	System.out.printf("|   1    | Executa a rotina de Inclusao de Alunos  | \n");
	System.out.printf("|   2    | Executa a rotina de Alteracao de Alunos | \n");
	System.out.printf("|   3    | Executa a rotina de Exclusao de Alunos  | \n");
	System.out.printf("|   4    | Executa a rotina de Consulta de Alunos  | \n");
	System.out.printf("|--------------------------------------------------| \n");
	System.out.printf("|Escolha uma opcao: |------------------------------| \n");
	System.out.printf("|--------------------------------------------------| \n");
	opcao = leitor.nextInt();
	
	switch (opcao) {
	case 1:
		
		System.out.printf("| Escolhida: --------------------------------------| \n");
		System.out.printf("|   1    | Executa a rotina de Inclusao de Alunos  | \n");
		System.out.printf("|--------------------------------------------------| \n");
		break;
		
	case 2:
		
		System.out.printf("| Escolhida: --------------------------------------| \n");
		System.out.printf("|   2    | Executa a rotina de Alteracao de Alunos | \n");
		System.out.printf("|--------------------------------------------------| \n");
		break;
		
		
	case 3:
		
		System.out.printf("| Escolhida: --------------------------------------| \n");
		System.out.printf("|   3    | Executa a rotina de Exclusao de Alunos  | \n");
		System.out.printf("|--------------------------------------------------| \n");
		break;
		
		
	case 4:
		
		System.out.printf("| Escolhida: --------------------------------------| \n");
		System.out.printf("|   41    | Executa a rotina de Consulta de Alunos  | \n");
		System.out.printf("|--------------------------------------------------| \n");
		break;
		
	default:
		System.out.println("Tente novamente.");
	
	
		}
	}
}