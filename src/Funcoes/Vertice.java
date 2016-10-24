
package Funcoes;

import java.util.List;
import java.util.ArrayList;

public class Vertice{ 
        int id;
        String nomeVertice;
        List<Arestas> adj;
        
       public Vertice(){}
        
        Vertice(String nome, int id) {
            this.nomeVertice = nome;
            this.id = id;
            this.adj = new ArrayList<Arestas>();
        }


        void addAdj(Arestas e) {
            adj.add(e);
        }
        
        public String getNomeVertice(Vertice v)
        {
            return nomeVertice;
        };
        
        public void setVertice(String nome, int id)
        {
            this.nomeVertice = nome;
            this.id = id;
            this.adj = new ArrayList<Arestas>();
        }
      
    
}
