package UI;

import java.util.Scanner;


public class Principal {
    


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//iniciamento dos arrays e variáveis
		String[] clientes = new String[10];
		String[] Nomeprato = new String[10];
		String[] Nomesobremesa = new String[10];
		String[] Nomebebida = new String[10];
		int[] prato = new int[10];
		int[] sobremesa = new int[10];
		int[] bebida = new int[10];
		double[] soma = new double[10];
		double[] pago = new double[10];
		double[] troco = new double[10];
		String nome; 
		char escolha = 's', passar = 'n';
		int opcao, i = 0, c = 1; // i = "inicio" será usado para iniciar os sistemas de repetição do programa c = "contar" seá usadpara auxiia os omandos de repetições na contagem 
		
		do {
			//primeiro menu do programa
			System.out.println("============================================");
			System.out.println("          Restaurante Bistrô SEJA");
			System.out.println("============================================");
			System.out.println("1 - Cadastro de Cliente");
			System.out.println("2 - Listagem de Clientes");
			System.out.println("3 - Procurar cliente");
                        System.out.println("4 - Excluir cliente");
                        System.out.println("============================================");
			
			System.out.print("Digite a opção desejada: ");
			opcao = in.nextInt();
			System.out.println("============================================");
			
			switch(opcao){
				case 1:
					while(i <= 10) { //Esse comando "while" está sendo usado para receber o nome dos clientes e fazer o cadastro
						System.out.print("Digite o nome e sobrenome: ");
						in.nextLine();
						clientes[i] = in.nextLine(); 
						i += 1;
						if (i < 10) {
							System.out.print("Deseja cadastrar mais algum cliente?(S/N) ");
							escolha = in.next().charAt(0); 
						}
						if (escolha != 's' || i == 10) {
							break;
						}
					}
					break;	
				case 2:
					if (i > 0) {
						for (c = 0; c < i; c++) { //Esse comando "for" está sendo utilazado para fazer a listagem dos clientes cadastrados
							System.out.println((c + 1) + " ª pessoa - " + clientes[c]);
						}
					}else {
						System.out.println("Ainda não foi cadastrado nenhum cliente!");
					}
					break;
				case 3:
					//Esse comando esta sendo utilizado para capturar o nome do cliente a ser pesquisado no array clientes
					System.out.print("Digite o nome e sobrenome do cliente: ");
					in.nextLine();
					nome = in.nextLine();
					for (c = 0; c < i; c++) {
						if (clientes[c].equalsIgnoreCase(nome) == true) {
							System.out.println("O nome " + nome + " está na " + (c + 1) + "ª posição da lista");
						}else {
							System.out.println("O nome não está na " + (c + 1) + "ª posição da lista");
						}
                                                break;
                                        }
                                case 4:
                                        while(i <= 10) { //Esse comando "while" está sendo usado para receber o nome dos clientes e fazer o cadastro
						System.out.print("Digite o nome e sobrenome: ");
						in.nextLine();
						clientes[i] = in.nextLine(); 
						i -= 1;
						System.out.println("Cliente deletado com sucesso! " );
                                                for (c = 0; c < i; c++) { //Esse comando "for" está sendo utilazado para fazer a listagem dos clientes cadastrados
							System.out.println((c + 1) + " ª pessoa - " + clientes[c]);
						}                                               
					break;
					}
                                default:
					//Esse comando está sendo utilizado para caso o cliente digitar uma opção errada 
					System.out.println("Opção invalida!");
                        }
                        
                                        
// comando utilizado para perguntar se a pessoa deseja passar para o menu de opções	
		System.out.print("Deseja passar para o cardapio? [S/N] ");
		passar = in.next().charAt(0);
                }while(passar != 's');
		
