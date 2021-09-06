package pilha;
import java.util.Scanner;

public class TesteRainha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o tamanho do tabuleiro:\n-> ");
        int n = s.nextInt();
        Tab tab = new Tab(n);
        System.out.print("Digite a linha onde deve ser colocada a primeira rainha:\n-> ");
        int lin = s.nextInt();
        System.out.print("Digite a coluna onde deve ser colocada a primeira rainha:\n-> ");
        int col = s.nextInt();
        tab.Set(lin, col);
        s.close();
        System.out.println("O tabuleiro ficou:");
        tab.Print();
    }
}
