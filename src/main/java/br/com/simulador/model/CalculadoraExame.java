package br.com.simulador.model;

public class CalculadoraExame extends Calculadora {

	private Double notaAnual;
	private Double notaExame;

	public CalculadoraExame(Double notaAnual, Double notaExame) {
		super();
		this.notaAnual = notaAnual;
		this.notaExame = notaExame;
	}

	public CalculadoraExame(Double notaAnual) {
		super();
		this.notaAnual = notaAnual;
	}

	@Override
	protected double calcula() {
		return ((notaAnual * 6) + (notaExame * 4)) / 10;
	}

	@Override
	public boolean isAprovado() {
		return calcula() >= 50;
	}

	public double valorQueFaltouParaPassar() {
		return 50 - calcula();
	}

	@Override
	protected double calculaValorNecessario() {
		double resultado = (500 - (notaAnual * 6)) / 4;
		return resultado < 0 ? resultado * -1 : resultado;
	}

	public static void main(String[] args) {
		CalculadoraExame exame = new CalculadoraExame(20.0, 9.0);
		System.out.println("Aprovado? " + exame.isAprovado());
		if (!exame.isAprovado()) {
			System.out.println("Valor que faltou: " + exame.valorQueFaltouParaPassar());
		}
	}

}
