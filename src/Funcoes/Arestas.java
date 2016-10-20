/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;


public class Arestas extends Vertice {
        String nomeAresta;
        Vertice origem;
        Vertice destino;
        
        Arestas(){}
        
        Arestas (String nome, Vertice origem, Vertice destino)
        {
            this.nomeAresta = nome;
            this.origem = origem;
            this.destino = destino;
        }

       
        public int pegarMatrizAdj(Arestas a[], Vertice origem, Vertice destino, int tamAresta)
        {
            int verificador = 0;
            
            for(int i = 0; i < tamAresta; i++)
            {
                if(getOrigem(a[i]) == origem && getDestino(a[i]) == destino)
                {
                    return 1;
                }
                else if(getOrigem(a[i]) == destino && getDestino(a[i]) == origem)
                {
                    return 1;
                }
                else
                {
                    
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
