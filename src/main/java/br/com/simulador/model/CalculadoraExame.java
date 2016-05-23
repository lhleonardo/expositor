package br.com.simulador.model;

/**
 * Calculadora responsável pela classificação do aluno pela nota de exame.
 * 
 * @author Leonardo Braz e João Victor
 *
 */
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

	/**
	 * Fórmula -> Média = ((notaAnual * 6) + (notaExame * 4)) / 10
	 */
	@Override
	protected double calcula() {
		return ((notaAnual * 6) + (notaExame * 4)) / 10;
	}

	@Override
	public boolean isAprovado() {
		return calcula() >= 50;
	}

	/**
	 * Método responsável por calcular a nota necessária para o aluno tirar no exame, calculando em
	 * cima de sua nota anual.
	 * 
	 * @return nota necessária
	 */
	public double valorQueFaltouParaPassar() {
		return 50 - calcula();
	}

	@Override
	protected double calculaValorNecessario() {
		double resultado = (500 - (notaAnual * 6)) / 4;
		return resultado < 0 ? resultado * -1 : resultado;
	}

}
