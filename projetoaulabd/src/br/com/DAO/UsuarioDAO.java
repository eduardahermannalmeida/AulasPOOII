package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import br.com.VIEW.TelaLogin;
import br.com.VIEW.TelaPrincipal;
import br.com.VIEW.TelaUsuarios;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    // Classe onde vão ficar todos os métodos relacionados a consultas no banco.

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    // Inserir Usuário
    public void inserirUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "insert into tb_usuarios(id_usuario, nome, login, senha) values(?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());
            pst.setString(2, objUsuarioDTO.getNomeUsuario());
            pst.setString(3, objUsuarioDTO.getLoginUsuario());
            pst.setString(4, objUsuarioDTO.getSenhaUsuario());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO! \n Usuário cadastrado com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO. \n Houve um erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Inserir Usuario" + e);
            System.out.println(e.getMessage());
            if (e.getMessage().contains("tb_usuarios.PRIMARY")) {
                JOptionPane.showMessageDialog(null, "ERRO: O ID inserido já está em uso.");
            } else if (e.getMessage().contains("tb_usuarios.login_UNIQUE")) {
                JOptionPane.showMessageDialog(null, "ERRO: O Login inserido já está em uso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir usuário: " + e.getMessage());
            }
        }
    }

    // Logar Usuário
    public void logar(UsuarioDTO ojtUsuarioDTO) {
        String sql = "select * from tb_usuarios where login = ? and senha = ?";
        conexao = new ConexaoDAO().conector();
        try {
            // Preparar a consulta no banco, em função ao que foi inserido nas caixas de texto
            pst = conexao.prepareStatement(sql);
            //pst.setString(1, txtUsuario.getText());
            //pst.setString(2, txtSenha.getText());
            pst.setString(1, ojtUsuarioDTO.getLoginUsuario());
            pst.setString(2, ojtUsuarioDTO.getSenhaUsuario());

            // executa a query
            rs = pst.executeQuery();

            // verifica se existe usuário
            if (rs.next()) {
                TelaPrincipal tPrincipal = new TelaPrincipal();
                tPrincipal.setVisible(true);
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Metódo Login: " + e);
        }
    }

    public void pesquisar(UsuarioDTO objUsuarioDTO) {
        String sql = "select * from tb_usuarios where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());
            rs = pst.executeQuery();
            if (rs.next()) {
                TelaUsuarios.txtNomeUsuario.setText(rs.getString(2));
                TelaUsuarios.txtLoginUsuario.setText(rs.getString(3));
                TelaUsuarios.txtSenhaUsuario.setText(rs.getString(4));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
                apagarCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }

    }

    public void editar(UsuarioDTO objUsuarioDTO) {
        String sql = "update tb_usuarios set nome = ?, login = ?, senha = ? where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(4, objUsuarioDTO.getId_usuario());
            pst.setString(1, objUsuarioDTO.getNomeUsuario());
            pst.setString(2, objUsuarioDTO.getLoginUsuario());
            pst.setString(3, objUsuarioDTO.getSenhaUsuario());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Usuário Editado com Sucesso!");
                apagarCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método editar" + e);
        }
    }

    // Apagar
    public void apagar(UsuarioDTO objUsuarioDTO) {
        String sql = "delete from tb_usuarios where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getId_usuario());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Usuário apagado com Sucesso!");
                apagarCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Metódo Apagar " + e);
        }
    }
    // Apagar Campos

    public void apagarCampos() {

        TelaUsuarios.txtIDUsuario.setText(null);
        TelaUsuarios.txtNomeUsuario.setText(null);
        TelaUsuarios.txtLoginUsuario.setText(null);
        TelaUsuarios.txtSenhaUsuario.setText(null);

    }

}
