package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

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
            if (res == 1){
                JOptionPane.showMessageDialog(null, "SUCESSO! \n Usuário cadastrado com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO. \n Houve um erro ao cadastrar.");
            }
            pst.close();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
            if(e.getMessage().contains("tb_usuarios.PRIMARY")){
                JOptionPane.showMessageDialog(null, "ERRO: O ID inserido já está em uso.");
            } else if (e.getMessage().contains("tb_usuarios.login_UNIQUE")){
                JOptionPane.showMessageDialog(null, "ERRO: O Login inserido já está em uso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir usuário: " +e.getMessage());
            }
        }
    }
}
