/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Funcoes.Grafo; //IMPORTA A FUNÇÃO GRAFO DE OUTRO PACOTE
import Funcoes.Vertice;
import Funcoes.Arestas;

public class Menu {
    
    Scanner scan = new Scanner(System.in);
    Grafo grafo = new Grafo();
    
    
    public int menu_Principal()
    {
        int op;
        System.out.println("Defina Quantos Vértices usará ");
        System.out.println("Defina Quantas Arestas usará");
        System.out.println("Para testes usarei 8 para o tamanho de Vértices e 4 para arestas");
        
        int tamVertice = 8;
        int tamArestas = 4;
        
        Vertice v[] = new Vertice[tamVertice];
        Arestas a[] = new Arestas[tamArestas];
        
        System.out.println("----MENU PRINCIPAL-----");
        System.out.println("1-Inserir Dados do Grafo");
        System.out.println("2-Listar Lista de adjacencia");
        System.out.println("3-Listar Matriz adjacencia");
        System.out.println("0-Finalizar o programa");
                                    
        op = scan.nextInt();
        
        switch(op)
        {
            case 0:
                System.out.println("Saindo do Menu Principal");
                break;
            case 1:
                inserir_dados_do_grafo(v,a);
                break;
            case 2:
                System.out.println(grafo);
                break;
            case 3:
                grafo.printarMatrizAdjacente(v, a, tamVertice);
            default:
                System.out.println("Opção Invalida");
                break;
        }
        
        return op;
    }
    
    public void inserir_dados_do_grafo(Vertice v[], Arestas a[])
    {
        //TESTE PARA INSERIR GRAFOS
       
       int j, i;
       
       v[0] = grafo.addVertice("vertice s");
       v[1] = grafo.addVertice("Vertice s1");
       v[2] = grafo.addVertice("vertive s2");
       v[3] = grafo.addVertice("vertice s3");
       v[4] = grafo.addVertice("vertice s4");
       v[5] = grafo.addVertice("Vertice s5");
       v[6] = grafo.addVertice("vertive s6");
       v[7] = grafo.addVertice("vertice s7");
       
      grafo.printarVertices(v);
       
       a[0] = grafo.addAresta("aresta t", v[0], v[1]);
       a[1] = grafo.addAresta("aresta t2", v[1], v[2]);
       a[2] = grafo.addAresta("aresta t3", v[2], v[0]);
       a[3] = grafo.addAresta("aresta 4", v[1], v[3]);
      
       /*para printar a Matriz de adjacencia é só seguir os passos abaixo
       
        System.out.println("Matriz de Adjacencia"); 
      for(i = 0; i < 8; i++)
      {
          
          for (j = 1; j < 7;j++) //Este for deve ir até o tamanho de vértices -1
          {
              System.out.print(" V[" + i + "][" + j + "] " + a[0].pegarMatrizAdj(a, v[i], v[j], 4));
              
          }
          System.out.println(" V[" + i + "][" + j + "] " + a[0].pegarMatrizAdj(a, v[i], v[j], 4));
      }
      
        System.out.println();
      */  
        System.out.println("Matriz de Incidencia");
        
        for(i = 0; i < 8; i++) //linhas representam os vertices
      {
          
          for (j = 1; j < 4;j++) //Colunas representam arestas
          {
              System.out.print(" A[" + i + "][" + j + "] ");
              
          }
          System.out.println(" A[" + i + "][" + j + "] ");
      }
        System.out.println();
}
}