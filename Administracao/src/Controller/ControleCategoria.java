package Controller;

import Model.ModeloCategoria;
import Model.ModeloEstudos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleCategoria {
    Conexao conbanco = new Conexao();
    public void inserir(ModeloCategoria obj){
        conbanco.conexao();
        try {
            
            String sql = "Insert into categoria_gasto (nome) values(?)";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            
            pst.execute();
             JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro no comando inserir:"+ ex);
        }
        
    }
     public void inserirtipo(ModeloCategoria obj){
        conbanco.conexao();
        try {
            
            String sql = "Insert into tipo_gasto (nomet,fk_id_categoria) values(?,?)";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setString(1, obj.getNometipo());
            pst.setInt(2 , obj.getId_categoria());
            pst.execute();
             JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro no comando inserir:"+ ex);
        }
        
    }
}
