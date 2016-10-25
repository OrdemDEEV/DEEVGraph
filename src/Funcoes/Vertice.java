
package Funcoes;

import java.util.List;
import java.util.ArrayList;

public class Vertice{ 
        private int id;
        private String nomeVertice;
        List<Arestas> adj;
        
       public Vertice(){}
        
        Vertice(String nome, int id) {
            this.nomeVertice = nome;
            this.id = id;
            this.adj = new ArrayList<Arestas>();
        }
        
        void setVerdiceID(int id)
        {
            this.id = id;
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
            this.id = id;
            this.adj = new ArrayList<Arestas>();
        }
        
        public int getVerticeId()
        {
            return id;
        }
      
    
}
