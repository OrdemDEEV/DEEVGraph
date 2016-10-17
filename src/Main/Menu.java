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
    
    public int menu_Principal()
    {
        int op;
        
        System.out.println("----MENU-----");
        System.out.println("1-Entrada Formal");
        System.out.println("2-Listar o Grafo");
        System.out.println("0-Finalizar o programa");
        
        op = scan.nextInt();
        
        return op;
    }
}
