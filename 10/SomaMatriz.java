import java.util.Scanner;

public class SomaMatriz {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a dimensão da sua matriz quadrada: ");
        int dimensao = in.nextInt();

        int posSimbolos = Math.ceilDiv(dimensao, 2);
        System.out.println(posSimbolos);

        int[][][] matriz = new int[3][dimensao][dimensao];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < dimensao; j++){
                for(int n = 0; n < dimensao; n++){
                    System.out.printf("Digite o valor da %dª coluna da %dª linha da matriz de número %d: ", n+1, j+1, i+1);
                    matriz[i][j][n] = in.nextInt();
                }
            }
        }

        for(int i = 0; i < dimensao; i++){
            for(int j = 0; j < dimensao; j++){
                matriz[2][i][j] = matriz[0][i][j] + matriz[1][i][j];
            }
        }

        for(int i = 0; i < dimensao; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                for(int n = 0; n < dimensao; n++){
                    System.out.print(matriz[j][i][n] + " ");
                }
                if(i == posSimbolos-1){
                    if(j == 0){
                        System.out.print(" +  ");
                    }else if(j == 1){
                        System.out.print(" =  ");
                    }
                }else{
                    System.out.print("    ");
                }
            }
        }

        in.close();
    }
}