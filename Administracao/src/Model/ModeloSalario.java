
package Model;

public class ModeloSalario {
    private int id;
    private String data;
    private float valor;
    private String nome;
    private String pq;
    private int id_estudo;
    private float saldo;
    private float saldo_total;

    public float getSaldo_total() {
        return saldo_total;
    }

    public void setSaldo_total(float saldo_total) {
        this.saldo_total = saldo_total;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    

    public int getId_estudo() {
        return id_estudo;
    }

    public void setId_estudo(int id_estudo) {
        this.id_estudo = id_estudo;
    }


    public String getPq() {
        return pq;
    }

    public void setPq(String pq) {
        this.pq = pq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
