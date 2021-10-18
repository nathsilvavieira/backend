package fastFood;

public class Main {
    public static void main(String[] args) {
       Cardapio pedido= new Adulto("xtudo", 1,15.00);
        pedido.montar();
        System.out.println("Total lanche adulto R$ "+pedido.calcularPrecoVenda());
        pedido = new Infantil("Lanche feliz", 2, 10.00,"gatinho");
        pedido.montar();
        System.out.println("Total lanche infantil R$ "+pedido.calcularPrecoVenda());
        pedido = new Vegetariano("xsaladaveg", 3,10);
        pedido.montar();
        System.out.println("Total lanche vegetariano R$ "+pedido.calcularPrecoVenda());



    }

}
