import java.util.Scanner;

public class JogoDaVelha{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //BLOCO DE DECLARAÇÕES
        int L, C;
        L = 3; C = 3; //define o tamanho da matriz --> tamanho de linha e coluna

        int [][] velha = new int[L][C]; //matriz

        int x, y;//user informa posição de linha e coluna

        System.out.println("Informe linha(0, 1 e 2): ");
        x = teclado.nextInt();
        System.out.println("Informe coluna(0, 1 e 2): ");
        y = teclado.nextInt();

        velha[x][y] = 9;

        imprimeVelha(velha);

        teclado.close();
    }

    public static void imprimeVelha(int [][] velhinha){//Função que imprime a velha
        int l,c;

        for(l = 0; l < 3; l++){
            System.out.print("\n");
            for(c = 0;c < 3; c++){
                System.out.print(velhinha[l][c]);

            }
        }
    }
}