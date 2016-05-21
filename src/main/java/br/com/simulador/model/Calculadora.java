package br.com.simulador.model;

public abstract class Calculadora {
	protected abstract double calcula();

	public double getMedia() {
		return calcula();
	}

	protected abstract double calculaValorNecessario();

	public abstract boolean isAprovado();

	public double getValorNecessario() {
		return this.calculaValorNecessario();
	}
}
