package codigo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Classe básica para um Grafo simples
 */
public class Grafo {
    public final String nome;
    protected List<Vertice> vertices;

    /**
     * Construtor. Cria um grafo vazio com capacidade para MAX_VERTICES
     */
    public Grafo(String nome) {
        this.nome = nome;
        this.vertices = new List<Vertice>();
    }

    public List<Vertice> getVertice() {
        return this.vertices;
    }

    public void setVertice(List<Vertice> vertice) {
        this.vertices = vertice;
    }
    
    public void carregar(String nomeArquivo) throws Exception {
        BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo));
        int ordem = Integer.parseInt(ler.readLine());
        String grafo = ler.readLine();
        this.nome = grafo;
        for (int i = 1; i <= ordem; i++) {
            this.addVertice(i);
        }

        int vetorA;
        int vetorB;
        String linha = null;
        String[] split = null;

        linha = ler.readLine();
        while(linha != null) {
            split = linha.split(";");
            vetorA = Integer.parseInt(split[0]);
            vetorB = Integer.parseInt(split[1]);

            Vertice vetorInicial = this.existeVertice(vetorA);
            Vertice vetorFinal = this.existeVertice(vetorB);
            
            if (vetorFinal.existeAresta(vetorInicial.getId()) == null && vetorInicial.existeAresta(vetorFinal.getId()) == null){
              vetorInicial.addAresta(vetorB);
            }

            linha = ler.readLine();
        }
        ler.close();
    }

    public void salvar(String nomeArquivo){

    }

    /**
     * Adiciona, se possível, um vértice ao grafo. O vértice é auto-nomeado com o
     * próximo id disponível.
     */
    public void addVertice(int id) {
        Vertice vertice = new Vertice(id);
        this.vertices.add(id, vertice);
    }

    /**
     * Adiciona uma aresta entre dois vértices do grafo.
     * Não verifica se os vértices pertencem ao grafo.
     * 
     * @param verticeA  Vértice de verticeA
     * @param verticeB Vértice de verticeB
     */
    public boolean addAresta(int verticeA, int verticeB) {
        boolean adicionou = false;
        Vertice saida = this.existeVertice(verticeA);
        Vertice chegada = this.existeVertice(verticeB);
        if (saida != null && chegada != null) {
            saida.addAresta(verticeB);
            chegada.addAresta(verticeA);
            adicionou = true;
        }
        return adicionou;
    }

    public Vertice existeVertice(int idVertice) {
        for (Vertice vertice : this.vertices) {
            if (vertice.getId() == idVertice)
                return vertice;
        }
        return null;
    }

    public boolean existeAresta(int verticeA, int verticeB) {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getId() == verticeA) {
                if (this.vertices.get(i).existeAresta(verticeB) == null)
                    return false;
                else
                    return true;

            }
        }
        return false;
    }

    /**
     * Verifica se este é um grafo completo.
     * 
     * @return TRUE para grafo completo, FALSE caso contrário
     */
    public boolean completo(){
        boolean resposta = true;

        return resposta;
    }

    /**
     * Retornar o subgrafo enviado pelo
     * 
     * @param vertices
     * @return
     */
    public Grafo subGrafo(Lista<Vertice> vertices){
        Grafo subgrafo = new Grafo("Subgrafo de " + this.nome);

        return subgrafo;
    }

    public int tamanho() {
        return 0;
    }

    public int ordem() {
        return this.vertices.size();
    }

}
