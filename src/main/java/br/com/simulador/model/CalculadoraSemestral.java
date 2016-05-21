package br.com.simulador.model;

public class CalculadoraSemestral extends Calculadora {

	private double nota1 = 0;
	private double nota2 = 0;

	protected double calcula() {
		return (this.nota1 + this.nota2) / 2;
	}

	public CalculadoraSemestral(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public CalculadoraSemestral(double nota1) {
		this.nota1 = nota1;
	}

	public static void main(String[] args) {
		semestre(50.0, 50.0);
		semestre(50.0, 60.0);
		semestre(50.0, 70.0);
		semestre(30.0, 0.0);
	}

	@Override
	public String toString() {
		return "Notas Semestrais [" + nota1 + ", " + nota2 + "]";
	}

	public static void semestre(double v1, double v2) {
		CalculadoraSemestral primeiro = new CalculadoraSemestral(v1, v2);
		System.out.println(primeiro);
		System.out.println("Média:" + primeiro.getMedia());
		System.out.println("Aprovado: " + primeiro.isAprovado());
		if (!primeiro.isAprovado()) {
			System.out.println("Valor necessário para passar: " + primeiro.getValorNecessario());
		}
		System.out.println("----------------------");
	}

	@Override
	protected double calculaValorNecessario() {
		return (60 - calcula()) * 2;
	}

	@Override
	public boolean isAprovado() {
		return calcula() >= 60;
	}
}