/*
    Armazen todos os nós arestas e vertices em duas listas.
 */
package Funcoes;

import Interfaces.VizualizarMatris;
import Funcoes.Vertice;

public class GrafoNo extends NoVertice {

    private NoVertice lista_no_vertice = new NoVertice();
    private NoAresta lista_no_arestas = new NoAresta();

    public Vertice addVertice(String nome) { //Adicona vertice e retorna para uma variavel vertice
        Vertice v = new Vertice();
        v.setVerticeNome(nome);
        return v;
    }

    public Arestas addAresta(String nome, Vertice origem, Vertice destino) { //Adiciona aresta e retorna para uma variavel aresta
        Arestas e = new Arestas(nome, origem, destino);
        return e;
    }

    public NoVertice getListaVertice() {
        return lista_no_vertice;
    }

    public void setVertice_na_ListaVertice(Vertice vertice) {
        //System.out.println(vertice.getNomeVertice());
        this.lista_no_vertice = lista_no_vertice.insereVerticeNo(lista_no_vertice, vertice);

    }

    public NoAresta getListaAresta() {
        return lista_no_arestas;
    }

    public void setAresta_na_ListaAresta(Arestas aresta) {
        lista_no_arestas = lista_no_arestas.insereArestaNo(lista_no_arestas, aresta);
    }

    public Vertice encontrar_Vertice_Nome(String nome) {
        NoVertice lista = lista_no_vertice.getNoProxVertice();

        while (lista != null) {
            if (nome.equals(lista.getNomeVertice())) {
                break;
            }
            lista = lista.getNoProxVertice();
        }
        if(lista == null)
        {
            Vertice v = new Vertice();
            v.setVertice("Vertice " + nome + " não encontrado");
            return v;
            
        }

        return lista.getVertice();
    }

    public int getTamVertices(NoVertice lista_no_Vertice) {

        NoVertice lista_vertice = lista_no_vertice.getNoProxVertice();
        int tam_vertices = 0;

        while (lista_vertice != null) {
            tam_vertices++;
            lista_vertice = lista_vertice.getNoProxVertice();
        }
        return tam_vertices;
    }

    public int getTamArestas(NoAresta lista_no_arestas) {

        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        int tam_arestas = 0;

        while (lista_aresta != null) {
            tam_arestas++;
            lista_aresta = lista_aresta.getNoProxAresta();
        }
        return tam_arestas;
    }

    public String imprimirVertices() {
        NoVertice lista = lista_no_vertice.getNoProxVertice();
        String texto = null;
        int verificador = 0;

        if (lista.getVertice() == null) {
            System.out.println("não a vertices");
            return texto;
        } else {
            while (lista != null) {
                if(verificador == 0)
                {
                    texto = lista.getNomeVertice();
                    verificador = 1;
                }
                else
                {
                    texto += "\n" + lista.getNomeVertice();
                }

                System.out.println(lista.getNomeVertice());
                lista = lista.getNoProxVertice();
            }
        }
        texto += "\nfimVertices";
        
        return texto;
    }

    public String imprimirArestas() {
        NoAresta lista = lista_no_arestas.getNoProxAresta();
        String texto = null;
        int verificador = 0;

        if (lista == null) {
            System.out.println("não a Arestas");
            return texto;
        } else {
            while (lista != null) {
                if(verificador == 0)
                {
                    texto = lista.getNomeAresta() + "\n" + lista.getAresta().getOrigem().getNomeVertice() + "\n" + lista.getAresta().getDestino().getNomeVertice();
                    verificador = 1;
                }
                else
                {
                    texto += "\n" + lista.getNomeAresta() + "\n" + lista.getAresta().getOrigem().getNomeVertice() + "\n" + lista.getAresta().getDestino().getNomeVertice();
                }
                System.out.println(lista.getNomeAresta() + " // Vertice Origem = " + lista.getAresta().getOrigem().getNomeVertice() + " // Vertice Destino = " + lista.getAresta().getDestino().getNomeVertice());
                lista = lista.getNoProxAresta();
            }
        }
        
        return texto;
    }

    public int verificar_Adjacencia(Vertice origem, Vertice destino) {
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        int valor = 0;

        while (lista_aresta != null) {
            if (origem == lista_aresta.getAresta().getOrigem() && destino == lista_aresta.getAresta().getDestino()) {
                valor++;
            } else if (destino == lista_aresta.getAresta().getOrigem() && origem == lista_aresta.getAresta().getDestino()) {
                valor++;
            }
            lista_aresta = lista_aresta.getNoProxAresta();

        }
        return valor;
    }

