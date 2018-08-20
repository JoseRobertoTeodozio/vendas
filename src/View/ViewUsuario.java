/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerUsuario;
import Model.ModelUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Roberto
 */
public class ViewUsuario extends javax.swing.JFrame {

    ControllerUsuario cUsuario = new ControllerUsuario();
    ModelUsuario mUsuario = new ModelUsuario();
    ArrayList<ModelUsuario> listaUsuario = new ArrayList<>();
    String salvarAlterar;

    /**
     * Creates new form ViewUsuario
     */
    public ViewUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        carregarUsuarios();
        habilitarDesabilitarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtLogin = new javax.swing.JTextField();
        jtSenha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableUsuario = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("USUARIOS");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("CÓDIGO");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("NOME");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("LOGIN");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("SENHA");

        jtCodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtableUsuario);

        jbCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagens 16X16/cancelar.png"))); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagens 16X16/delete2.png"))); // NOI18N
        jbExcluir.setText("EXCLUIR");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagens 16X16/edit2.png"))); // NOI18N
        jbAlterar.setText("ALTERAR");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagens 16X16/novo2.png"))); // NOI18N
        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagens 16X16/save2.png"))); // NOI18N
        jbSalvar.setText("SALVAR");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(328, 328, 328))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAlterar, jbCancelar, jbExcluir, jbNovo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        try {
            mUsuario.setIdUsuario(Integer.parseInt(jtCodigo.getText()));
        } catch (NumberFormatException e) {
        }
        mUsuario.setNome(jtNome.getText());
        mUsuario.setLogin(jtLogin.getText());
        mUsuario.setSenha(jtSenha.getText());

        if (salvarAlterar.equals("salvar")) {
            if (cUsuario.salvarUsuarioController(mUsuario) > 0) {
                JOptionPane.showMessageDialog(this, "Usuario salvo com sucesso!", " ATENÇÂO ", JOptionPane.WARNING_MESSAGE);
                carregarUsuarios();
                limparCamos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar usuario!", " ERRO ", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (cUsuario.atualizarUsuarioController(mUsuario)) {
                JOptionPane.showMessageDialog(this, "Usuario atualizado com sucesso!", " ATENÇÂO ", JOptionPane.WARNING_MESSAGE);
                carregarUsuarios();
                limparCamos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar usuario!", " ERRO ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jtableUsuario.getSelectedRow();
        try {
            int codigoUsuario = (int) jtableUsuario.getValueAt(linha, 0);
            if (cUsuario.excluirUsuarioController(codigoUsuario)) {
                JOptionPane.showMessageDialog(this, "Usuário excluido com sucesso!", " ATENÇÂO ", JOptionPane.WARNING_MESSAGE);
                this.carregarUsuarios();

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir usuário!", " ERRO ", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenum regisro selecionado.", " ERRO ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        habilitarDesabilitarCampos(true);
        int linha = jtableUsuario.getSelectedRow();
        try {
            int codigo = (int) jtableUsuario.getValueAt(linha, 0);

            mUsuario = cUsuario.getUsuarioController(codigo);
            jtCodigo.setText(String.valueOf(mUsuario.getIdUsuario()));
            jtLogin.setText(mUsuario.getLogin());
            jtNome.setText(mUsuario.getNome());
            jtSenha.setText(mUsuario.getSenha());

            salvarAlterar = "alterar";
        } catch (Exception e) {
            habilitarDesabilitarCampos(false);
            JOptionPane.showMessageDialog(this, "Código inválido ou nenum regisro selecionado.", " ERRO ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        limparCamos();
        habilitarDesabilitarCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        salvarAlterar = "salvar";
        habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_jbNovoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    /**
     * Carregar usuários na tabela
     */
    private void carregarUsuarios() {
        listaUsuario = cUsuario.getListaUsuarioController();
        DefaultTableModel modelo = (DefaultTableModel) jtableUsuario.getModel();
        modelo.setNumRows(0);

        int cont = listaUsuario.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaUsuario.get(i).getIdUsuario(),
                listaUsuario.get(i).getNome(),
                listaUsuario.get(i).getLogin(),
                listaUsuario.get(i).getSenha()
            });
        }
    }

    // limpar formulario usuário
    private void limparCamos() {
        jtCodigo.setText("");
        jtNome.setText("");
        jtLogin.setText("");
        jtSenha.setText("");
    }

    // método para habilitar ou desabilitar campos e botões do formulário
    private void habilitarDesabilitarCampos(boolean cond) {
        jtCodigo.setEnabled(cond);
        jtNome.setEnabled(cond);
        jtLogin.setEnabled(cond);
        jtSenha.setEnabled(cond);
        jbSalvar.setEnabled(cond);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtLogin;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtSenha;
    private javax.swing.JTable jtableUsuario;
    // End of variables declaration//GEN-END:variables
}