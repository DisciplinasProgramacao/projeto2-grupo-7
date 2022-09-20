package codigo;

public class VerticeNew {
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestaEntrada;
    private ArrayList<Aresta<TIPO>> arestaSaida;

    public VerticeNew(TIPO valor){
        this.dado = valor;
        this.arestaEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestaSaida = new ArrayList<Aresta<TIPO>>();
    }
    public TIPO getDado(){
        return dado;
    }
    public void adicionar_aresta_entrada(Aresta<TIPO> aresta){
        this.arestaEntrada.add(aresta); 
    }
    public void adicionar_aresta_saida(Aresta<TIPO> aresta){
        this.arestaSaida.add(aresta); 
    }
}