    public void imprimirListaAdj() {
        NoVertice lista_vertice = lista_no_vertice.getNoProxVertice();
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        Vertice v = new Vertice("null");
        while(lista_vertice != null)
        {
            System.out.print(lista_vertice.getNomeVertice());
            
                while(lista_aresta != null)
                {
                    
                    if(lista_aresta.getAresta().getOrigem().getNomeVertice().equals(lista_vertice.getVertice().getNomeVertice()))
                    {
                        if(!lista_aresta.getAresta().getDestino().getNomeVertice().equals(v.getNomeVertice()))
                        {
                            System.out.print(" -> ");
                            System.out.print(lista_aresta.getAresta().getDestino().getNomeVertice());
                            v = lista_aresta.getAresta().getDestino();
                        }
                    }
                    
                    if(lista_aresta.getAresta().getDestino().getNomeVertice().equals(lista_vertice.getVertice().getNomeVertice()))
                    {
                        if(!lista_aresta.getAresta().getOrigem().getNomeVertice().equals(v.getNomeVertice()))
                        {
                            System.out.print(" -> ");
                            System.out.print(lista_aresta.getAresta().getOrigem().getNomeVertice());
                            v = lista_aresta.getAresta().getOrigem();
                        }
                    }
                    lista_aresta = lista_aresta.getNoProxAresta();
                }
            v = new Vertice("null");
            System.out.println("");
            lista_vertice = lista_vertice.getNoProxVertice();
            lista_aresta = lista_no_arestas.getNoProxAresta();
        }
        }

    public void imprimirMatrizAdj() {
        NoVertice lista_verticeL = lista_no_vertice.getNoProxVertice();
        NoVertice lista_verticeC = lista_no_vertice.getNoProxVertice();

        while (lista_verticeL != null) {

            while (lista_verticeC != null) {
                //System.out.print("LINHA"+"COLUNA");
                System.out.print(" " + verificar_Adjacencia(lista_verticeL.getVertice(), lista_verticeC.getVertice()));

                lista_verticeC = lista_verticeC.getNoProxVertice();
            }
            System.out.println();
            lista_verticeC = lista_no_vertice.getNoProxVertice();
            lista_verticeL = lista_verticeL.getNoProxVertice();
        }
    }

