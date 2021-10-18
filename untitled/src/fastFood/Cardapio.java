package fastFood;

public abstract class Cardapio {
    private String produto;
    private int quantidade;
    private double precoBase;

    public Cardapio(String produto, int quantidade, double precoBase) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoBase = precoBase;
    }

    public void preparaMenu(){
        calcularPrecoVenda();
        montar();

    }

    public abstract double calcularPrecoVenda();
    public abstract void montar();



    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
