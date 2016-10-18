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
        
      

        
}
