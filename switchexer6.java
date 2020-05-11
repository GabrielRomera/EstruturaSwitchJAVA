package exercicios2;
	import java.util.Scanner;
		public class switchexer6 {
			public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);

	int opcao;
	float salario, diferenca, salarioporcento, salariototal;
	
		
	
	System.out.printf("| Codigo | Cargo            | \n");
	System.out.printf("|---------------------------| \n");
	System.out.printf("|   1    | Diretor          | \n");
	System.out.printf("|   2    | Engenheiro       | \n");
	System.out.printf("|   3    | Tecnico          | \n");
	System.out.printf("|   4    | Gerente          | \n");
	System.out.printf("|   5    | Analista         | \n");
	System.out.printf("|   6    | Coordenador      | \n");
	System.out.printf("|   7    | Outros           | \n");
	System.out.printf("|---------------------------| \n");
	System.out.printf(" Digite o codigo do cargo:  \n");
	opcao = leitor.nextInt();
	
	System.out.printf("Digite o salario: ");
	salario = leitor.nextFloat();
	
	switch (opcao) {
	case 1:
		salarioporcento= salario * 10 / 100; 
		salariototal = salario + salarioporcento;
		diferenca = salariototal - salario;
		System.out.printf("Cargo: Diretor"
				+ "\nSalario antigo: "+salario+" Reais."
				+ "\nNovo salario: "+salariototal+" Reais"
				+"\nDiferenca: "+diferenca+" Reais.");
		break;
		
	case 2:
		salarioporcento= salario * 20 / 100; 
		salariototal = salario + salarioporcento;
		diferenca = salariototal - salario;
		System.out.printf("Cargo: Engenheiro"
				+ "\nSalario antigo: "+salario+" Reais."
				+ "\nNovo salario: "+salariototal+" Reais"
				+"\nDiferenca: "+diferenca+" Reais.");
		break;
		
	case 3:
		salarioporcento= salario * 30 / 100; 
		salariototal = salario + salarioporcento;
		diferenca = salariototal - salario;
		System.out.printf("Cargo: Tecnico"
				+ "\nSalario antigo: "+salario+" Reais."
				+ "\nNovo salario: "+salariototal+" Reais"
				+"\nDiferenca: "+diferenca+" Reais.");
		break;
		
	case 4:
		salarioporcento= salario * 10 / 100; 
		salariototal = salario + salarioporcento;
		diferenca = salariototal - salario;
		System.out.printf("Cargo: Gerente"
				+ "\nSalario antigo: "+salario+" Reais."
				+ "\nNovo salario: "+salariototal+" Reais"
				+"\nDiferenca: "+diferenca+" Reais.");
		break;
		
	case 5:
		salarioporcento= salario * 30 / 100; 
		salariototal = salario + salarioporcento;
		diferenca = salariototal - salario;
		System.out.printf("Cargo: Analista"
				+ "\nSalario antigo: "+salario+" Reais."
				+ "\nNovo salario: "+salariototal+" Reais"
				+"\nDiferenca: "+diferenca+" Reais.");
		break;
		
	case 6:
		salarioporcento= salario * 20 / 100; 
		salariototal = salario + salarioporcento;
		diferenca = salariototal - salario;
		System.out.printf("Cargo: Coordenador"
				+ "\nSalario antigo: "+salario+" Reais."
				+ "\nNovo salario: "+salariototal+" Reais"
				+"\nDiferenca: "+diferenca+" Reais.");
		break;
		
		//Deixei o cargo outros para facilitar.
	case 7:
		salarioporcento= salario * 40 / 100; 
		salariototal = salario + salarioporcento;
		diferenca = salariototal - salario;
		System.out.printf("Cargo: Outros"
				+ "\nSalario antigo: "+salario+" Reais."
				+ "\nNovo salario: "+salariototal+" Reais"
				+"\nDiferenca: "+diferenca+" Reais.");
		break;
		
		
	default:
		System.out.println("Erro, tente novamente.");
	
	
		}
	}
}