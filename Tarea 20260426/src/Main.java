public class Main {
    public static void main(String[] args) {
        MatrizArray<Integer> LaMatriz = new MatrizArray<>(3, 3);

        LaMatriz.agregar(0, 0, 10);
        LaMatriz.agregar(0, 1, 20);
        LaMatriz.agregar(1, 1, 30);
        LaMatriz.agregar(2, 2, 40);

        System.out.println("Contenido de la matriz:");
        LaMatriz.mostrar();

        Integer valor = LaMatriz.obtener(1, 1);
        System.out.println("\nValor en la posición (1,1): " + valor);
    }
}