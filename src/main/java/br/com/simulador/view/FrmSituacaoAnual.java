/*
 * To change this license header, choose License Headers in Project Properties. To change
 * this template file, choose Tools | Templates and open the template in the editor.
 */
package br.com.simulador.view;

import br.com.simulador.model.Calculadora;
import br.com.simulador.model.CalculadoraAnual;

/**
 *
 * @author 03345943247
 */
public class FrmSituacaoAnual extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;

	public FrmSituacaoAnual(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
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

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setBorder(
		        javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 198, 207), null));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
		        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 520,
		                Short.MAX_VALUE));
		jPanel1Layout
		        .setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                .addGap(0, 20, Short.MAX_VALUE));

		jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel1.setText("1º Bimestre");

		jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel2.setText("2º Bimestre");

		txtSegundoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel3.setText("3º Bimestre");

		txtTerceiroB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel4.setText("4º Bimestre");

		txtQuartoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		btnCalcular.addActionListener(listener -> btnCalcularActionPerformed(listener));
		btnCalcular.setText("Calcular");

		txtSaida.setEditable(false);
		txtSaida.setColumns(20);
		txtSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		txtSaida.setLineWrap(true);
		txtSaida.setRows(5);
		jScrollPane1.setViewportView(txtSaida);

		jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel5.setText("Resultado da Consulta");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
		                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		        .addGroup(layout.createSequentialGroup().addGroup(layout
		                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                .addGroup(layout.createSequentialGroup().addGap(83, 83, 83).addGroup(layout
		                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                        .addGroup(layout.createSequentialGroup().addComponent(jLabel3)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(txtTerceiroB, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                        80, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
		                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                .addComponent(jLabel4)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(txtQuartoB, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
		                                        javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGroup(layout.createSequentialGroup().addComponent(jLabel1)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(txtPrimeiroB, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                        80, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(34, 34, 34).addComponent(jLabel2)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(txtSegundoB, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
		                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
		                .addGroup(layout.createSequentialGroup().addGap(197, 197, 197).addComponent(
		                        btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)))
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                .addGap(10, 49, Short.MAX_VALUE)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                        .addComponent(jLabel5).addComponent(jScrollPane1,
		                                javax.swing.GroupLayout.PREFERRED_SIZE, 436,
		                                javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(39, 39, 39)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGroup(layout.createSequentialGroup()
		                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
		                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(29, 29, 29)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                        .addComponent(txtPrimeiroB, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jLabel1)
		                        .addComponent(txtSegundoB, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jLabel2))
		                .addGap(29, 29, 29)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                        .addComponent(txtTerceiroB, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jLabel3)
		                        .addComponent(txtQuartoB, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jLabel4))
		                .addGap(18, 18, 18)
		                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19,
		                        Short.MAX_VALUE)
		                .addComponent(jLabel5)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap()));

		setSize(new java.awt.Dimension(540, 370));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCalcularActionPerformed
		CalculadoraAnual anual = new CalculadoraAnual(pegaValor(txtPrimeiroB.getText()),
		        pegaValor(txtSegundoB.getText()), pegaValor(txtTerceiroB.getText()),
		        pegaValor(txtQuartoB.getText()));

		txtSaida.setText(montaBuilder(anual));

	}

	private String montaBuilder(Calculadora semestral) {
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
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
			        .getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FrmSituacaoAnual.class.getName())
			        .log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmSituacaoAnual.class.getName())
			        .log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmSituacaoAnual.class.getName())
			        .log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmSituacaoAnual.class.getName())
			        .log(java.util.logging.Level.SEVERE, null, ex);
		}
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
	}

	private javax.swing.JButton btnCalcular;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtPrimeiroB;
	private javax.swing.JTextField txtQuartoB;
	private javax.swing.JTextArea txtSaida;
	private javax.swing.JTextField txtSegundoB;
	private javax.swing.JTextField txtTerceiroB;
}
