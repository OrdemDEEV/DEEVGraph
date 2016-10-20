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
    private int tamVertice;
    private int tamArestas;
    private Vertice v[] = new Vertice[tamVertice];
    private Arestas a[] = new Arestas[tamArestas];
    
    public Menu(int tamVertice, int tamArestas)
    {
        System.out.println("Defina Quantos Vértices usará ");
        System.out.println("Defina Quantas Arestas usará");
        System.out.println("Para testes usarei 8 para o tamanho de Vértices e 4 para arestas");
        
        this.tamVertice = tamVertice;
        this.tamArestas = tamArestas;
        
    }
    
    public int menu_Principal()
    {
        int op;
        
        
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
                inserir_dados_do_grafo(/*v,a,*/ tamVertice, tamArestas);
                break;
            case 2:
                System.out.println(grafo);
                break;
            case 3:
                
                grafo.printarMatrizAdjacente(this.v, this.a, tamVertice);
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        
        return op;
    }
    
    public void inserir_dados_do_grafo(/*Vertice v[], Arestas a[],*/ int tamVertice, int tamArestas)
    {
        //TESTE PARA INSERIR GRAFOS
       Vertice vf[] = new Vertice[tamVertice];
       Arestas af[] = new Arestas[tamArestas];
        
       int j, i;
       
       vf[0] = grafo.addVertice("vertice s0");
       vf[1] = grafo.addVertice("Vertice s1");
       vf[2] = grafo.addVertice("vertive s2");
       vf[3] = grafo.addVertice("vertice s3");
       vf[4] = grafo.addVertice("vertice s4");
       vf[5] = grafo.addVertice("Vertice s5");
       vf[6] = grafo.addVertice("vertive s6");
       vf[7] = grafo.addVertice("vertice s7");
       
       this.v = vf;
       
       af[0] = grafo.addAresta("aresta t0", v[0], v[1]);
       af[1] = grafo.addAresta("aresta t2", v[1], v[2]);
       af[2] = grafo.addAresta("aresta t3", v[2], v[0]);
       af[3] = grafo.addAresta("aresta t4", v[1], v[3]);
      
       this.a = af;
       
       grafo.printarVertices(this.v);
       
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