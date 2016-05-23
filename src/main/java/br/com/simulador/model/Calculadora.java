package br.com.simulador.model;

/**
 * Classe respons�vel por representar uma determinada calculadora, podendo modificar e implementar a
 * l�gica adequada para cada situa��o.
 * 
 * @author Leonardo e Jo�o Victor
 *
 */

public abstract class Calculadora {
	/**
	 * m�todo de implementa��o obrigat�ria. Sua utiliza��o � feita na recep��o da l�gica correta do
	 * c�lculo para a calculadora, variando entre implementa��es.
	 * 
	 * @return resultado do c�lculo
	 */
	protected abstract double calcula();

	/**
	 * retorna o valor calculado para o receptor da mensagem.
	 * 
	 * @return resultado do c�lculo
	 */
	public double getMedia() {
		return calcula();
	}

	/**
	 * Por ser uma calculadora de simula��es de notas, � comum que tenha uma nota necess�ria para
	 * atingir uma determinado valor. Logo, � preciso definir a l�gica desse c�lculo do valor
	 * necess�rio.
	 * 
	 * @return valor necess�rio para atingir a m�dia. (<code>calcula</code>)
	 */
	protected abstract double calculaValorNecessario();

	/**
	 * Retorno de aprova��o para determinada l�gica, sendo necess�ria a implementa��o.
	 * 
	 * @return status (APROVADO ou REPROVADO) [true/false]
	 */
	public abstract boolean isAprovado();

	/**
	 * Retorno do valor necess�rio, caso seja preciso, para a aprova��o.
	 * 
	 * @return valor necess�rio
	 */
	public double getValorNecessario() {
		return this.calculaValorNecessario();
	}
}
