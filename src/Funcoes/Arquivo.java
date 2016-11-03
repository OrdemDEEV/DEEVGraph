/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arquivo {

    public void exportar_Grafo(String listaADJ, String MatrizADJ, String MatrizINC) {
        
        try (FileWriter arq = new FileWriter("grafo.txt")) {
            
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("Lista de Adjacencia%n%n" + listaADJ + "%n%nMatriz de Adjacencia%n%n" + MatrizADJ + "%n%nMatriz de Incidencia%n%n" + MatrizINC);
            arq.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu algum erro no arquivo");
        }

    }

    public void salvar_dados(String Vertices, String Arestas) {
        
        try (FileWriter arq = new FileWriter("dados.deev")) {
            
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(Vertices + "%n" + Arestas);
            arq.close();
              
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu algum erro no arquivo");
        }
     

    }

}
