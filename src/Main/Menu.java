/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Funcoes.GrafoNo;
import Funcoes.Vertice;
import Funcoes.Arestas;
import Funcoes.Arquivo;


public class Menu {
    
    Scanner scan = new Scanner(System.in);
    GrafoNo grafo = new GrafoNo();
    Arquivo arq = new Arquivo();
    //só para testar git recem instalado
    public int menu_Principal()
    {
        int op;
        String dados;
        
        System.out.println("----MENU PRINCIPAL-----");
        System.out.println("1-Inserir Dados do Grafo");
        System.out.println("2-Mostrar Lista de adjacencia");
        System.out.println("3-Mostrar Matriz adjacencia");
        System.out.println("4-Mostrar Matriz de Incidencia");
        System.out.println("5-DeletarGrafo");
        System.out.println("6-Exportar Grafo");
        System.out.println("7-Salvar Grafo");
        System.out.println("8-Carregar dados");
        System.out.println("9-Mostrar Vértices e Arestas");
        System.out.println("10-Verificar Conectividade");
        System.out.println("11-Verificar paralelo");
        System.out.println("12-Verificar laço");
        System.out.println("13-Verificar tipo de Grafo");
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
                grafo.imprimirListaAdj();
                break;
            case 3:
                grafo.imprimirMatrizAdj();
                break;
            case 4:
                grafo.imprimirMatrizInc();
                break;
            case 5:
               this.grafo = new GrafoNo();
                break;
            case 6: 
                arq.exportar_Grafo(grafo.retornarListaAdj(), grafo.retornarMatrizADJ(), grafo.retornarMatrizINC(), "Grafo/grafo");
                break;
            case 7:
                arq.salvar_dados(grafo.imprimirVertices(), grafo.imprimirArestas(), "Grafo/dados");
                break;
            case 8:
                //COMENTADO PARA FUNCIONAR NA INTERFACE E PRECISO PEGAR O CAMINHO E NOME DO ARQUIVO E PASSAR COMO PARAMETRO
                grafo = arq.carregar_dados("Grafo/dados.deev");
                break;
            case 9:
                grafo.imprimirArestas();
                System.out.println();
                grafo.imprimirVertices();
                break;
            case 10:
                verconexao();
                break;
            case 11:
                verparalelo();
                break;
            case 12:
                verlaco();
                break;
            case 13:
                System.out.println(grafo.verificaTipoGrafo());
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        
        return op;
    }
    
    public void verconexao()
    {
        int ver;
        ver = grafo.verificar_conectividade();
        
        if(ver == 0)
        {
            System.out.println("É desconexo");
        }
        else
        {
            System.out.println("É conexo");
        }
    }
    
    public void verparalelo()
    {
        int ver;
        ver = grafo.verificar_paralelo();
        
        if(ver == 1)
        {
            System.out.println("Tem aresta paralela");
        }
        else
        {
            System.out.println("não tem aresta paralela");
        }
    }
    
    public void verlaco()
    {
        int ver;
        ver = grafo.verifica_laco();
        
        if(ver == 1)
        {
            System.out.println("tem laço");
        }
        else
        {
            System.out.println("não tem laço");
        }
        
    }
    
    public void inserir_dados_do_grafo()
    {
       //TESTE PARA INSERIR NO GRAFO PARA MATRIZES
       Vertice v;
       Arestas a;
       
       v = grafo.addVertice("Vertice s0");   
       grafo.setVertice_na_ListaVertice(v);
       
       v = grafo.addVertice("Vertice s1");
       grafo.setVertice_na_ListaVertice(v);
       
       v = grafo.addVertice("Vertice s2");
       grafo.setVertice_na_ListaVertice(v);
       
       v = grafo.addVertice("Vertice s3");
       grafo.setVertice_na_ListaVertice(v);
       
       v = grafo.addVertice("Vertice s4");
       grafo.setVertice_na_ListaVertice(v);
       
       
       String ver1 = grafo.imprimirVertices();
       
       a = grafo.addAresta("aresta t0", grafo.encontrar_Vertice_Nome("Vertice s0"), grafo.encontrar_Vertice_Nome("Vertice s1"));
       grafo.setAresta_na_ListaAresta(a);
       
       a = grafo.addAresta("aresta t1", grafo.encontrar_Vertice_Nome("Vertice s1"), grafo.encontrar_Vertice_Nome("Vertice s2"));
       grafo.setAresta_na_ListaAresta(a);
       
       a = grafo.addAresta("aresta t2", grafo.encontrar_Vertice_Nome("Vertice s2"), grafo.encontrar_Vertice_Nome("Vertice s0"));
       grafo.setAresta_na_ListaAresta(a);
       
       a = grafo.addAresta("aresta t3", grafo.encontrar_Vertice_Nome("Vertice s1"), grafo.encontrar_Vertice_Nome("Vertice s3"));
       grafo.setAresta_na_ListaAresta(a);
       
       a = grafo.addAresta("aresta t3", grafo.encontrar_Vertice_Nome("Vertice s2"), grafo.encontrar_Vertice_Nome("Vertice s0"));
       grafo.setAresta_na_ListaAresta(a);
       
       a = grafo.addAresta("aresta t4", grafo.encontrar_Vertice_Nome("Vertice s2"), grafo.encontrar_Vertice_Nome("Vertice s2"));
       grafo.setAresta_na_ListaAresta(a);
       
       String ver2 = grafo.imprimirArestas(); 
       
        System.out.println("\n\n\n\n AGORA VAMOS IMPRIMIR AS VAREAVEIS");
        System.out.println("");
       

        System.out.println(ver1 + "\n" + ver2);
}
}