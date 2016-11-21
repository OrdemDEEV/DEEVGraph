/*
    Onde fica o nó das arestas.
 */
package Funcoes;

public class NoAresta {

    private Arestas aresta;
    private NoAresta noProxAresta;
    private NoAresta noAntAresta;

    //Insere um no de aresta no final da lista de arestas
    public NoAresta insereArestaNo(NoAresta lista_de_arestas, Arestas aresta) {
        NoAresta novo = criarNoAresta(aresta);

        if (lista_de_arestas == null) {
            lista_de_arestas = novo;
        } else {
            NoAresta ultimo = buscaUltimoNo(lista_de_arestas);
            novo.noAntAresta = ultimo;
            ultimo.noProxAresta = novo;
        }

        return lista_de_arestas;
    }
    //consulta todos os valores da aresta

    public void consultaArestas(NoAresta lista_de_arestas) {
        if (lista_de_arestas == null) {
            System.out.println("Não existem arestas");
        } else {
            NoAresta n = lista_de_arestas;
            while (n != null) {
                System.out.println("Aresta: " + n.aresta.getnomeAresta());
                n = n.noProxAresta;
            }
        }
    }

    //Busca a ultima aresta
    public NoAresta buscaUltimoNo(NoAresta lista_de_arestas) {
        if (lista_de_arestas == null) {
            return null;
        }
        //buscando o ultimo elemento inserido na lista de arestas

        NoAresta n = lista_de_arestas;
        while (n.noProxAresta != null) {
            n = n.noProxAresta;
        }

        return n;
    }

    //Cria um nó com aresta
    public NoAresta criarNoAresta(Arestas aresta) {
        NoAresta novo = new NoAresta();
        novo.aresta = aresta;
        novo.noProxAresta = null;
        novo.noAntAresta = null;
        return novo;
    }

    public void setAresta(Arestas aresta) {
        this.aresta = aresta;
    }

    public Arestas getAresta() {
        return aresta;
    }

    public void setNoProxAresta(NoAresta noprox) {
        this.noProxAresta = noprox;
    }

    public NoAresta getNoProxAresta() {
        return noProxAresta;
    }

    public void setNoAntAresta(NoAresta noant) {
        this.noAntAresta = noant;
    }

    public NoAresta getNoAntAresta() {
        return noAntAresta;
    }

    public String getNomeAresta() {
        return aresta == null ? "erro aqui" : aresta.getnomeAresta();
    }

    NoAresta encontrar_Aresta_Nome(String nomeAresta, NoAresta lista) {

        while (lista != null) {
            if (nomeAresta.equals(lista.getNomeAresta())) {
                break;
            }
            lista = lista.getNoProxAresta();
        }

        return lista;
    }
}
