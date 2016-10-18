/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Funcoes.Grafo; //IMPORTA A FUNÇÃO GRAFO DE OUTRO PACOTE

public class Menu {
    
    Scanner scan = new Scanner(System.in);
    Grafo grafo = new Grafo();
    
    public int menu_Principal()
    {
        int op;
        
        System.out.println("----MENU PRINCIPAL-----");
        System.out.println("1-Enserir Dados do Grafo");
        System.out.println("2-Listar o Grafo");
        System.out.println("0-Finalizar o programa");
        
        op = scan.nextInt();
        
        switch(op)
        {
            case 0:
                System.out.println("Saindo do Menu Principal");
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        
        return op;
    }
    
    public void inserir_dados_do_grafo()
    {
        System.out.println("Digite quantas arestas vão ter");
        
        System.out.println("Digite quantos vértices vão ter");
        
        //dai no caso a gente cria uma variavel vertice e outra aresta com [ ] o tamanho de quantas vão
        //ser usadas 
        
    }
    
}