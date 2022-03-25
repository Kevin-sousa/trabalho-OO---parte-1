package controle;
import java.util.Scanner;

public class Principal {
	
	public static Scanner get = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		while ((opcao = menu_principal()) != 4) {
			
			switch (opcao) {
	        case 1:
	        	menu_gerenciar_locatarios();
	            break;

	        case 2:
	        	menu_gerenciar_frota();
	            break;

	        case 3:
	        	menu_gerenciar_reserva();
	            break;
	        
	        
		
			}
		}
	}
	
	public static int menu_principal(){
		
		System.out.println("bem vindo ao sistema de controle locatario, para continuar selecione uma das seguintes op��es:\n");
		System.out.println("Digite (1) - Gerenciar Locat�rios");
		System.out.println("Digite (2) - Gerenciar Frota");
		System.out.println("Digite (3) - Gerenciar Reservas");
		System.out.println("Digite (4) - Sair do Programa");
		int opcao = get.nextInt();
		if(opcao>4 || opcao < 1) {
			System.out.println("Por favor informe um valor valido");
		}
		
		return opcao;
	}
	
	public static int menu_gerenciar_locatarios(){
		
		System.out.println("gerenciamento de locatarios, para continuar selecione uma das seguintes op��es:");
		System.out.println("Digite (1) - Cadastrar Locat�rio");
		System.out.println("Digite (2) - Buscar Locat�rio");
		System.out.println("Digite (3) - Pesquisar Locat�rio");
		System.out.println("Digite (4) - Excluir locat�rio");
		System.out.println("Digite (5) - para voltar ao menu principal");
		int opcao = get.nextInt();
		return opcao;
	}
	
	public static int menu_gerenciar_frota(){
			System.out.println("gerenciamento de frota, para continuar selecione uma das seguintes op��es:");
			System.out.println("Digite (1) - Cadastrar ve�culos");
			System.out.println("Digite (2) - Pesquisar Ve�culo");
			System.out.println("Digite (3) - Atualizar dados de um ve�culo");
			System.out.println("Digite (4) - Remover ve�culo da frota");
			System.out.println("Digite (5) - para voltar ao menu principal");
			
			int opcao = get.nextInt();
			
			while (opcao == 1 || opcao == 2) {
				
				switch (opcao) {
		        case 1:
		        	menu_cadastra_veiculo();
		            break;

		        case 2:
		        	menu_pesquisa_veiculo();
		            break;
		        
				}
			}
			
			
			return opcao;
	}
			
	public static void menu_cadastra_veiculo(){
		
		System.out.println("Digite (1) - Cadastrar veiculo de passeio");
		System.out.println("Digite (2) - Cadastrar ve�culo utilit�rio");
		System.out.println("Digite (3) - Cadastrar Motocicleta");
		System.out.println("Digite (4) - para voltar ao menu principal");	
		
	}
	
	public static void menu_pesquisa_veiculo(){
		System.out.println("Digite (1) - Pesquisar ve�culo pelo Renavam");
		System.out.println("Digite (2) - Pesquisar ve�culo por marca, modelo ou renavam");
		System.out.println("Digite (3) - para voltar ao menu principal");	
	}
	
	public static void menu_gerenciar_reserva(){
		System.out.println("gerenciamento de reserva");
	}
}
