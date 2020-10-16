package br.laramara.ti.sismovimentacaoclient.telas;

import br.laramara.ti.sismovimentacaoclient.controladores.ControladorTelaLogin;
import javax.swing.JFrame;

public class TelaLogin extends javax.swing.JDialog {

    /** Creates new form TelaLogin */
    public TelaLogin(JFrame parent) {
        super(parent, true);
        initComponents();
        controlador = new ControladorTelaLogin(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaLogin = new javax.swing.JPanel();
        jpaAcesso = new javax.swing.JPanel();
        jlaUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jlaSenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jbuAcessar = new javax.swing.JButton();
        jbuFechar = new javax.swing.JButton();
        jpaLogo = new javax.swing.JPanel();
        jlaLogo = new javax.swing.JLabel();
        jtfLogo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(br.laramara.ti.sismovimentacaoclient.telas.SisMovimentacaoClient.class).getContext().getResourceMap(TelaLogin.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setForeground(resourceMap.getColor("Form.foreground")); // NOI18N
        setLocationByPlatform(true);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("Form"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpaLogin.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("jpaLogin.border.lineColor"))); // NOI18N
        jpaLogin.setName("jpaLogin"); // NOI18N
        jpaLogin.setLayout(null);

        jpaAcesso.setName("jpaAcesso"); // NOI18N
        jpaAcesso.setLayout(null);

        jlaUsuario.setText(resourceMap.getString("jlaUsuario.text")); // NOI18N
        jlaUsuario.setName("jlaUsuario"); // NOI18N
        jpaAcesso.add(jlaUsuario);
        jlaUsuario.setBounds(10, 40, 36, 14);
        jlaUsuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jlaUsuario.AccessibleContext.accessibleName")); // NOI18N
        jlaUsuario.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jlaUsuario.AccessibleContext.accessibleDescription")); // NOI18N

        jtfUsuario.setText(resourceMap.getString("jtfUsuario.text")); // NOI18N
        jtfUsuario.setToolTipText(resourceMap.getString("jtfUsuario.toolTipText")); // NOI18N
        jtfUsuario.setName("jtfUsuario"); // NOI18N
        jpaAcesso.add(jtfUsuario);
        jtfUsuario.setBounds(10, 60, 262, 20);
        jtfUsuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jtxtUsuario.AccessibleContext.accessibleName")); // NOI18N

        jlaSenha.setText(resourceMap.getString("jlaSenha.text")); // NOI18N
        jlaSenha.setName("jlaSenha"); // NOI18N
        jpaAcesso.add(jlaSenha);
        jlaSenha.setBounds(10, 90, 30, 14);
        jlaSenha.getAccessibleContext().setAccessibleName(resourceMap.getString("jlabSenha.AccessibleContext.accessibleName")); // NOI18N
        jlaSenha.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jlabSenha.AccessibleContext.accessibleDescription")); // NOI18N

        jpfSenha.setText(resourceMap.getString("jpfSenha.text")); // NOI18N
        jpfSenha.setToolTipText(resourceMap.getString("jpfSenha.toolTipText")); // NOI18N
        jpfSenha.setName("jpfSenha"); // NOI18N
        jpaAcesso.add(jpfSenha);
        jpfSenha.setBounds(10, 110, 262, 20);
        jpfSenha.getAccessibleContext().setAccessibleName(resourceMap.getString("jpassSenha.AccessibleContext.accessibleName")); // NOI18N
        jpfSenha.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jpassSenha.AccessibleContext.accessibleDescription")); // NOI18N

        jbuAcessar.setIcon(resourceMap.getIcon("jbuAcessar.icon")); // NOI18N
        jbuAcessar.setMnemonic('A');
        jbuAcessar.setText(resourceMap.getString("jbuAcessar.text")); // NOI18N
        jbuAcessar.setToolTipText(resourceMap.getString("jbuAcessar.toolTipText")); // NOI18N
        jbuAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuAcessar.setName("jbuAcessar"); // NOI18N
        jbuAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAcessarActionPerformed(evt);
            }
        });
        jpaAcesso.add(jbuAcessar);
        jbuAcessar.setBounds(11, 150, 130, 33);

        jbuFechar.setIcon(resourceMap.getIcon("jbuFechar.icon")); // NOI18N
        jbuFechar.setMnemonic('F');
        jbuFechar.setText(resourceMap.getString("jbuFechar.text")); // NOI18N
        jbuFechar.setToolTipText(resourceMap.getString("jbuFechar.toolTipText")); // NOI18N
        jbuFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuFechar.setName("jbuFechar"); // NOI18N
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });
        jpaAcesso.add(jbuFechar);
        jbuFechar.setBounds(150, 150, 120, 33);
        jbuFechar.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jbtnSair.AccessibleContext.accessibleDescription")); // NOI18N

        jpaLogin.add(jpaAcesso);
        jpaAcesso.setBounds(200, 30, 280, 200);

        jpaLogo.setName("jpaLogo"); // NOI18N
        jpaLogo.setLayout(null);

        jlaLogo.setIcon(resourceMap.getIcon("jlaLogo.icon")); // NOI18N
        jlaLogo.setText(resourceMap.getString("jlaLogo.text")); // NOI18N
        jlaLogo.setToolTipText(resourceMap.getString("jlaLogo.toolTipText")); // NOI18N
        jlaLogo.setName("jlaLogo"); // NOI18N
        jpaLogo.add(jlaLogo);
        jlaLogo.setBounds(0, 0, 182, 182);

        jtfLogo.setEditable(false);
        jtfLogo.setFont(resourceMap.getFont("jtfLogo.font")); // NOI18N
        jtfLogo.setForeground(resourceMap.getColor("jtfLogo.foreground")); // NOI18N
        jtfLogo.setText(resourceMap.getString("jtfLogo.text")); // NOI18N
        jtfLogo.setCaretColor(resourceMap.getColor("jtfLogo.caretColor")); // NOI18N
        jtfLogo.setDisabledTextColor(resourceMap.getColor("jtfLogo.disabledTextColor")); // NOI18N
        jtfLogo.setName("jtfLogo"); // NOI18N
        jpaLogo.add(jtfLogo);
        jtfLogo.setBounds(1, 183, 1, 1);

        jpaLogin.add(jpaLogo);
        jpaLogo.setBounds(10, 40, 182, 185);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName(resourceMap.getString("Form.AccessibleContext.accessibleName")); // NOI18N
        getAccessibleContext().setAccessibleDescription(resourceMap.getString("Form.AccessibleContext.accessibleDescription")); // NOI18N
        getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAcessarActionPerformed
        controlador.autenticarLogin(jtfUsuario.getText(), new String(jpfSenha.getPassword()), this);
    }//GEN-LAST:event_jbuAcessarActionPerformed

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuAcessar;
    private javax.swing.JButton jbuFechar;
    private javax.swing.JLabel jlaLogo;
    private javax.swing.JLabel jlaSenha;
    private javax.swing.JLabel jlaUsuario;
    private javax.swing.JPanel jpaAcesso;
    private javax.swing.JPanel jpaLogin;
    private javax.swing.JPanel jpaLogo;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfLogo;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

    private ControladorTelaLogin controlador;

}