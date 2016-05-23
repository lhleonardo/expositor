/*
 * To change this template file, choose Tools | Templates and open the template in the
 * editor.
 */
package br.com.simulador.view;

import java.awt.event.ActionEvent;

/**
 * Menu principal
 * 
 * @author Leonardo Braz e João Victor
 *
 */
public class FrmMenu extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public FrmMenu() {
		initComponents();
	}

	/**
	 * método de inicialização dos componentes, gerado pelo Netbeans
	 */
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		btnSituacaoAnual = new javax.swing.JButton();
		btnSemestre = new javax.swing.JButton();
		btnExame = new javax.swing.JButton();

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 198, 207), null));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGap(0, 520, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGap(0, 20, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Menu Principal");
		setResizable(false);

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 198, 207), null));
		jPanel2.setForeground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGap(0, 520, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGap(0, 20, Short.MAX_VALUE));

		jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
		jLabel1.setText("Expositor");

		btnSituacaoAnual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		btnSituacaoAnual.setText("Situação Anual");
		btnSituacaoAnual.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSituacaoAnualActionPerformed(evt);
			}
		});

		btnSemestre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		btnSemestre.setText("Semestre");
		btnSemestre.addActionListener(event -> brnSituacaoSemestralActionPerformed(event));

		btnExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		btnExame.setText("Exame");
		btnExame.addActionListener(event -> btnSituacaoExameActionPerformed(event));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		                Short.MAX_VALUE)
		        .addGroup(layout.createSequentialGroup().addGroup(layout
		                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                .addGroup(layout.createSequentialGroup().addGap(209, 209, 209).addComponent(jLabel1))
		                .addGroup(layout.createSequentialGroup().addGap(76, 76, 76).addGroup(layout
		                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                        .addGroup(layout.createSequentialGroup()
		                                .addComponent(btnSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
		                                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(btnExame, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
		                                        javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addComponent(btnSituacaoAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 372,
		                                javax.swing.GroupLayout.PREFERRED_SIZE))))
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGroup(layout.createSequentialGroup()
		                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
		                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(29, 29, 29).addComponent(jLabel1).addGap(32, 32, 32)
		                .addComponent(btnSituacaoAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)
		        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                .addComponent(btnSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
		                        javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addComponent(btnExame, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
		                        javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(0, 76, Short.MAX_VALUE)));

		setSize(new java.awt.Dimension(540, 370));
		setLocationRelativeTo(null);
	}

	private void btnSituacaoAnualActionPerformed(java.awt.event.ActionEvent evt) {
		FrmSituacaoAnual anual = new FrmSituacaoAnual(this, true);
		anual.setVisible(true);
	}

	private void btnSituacaoExameActionPerformed(ActionEvent evt) {
		FrmSituacaoExame exame = new FrmSituacaoExame(this, true);
		exame.setVisible(true);
	}

	private void brnSituacaoSemestralActionPerformed(ActionEvent evt) {
		FrmSituacaoSemestral semestre = new FrmSituacaoSemestral(this, true);
		semestre.setVisible(true);
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrmMenu().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnExame;
	private javax.swing.JButton btnSemestre;
	private javax.swing.JButton btnSituacaoAnual;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
}