    public void imprimirMatrizInc() {
        NoVertice lista_vertice = lista_no_vertice.getNoProxVertice();
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();

        while (lista_vertice != null) {
            while (lista_aresta != null) {
                if (lista_vertice.getVertice() == lista_aresta.getAresta().getOrigem() || lista_vertice.getVertice() == lista_aresta.getAresta().getDestino()) {
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
                lista_aresta = lista_aresta.getNoProxAresta();
            }
            System.out.println();
            lista_vertice = lista_vertice.getNoProxVertice();
            lista_aresta = lista_no_arestas.getNoProxAresta();
        }

    }

    public String retornarListaAdj() {
        NoVertice lista_vertice = lista_no_vertice.getNoProxVertice();
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        Vertice v = new Vertice("null");
        String texto = null;
        int verificador_primeiro = 0;
        while(lista_vertice != null)
        {
            System.out.print(lista_vertice.getNomeVertice());
            if(verificador_primeiro == 0)
            {
                texto = lista_vertice.getNomeVertice();
                verificador_primeiro = 1;
            }else
            {
                texto += lista_vertice.getNomeVertice();
            }
            
                while(lista_aresta != null)
                {
                    
                    if(lista_aresta.getAresta().getOrigem().getNomeVertice().equals(lista_vertice.getVertice().getNomeVertice()))
                    {
                        if(!lista_aresta.getAresta().getDestino().getNomeVertice().equals(v.getNomeVertice()))
                        {
                            System.out.print(" -> ");
                            System.out.print(lista_aresta.getAresta().getDestino().getNomeVertice());
                            texto += " -> " + lista_aresta.getAresta().getDestino().getNomeVertice();
                            v = lista_aresta.getAresta().getDestino();
                        }
                    }
                    
                    if(lista_aresta.getAresta().getDestino().getNomeVertice().equals(lista_vertice.getVertice().getNomeVertice()))
                    {
                        if(!lista_aresta.getAresta().getOrigem().getNomeVertice().equals(v.getNomeVertice()))
                        {
                            System.out.print(" -> ");
                            System.out.print(lista_aresta.getAresta().getOrigem().getNomeVertice());
                            texto += " -> " + lista_aresta.getAresta().getOrigem().getNomeVertice();
                            v = lista_aresta.getAresta().getOrigem();
                        }
                    }
                    lista_aresta = lista_aresta.getNoProxAresta();
                }
            System.out.println("");
            v = new Vertice("null");
            texto += "\n";
            lista_vertice = lista_vertice.getNoProxVertice();
            lista_aresta = lista_no_arestas.getNoProxAresta();
        }

        return texto;

    }

    public String retornarMatrizADJ() {
        NoVertice lista_verticeL = lista_no_vertice.getNoProxVertice();
        NoVertice lista_verticeC = lista_no_vertice.getNoProxVertice();
        String texto = null;
        int verifica_primeiro = 0;

        while (lista_verticeL != null) {

            while (lista_verticeC != null) {
                if (verifica_primeiro == 0) {
                    texto = " " + Integer.toString(verificar_Adjacencia(lista_verticeL.getVertice(), lista_verticeC.getVertice()));

                    verifica_primeiro = 1;
                } else {
                   texto += " " + Integer.toString(verificar_Adjacencia(lista_verticeL.getVertice(), lista_verticeC.getVertice()));
                }
                //System.out.print("LINHA"+"COLUNA");
                System.out.print(" " + verificar_Adjacencia(lista_verticeL.getVertice(), lista_verticeC.getVertice()));

                lista_verticeC = lista_verticeC.getNoProxVertice();
            }
            texto += "\n";
            System.out.println();
            lista_verticeC = lista_no_vertice.getNoProxVertice();
            lista_verticeL = lista_verticeL.getNoProxVertice();
        }

        return texto;
    }

    public String retornarMatrizINC() {
        String texto = null;
        NoVertice lista_vertice = lista_no_vertice.getNoProxVertice();
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        int verifica_primeiro = 0;

        while (lista_vertice != null) {
            while (lista_aresta != null) {
                if (lista_vertice.getVertice() == lista_aresta.getAresta().getOrigem() || lista_vertice.getVertice() == lista_aresta.getAresta().getDestino()) {
                    if (verifica_primeiro == 0) {
                        texto = " 1";
                        verifica_primeiro = 1;
                    } else {
                        texto += " 1";
                    }
                    System.out.print(" 1");
                } else {
                    if (verifica_primeiro == 0) {
                        texto = "0";
                        verifica_primeiro = 1;
                    } else {
                        texto += " 0";
                    }

                    System.out.print(" 0");
                }
                lista_aresta = lista_aresta.getNoProxAresta();
            }
            texto += "\n";
            System.out.println();
            lista_vertice = lista_vertice.getNoProxVertice();
            lista_aresta = lista_no_arestas.getNoProxAresta();
        }

        return texto;
    }
    
    public int verificar_conectividade()
    {
        int quantidade_de_vertices = getTamVertices(lista_no_vertice), i = 0, j = 0, testador = 0;
        
        
        int matrizadj[][] = new int[quantidade_de_vertices][quantidade_de_vertices];
        matrizadj[0][0] = 0;
        
        NoVertice lista_verticeL = lista_no_vertice.getNoProxVertice();
        NoVertice lista_verticeC = lista_no_vertice.getNoProxVertice();
        
        //Armazena os valores em uma Matriz de adjacencia
        
         for(i=0;i<quantidade_de_vertices;i++)
        {
            for(j=0;j<quantidade_de_vertices;j++)
            {
                matrizadj[i][j] = verificar_Adjacencia(lista_verticeL.getVertice(), lista_verticeC.getVertice());
                lista_verticeC = lista_verticeC.getNoProxVertice();
            }
            lista_verticeC = lista_no_vertice.getNoProxVertice();
            lista_verticeL = lista_verticeL.getNoProxVertice();
        }
        
        for(i=0;i<quantidade_de_vertices;i++)
        {
            for(j=0;j<quantidade_de_vertices;j++)
            {
                System.out.print(matrizadj[i][j]);
                testador = matrizadj[i][j]+testador ;
                
            }
            System.out.println();
            if(testador == 0)
            {
                return 1;
            }
            testador = 0;
            
        }
        
        
        return 0;
    }

}
