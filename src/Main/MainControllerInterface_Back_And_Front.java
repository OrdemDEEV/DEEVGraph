/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*
*       -----IMPORTANT-------
*
*CLASSE QUE REALIZA A LINKAGEM DO BACK AND COM O FRONT, ENVIAMOS OS DADOS 
*DA INTERFACE GRAFICA PARA ESTA CLASSE E ELA CHAMA OS METODOS NECESSARIOS
*PARA REALIZAR AS IMPLEMENTAÇÕES
*
*
*       -----IMPORTANT-------
*/
package Main;

import Funcoes.Arestas;
import Funcoes.GrafoFormal;
import Funcoes.GrafoListaAdj;
import Funcoes.GrafoNo;
import Funcoes.Vertice;

/**
 *
 * @author Eduardo
 */
public class MainControllerInterface_Back_And_Front {
    //instanciando classe principal das funcoes
    //GrafoListaAdj grafoadj = new GrafoListaAdj();
    GrafoNo grafo = new GrafoNo();
    Vertice v;
    Arestas a;
    
    //função capaz de criar vertice
    public void Criar_Vertice(String nome, int id){
       // grafoadj.addVertice(nome, id);
        v = grafo.addVertice(nome, id); //Cria o vertice nó
        grafo.setVertice_na_ListaVertice(v); //coloca na lista de nós de GrafoNo
    }
    
    //Função capaz de criar aresta
    public void Criar_Aresta(String nome, int id, int id_vertice_1, int id_vertice_2){
        //grafoadj.addAresta(nome, grafo.encontrar_Vertice_ID(id_vertice_1), grafo.encontrar_Vertice_ID(id_vertice_2), id);
        a = grafo.addAresta(nome, grafo.encontrar_Vertice_ID(id_vertice_1), grafo.encontrar_Vertice_ID(id_vertice_2), id);
        grafo.setAresta_na_ListaAresta(a);
        grafo.imprimirArestas(); 
    }
    
    //imprimir lista na interface
    public String Imprimir_lista(){
        //chama função que retona a lista com texto
        String lista = grafo.retornarListaAdj();
        return lista;
    }
    
    //Função que realiza leitura do grafo formal
    public void Ler_Grafo_Formal(String grafo){
        GrafoFormal leitura = new GrafoFormal();
        //chamada da func que ordena os dados
        int retorno = leitura.separa_dados(grafo);
            if(retorno == 1){
                System.out.println("Erro na leitura!");
            }
            else{
                System.out.println("Sucesso na leitura!");
            }
    }
}
