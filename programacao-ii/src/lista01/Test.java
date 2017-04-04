package lista01;

import javax.swing.JOptionPane;

public class Test {
	private static void print(String msg){
		//System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private static String showInputDialog(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	private static void imprimirFatorial(){
		String strNum = showInputDialog("Informe um número para calcular o fatorial");
		try {
			Integer numero = Integer.parseInt(strNum);
			Exercicios ex = new Exercicios();
			print(ex.calculaFatorial(numero).toString());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			imprimirFatorial();
		}
	}
	
	private static void verificaNumeroImparOuPar(){
		String strNum = showInputDialog("Informe um número para verificar se ele é par ou ímpar");
		try {
			Integer numero = Integer.parseInt(strNum);
			Exercicios ex = new Exercicios();
			print(ex.isImpar(numero) ? "O numero é Ímpar" : "O numero é Par");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			verificaNumeroImparOuPar();
		}
	}
	
	private static void inverterNumero(){
		String strNum = showInputDialog("Informe um número o obter o inverso dele");
		try {
			Integer numero = Integer.parseInt(strNum);
			Exercicios ex = new Exercicios();
			print(numero+" -> "+ex.inverterNumero(numero));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			inverterNumero();
		}
	}
	
	private static void verificaNumeroPrimo(){
		String strNum = showInputDialog("Informe um número para verificar se ele é um numero primo.");
		try {
			Integer numero = Integer.parseInt(strNum);
			Exercicios ex = new Exercicios();
			print(ex.isPrimo(numero) ? numero+" é primo" : numero+" não é primo");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			verificaNumeroPrimo();
		}
	}
	
	private static void serieFibonacci(){
		String strNum = showInputDialog("Informe um número para obter a serie fibonacci dele");
		try {
			Integer numero = Integer.parseInt(strNum);
			Exercicios ex = new Exercicios();
			print(ex.fibonacci(numero));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			serieFibonacci();
		}
	}
	
	private static void maiorNumeroDeTres(){
		String strNum1 = showInputDialog("Informe primeiro numero");
		String strNum2 = showInputDialog("Informe segundo numero");
		String strNum3 = showInputDialog("Informe terceiro numero");
		try {
			Integer n1 = Integer.parseInt(strNum1);
			Integer n2 = Integer.parseInt(strNum2);
			Integer n3 = Integer.parseInt(strNum3);
			
			Exercicios ex = new Exercicios();
			print("O maior Numero é : "+ex.getMaior(n1,n2,n3));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			maiorNumeroDeTres();
		}
	}
	
	private static void calcularReajusteSalario(){
		String sSalario = showInputDialog("Informe o salário Ex:2000 (2 mil reais)");
		String sPct = showInputDialog("Informe o percentual de aumento.");
		try {
			Double salario = Double.parseDouble(sSalario);
			Double pct = Double.parseDouble(sPct);
			
			Exercicios ex = new Exercicios();
			print("O valor reajustado do salário em "+sPct+"% é : "+ex.calcularAumentoPct(salario, pct));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			calcularReajusteSalario();
		}
	}
	
	private static void calcularEqSegundoGrau(){
		String sA = showInputDialog("Informe o valor de (a).");
		String sB = showInputDialog("Informe o valor de (b).");
		String sC = showInputDialog("Informe o valor de (c).");
		try {
			Double a = Double.parseDouble(sA);
			Double b = Double.parseDouble(sB);
			Double c = Double.parseDouble(sC);
			
			Exercicios ex = new Exercicios();
			print(ex.calcularEqSegundoGrau(a, b, c));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			calcularEqSegundoGrau();
		}
	} 
	
	private static void verificarNumeroPerfeito(){
		String sN = showInputDialog("Informe um numero para verificar se ele é perfeito");
		try {
			Integer n = Integer.parseInt(sN);
			
			Exercicios ex = new Exercicios();
			print(ex.isPerfeito(n) ? "É perfeito." : "Não é perfeito.");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			verificarNumeroPerfeito();
		}
	} 
	

	private static void gerarTabuada() {
		String sN = showInputDialog("Informe um numero para gerar a tabuada");
		try {
			Integer n = Integer.parseInt(sN);
			
			Exercicios ex = new Exercicios();
			print(ex.gerarTabuada(n));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			gerarTabuada();
		}
	}
	
	private static void idadeEmDias(){
		String sAnos = showInputDialog("Informe a quantidade de anos");
		String sMeses = showInputDialog("Informe a quantidade de meses");
		String sDias = showInputDialog("Informe a quantidade de dias");
		try {
			Integer anos = Integer.parseInt(sAnos);
			Integer meses = Integer.parseInt(sMeses);
			Integer dias = Integer.parseInt(sDias);
			
			Exercicios ex = new Exercicios();
			print("A idade informada em dias é igual a "+ex.idadeEmDias(anos, meses, dias));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			idadeEmDias();
		}
	}

	
	private static void calculaSalarioComissionado(){
		String sSalario = showInputDialog("Informe o salário");
		String sVendas = showInputDialog("Informe o tatal de vendas");
		try {
			Double salario = Double.parseDouble(sSalario);
			Double vendas = Double.parseDouble(sVendas);
			
			Exercicios ex = new Exercicios();
			print("O valor final do salário será de "+ex.calculaSalarioComissionado(salario, vendas));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			calculaSalarioComissionado();
		}
	}
	
	
	private static void calculaPerimetro(){
		String sRaio = showInputDialog("Informe o raio");
		String sAltura = showInputDialog("Informe a altura");
		try {
			Double raio = Double.parseDouble(sRaio);
			Double altura = Double.parseDouble(sAltura);
			
			Exercicios ex = new Exercicios();
			print("O do perimetro é igual a "+ex.calculaPerimetro(raio, altura));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			calculaPerimetro();
		}
	}
	
	private static void calculaVelocidadeMedia(){
		String sDistancia = showInputDialog("Informe o distancia percorrida.");
		String sTempo = showInputDialog("Informe o tempo");
		try {
			Double distancia = Double.parseDouble(sDistancia);
			Double tempo = Double.parseDouble(sTempo);
			
			Exercicios ex = new Exercicios();
			print("A velocidade media é de "+ex.calculaVelocidadeMedia(distancia, tempo));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor informado não é um numero. Tente novamente");
			calculaVelocidadeMedia();
		}
	}
	
	
	
	public static void main(String[] args) {
//		imprimirFatorial();
//		verificaNumeroImparOuPar();
//		inverterNumero();
//		verificaNumeroPrimo();
//		serieFibonacci();
//		maiorNumeroDeTres();
//		calcularReajusteSalario();
//		calcularEqSegundoGrau();
//		verificarNumeroPerfeito();
//		gerarTabuada();
//		idadeEmDias();
//		calculaSalarioComissionado();
//		calculaPerimetro();
		calculaVelocidadeMedia();
	    System.exit(0);
	}

}
