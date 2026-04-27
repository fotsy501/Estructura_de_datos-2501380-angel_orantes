public interface ListaTarea<G> {

    void AgregarTarea(G tarea);

    G ObtenerTarea(int indice);

    int TamanioTarea();

    boolean EstaVacia();

    boolean Habilidades();

    void MostrarTareas();
    
    
}

