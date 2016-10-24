/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Funcoes.GrafoListaAdj; //IMPORTA A FUNÇÃO GRAFO DE OUTRO PACOTE
import Funcoes.GrafoNo;
import Funcoes.Vertice;
import Funcoes.Arestas;


public class Menu {
    
    Scanner scan = new Scanner(System.in);
    GrafoListaAdj grafoadj = new GrafoListaAdj();
    GrafoNo grafo = new GrafoNo();
    
    public int menu_Principal()
    {
        int op;
        
        
        System.out.println("----MENU PRINCIPAL-----");
        System.out.println("1-Inserir Dados do Grafo");
        System.out.println("2-Mostrar Lista de adjacencia");
        System.out.println("3-Mostrar Matriz adjacencia");
        System.out.println("4-Mostrar Matriz de Incidencia");
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
                System.out.println(grafoadj);
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        
        return op;
    }
    
    public void inserir_dados_do_grafo()
    {
        
        //Não vamos precisar saber o valor,só criei um vetor aqui para saber 
        //TESTE PARA INSERIR NO GRAFO PARA LISTA DE ADJACENCIA
       Vertice vf[] = new Vertice[5];
       Arestas af[] = new Arestas[4];
        
       int j, i;
       
       vf[0] = grafoadj.addVertice("vertice s0", 0);
       vf[1] = grafoadj.addVertice("Vertice s1", 1);
       vf[2] = grafoadj.addVertice("vertive s2", 2);
       vf[3] = grafoadj.addVertice("vertice s3", 3);
       vf[4] = grafoadj.addVertice("vertice s4", 4);
      /*  vf[5] = grafoadj.addVertice("Vertice s5", 5);
       vf[6] = grafoadj.addVertice("vertive s6", 6);
       vf[7] = grafoadj.addVertice("vertice s7", 7);
       */
      
       
       af[0] = grafoadj.addAresta("aresta t0", vf[0], vf[1], 0);
       af[1] = grafoadj.addAresta("aresta t2", vf[1], vf[2], 1);
       af[2] = grafoadj.addAresta("aresta t3", vf[2], vf[0], 2);
       af[3] = grafoadj.addAresta("aresta t4", vf[1], vf[3], 3);
      
       
       /*
        O que da de fazer nessa parte na interdace grafica, e quando adicionar um grafo e uma aresta da de fazer o seguinte
       grafoadj.addAresta("aresta t0", grafoadj.addVertice("vertice s0"), grafoadj.addVertice("Vertice s1"));
       Sendo adiconando uma aresta, pega o nome da aresta, depois ja cria o vertice que eles se conectam junto com a aresta.
       
       É um sugestão interessante
       */
       
       //TESTE PARA INSERIR NO GRAFO PARA MATRIZES
       Vertice v = new Vertice();
       Arestas a = new Arestas();
       
       v = grafo.addVertice("vertice s0", 0);   
       grafo.setVertice_na_ListaVertice(v);
       
       v = grafo.addVertice("Vertice s1", 1);
       grafo.setVertice_na_ListaVertice(v);
       
       v = grafo.addVertice("Vertice s2", 2);
       grafo.setVertice_na_ListaVertice(v);
       
       v = grafo.addVertice("Vertice s3", 3);
       grafo.setVertice_na_ListaVertice(v);
       
       v = grafo.addVertice("Vertice s4", 4);
       grafo.setVertice_na_ListaVertice(v);
       
       a = grafo.addAresta("aresta t0", grafo.encontrar_Vertice_ID(0), grafo.encontrar_Vertice_ID(1), 0);
       grafo.setAresta_na_ListaAresta(a);
       
       a = grafo.addAresta("aresta t1", grafo.encontrar_Vertice_ID(1), grafo.encontrar_Vertice_ID(2), 1);
       grafo.setAresta_na_ListaAresta(a);
       
       a = grafo.addAresta("aresta t2", grafo.encontrar_Vertice_ID(2), grafo.encontrar_Vertice_ID(0), 2);
       grafo.setAresta_na_ListaAresta(a);
       
       a = grafo.addAresta("aresta t3", grafo.encontrar_Vertice_ID(1), grafo.encontrar_Vertice_ID(3), 3);
       grafo.setAresta_na_ListaAresta(a);
       
       

        System.out.println();
}
}