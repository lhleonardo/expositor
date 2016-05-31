package br.com.simulador.model;

public class CalculadoraSemestral extends Calculadora {

	private double nota1 = 0;
	private double nota2 = 0;

	@Override
	public String toString() {
		return "Notas Semestrais [" + nota1 + ", " + nota2 + "]";
	}

	public CalculadoraSemestral(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public CalculadoraSemestral(double nota1) {
		this.nota1 = nota1;
	}

	protected double calcula() {
		return (this.nota1 + this.nota2) / 2;
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