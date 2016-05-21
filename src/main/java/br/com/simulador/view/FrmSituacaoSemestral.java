/*
 * To change this license header, choose License Headers in Project Properties. To change
 * this template file, choose Tools | Templates and open the template in the editor.
 */
package br.com.simulador.view;

import br.com.simulador.model.CalculadoraSemestral;

public class FrmSituacaoSemestral extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;

	public FrmSituacaoSemestral(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		txtNota1 = new javax.swing.JTextField();
		txtNota2 = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		btnCalcular = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtSaida = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Situação Semestral");
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel1.setText("Nota 1");

		jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel2.setText("Nota 2");

		txtNota1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		txtNota1.setToolTipText("");

		txtNota2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setBorder(
		        javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 198, 207), null));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
		        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0,
		                Short.MAX_VALUE));
		jPanel1Layout
		        .setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                .addGap(0, 20, Short.MAX_VALUE));

		btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCalcularActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jLabel3.setText("Resultado da Consulta");

		txtSaida.setEditable(false);
		txtSaida.setColumns(20);
		txtSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		txtSaida.setLineWrap(true);
		txtSaida.setRows(5);
		jScrollPane1.setViewportView(txtSaida);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
		                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
		                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGroup(layout.createSequentialGroup().addGroup(layout
		                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
		                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addGroup(layout
		                                        .createParallelGroup(
		                                                javax.swing.GroupLayout.Alignment.LEADING, false)
		                                        .addComponent(txtNota2, javax.swing.GroupLayout.DEFAULT_SIZE,
		                                                80, Short.MAX_VALUE)
		                                        .addComponent(txtNota1))))
		                .addGap(211, 211, 211))
		        .addGroup(layout.createSequentialGroup().addGap(49, 49, 49)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                        .addComponent(jLabel3).addComponent(jScrollPane1,
		                                javax.swing.GroupLayout.PREFERRED_SIZE, 436,
		                                javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addContainerGap(39, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGroup(layout.createSequentialGroup()
		                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
		                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(29, 29, 29)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                        .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jLabel1))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                        .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jLabel2))
		                .addGap(18, 18, 18)
		                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37,
		                        Short.MAX_VALUE)
		                .addComponent(jLabel3)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap()));

		setSize(new java.awt.Dimension(540, 370));
		setLocationRelativeTo(null);
	}

	private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCalcularActionPerformed
		CalculadoraSemestral semestral = new CalculadoraSemestral(pegaValor(txtNota1.getText()),
		        pegaValor(txtNota2.getText()));
		StringBuilder builder = montaBuilder(semestral);

		txtSaida.setText(null);
		txtSaida.setText(builder.toString());
	}

	private StringBuilder montaBuilder(CalculadoraSemestral semestral) {
		StringBuilder builder = new StringBuilder();
		builder.append("Média: " + semestral.getMedia());
		builder.append("\nSituação: " + (semestral.isAprovado() ? "APROVADO" : "REPROVADO"));
		if (!semestral.isAprovado()) {
			builder.append("\nValor necessário para aprovação: " + semestral.getValorNecessario());
		}
		return builder;
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
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField txtNota1;
	private javax.swing.JTextField txtNota2;
	private javax.swing.JTextArea txtSaida;
}
