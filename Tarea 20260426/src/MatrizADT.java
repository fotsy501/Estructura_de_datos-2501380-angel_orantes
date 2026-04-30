public interface MatrizADT <K> {
void agregar(int fila, int columna, K valor);
    K obtener(int fila, int columna); 
    void mostrar();
    void agregar1(int fila, int columna, K valor);
}
