/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carloskafka.sisprojeto.telas;

/**
 *
 * @author m8
 */
public class TelaMenu2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu2
     */
    public TelaMenu2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmCadastrarCliente = new javax.swing.JMenuItem();
        jmCadastrarFornecedor = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmConsultaCliente = new javax.swing.JMenuItem();
        jmConsultaFonecedor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmCadastros.setText("Cadastros");

        jmCadastrarCliente.setText("Cadastrar Cliente");
        jmCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarClienteActionPerformed(evt);
            }
        });
        jmCadastros.add(jmCadastrarCliente);

        jmCadastrarFornecedor.setText("Cadastrar Fornecedor");
        jmCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarFornecedorActionPerformed(evt);
            }
        });
        jmCadastros.add(jmCadastrarFornecedor);

        jMenuBar1.add(jmCadastros);

        jmConsultas.setText("Consultas");

        jmConsultaCliente.setText("Consulta Cliente");
        jmConsultas.add(jmConsultaCliente);

        jmConsultaFonecedor.setText("Consulta Fornecedor");
        jmConsultas.add(jmConsultaFonecedor);

        jMenuBar1.add(jmConsultas);

        jMenu3.setText("Exclusão");

        jMenuItem1.setText("Exclusão Cliente");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Exclusão Fornecedor");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarClienteActionPerformed
        new TelaCadastroCliente().show();
    }//GEN-LAST:event_jmCadastrarClienteActionPerformed

    private void jmCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarFornecedorActionPerformed
        new TelaFornecedor().show();
    }//GEN-LAST:event_jmCadastrarFornecedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmCadastrarCliente;
    private javax.swing.JMenuItem jmCadastrarFornecedor;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenuItem jmConsultaCliente;
    private javax.swing.JMenuItem jmConsultaFonecedor;
    private javax.swing.JMenu jmConsultas;
    // End of variables declaration//GEN-END:variables
}