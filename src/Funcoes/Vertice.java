
package Funcoes;

import java.util.List;
import java.util.ArrayList;

public class Vertice{ 
        
        private String nomeVertice;
        List<Arestas> adj;
        
       public Vertice(){}
        
        Vertice(String nome) {
            this.nomeVertice = nome;
            this.adj = new ArrayList<Arestas>();
        }
        

        
        void setVerticeNome(String nome)
        {
            this.nomeVertice = nome;
        }

        void addAdj(Arestas e) {
            adj.add(e);
        }
        
        public String getNomeVertice()
        {
            return nomeVertice;
        };
        
        public void setVertice(String nome, int id)
        {
            this.nomeVertice = nome;
            this.adj = new ArrayList<Arestas>();
        }
        

      
    
}
