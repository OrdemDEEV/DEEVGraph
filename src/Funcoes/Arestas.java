/*
 * Struct da aresta, define as caracteristicas da aresta
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
       
         public int pegarMatrizAdj(Arestas a[], Vertice origem, Vertice destino, int tamAresta)
        {
            int verificador = 0;
            
            for(int i = 0; i < tamAresta; i++)
            {
                if(a[0].origem.getNomeVertice().equals(origem.getNomeVertice())  && a[0].destino.getNomeVertice().equals(destino.getNomeVertice()))
                {
                    return 1;
                }
                
                if(a[0].origem.getNomeVertice().equals(destino.getNomeVertice())  && a[0].destino.getNomeVertice().equals(origem.getNomeVertice()))
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
      
 
        public Vertice getOrigem()
        {
            return origem;
        }

        public Vertice getDestino()
        {
            return destino;
        }
}
