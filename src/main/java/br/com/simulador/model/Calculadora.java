package br.com.simulador.model;

/**
 * Classe responsável por representar uma determinada calculadora, podendo modificar e implementar a
 * lógica adequada para cada situação.
 * 
 * @author Leonardo e João Victor
 *
 */

public abstract class Calculadora {
	/**
	 * método de implementação obrigatória. Sua utilização é feita na recepção da lógica correta do
	 * cálculo para a calculadora, variando entre implementações.
	 * 
	 * @return resultado do cálculo
	 */
	protected abstract double calcula();

	/**
	 * retorna o valor calculado para o receptor da mensagem.
	 * 
	 * @return resultado do cálculo
	 */
	public double getMedia() {
		return calcula();
	}

	/**
	 * Por ser uma calculadora de simulações de notas, é comum que tenha uma nota necessária para
	 * atingir uma determinado valor. Logo, é preciso definir a lógica desse cálculo do valor
	 * necessário.
	 * 
	 * @return valor necessário para atingir a média. (<code>calcula</code>)
	 */
	protected abstract double calculaValorNecessario();

	/**
	 * Retorno de aprovação para determinada lógica, sendo necessária a implementação.
	 * 
	 * @return status (APROVADO ou REPROVADO) [true/false]
	 */
	public abstract boolean isAprovado();

	/**
	 * Retorno do valor necessário, caso seja preciso, para a aprovação.
	 * 
	 * @return valor necessário
	 */
	public double getValorNecessario() {
		return this.calculaValorNecessario();
	}
}
