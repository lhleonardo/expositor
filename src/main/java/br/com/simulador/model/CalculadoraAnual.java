package br.com.simulador.model;

public class CalculadoraAnual extends Calculadora {

	private Double nota1;
	private Double nota2;
	private Double nota3;
	private Double nota4;

	@Override
	protected double calcula() {
		return (nota1 + nota2 + nota3 + (nota4 == null ? 0 : nota4));
	}

	@Override
	public boolean isAprovado() {
		return calcula() >= 240;
	}

	public CalculadoraAnual(Double nota1, Double nota2, Double nota3, Double nota4) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public CalculadoraAnual(Double nota1, Double nota2, Double nota3) {
		this(nota1, nota2, nota3, null);
	}

	public static void main(String[] args) {
		CalculadoraAnual anual = new CalculadoraAnual(50.0, 50.9, 50.0);
		System.out.println("Média: " + anual.getMedia());
		System.out.println("Situação: " + (anual.isAprovado() ? "APROVADO" : "REPROVADO"));
		if (!anual.isAprovado()) {
			System.out.println("Valor necessário: " + anual.getValorNecessario());
		}
	}

	@Override
	protected double calculaValorNecessario() {
		return 240 - getMedia();
	}

}
