package br.com.VIEW;

import br.com.DAO.ConexaoDAO;
import br.com.DAO.UsuarioDAO;
import br.com.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaUsuarios extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaUsuarios() {
        initComponents();
        conexao = ConexaoDAO.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtSenhaUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Usuários");
        setResizable(false);

        jLabel1.setText("ID");

        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_icon.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("Login");

        txtLoginUsuario.setText(" ");
        txtLoginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha");

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clean_icon.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Usuário");

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_icon.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_icon.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_icon.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeUsuario)
                            .addComponent(txtLoginUsuario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))
                            .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar)
                        .addComponent(btnDeletar)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // Método pesquisar

        // Captura de dados na tela Usuario
        String id_usuario = txtIDUsuario.getText();

        // Transferência de dados para UsuarioDTO
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setId_usuario(Integer.parseInt(id_usuario));

        // Criação do Objeto na Classe UsuarioDAO
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.pesquisar(objUsuarioDTO);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUsuarioActionPerformed

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void txtLoginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginUsuarioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Método apagarCampos
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.apagarCampos();

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

        if (txtIDUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo ID");
        } else if (txtNomeUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Nome");
        } else if (txtLoginUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Login");
        } else if (txtSenhaUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Preencha o campo Senha.");
        } else {

            // Captura de dados na tela Usuario
            int id_usuario = Integer.parseInt(txtIDUsuario.getText());
            String nome_usuario = txtNomeUsuario.getText();
            String login_usuario = txtLoginUsuario.getText();
            String senha_usuario = txtSenhaUsuario.getText();

            // Transferência de dados para UsuarioDTO
            UsuarioDTO objUsuarioDTO = new UsuarioDTO();
            objUsuarioDTO.setId_usuario(id_usuario);
            objUsuarioDTO.setNomeUsuario(nome_usuario);
            objUsuarioDTO.setLoginUsuario(login_usuario);
            objUsuarioDTO.setSenhaUsuario(senha_usuario);

            // Criação do objeto da classe UsuarioDAO
            UsuarioDAO objUsuarioDAO = new UsuarioDAO();
            objUsuarioDAO.inserirUsuario(objUsuarioDTO);

            objUsuarioDAO.apagarCampos();
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

// Captura de informações da tela
        String id_usuario = txtIDUsuario.getText();
        String nome_usuario = txtNomeUsuario.getText();
        String login_usuario = txtLoginUsuario.getText();
        String senha_usuario = txtSenhaUsuario.getText();

        //Transferência para classe UsuarioDTO
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setId_usuario(Integer.parseInt(id_usuario));
        objUsuarioDTO.setNomeUsuario(nome_usuario);
        objUsuarioDTO.setLoginUsuario(login_usuario);
        objUsuarioDTO.setSenhaUsuario(senha_usuario);

        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.editar(objUsuarioDTO);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String id_usuario = txtIDUsuario.getText();

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setId_usuario(Integer.parseInt(id_usuario));

        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.apagar(objUsuarioDTO);
        
    }//GEN-LAST:event_btnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JTextField txtIDUsuario;
    public static javax.swing.JTextField txtLoginUsuario;
    public static javax.swing.JTextField txtNomeUsuario;
    public static javax.swing.JTextField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}
