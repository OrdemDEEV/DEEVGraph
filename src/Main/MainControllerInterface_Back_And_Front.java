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

import Funcoes.GrafoListaAdj;

/**
 *
 * @author Eduardo
 */
public class MainControllerInterface_Back_And_Front {
    //instanciando classe principal das funcoes
    GrafoListaAdj grafoadj = new GrafoListaAdj();
    
    //função capaz de criar vertice
    public void Criar_Vertice(String nome, int id){
        grafoadj.addVertice(nome, id);
    }
    
    //Função capaz de criar aresta
    public void Criar_Aresta(String nome, int id, int vertice_1, int vertice_2){
        grafoadj.addAresta(nome, grafoadj, grafoadj, id);
    }
}
