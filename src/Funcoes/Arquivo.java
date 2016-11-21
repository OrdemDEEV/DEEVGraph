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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Arquivo {

    public void exportar_Grafo(String listaADJ, String MatrizADJ, String MatrizINC, String caminho) {

        try (FileWriter arq = new FileWriter(caminho+".txt")) {

            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("Lista de Adjacencia%n%n" + listaADJ + "%n%nMatriz de Adjacencia%n%n" + MatrizADJ + "%n%nMatriz de Incidencia%n%n" + MatrizINC + "%n%n%n© ordemDeev");
            arq.close();

        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu algum erro no arquivo");
        }

    }

    public void salvar_dados(String Vertices, String Arestas, String nometxt) {

        try (FileWriter arq = new FileWriter(nometxt+".deev")) {

            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(Vertices + "\n" + Arestas);
            arq.close();

        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu algum erro no Vertices");
        }

    }

    public GrafoNo carregar_dados(String caminho) {
        GrafoNo grafo = new GrafoNo();
        Vertice v;
        Arestas a;
        int testaaresta = 0, testevertice=0, fimVertice = 0;
        String nomeAresta = " ", vertice1 = " ", vertice2 = " ";
        
        
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha a variável "linha" recebe o valor "null" quando o processo de repetição atingir o final do arquivo texto
            while (linha != null) {
                System.out.printf("%s\n", linha);  
                
                
             if(fimVertice == 1)
                {
                    if(testaaresta == 0)
                {
                    nomeAresta = linha;
                    testaaresta = 1;
                    linha = lerArq.readLine();
                }else if(testevertice == 0)
                {
                    vertice1 = linha;
                    testevertice = 1;
                    linha = lerArq.readLine();
                }else if(testevertice ==  1)
                {
                    vertice2 = linha;
                    testevertice = 2;
                    linha = lerArq.readLine();
                    grafo.setAresta_na_ListaAresta(grafo.addAresta(nomeAresta, grafo.encontrar_Vertice_Nome(vertice1), grafo.encontrar_Vertice_Nome(vertice2)));
                    testaaresta = 0;
                    testevertice = 0;
                }
              }
             else
             {
                 if(linha.equals("fimVertices"))
                 {
                     fimVertice = 1;
                     linha = lerArq.readLine();
                 }else
                 {
                     grafo.setVertice_na_ListaVertice(grafo.addVertice(linha));
                     linha = lerArq.readLine();
                 }
                 
             }
                
                
                 // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        return grafo;
    }

}

