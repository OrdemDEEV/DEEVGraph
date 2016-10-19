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
        
        System.out.println("----MENU PRINCIPAL-----");
        System.out.println("1-Inserir Dados do Grafo");
        System.out.println("2-Listar o Grafo adjacente");
        System.out.println("0-Finalizar o programa");
                                    
        op = scan.nextInt();
        
        switch(op)
        {
            case 0:
                System.out.println("Saindo do Menu Principal");
                break;
            case 1:
                inserir_dados_do_grafo();
                break;
            case 2:
                System.out.println(grafo);
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        
        return op;
    }
    
    public void inserir_dados_do_grafo()
    {
        //TESTE PARA INSERIR GRAFOS
       Vertice v[] = new Vertice[8];
       Arestas a[] = new Arestas[4];
       Vertice matrizAdjacencia[][] = new Vertice[8][8];
       int j = 0, i = 0;
       
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
       
      for(i = 0; i < 8; i++)
      {
          
          for (j = 1; j < 8;j++)
          {
              System.out.print("i");
              
          }
          System.out.println("i");
      }
      
        System.out.println();
}
}