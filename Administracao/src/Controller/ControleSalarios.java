
package Controller;

import Model.ModeloSalario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleSalarios {
     Conexao conbanco = new Conexao();
    public void inserir(ModeloSalario obj){
        conbanco.conexao();
        try {
            
            String sql = "Insert into salario (data,valor,nome,obs,id_estudo) values(?,?,?,?,?)";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setString(1, obj.getData());
            pst.setFloat(2, obj.getValor());
            pst.setString(3, obj.getNome());
            pst.setString(4, obj.getPq());
            pst.setInt(5, obj.getId_estudo());
            pst.execute();
             JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro no comando inserir:"+ ex);
        }
        
    }
     public void inserirsaldo(ModeloSalario obj){
        conbanco.conexao();
        try {
            
            String sql = "Insert into saldo_atual (valor,data) values(?,?)";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setFloat(1, obj.getSaldo());
            pst.setString(2, obj.getData());
            
            pst.execute();
            // JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro no comando inserirsaldo:"+ ex);
        }
        
    }
      public void inserirsaldo2(ModeloSalario obj){
        conbanco.conexao();
        try {
            
            String sql = "Insert into saldo_total (valor,data) values(?,?)";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setFloat(1, obj.getSaldo_total());
            pst.setString(2, obj.getData());
            
            pst.execute();
            // JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro no comando inserirsaldo:"+ ex);
        }
        
    }
    
    public void deletar(ModeloSalario obj){
        try {
            conbanco.conexao();
            
            String sql = "Delete from salario where id_salario=?";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setInt(1,obj.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no comando deletar:"+ ex);
        }
    }
}    
        
    
   /* public void alterar(ModeloSalario obj){
         conbanco.conexao();
        try {
            
            String sql = "UPDATE  salario set  data=?, valor=?, obs=?, nome=?, id_estudo=? where id_salario=?";
            PreparedStatement pst = conbanco.conn.prepareStatement(sql);
            pst.setString(1, obj.getData());
            pst.setFloat(2, obj.getValor());
            pst.setString(3, obj.getPq());
            pst.setString(4, obj.getNome());
            pst.setInt(5, obj.getId_estudo());
            pst.setInt(6, obj.getId());
            
            pst.execute();
             JOptionPane.showMessageDialog(null,"Alteração feita com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro no comando alterar:"+ ex);
        }
     
        
  }
}*/
