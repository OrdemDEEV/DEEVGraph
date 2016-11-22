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
import Funcoes.Arquivo;
import Funcoes.GrafoFormal;
import Funcoes.GrafoNo;
import Funcoes.Vertice;

/**
 *
 * @author Eduardo
 */
public class MainControllerInterface_Back_And_Front {
    //instanciando classe principal das funcoes
    private GrafoNo grafo = new GrafoNo();
    private Vertice v;
    private Arestas a;
    private Arquivo arq = new Arquivo();

    //função capaz de criar vertice
    public void Criar_Vertice(String nome) {
        v = grafo.addVertice(nome); //Cria o vertice nó
        grafo.setVertice_na_ListaVertice(v); //coloca na lista de nós de GrafoNo
    }

    //Função capaz de criar aresta
    public void Criar_Aresta(String nome, String nome_vertice_1, String nome_vertice_2) {
        a = grafo.addAresta(nome, grafo.encontrar_Vertice_Nome(nome_vertice_1), grafo.encontrar_Vertice_Nome(nome_vertice_2));
        grafo.setAresta_na_ListaAresta(a);
        grafo.imprimirArestas();
    }

    //imprimir lista na interface
    public String imprimir_listaADJ() {
        //chama função que retona a lista com texto
        String lista = grafo.retornarListaAdj();
        return lista;
    }

    public String imprimir_matrizADJ() {
        String matriz = grafo.retornarMatrizADJ();
        return matriz;
    }

    public String imprimir_matrizINC() {
        String matriz = grafo.retornarMatrizINC();
        return matriz;
    }

    public String verifica_simples() {
        String resposta = null;
        int laco, paralelo;

        laco = grafo.verifica_laco();
        paralelo = grafo.verificar_paralelo();

        if (laco == 0 && paralelo == 0 && grafo.getTamVertices(grafo.getListaVertice()) != 0) {
            resposta = "Sim";
        } else {
            resposta = "Não";
        }
        return resposta;
    }

    public String verifica_completo() {
        String resposta = null;
        int conexo, laco, paralelo;

        conexo = grafo. verificar_conectividade_completo();
        laco = grafo.verifica_laco();
        paralelo = grafo.verificar_paralelo();

        if (conexo == 1 && laco == 0 && paralelo == 0 && grafo.getTamVertices(grafo.getListaVertice()) != 0) {
            resposta = "Sim";
        } else {
            resposta = "Não";
        }
        return resposta;
    }
    
    public String verifica_menor(){
        int planar = grafo.menorCiclo();
        
            if(planar == 1){
                return "Sim";
            }
            else{
                return "Não";
            }
        
    }
    
    public String verifica_conectividade() {
        int resultado = grafo.verificar_conectividade();
        String tipo = null;

        if (resultado == 0 || grafo.getTamVertices(grafo.getListaVertice()) == 0) {
            tipo = "Não";
        }
        if (resultado == 1 && grafo.getTamVertices(grafo.getListaVertice()) != 0) {
            tipo = "Sim";
        }
        return tipo;
    }

    public int verifica_nome_vertice(String nome_vertice) {
        int resultado = grafo.verificanomevertice(nome_vertice);
        System.out.println("O nome do vertice procurado foi = " + nome_vertice);

        if (resultado == 1) {
            return 1;
        }
        if (resultado == 0) {
            return 0;
        }
        return 0;
    }

    public int verifica_nome_aresta(String nome_aresta) {
        int resultado = grafo.verificanomearesta(nome_aresta);
        int retorno = 0;
        if (resultado == 1) {
            retorno = 1;
        }
        if (resultado == 0) {
            retorno = 0;
        }
        return retorno;
    }

    public void exportar_dados(String caminho) {
        arq.exportar_Grafo(grafo.retornarListaAdj(), grafo.retornarMatrizADJ(), grafo.retornarMatrizINC(), caminho);
    }

    public String imprimir_vertices() {
        String resultado = grafo.imprimirVertices();
        return resultado;
    }

    public String imprimir_arestas() {
        String resultado = grafo.imprimirArestas();
        return resultado;
    }

    public int qtd_paralelos() {
        int resultado = grafo.qtdade_paralelos();
        return resultado;
    }

    public int qtd_laco() {
        int resultado = grafo.qtd_laco();
        return resultado;
    }

    //Função que realiza leitura do grafo formal
    public void ler_Grafo_Formal(String grafo, int tamanho) {
        GrafoFormal leitura = new GrafoFormal();
        //chamada da func que ordena os dados
        int retorno = leitura.separa_dados(grafo, tamanho);
        if (retorno == 1) {
            System.out.println("Erro na leitura!");
        } else {
            System.out.println("Sucesso na leitura!");
        }
    }

    //Destrutor reciar os grafos vazios
    public void resetar_Grafo() {
        this.grafo = new GrafoNo();
    }

    public void carrega_Grafo(GrafoNo grafo) {
        this.grafo = grafo;
    }

    public GrafoNo getGrafo() {
        return grafo;
    }
}
