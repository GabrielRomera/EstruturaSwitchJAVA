package exercicios2;
	import java.util.Scanner;
		public class switchexer5 {
			public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);

	int codigo;
	float preco, total, valorfinal, valor3vezes;
	
				
	
	System.out.printf("Escolha uma condicao de pagamento: [1 ao 4]\n");
	codigo = leitor.nextInt();
	
	System.out.printf("Digite o preco do produto:\n");
	preco = leitor.nextFloat();
	
	switch (codigo) {
	case 1:
		total= preco * 10 / 100; 
		valorfinal = preco - total;
		System.out.printf("Com 10 por cento de desconto: " +valorfinal+" Reais.");
		break;
	
	case 2:
		total= preco * 5 / 100; 
		valorfinal = preco - total;
		System.out.printf("Com 5 por cento de desconto: " +valorfinal+" Reais.");
		break;
		
	case 3:
		valorfinal = preco /2;
		System.out.printf("Produto em 2 vezes de: " +valorfinal+ " Reais.");
		break;
		
	case 4:
		total= preco * 10 / 100; 
		valorfinal = preco + total;
		valor3vezes = valorfinal /3;
		System.out.printf("Valor total: "+valorfinal+" Reais.\nProduto em 3 vezes de: " +valor3vezes+ " Reais.");
		break;
		
	default:
		System.out.println("Tente novamente.");
	
	
		}
	}
}