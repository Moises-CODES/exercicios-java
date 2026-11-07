package lvl2_operadores;


public class MainOperadores {
    public static void main(String[] args) {
        double valorProduto = 7800.00;
        int quantidade = 5;
        double desconto = 0.10;

        double valorTotal = valorProduto * quantidade;
        double valorDesconto = valorTotal * desconto;
        double valorComDesconto = valorTotal - valorDesconto;

        System.out.println("O valor total dos produtos é R$: " + valorTotal);
        System.out.println("O valor do desconto é R$: " + valorDesconto);
        System.out.println("O valor com desconto é R$: " + valorComDesconto);
    }
}
