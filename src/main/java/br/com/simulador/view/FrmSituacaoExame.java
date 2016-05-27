package br.com.simulador.view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.com.simulador.model.CalculadoraExame;
import br.com.simulador.util.Mensagem;

public class FrmSituacaoExame extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	private Mensagem mensagem;

	public FrmSituacaoExame(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();

		this.mensagem = new Mensagem("Situação exame", this);
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		txtNota = new javax.swing.JTextField();
		txtExame = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtSaida = new javax.swing.JTextArea();
		btnCalcular = new javax.swing.JButton();
		btnCalcular.setFont(new Font("Segoe UI", Font.BOLD, 14));
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);

		jLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		jLabel1.setText("Nota");

		jLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		jLabel2.setText("Exame");

		txtNota.setFont(new java.awt.Font("Segoe UI", 0, 14));
		txtNota.setToolTipText("");

		txtExame.setFont(new java.awt.Font("Segoe UI", 0, 14));

		txtSaida.setEditable(false);
		txtSaida.setColumns(20);
		txtSaida.setFont(new java.awt.Font("Segoe UI", 0, 14));
		txtSaida.setLineWrap(true);
		txtSaida.setRows(5);
		jScrollPane1.setViewportView(txtSaida);

		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(evt -> btnCalcularActionPerformed(evt));

		jLabel3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		jLabel3.setText("Resultado da Consulta");

		btnLimparCampos = new JButton();
		btnLimparCampos.setText("Limpar Campos");
		btnLimparCampos.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnLimparCampos.addActionListener(evt -> btnLimpaCampos());

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
		        .addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
		                .addGap(131)
		                .addGroup(layout.createParallelGroup(Alignment.LEADING)
		                        .addGroup(layout.createSequentialGroup()
		                                .addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 130,
		                                        GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(ComponentPlacement.RELATED).addComponent(btnLimparCampos))
		                        .addGroup(layout.createSequentialGroup().addGap(72)
		                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
		                                        .addComponent(jLabel1, Alignment.TRAILING)
		                                        .addComponent(jLabel2, Alignment.TRAILING))
		                                .addPreferredGap(ComponentPlacement.RELATED)
		                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
		                                        .addComponent(txtNota, GroupLayout.PREFERRED_SIZE, 80,
		                                                GroupLayout.PREFERRED_SIZE)
		                                        .addComponent(txtExame, GroupLayout.PREFERRED_SIZE, 80,
		                                                GroupLayout.PREFERRED_SIZE))
		                                .addPreferredGap(ComponentPlacement.RELATED, 205, GroupLayout.PREFERRED_SIZE))))
		                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel3))
		                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1,
		                        GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)))
		        .addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
		        .addGap(21)
		        .addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1).addComponent(txtNota,
		                GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		        .addPreferredGap(ComponentPlacement.UNRELATED)
		        .addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(txtExame,
		                GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		        .addGap(18)
		        .addGroup(layout.createParallelGroup(Alignment.LEADING)
		                .addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
		                .addComponent(btnLimparCampos, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		        .addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel3)
		        .addPreferredGap(ComponentPlacement.RELATED)
		        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE).addContainerGap()));
		getContentPane().setLayout(layout);

		setSize(new Dimension(540, 343));
		setLocationRelativeTo(null);
	}

	private void btnLimpaCampos() {
		txtExame.setText("");
		txtNota.setText("");
		txtSaida.setText("");
		txtNota.requestFocus();
	}

	private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (preenchimentoCorreto()) {
				CalculadoraExame exame = new CalculadoraExame(pegaValor(txtNota.getText()),
				        pegaValor(txtExame.getText()));

				txtSaida.setText(montaBuilder(exame));
			} else {
				mensagem.erroPreenchimentoInvalido();
			}
		} catch (NumberFormatException ex) {
			mensagem.erroLetraAoInvesDeNumero();
			btnLimpaCampos();
		}

	}

	private boolean preenchimentoCorreto() {

		if (campoPreenchido(txtExame) && campoPreenchido(txtNota))
			return true;
		if (campoPreenchido(txtNota) && !campoPreenchido(txtExame))
			return true;
		else
			return false;
	}

	private boolean campoPreenchido(JTextField txt) {
		return !txt.getText().isEmpty();
	}

	private double pegaValor(String valor) {
		return valor.isEmpty() ? 0.0 : Double.parseDouble(valor);
	}

	public static void main(String args[]) {
		new FrmSituacaoExame(null, true).setVisible(true);
	}

	private String montaBuilder(CalculadoraExame exame) {
		StringBuilder builder = new StringBuilder();
		builder.append("Média: " + exame.getMedia());
		builder.append("\nSituação: " + (exame.isAprovado() ? "APROVADO" : "REPROVADO"));
		if (!exame.isAprovado()) {
			builder.append("\nValor necessário para aprovação: " + exame.getValorNecessario());
		}
		return builder.toString();
	}

	private javax.swing.JButton btnCalcular;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtExame;
	private javax.swing.JTextField txtNota;
	private javax.swing.JTextArea txtSaida;
	private JButton btnLimparCampos;

}
