public class Main {
    public static void main(String[] args) {
        WarshallTrans wart = new WarshallTrans();
        System.out.println("Se imprimira la lista antes de aplicarle el algoritmo");
        int[][] matriz = {{0,1,0,0},{1,0,1,0},{0,0,0,1},{0,0,0,0}};
        wart.ImprimirMatriz(matriz);

        int[][] matriztrans = wart.AlgWarshallTrans(matriz);
        System.out.println("Se imprimira la lista después de aplicarle el algoritmo");
        wart.ImprimirMatriz(matriztrans);
    }
}
