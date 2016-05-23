package br.com.simulador.view;

import javax.swing.JTextField;

import br.com.simulador.model.CalculadoraSemestral;
import util.Mensagem;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSituacaoSemestral extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	private Mensagem mensagem;

	public FrmSituacaoSemestral(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		this.mensagem = new Mensagem("Situação Semestral", this);
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		txtNota1 = new javax.swing.JTextField();
		txtNota2 = new javax.swing.JTextField();
		btnCalcular = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtSaida = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Situação Semestral");
		setResizable(false);

		jLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		jLabel1.setText("Nota 1");

		jLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		jLabel2.setText("Nota 2");

		txtNota1.setFont(new java.awt.Font("Segoe UI", 0, 14));
		txtNota1.setToolTipText("");

		txtNota2.setFont(new java.awt.Font("Segoe UI", 0, 14));

		btnCalcular.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(evt -> btnCalcularActionPerformed(evt));

		jLabel3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		jLabel3.setText("Resultado da Consulta");

		txtSaida.setEditable(false);
		txtSaida.setColumns(20);
		txtSaida.setFont(new java.awt.Font("Segoe UI", 0, 14));
		txtSaida.setLineWrap(true);
		txtSaida.setRows(5);
		jScrollPane1.setViewportView(txtSaida);
		
		btnLimparCampos = new JButton();
		btnLimparCampos.addActionListener(evento -> btnLimparCamposActionPerformed());
		btnLimparCampos.setText("Limpar campos");
		btnLimparCampos.setFont(new Font("Segoe UI", Font.BOLD, 14));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel3)
					.addContainerGap())
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 496, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(layout.createSequentialGroup()
					.addGap(193)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel2, Alignment.TRAILING)
						.addComponent(jLabel1, Alignment.TRAILING))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtNota1)
						.addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(197, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
					.addGap(121)
					.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLimparCampos)
					.addContainerGap(120, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGap(19)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2))
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLimparCampos, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(jLabel3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		getContentPane().setLayout(layout);

		setSize(new Dimension(518, 335));
		setLocationRelativeTo(null);
	}


	private void btnLimparCamposActionPerformed() {
		txtNota1.setText("");
		txtNota2.setText("");
	}

	private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (preenchimentoCorreto()) {
				CalculadoraSemestral semestral = new CalculadoraSemestral(pegaValor(txtNota1.getText()),
						pegaValor(txtNota2.getText()));

				txtSaida.setText(montaBuilder(semestral));
			} else {
				mensagem.erroPreenchimentoInvalido();
			}
		} catch (NumberFormatException ex) {
			mensagem.erroLetraAoInvesDeNumero();
		}
	}

	private boolean preenchimentoCorreto() {
		return campoPreenchido(txtNota1) || campoPreenchido(txtNota2);
	}

	private boolean campoPreenchido(JTextField txt) {
		return !txt.getText().isEmpty();
	}

	private String montaBuilder(CalculadoraSemestral semestral) {
		StringBuilder builder = new StringBuilder();
		builder.append("Média: " + semestral.getMedia());
		builder.append("\nSituação: " + (semestral.isAprovado() ? "APROVADO" : "REPROVADO"));
		if (!semestral.isAprovado()) {
			builder.append("\nValor necessário para aprovação: " + semestral.getValorNecessario());
		}
		return builder.toString();
	}

	private double pegaValor(String valor) {
		return valor.isEmpty() ? 0.0 : Double.parseDouble(valor);
	}

	public static void main(String args[]) {
		FrmSituacaoSemestral semestral = new FrmSituacaoSemestral(null, true);
		semestral.setVisible(true);
	}

	private javax.swing.JButton btnCalcular;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtNota1;
	private javax.swing.JTextField txtNota2;
	private javax.swing.JTextArea txtSaida;
	private JButton btnLimparCampos;
}
