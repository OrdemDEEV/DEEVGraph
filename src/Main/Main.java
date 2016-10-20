/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;


public class Main {
    

    public static void main(String[] args){

        Menu menu = new Menu(8,4);
        int op = -1;
        
        while(op != 0){
            
            op = menu.menu_Principal();
        }
        System.out.println("Programa Encerrado");
    }
}