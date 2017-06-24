
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    
    public Statement stm;//Responsável por realizar pesquisas no banco de dados
    public ResultSet rs;//Responsável por armazenar o resultado da pesquisa passado pelo Statement
    private String driver = "com.mysql.jdbc.Driver";//Responsalvel por indentificar o servidor do banco de dados
    private String caminho = "jdbc:mysql://127.0.0.1:3306/vida";//responsavel por setar o local do banco de dados
    private String usuario = "root";
    private String senha = "";
    public  Connection conn;//responsavel por conectar o banco
    
    
    
    public void conexao(){// método responsavel por realizar a conexão com o banco
        try{//tentativa inicial
        System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexão
        conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexão com o banco de dados
           // JOptionPane.showMessageDialog(null,"Conectado com sucesso!");
        }catch(SQLException ex){//excessão
            JOptionPane.showMessageDialog(null,"Erro de conexão!\n Erro:" + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            int rs = stm.executeUpdate(sql); 
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null,"Erro de executa!\n Erro:" + ex.getMessage());
        }
            
        
    }
    public void executarpesquisa(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql); 
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null,"Erro de executa!\n Erro:" + ex.getMessage());
        }
            
        
    }
    
    public void desconecta(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null,"desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na desconexão ao banco!\n Erro:" + ex.getMessage());
        }
    }
    
   
        
}
