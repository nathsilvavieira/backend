package fastFood;

public class Vegetariano extends Cardapio{

    public Vegetariano(String produto, int quantidade, double precoBase) {
        super(produto, quantidade, precoBase);
    }

    @Override
    public double calcularPrecoVenda() {
        double valorExtra = getPrecoBase()*0.01;
        double valorTotal = getQuantidade()*(getPrecoBase()+valorExtra);
        return valorTotal;

    }

    @Override
    public void montar() {
        System.out.println(" Montando lanche Vegetariano "+ getProduto()+" com embalagem especial e molho." );

    }

}
