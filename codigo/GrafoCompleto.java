public class GrafoCompleto extends Grafo {
    private int ordem;

    static GrafoCompleto grafo = new GrafoCompleto("grafo");
    
    public GrafoCompleto(String nome) {
        super(nome);
    }

    public GrafoCompleto(String nome, int ordem) {
        super(nome);
        this.ordem = ordem;

        Vertice[] arrVertices = new Vertice[this.ordem];

        for (int i = 0; i < arrVertices.length; i++) {
            arrVertices[i] = new Vertice(i);
            for (int j = 0; j < arrVertices.length; j++) {
                if (i == j)
                    continue;
                arrVertices[i].addAresta(j);
            }
        }

        for (Vertice vertice : arrVertices) {
            vertices.add(vertice.getId(), vertice);
        }

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
