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
import java.io.FileReader;
import Funcoes.GrafoNo;
import Funcoes.Vertice;
import Funcoes.Arestas;

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

    public GrafoNo carregar_dados(String arquivo) {
        GrafoNo grafo = new GrafoNo();
        Vertice v;
        Arestas a;
        int teste = 0, vertice=0, arestas=0;
        String nomeAresta, vertice1, vertice2;
        
        try {
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha a variável "linha" recebe o valor "null" quando o processo de repetição atingir o final do arquivo texto
            while (linha != null) {
                System.out.printf("%s\n", linha);
                
                
                        if(linha.equals("FimVertice") && teste == 0) // se ele chegou no fim de todos os vertices, teste vira 1
                        {
                           teste = 1; 
                        }else if( teste == 0) //entra até chegar em todos os vertices
                        {
                            v = grafo.addVertice(linha);
                            grafo.setVertice_na_ListaVertice(v);
                           
                        }else if(linha.equals("FimAresta") && teste == 1) //se ele chego em todos os vertices, printa e o teste vira 2;
                        {
                            System.out.println("final do arquivo encontrado");
                            teste = 2;
                        }else if(teste == 1 && !linha.equals("FimVertice")) //entra se teste == 1 e não for FimVertice
                        {
                            if(arestas == 0)
                            {
                                nomeAresta = linha;
                                arestas = 1;
                            }else if(vertice == 0)
                            {
                                vertice1 = linha;
                                vertice = 1;
                            }
                            else if(vertice == 1)
                            {
                                vertice2 = linha;
                                vertice = 0;
                                arestas = 0;
                                a = grafo.addAresta("aresta t3", grafo.encontrar_Vertice_Nome("Vertice s1"), grafo.encontrar_Vertice_Nome("Vertice s3"));
                                grafo.setAresta_na_ListaAresta(a);
                            } 
                        }
                        else
                        {
                            System.out.println("não entrou em nenhum if, deve ter algum erro");
                        }

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
        return grafo;
    }

}

