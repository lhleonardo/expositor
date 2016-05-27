package br.com.simulador.util;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Mensagem {
	private String titulo;
	private Component component;

	public Mensagem(String titulo, Component component) {
		this.titulo = titulo;
		this.component = component;
	}

	public Mensagem(String titulo) {
		this(titulo, null);
	}

	public String getTitulo() {
		return titulo;
	}

	public void informacao(String mensagem) {
		JOptionPane.showMessageDialog(component, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public void erro(String erro) {
		JOptionPane.showMessageDialog(component, erro, titulo, JOptionPane.ERROR_MESSAGE);
	}

	public void erro(Exception e) {
		JOptionPane.showMessageDialog(component, e.getMessage(), titulo, JOptionPane.ERROR_MESSAGE);
	}

	public void erroPreenchimentoInvalido() {
		this.erro("Informe todos os campos necessários.\n\nEsquema de utilização: Informe todas as notas para saber "
		        + "seu status de aprovação\n\nPara saber a nota que precisa tirar para aprovação, "
		        + "preencha as notas presentes, exceto a nota faltante. ");
	}

	public void erroLetraAoInvesDeNumero() {
		this.erro("Você provavelmente informou letras nos campos de entrada.\nPor favor, informe apenas números.");
	}
}
