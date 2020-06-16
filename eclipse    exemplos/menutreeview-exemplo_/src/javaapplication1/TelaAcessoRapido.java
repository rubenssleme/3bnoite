/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author rubens.leme
 */
public class TelaAcessoRapido extends javax.swing.JInternalFrame {

    /**
     * Creates new form AcessoRapido
     */
    public TelaAcessoRapido() {
        initComponents();
        controlador =  new ControladorAcessoRapido();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtServidores = new javax.swing.JButton();
        jbtAlunos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Acesso Rapido");
        setToolTipText("");

        jbtServidores.setText("Servidores");
        jbtServidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtServidoresActionPerformed(evt);
            }
        });

        jbtAlunos.setText("Alunos");
        jbtAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbtServidores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jbtAlunos)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtServidores)
                    .addComponent(jbtAlunos))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtServidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtServidoresActionPerformed
    controlador.abrirTelaServidores();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtServidoresActionPerformed

    private void jbtAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAlunosActionPerformed
       controlador.abrirTelaAlunos(); // TODO add your handling code here:
    }//GEN-LAST:event_jbtAlunosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAlunos;
    private javax.swing.JButton jbtServidores;
    // End of variables declaration//GEN-END:variables
ControladorAcessoRapido controlador ;
}
