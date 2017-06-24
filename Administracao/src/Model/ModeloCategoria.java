package Model;

public class ModeloCategoria {
    
    private String nome;
    private int id;
    private int id_categoria;
    private String nometipo;

    public String getNometipo() {
        return nometipo;
    }

    public void setNometipo(String nometipo) {
        this.nometipo = nometipo;
    }
    
    

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
