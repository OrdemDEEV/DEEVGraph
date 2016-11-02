/*
 Onde fica o nó dos vertices.
 */
package Funcoes;

public class NoVertice {

    private Vertice vertice;
    private NoVertice noProxVertice;
    private NoVertice noAntVertice;

    //consulta todos os valores dos vertices
    public void consultaVertices(NoVertice lista_de_vertices) {
        if (lista_de_vertices == null) {
            System.out.println("Não existem vertices");
        } else {
            NoVertice n = lista_de_vertices;
            while (n != null) {
                System.out.println("vertice: " + n.vertice);
                n = n.noProxVertice;
            }
        }
    }

    //Insere um no de Vertice no final da lista de Vertices
    public NoVertice insereVerticeNo(NoVertice lista_de_vertices, Vertice vertice) {
        NoVertice novo = criarNoVertice(vertice);

        if (lista_de_vertices == null) {
            lista_de_vertices = novo;
        } else {
            NoVertice ultimo = buscaUltimoNo(lista_de_vertices);
            novo.noAntVertice = ultimo;
            ultimo.noProxVertice = novo;
        }

        return lista_de_vertices;
    }

    //Busca o ultimo vertice
    public NoVertice buscaUltimoNo(NoVertice lista_de_vertices) {
        if (lista_de_vertices == null) {
            return null;
        }
        //buscando o ultimo elemento inserido na lista de vertices

        NoVertice n = lista_de_vertices;
        while (n.noProxVertice != null) {
            n = n.noProxVertice;
        }

        return n;
    }

    //Cria um nó com vertice
    public NoVertice criarNoVertice(Vertice vertice) {
        NoVertice novo = new NoVertice();
        novo.vertice = vertice;
        novo.noProxVertice = null;
        novo.noAntVertice = null;
        return novo;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setNoProxVertice(NoVertice noprox) {
        this.noProxVertice = noprox;
    }

    public NoVertice getNoProxVertice() {
        return noProxVertice;
    }

    public void setNoAntVertice(NoVertice noant) {
        this.noAntVertice = noant;
    }

    public NoVertice getNoAntVertice() {
        return noAntVertice;
    }

    public String getNomeVertice() {
        return vertice == null ? "erro aqui" : vertice.getNomeVertice();
    }
    


}
