package fastFood;

public class Infantil extends Cardapio{
    private String brinde;

    public Infantil(String produto, int quantidade, double precoBase, String brinde) {
        super(produto, quantidade, precoBase);
        this.brinde = brinde;
    }

    @Override
    public double calcularPrecoVenda() {
        double valorBrinde = 5;
        double valorTotal = getQuantidade()*(getPrecoBase()+valorBrinde);
        return valorTotal;
    }

    @Override
    public void montar() {
        System.out.println(" Montando lanche infantil " + getProduto());
        System.out.println(" Adicionando brinquedo brinde "+ this.brinde);
    }
}
