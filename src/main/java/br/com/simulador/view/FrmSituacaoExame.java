/*
 * To change this license header, choose License Headers in Project Properties. To change
 * this template file, choose Tools | Templates and open the template in the editor.
 */
package br.com.simulador.view;

import br.com.simulador.model.CalculadoraExame;

public class FrmSituacaoExame extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;

	public FrmSituacaoExame(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		txtNota = new javax.swing.JTextField();
		txtExame = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtSaida = new javax.swing.JTextArea();
		btnCalcular = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
		jLabel1.setText("Nota");

		jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel2.setText("Exame");

		txtNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		txtNota.setToolTipText("");
		txtNota.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNotaActionPerformed(evt);
			}
		});

		txtExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		txtSaida.setEditable(false);
		txtSaida.setColumns(20);
		txtSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		txtSaida.setLineWrap(true);
		txtSaida.setRows(5);
		jScrollPane1.setViewportView(txtSaida);

		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCalcularActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel3.setText("Resultado da Consulta");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
		                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		                Short.MAX_VALUE)
		        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                        .addComponent(jLabel3)
		                        .addGroup(layout
		                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		                                        layout.createSequentialGroup()
		                                                .addGroup(layout.createParallelGroup(
		                                                        javax.swing.GroupLayout.Alignment.LEADING)
		                                                        .addComponent(btnCalcular,
		                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                130,
		                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                        .addGroup(layout.createSequentialGroup()
		                                                                .addGroup(layout
		                                                                        .createParallelGroup(
		                                                                                javax.swing.GroupLayout.Alignment.LEADING)
		                                                                        .addComponent(jLabel1,
		                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
		                                                                        .addComponent(jLabel2,
		                                                                                javax.swing.GroupLayout.Alignment.TRAILING))
		                                                                .addPreferredGap(
		                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                                                .addGroup(layout
		                                                                        .createParallelGroup(
		                                                                                javax.swing.GroupLayout.Alignment.LEADING)
		                                                                        .addComponent(txtNota,
		                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                                80,
		                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                                        .addComponent(txtExame,
		                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
		                                                                                80,
		                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
		                                                .addGap(211, 211, 211))
		                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		                                        layout.createSequentialGroup()
		                                                .addComponent(jScrollPane1,
		                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 436,
		                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                                                .addGap(39, 39, 39))))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGroup(layout.createSequentialGroup()
		                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
		                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(29, 29, 29)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                        .addComponent(jLabel1).addComponent(txtNota,
		                                javax.swing.GroupLayout.PREFERRED_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                        .addComponent(jLabel2)
		                        .addComponent(txtExame, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(18, 18, 18)
		                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37,
		                        Short.MAX_VALUE)
		                .addComponent(jLabel3)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(11, 11, 11)));

		setSize(new java.awt.Dimension(540, 370));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNotaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNotaActionPerformed

	private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCalcularActionPerformed
		// TODO add your handling code here:
		CalculadoraExame exame = new CalculadoraExame(pegaValor(txtNota.getText()),
		        pegaValor(txtExame.getText()));

		txtSaida.setText(montaBuilder(exame));

	}

	private double pegaValor(String valor) {
		return valor.isEmpty() ? 0.0 : Double.parseDouble(valor);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
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
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtExame;
	private javax.swing.JTextField txtNota;
	private javax.swing.JTextArea txtSaida;

}
