package conta;

import dataAbertura.Data;

public class Conta {
	
	Data data = new Data();
	
	public String nome;
	public int numero;
	public String agencia;
	public double saldo;
	public String dataAbertura = data.toString();
	
	
	
	
	public void sacarDinheiro(double quantidade) {
		if (this.saldo > quantidade) {
			System.out.println("O valor de " + quantidade + " foi retirado");
			this.saldo -= quantidade;
		}
		
		else {
			System.out.println("SEM LIMITE PARA SACAR");
			System.exit(0);
		}
		
		
	}
	
	
	public void deposiDinheiro(double quantidade) {
		this.saldo += quantidade;
	}
	
	public void calcRend() {
		this.saldo += this.saldo + (this.saldo * 0.1);
	}
	
	public String toString() {
		return "NOME: " + nome + "\n" + "CONTA: " + numero + "\n" + "AGENCIA: " + agencia + "\n" + "SALDO: " + saldo + "\n" + "ABERTURA DA CONTA: " + dataAbertura;
	}

}
