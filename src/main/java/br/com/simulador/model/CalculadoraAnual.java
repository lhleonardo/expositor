package br.com.simulador.model;

/**
 * Calculadora de notas anuais, tomando base em suas quatro notas anuais (podendo ser chamadas de
 * bimestres ou etapas).
 * 
 * 
 * @author Leonardo e Jo�o Victor
 *
 */
public class CalculadoraAnual extends Calculadora {
	/**
	 * O c�lculo � efetuado a partir das quatro notas informadas pelo usu�rio. Elas devem ser
	 * informadas cronologicamente.
	 * 
	 * A partir desses valores, � feita a somat�ria e uma verifica��o, para saber se a m�dia foi
	 * atingida.
	 */

	// Nota do primeiro bimestre
	private Double nota1;
	// Nota do segundo bimestre
	private Double nota2;
	// Nota do terceiro bimestre
	private Double nota3;
	// Nota do quarto bimestre
	private Double nota4;

	public CalculadoraAnual(Double nota1, Double nota2, Double nota3, Double nota4) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public CalculadoraAnual(Double nota1, Double nota2, Double nota3) {
		this(nota1, nota2, nota3, null);
	}

	@Override
	protected double calcula() {
		return (nota1 + nota2 + nota3 + (nota4 == null ? 0 : nota4));
	}

	/**
	 * Caso a nota tenha atingido 240 pontos, o aluno conseguiu aprova��o.
	 */
	@Override
	public boolean isAprovado() {
		return calcula() >= 240;
	}


	@Override
	protected double calculaValorNecessario() {
		return 240 - getMedia();
	}

}
