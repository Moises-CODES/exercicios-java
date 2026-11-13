//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCondicionais {
    public static void main(String[] args) {

        System.out.println("Sistema de classificação de estoque!");
int quantidadeEstoque = 20;


    System.out.println("Quantos produtos deseja?\n " + quantidadeEstoque );

if (quantidadeEstoque ==0) {
    System.out.println("ESTOQUE ZERADO");


       }


else if(quantidadeEstoque >=1 && quantidadeEstoque<=5){
    System.out.println("ESTOQUE CRÍTICO");
}
else if (quantidadeEstoque >=6 && quantidadeEstoque <=15){
    System.out.println ("ESTOQUE BAIXO");
        }
else {
    System.out.println ("ESTOQUE NORMAL");
}

        }
    }