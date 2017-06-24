package Controller;

import Model.ModeloCategoria;
import Model.ModeloGastoEstudo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleGastosEtudo {
    Conexao conbanco = new Conexao();
    public void inserir(ModeloGastoEstudo obj){
        conbanco.conexao();
        try {
            
            String sql = "Insert into gastos_estudo (nome,valor_parcelas,nparcelas,valor_total) values(?,?,?,?)";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setFloat(2, obj.getValorparcela());
            pst.setInt(3, obj.getNparcelas());
            pst.setFloat(4, obj.getTot());
            pst.execute();
             JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro no comando inserir:"+ ex);
        }
        
    }
}
