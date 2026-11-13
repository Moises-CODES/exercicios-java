//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCondicionais {
    public static void main(String[] args) {
//EXERCÍCIO PRATICADO EM 12/11/2026
        System.out.println("Sistema de classificação de estoque!");
        //criando um nome virtual para iniciar o exercício

        int quantidadeEstoque = 20;
//aqui uma variável para declarar o total em estoque, podendo testar a mesma com vários valores diferentes

        System.out.println("Quantos produtos deseja?\n " + quantidadeEstoque );

        if (quantidadeEstoque ==0) {
            System.out.println("ESTOQUE ZERADO");
//com esta condição digitando 0, imprime "ESTOQUE ZERADO"

        }


        else if(quantidadeEstoque >=1 && quantidadeEstoque<=5){
            System.out.println("ESTOQUE CRÍTICO");
            //Nesta condição digitando entre 1 e 5, imprime "ESTOQUE CRÍTICO"
        }
        else if (quantidadeEstoque >=6 && quantidadeEstoque <=15){
            System.out.println ("ESTOQUE BAIXO");
            //Nesta próxima condição, digitando entre 6 e 15, imprime "ESTOQUE BAIXO"
        }
        else {
            System.out.println ("ESTOQUE NORMAL");
            //Nesta condição, acima dos valores acima citados imprime "ESTOQUE NORMAL"
        }

    }
}