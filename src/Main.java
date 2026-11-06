//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a loja DCastro Tec!");

//para armazenar o nome do produto

        String name = "Pc Gamer";

//para armazenar a quantidade de produtos
        int quantidadeEstoque = 0;


//para armazenar o valor do produto
        double valorProduto = 7800.00;

//para armazenar se o produto está disponível

       boolean estaDisponivel = true;
       if (estaDisponivel && quantidadeEstoque >0)
            {
            System.out.println("PRODUTO DISPONÍVEL");
        }
       else
        {
            System.out.println("PRODUTO INDISPONÍVEL");
        }
//para calcular o preço do produto
        double valorTotalEstoque = valorProduto * quantidadeEstoque;


        System.out.println("Produto pesquisado: " + name);
        System.out.println("TOTAL EM ESTOQUE: " + quantidadeEstoque);
        System.out.println("PREÇO: " + valorProduto);
        System.out.println("DISPONÍVEL: " + estaDisponivel);
        System.out.println("VALOR TOTAL EM ESTOQUE: " + valorTotalEstoque);

//Condição para dizer se a quantidade é baixa ou alta em estoque
        if (quantidadeEstoque == 0) {
            System.out.println("SEM ESTOQUE");
        } else if (quantidadeEstoque <= 5) {
            System.out.println("ULTIMAS PEÇAS");
        } else {
            System.out.println("ESTOQUE SUFICIENTE");
        }
    }
}