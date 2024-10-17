import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {




    public static void main(String[] args) {

        List<String> dna = new ArrayList<>(List.of("ACGTA", "CGTAC", "CTGAC", "TAGCC", "AAACC"));
        int n = dna.size();
        char[][] matrizDna = new char[n][n];

        //Chequea si la matriz es cuadrada
        for(int i = 0; i < dna.size(); i++){
            if (dna.get(i).length() != dna.size()) {
                System.out.println("La matriz no es cuadrada!");
                break;
            }else {
                System.out.println("Fila " + (i+1) + " chequeada exitosamente");
            }
        }

        //Llena la matriz con el array de Strings
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                matrizDna[f][c] = dna.get(f).charAt(c);
            }
        }

        //Imprime la matriz
        for (char[] fila : matrizDna) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        //Chequear el adn por filas

        for (int i = 0; i < matrizDna.length; i++) {
            int contador = 1;
            //La cuenta empieza desde n+1, es decir desde el elemento 0 1
            for (int j = 1; j < matrizDna.length; j++) {
                //Compara el elemento n con su anterior n-1
                if (matrizDna[i][j] == matrizDna[i][j - 1]) {
                    contador++;
                    if (contador >= 4) {
                        System.out.println("Secuencia encontrada en la fila " + (i + 1) + ": " + matrizDna[i][j]);
                        System.out.println("Es mutante");
                        break;
                    }
                } else {
                    contador = 1;
                }
            }
        }

        //Chequear el adn por columnas

        for (int i = 0; i < matrizDna.length; i++) {
            int contador = 1;
            //La cuenta empieza desde n+1, es decir desde el elemento 0 1
            for (int j = 1; j < matrizDna.length; j++) {
                //Compara el elemento n con su anterior n-1
                if (matrizDna[j][i] == matrizDna[j-1][i]) {
                    contador++;
                    if (contador >= 4) {
                        System.out.println("Secuencia encontrada en la columna " + (j + 1) + ": " + matrizDna[j][i]);
                        System.out.println("Es mutante");
                        break;
                    }
                } else {
                    contador = 1;
                }
            }
        }





    }
}