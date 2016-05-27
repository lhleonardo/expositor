/*
 * To change this template file, choose Tools | Templates and open the template in the
 * editor.
 */
package br.com.simulador.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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

		jLabel1.setFont(new Font("Segoe UI Light", Font.BOLD, 35)); // NOI18N
		jLabel1.setText("Expositor");

		btnSituacaoAnual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		btnSituacaoAnual.setText("Situação Anual");
		btnSituacaoAnual.addActionListener(evt -> btnSituacaoAnualActionPerformed(evt));

		btnSemestre.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
		btnSemestre.setText("Semestre");
		btnSemestre.addActionListener(event -> brnSituacaoSemestralActionPerformed(event));

		btnExame.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
		btnExame.setText("Exame");
		btnExame.addActionListener(event -> btnSituacaoExameActionPerformed(event));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup().addComponent(jLabel1).addGap(156))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnExame, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														455, Short.MAX_VALUE)
										.addComponent(btnSemestre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 455,
												Short.MAX_VALUE)
										.addComponent(btnSituacaoAnual, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
								.addContainerGap()))));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addContainerGap(38, Short.MAX_VALUE)
								.addComponent(jLabel1).addGap(31)
								.addComponent(btnSituacaoAnual, GroupLayout.PREFERRED_SIZE, 63,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnSemestre, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnExame, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		getContentPane().setLayout(layout);

		setSize(new Dimension(481, 370));
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
}
