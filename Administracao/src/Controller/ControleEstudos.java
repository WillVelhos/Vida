package Controller;

import Model.ModeloEstudos;
import Model.ModeloSalario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleEstudos {
    Conexao conbanco = new Conexao();
    public void inserir(ModeloEstudos obj){
        conbanco.conexao();
        try {
            
            String sql = "Insert into estudo (nome) values(?)";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            
            pst.execute();
             JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro no comando inserir:"+ ex);
        }
        
    }
    
}
