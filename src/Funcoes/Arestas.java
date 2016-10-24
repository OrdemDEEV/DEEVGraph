/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;


public class Arestas extends Vertice {
        int id;
        String nomeAresta;
        Vertice origem;
        Vertice destino;
        
        public Arestas(){}
        
        Arestas (String nome, Vertice origem, Vertice destino, int id)
        {
            this.nomeAresta = nome;
            this.id = id;
            this.origem = origem;
            this.destino = destino;
        }
        
        public void setAresta(String nome, Vertice origem, Vertice destino, int id)
        {
            this.nomeAresta = nome;
            this.id = id;
            this.origem = origem;
            this.destino = destino;
        }

       
         public int pegarMatrizAdj(Arestas a[], Vertice origem, Vertice destino, int tamAresta)
        {
            int verificador = 0;
            
            for(int i = 0; i < tamAresta; i++)
            {
                if(a[0].origem.nomeVertice.equals(origem.nomeVertice)  && a[0].destino.nomeVertice.equals(destino.nomeVertice))
                {
                    return 1;
                }
                
                if(a[0].origem.nomeVertice.equals(destino.nomeVertice)  && a[0].destino.nomeVertice.equals(origem.nomeVertice))
                {
                    return 1;
                    
                }
        
            }
            
            if(verificador == 0)
            {
                return 0;
            }
            
            return 1;
            
        }
        
        public int pegarMatrizInc(Arestas a, Vertice v)
        {
           if(a.origem == v || a.destino == v)
           {
               return 1;
           }
            
            return 0;
        }
      
 
        public Vertice getOrigem(Arestas a)
        {
            return origem;
        }

        public Vertice getDestino(Arestas a)
        {
            return destino;
        }
}
