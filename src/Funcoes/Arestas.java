/*
 * Struct da aresta, define as caracteristicas da aresta
 */
package Funcoes;


public class Arestas extends Vertice {
       
       private String nomeAresta;
       private Vertice origem;
       private Vertice destino;
        
        public Arestas(){}
        
        Arestas (String nome, Vertice origem, Vertice destino)
        {
            this.nomeAresta = nome;
            this.origem = origem;
            this.destino = destino;
        }
 
        public Vertice getOrigem()
        {
            return origem;
        }

        public Vertice getDestino()
        {
            return destino;
        }
        
        public String getnomeAresta()
        {
            return nomeAresta;
        }
        
        
}
