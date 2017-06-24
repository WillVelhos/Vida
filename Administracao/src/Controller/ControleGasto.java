package Controller;

import Model.ModeloGasto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControleGasto {
    Conexao conBanco = new Conexao();
    public void inserir(ModeloGasto obj){
        try {
            conBanco.conexao();
            String sql = "INSERT into gasto (data,valor,id_categoria,id_tipo_categoria,obs) VALUES(?,?,?,?,?)";
            PreparedStatement pst = conBanco.conn.prepareStatement(sql);
            
            pst.setString( 1, obj.getData());
            pst.setFloat(2, obj.getValor());
            pst.setInt(3, obj.getId_categoria());
            pst.setInt(4, obj.getId_tipo());
            pst.setString(5, obj.getObs());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Gasto cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no metodo inserir:"+ex);
        }
    
    }
    public void inserirSaldo(ModeloGasto obj){
        try {
            conBanco.conexao();
            String sql = "INSERT into saldo_atual(valor,data) VALUES(?,?)";
            PreparedStatement pst = conBanco.conn.prepareStatement(sql);
            
            pst.setFloat( 1, obj.getSaldo());
            pst.setString(2, obj.getData());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no metodo inserir:"+ex);
        }
    
    }
    
}
