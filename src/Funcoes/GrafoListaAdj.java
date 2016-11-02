/*
    Armazena o grafo de forma de lista adjacente
 */
package Funcoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emerson
 */
public class GrafoListaAdj extends Vertice {
    List<Vertice> vertices;
    List<Arestas> arestas;

    public GrafoListaAdj() {
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Arestas>();
    }

    public Vertice addVertice(String nome) { //Adicona vertice e retorna para uma variavel vertice
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    public Arestas addAresta(String nome, Vertice origem, Vertice destino) { //Adiciona aresta e retorna para uma variavel aresta
        Arestas e = new Arestas(nome, origem, destino);
        //origem.addAdj(e);
        arestas.add(e);
        return e;
    }
    
    public String toString() {
        String r = "";
        for (Vertice u : vertices) {
            r += u.getNomeVertice() + " -> ";
            for (Arestas e : u.adj) {
                Vertice v = e.getDestino();
                r += v.getNomeVertice() + ", ";
            }
            r += "\n";
        }
        return r;
    }
}
