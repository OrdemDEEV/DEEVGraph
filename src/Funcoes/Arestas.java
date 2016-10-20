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
                if(a[i].getOrigem(a[i]) == origem && a[i].getDestino(a[i]) == destino)
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
      
 
        public Vertice getOrigem(Arestas a)
        {
            return origem;
        }

        public Vertice getDestino(Arestas a)
        {
            return destino;
        }
}
