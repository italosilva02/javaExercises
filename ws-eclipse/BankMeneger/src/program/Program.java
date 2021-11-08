package program;

import java.util.Locale;
import java.util.Scanner;

import conta.Conta;
import dataAbertura.Data;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		Data data = new Data();
		
		System.out.println("INFORME O NOME: ");
		conta.nome = sc.nextLine();
		System.out.println("INFORME O NUMERO DA CONTA: ");
		conta.numero = sc.nextInt();
		System.out.println("INFORME A AGENCIA: ");
		conta.agencia = sc.next();
		System.out.println("SALDO INICIAL R$: ");
		conta.saldo = sc.nextDouble(); 
		System.out.println("DATA DE ABERTURA DA CONTA: dd/mm/aaaa: ");
		data.dia = sc.nextInt();
		data.mes = sc.nextInt();
		data.ano = sc.nextInt();
		
		
		double depo = 0;
		

		System.out.println("\n\n\n INFORME A OPÇÂO QUE DESEJA: \n 1 - DEPOSITAR DINHEIRO \n 2 - SACAR DINHEIRO \n 3 - DADOS DA CONTA \n 4 - SAIR");
		int i = sc.nextInt();
		while (i != 4) {
		
		if (i == 1) {
			System.out.println("QUANTO DESEJA DEPOSITAR? R$ ");
			depo = sc.nextDouble();
			conta.deposiDinheiro(depo);
			System.out.println(conta.toString());
		}
		
		else if (i == 2) {
			System.out.println("QUANTO DESEJA SACAR? R$ ");
			depo = sc.nextDouble();
			conta.sacarDinheiro(depo);
			System.out.println(conta.toString());
		}
		
		else if (i == 3) {
			System.out.println(conta.toString());
		}
		
		else {
			System.exit(0);
			
		}
		
		System.out.println("PROGRAMA FINALIZADO COM SUCESSO");
		
		System.out.println("\n\n\n INFORME A OPÇÂO QUE DESEJA: \n 1 - DEPOSITAR DINHEIRO \n 2 - SACAR DINHEIRO \n 3 - DADOS DA CONTA \n 4 - SAIR");
		i = sc.nextInt();
		
		}
		
		
		
		sc.close();

	}

}
