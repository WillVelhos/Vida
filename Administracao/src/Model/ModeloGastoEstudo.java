package Model;

public class ModeloGastoEstudo {
    private int id;
    private String nome;
    private float valorparcela;
    private int nparcelas;
    private float tot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorparcela() {
        return valorparcela;
    }

    public void setValorparcela(float valorparcela) {
        this.valorparcela = valorparcela;
    }

    public int getNparcelas() {
        return nparcelas;
    }

    public void setNparcelas(int nparcelas) {
        this.nparcelas = nparcelas;
    }

    public float getTot() {
        return tot;
    }

    public void setTot(float tot) {
        this.tot = tot;
    }
}
