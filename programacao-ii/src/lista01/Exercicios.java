package lista01;

import java.util.ArrayList;
import java.util.List;

public class Exercicios {

	public Integer calculaFatorial(Integer numero) {
		Integer result = 1;
		for (int i = numero; i > 0; --i) {
			result *= i;
		}
		return result;
	}

	public Boolean isImpar(Integer n) {
		return n % 2 != 0;
	}

	public Integer inverterNumero(Integer n) {
		Integer inv = 0;
		while (n > 0) {
			inv *= 10;
			inv += (n % 10);
			n /= 10;
		}

		return inv;
	}

	public Boolean isPrimo(Integer n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count == 2;
	}

	public int fibbon(int n) {
		int fib;

		if (n == 0) {
			fib = 0;
			return fib;
		} else if (n == 1) {
			fib = 1;
			return fib;

		} else {
			fib = fibbon(n - 2) + fibbon(n - 1);
			return fib;

		}
	}

	public String fibonacci(Integer n) {
		String serie = "";
		for (int i = n, tam = n + 15; i < tam; i++) {
			serie += " " + fibbon(i);
		}
		serie += "...";
		return serie;
	}

	public Integer getMaior(Integer... ns) {
		Integer maior = 0;
		for (Integer n : ns) {
			if (n > maior) {
				maior = n;
			}
		}
		return maior;
	}

	public Double calcularAumentoPct(Double salario, Double pct) {
		return (salario + (salario * (pct / 100)));
	}

	public String calcularEqSegundoGrau(Double a, Double b, Double c) {
		Double x1, x2;
		Double delta = (b * b) - (4 * a * c);
		String s = "";
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		if (!x1.isNaN()) {
			s += " X1 = " + x1;
		}

		if (!x2.isNaN()) {
			s += " X2 = " + x2;
		}

		return s == "" ? "A equação não possui raiz" : s;
	}

	public Boolean isPerfeito(Integer numero) {
		List<Integer> listDiv = new ArrayList<>();
		Integer total = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				listDiv.add(i);
			}
		}

		for (Integer n : listDiv) {
			total += n;
		}

		return total.equals(numero);
	}

	public String gerarTabuada(Integer numero){
		String quebraLinha = System.getProperty("line.separator");
		String s = "";
		for(int i=0; i < 10;i++){
			s +=(numero+" x "+i + " = "+ (numero*i))+quebraLinha;
		}
		return s;
	}
	
	public Integer idadeEmDias(Integer anos,Integer meses,Integer dias){
		Integer total = dias; // Dias
		total += anos*365;//Anos
		total += meses*30;//Meses
		return total;
	}
	
	public Double calculaSalarioComissionado(Double salario, Double vendas){
		if(vendas.compareTo(1500D) > 0){
			return salario+(vendas*0.5);
		}
		
		return salario+(vendas*0.3);
	}
	
	public Double calculaPerimetro(Double raio, Double h){
		return (3.14D * (raio*raio) * h);
	}
	
	public Double calculaVelocidadeMedia(Double distancia, Double tempo){
		return distancia/tempo;
	}

}
