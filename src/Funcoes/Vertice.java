
package Funcoes;

import java.util.List;
import java.util.ArrayList;

public class Vertice {
        String nomeVertice;
        List<Arestas> adj;
        
        Vertice(){}
        
        Vertice(String nome) {
            this.nomeVertice = nome;
            this.adj = new ArrayList<Arestas>();
        }

        void addAdj(Arestas e) {
            adj.add(e);
        }
        
        public String getNomeVertice(Vertice v)
        {
            return nomeVertice;
        };
        
}
