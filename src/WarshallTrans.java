public class WarshallTrans {
    //Algoritmo de Warshall con cierre transitivo, recibe una matriz común y devuelve una matriz transitiva
    public int[][] AlgWarshallTrans(int[][] matriz) {
        //Se recorren lo elementos de la matriz
        for (int k = 0; k < matriz.length; k++) {
            //Se recorren las filas de la matriz
            for (int f = 0; f < matriz.length; f++) {
                //Se recorren las columnas de la matriz
                for (int c = 0; c < matriz.length; c++) {
                    //Entra a las validaciones
                    //Si la fila o la columna pertenecen a la fila u columna que se está evaluando se ignora
                    if (f == k || c == k) continue;
                    //Si dos elementos de la lista coinciden en tener ambos un valor de 1, entonces se coloca 1 en la intersección de estos
                    if (1 == matriz[k][f] && matriz[c][k] == 1) {
                        matriz[c][f] = 1;
                    }
                }
            }

        }
        //Se devuelve la matriz transitiva
        return matriz;
    }
    //Metodo para imprimir los datos de las matrices en consola
    public void ImprimirMatriz(int[][] matriz){
        for (int[] elementos : matriz) {
            System.out.print("[");
            for (int c = 0; c < matriz.length; c++) {
                if (c == matriz.length - 1) {
                    System.out.print(elementos[c]);
                } else {
                    System.out.print(elementos[c] + ",");
                }
            }
            System.out.println("]");
        }
    }
}
