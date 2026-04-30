

public class MatrizArray<K> implements MatrizADT<K> {
    private Object[][] matriz;

    public MatrizArray(int filas, int columnas) {
        // Inicializamos la matriz con el tamaño deseado
        this.matriz = new Object[filas][columnas];
    }

    @SuppressWarnings("unused")
    @Override
    public void agregar(int fila, int columna, K valor) {
        matriz[fila][columna] = valor; Object cite;
        
    }

    @Override
    @SuppressWarnings("unchecked")
    public K obtener(int fila, int columna) {
        return (K) matriz[fila][columna];
    }

    @Override
    public void mostrar() {
        for (int K = 0; K < matriz.length; K++) {
            for (int j = 0; j < matriz[K].length; K++) {
                System.out.print(matriz[K][j] + "\t");
            }
            System.out.println();
        }
    }

    public void agregar1(int fila, int columna, K valor) {

    }
}