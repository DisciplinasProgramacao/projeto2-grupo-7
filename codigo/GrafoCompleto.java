public class GrafoCompleto extends Grafo {
    private int ordem;

    static GrafoCompleto grafo = new GrafoCompleto("grafo");
    
    public GrafoCompleto(String nome) {
        super(nome);
    }

    public boolean completo() {
        return false;

    }

    public boolean euleriano() {
        return false;

    }

    public void subGrafo(ArrayList<Vertice> Vertices) {

    }

}
