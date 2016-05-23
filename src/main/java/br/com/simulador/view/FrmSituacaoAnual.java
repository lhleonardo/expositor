package br.com.simulador.view;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.com.simulador.model.Calculadora;
import br.com.simulador.model.CalculadoraAnual;
import util.Mensagem;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Leonardo Braz e João Victor
 */
public class FrmSituacaoAnual extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	private Mensagem mensagem;

	public FrmSituacaoAnual(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		this.mensagem = new Mensagem("Situação anual", this);
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		txtPrimeiroB = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		txtSegundoB = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtTerceiroB = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txtQuartoB = new javax.swing.JTextField();
		btnCalcular = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtSaida = new javax.swing.JTextArea();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Situação Anual");
		setResizable(false);

		jLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
		jLabel1.setText("1º Bimestre");

		jLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
		jLabel2.setText("2º Bimestre");

		txtSegundoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		jLabel3.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
		jLabel3.setText("3º Bimestre");

		txtTerceiroB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
		jLabel4.setText("4º Bimestre");

		txtQuartoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		btnCalcular.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
		btnCalcular.addActionListener(listener -> btnCalcularActionPerformed(listener));
		btnCalcular.setText("Calcular");

		txtSaida.setEditable(false);
		txtSaida.setColumns(20);
		txtSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		txtSaida.setLineWrap(true);
		txtSaida.setRows(5);
		jScrollPane1.setViewportView(txtSaida);

		jLabel5.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
		jLabel5.setText("Resultado da Consulta");

		JButton btnLimparCampos = new JButton();
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtPrimeiroB.setText("");
				txtSegundoB.setText("");
				txtTerceiroB.setText("");
				txtQuartoB.setText("");
				txtSaida.setText("");
				txtPrimeiroB.requestFocus();
			}
		});
		btnLimparCampos.setText("Limpar Campos");
		btnLimparCampos.setFont(new Font("Segoe UI", Font.BOLD, 14));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGap(82)
							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(layout.createSequentialGroup()
									.addComponent(jLabel1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPrimeiroB, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addGap(34)
									.addComponent(jLabel2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtSegundoB, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
											.addComponent(jLabel3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtTerceiroB, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
											.addComponent(jLabel4)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtQuartoB, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnLimparCampos, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))))
						.addGroup(layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel5)
								.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))))
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(31)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPrimeiroB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel1)
						.addComponent(txtSegundoB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2))
					.addGap(29)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTerceiroB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3)
						.addComponent(txtQuartoB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4))
					.addGap(18)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLimparCampos, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(jLabel5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(layout);

		setSize(new Dimension(503, 385));
		setLocationRelativeTo(null);
	}

	private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (preenchimentoCorreto()) {
				double primeiroBim = pegaValor(txtPrimeiroB.getText());
				double segundoBim = pegaValor(txtSegundoB.getText());
				double terceiroBim = pegaValor(txtTerceiroB.getText());
				double quartoBim = pegaValor(txtQuartoB.getText());

				CalculadoraAnual anual = new CalculadoraAnual(primeiroBim, segundoBim, terceiroBim, quartoBim);

				txtSaida.setText(montaBuilder(anual));
			} else {
				mensagem.erroPreenchimentoInvalido();
			}
		} catch (NumberFormatException ex) {
			mensagem.erroLetraAoInvesDeNumero();

			resetFields();
		}

	}

	private void resetFields() {
		txtPrimeiroB.setText("");
		txtSegundoB.setText("");
		txtTerceiroB.setText("");
		txtQuartoB.setText("");

		txtPrimeiroB.requestFocus();
	}

	private boolean preenchimentoCorreto() {
		return ((campoPreenchido(txtPrimeiroB) && campoPreenchido(txtSegundoB) && campoPreenchido(txtTerceiroB))
				|| (campoPreenchido(txtQuartoB)));
	}

	private boolean campoPreenchido(JTextField txt) {
		return !txt.getText().isEmpty();
	}

	private String montaBuilder(Calculadora calculadora) {
		StringBuilder builder = new StringBuilder();
		builder.append("Média: " + calculadora.getMedia());
		builder.append("\nSituação: " + (calculadora.isAprovado() ? "APROVADO"
				: txtQuartoB.getText().isEmpty() ? "EM ANDAMENTO" : "REPROVADO"));
		if (!calculadora.isAprovado()) {
			builder.append("\nValor necessário para aprovação: " + calculadora.getValorNecessario());
		}
		return builder.toString();
	}

	private double pegaValor(String valor) {
		return valor.isEmpty() ? 0.0 : Double.parseDouble(valor);
	}

	public static void main(String args[]) {
		try {
			javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					FrmSituacaoAnual dialog = new FrmSituacaoAnual(new javax.swing.JFrame(), true);
					dialog.addWindowListener(new java.awt.event.WindowAdapter() {
						@Override
						public void windowClosing(java.awt.event.WindowEvent e) {
							System.exit(0);
						}
					});
					dialog.setVisible(true);
				}
			});

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			new Mensagem("Situação Anual").erro(e1);
		}
	}

	private javax.swing.JButton btnCalcular;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtPrimeiroB;
	private javax.swing.JTextField txtQuartoB;
	private javax.swing.JTextArea txtSaida;
	private javax.swing.JTextField txtSegundoB;
	private javax.swing.JTextField txtTerceiroB;
}