		for(int a = 0; a < i ; a++) {
			//segundo menu do programa
			System.out.println("============================================");
			System.out.println("MENU DE CÁRDAPIO");
			System.out.println("Pratos:");
			System.out.println("1. Vegetariano - R$ 50,00");
			System.out.println("2. Peixe - R$ 40,00");
			System.out.println("3. Frango - R$ 50,00");
			System.out.println("4. Carnes - R$ 80,00");
			System.out.println("5. Nenhuma das opções");
			System.out.println("\nSobremesas:");
			System.out.println("1. Bolo de abacaxi - R$ 30,00");
			System.out.println("2. Sorvete diet - R$ 15,00");
			System.out.println("3. Mouse diet - R$ 18,00");
			System.out.println("4. Mouse chocolate - R$ 20,00");
			System.out.println("5. Nenhuma das opções");
			System.out.println("\nBebidas:");
			System.out.println("1. Chá - R$ 7,00");
			System.out.println("2. Suco de laranja - R$ 13,00");
			System.out.println("3. Refrigerante diet - R$ 18,00");
			System.out.println("4. Nenhuma das opções");
			System.out.println("============================================");
			System.out.print("Digite o número do prato do cliente " + clientes[a] + ": "); //os comandos abaixo serão utilizados para armazenar o nome e valor dos pratos de cada cliente
			int p = 0, s = 0, b = 0; //variaveis iniciadas para coletar os valores respectivamente dos pratos, sobremesa e bebida de cada cliente
			prato[a] = in.nextInt();
			if (prato[a] == 1) {
				p += 50;
				Nomeprato[a] = "Vegetariano";
			}else if (prato[a] == 2) {
				p += 40;
				Nomeprato[a] = "Peixe";
			}else if (prato[a] == 3) {
				p += 50;
				Nomeprato[a] = "Frango";
			}else if (prato[a] == 4) {
				p += 80;
				Nomeprato[a] = "Carnes";
			}else {
				p += 0;
				Nomeprato[a] = "Sem prato";
			}
			System.out.print("Digite o número da sobremesa de " + clientes[a] + ": "); //comando abaixo usado para armazenamento do nome e valor das sobremesas de cada cliente
			sobremesa[a] = in.nextInt();
			if (sobremesa[a] == 1) {
				s += 30;
				Nomesobremesa[a] = "Bolo de abacaxi";
			}else if (sobremesa[a] == 2) {
				s += 15;
				Nomesobremesa[a] = "Sorvete diet";
			}else if (sobremesa[a] == 3) {
				s += 18;
				Nomesobremesa[a] = "Mouse diet";
			}else if (sobremesa[a] == 4) {
				s += 20;
				Nomesobremesa[a] = "Mouse chololate";
			}else {
				s += 0;
				Nomesobremesa[a] = "Sem sobremesa";
			}
			System.out.print("Digite o número da bebida de " + clientes[a] + ": "); //armazenamento do nome e valor da bebida de cada cliente
			bebida[a] = in.nextInt();
			if (bebida[a] == 1) {
				b += 7;
				Nomebebida[a] = "Chá";
			}else if (bebida[a] == 2) {
				b += 13;
				Nomebebida[a] = "Suco de laranja";
			}else if (bebida[a] == 3) {
				b += 18;
				Nomebebida[a] = "Refrigerante diet";
			}else {
				b += 0;
				Nomebebida[a] = "Sem bebida";
			}
                        soma[a] = p + s + b; //array que faz a soma do prato, sobremesa e bebida de cada cliente
                        System.out.println("O valor total da conta foi R$ " + soma[a]);
			System.out.print("Valor que o cliente pagou: R$ ");
			pago[a] = in.nextDouble(); //array que faz a coleta de pagamento de cada cliente
			
                        int resp;
                        if (pago[a] < soma[a]){
                            System.out.println("O valor pagor não foi o total da sua conta");
                            System.out.println("Efetue o pagamento ou chamarei a policia...");
                            System.out.println("-------------------------------------------");
                            System.out.println("EFETUAR O PAGAMENTO? [1 - SIM /2 - NÃO] ");
                            System.out.println("--------------------------------------------");
                            resp = in.nextInt();
                            if (resp == 1) {
                                System.out.println("CONTA PAGA!! Obrigado :D");
                                pago[a] = soma[a];
                                break;
                            }else {
                                System.out.println("A POLICIA FOI CHAMADA E VOCÊ FOI PRESO!");
                                break;
                            }
                            
                        }		
                                            
		}
		for (int a = 0; a < i  ; a++) { //comando for utilizado para extrair os arrays e fazer criar uma nota fiscal mostrando tudo o que foi consumido, gasto, pago, e devolvido
			System.out.println("============================================");
			System.out.println("CLIENTE: " + clientes[a] +
					"\nCONSUMO:  \nPrato - " + Nomeprato[a] + "\nBebida - " + 
					Nomebebida[a] + "\nSobremesa - " + Nomesobremesa[a] + 
			 "\nCONTA: R$ " + soma[a] + "\nVALOR PAGO: R$ "
							+ pago[a] + "\nTROCO: R$ " + troco[a]);
		}
		in.close();
        }
        
}