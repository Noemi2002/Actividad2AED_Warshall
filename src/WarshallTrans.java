public class WarshallTrans {
    public int[][] AlgWarshallTrans(int[][] matriz) {

        for (int k = 0; k < matriz.length; k++) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (i == k || j == k) continue;
                    if (1 == matriz[k][i] && matriz[j][k] == 1) {
                        matriz[i][j] = 1;
                    }
                }
            }

        }
        return matriz;
    }
    public void ImprimirMatriz(int[][] matriz){
        for (int[] elementos : matriz) {
            System.out.print("[");
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(elementos[c] + ",");
            }
            System.out.println("]");
        }
    }
}
