package codigo;

import java.util.List;

/** 
 * Classe básica para um Grafo simples
 */
public class Grafo {
    public final String nome;
    private List<Vertice> vertices;

    /**
     * Construtor. Cria um grafo vazio com capacidade para MAX_VERTICES
     */
    public Grafo(String nome){
        this.nome = nome;
        this.vertices = new List<Vertice>();
    }
    
    public List<Vertice> getVertice(){
        return this.vertices;
    }
    public void setVertice(List<Vertice> vertice){
        this.vertices = vertice;
    }



    public void carregar(String nomeArquivo){

    }

    public void salvar(String nomeArquivo){
        
    }
    /**
     * Adiciona, se possível, um vértice ao grafo. O vértice é auto-nomeado com o próximo id disponível.
     */
    public boolean addVertice(int id){
        Vertice novo = new Vertice(id);
        return this.vertices.add(id, novo);
    }

    /**
     * Adiciona uma aresta entre dois vértices do grafo. 
     * Não verifica se os vértices pertencem ao grafo.
     * @param origem Vértice de origem
     * @param destino Vértice de destino
     */
    public boolean addAresta(int origem, int destino){
        boolean adicionou = false;
        Vertice saida = this.existeVertice(origem);
        Vertice chegada = this.existeVertice(destino);
        if(saida!=null && chegada !=null){
            saida.addAresta(destino);
            chegada.addAresta(origem);
            adicionou = true;
        }
        
        return adicionou;

    }

    public boolean existeVertice(int idVertice){
        for(Vertice vertice : this.vertices){
            if(vertice.getId() == idVertice)
                return true;
        }
        return false;
    }

    public boolean existeAresta(int verticeA, int verticeB){
            for(int i = 0; i < this.vertices.size(); i++){
                if(this.vertices.get(i).getId() == verticeA){
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
     * @return TRUE para grafo completo, FALSE caso contrário
     */
    public boolean completo(){
        boolean resposta = true;
        
       return resposta;
    }
/**
 * Retornar o subgrafo enviado pelo
 * @param vertices
 * @return
  */
    public Grafo subGrafo(Lista<Vertice> vertices){
        Grafo subgrafo = new Grafo("Subgrafo de "+this.nome);
        

        return subgrafo;
    }
    
    public int tamanho(){
        return 0;
    }

    public int ordem(){
        return this.vertices.size();
    }

}


