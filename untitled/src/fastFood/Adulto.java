package fastFood;

public class Adulto extends Cardapio{

    public Adulto(String produto, int quantidade, double precoBase){
        super(produto, quantidade, precoBase);

    }

    @Override
    public double calcularPrecoVenda() {
        double valorTotal = getQuantidade()*getPrecoBase();
        return valorTotal;
    }

    @Override
    public void montar() {
        System.out.println(" Montando lanche adulto " + getProduto());
    }
}
