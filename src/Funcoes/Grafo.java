
package Funcoes;


import java.util.List;
import java.util.ArrayList;

public class Grafo extends Vertice {
    
    List<Vertice> vertices;
    List<Arestas> arestas;

    public Grafo() {
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Arestas>();
    }

    public Vertice addVertice(String nome) { //Adicona vertice e retorna para uma variavel vertice
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    public Arestas addAresta(String nome, Vertice origem, Vertice destino) { //Adiciona aresta e retorna para uma variavel aresta
        Arestas e = new Arestas(nome, origem, destino);
        origem.addAdj(e);
        arestas.add(e);
        return e;
    }
    
    public void printarVertices(Vertice v[])
    {
         System.out.println("Vertices");
       for (int i = 0; i < 8; i++)
       {
           System.out.println("v" + i + " = nome: " + v[i].getNomeVertice(v[i]));
       }
    }
   /* TA DANDO ERRO
    public Vertice procuraNomeVertice(String nome, Vertice v[], int tam)
    {
        
        for(int i = 0; i< tam; i++)
        {
            System.out.println("NOME : " + v[i].getNomeVertice(v[i]));
            if(v[i].getNomeVertice(v[i]).equals(nome)) //Compara a string pega no getNome com o nome enviado
            {   
                return v[i];
            }
        }
        System.out.println("Nome não encontrado, retornando valor inicial");
        return v[0]; //PROPICIO A ERRO
    };
    */

    @Override
    public String toString() {
        String r = "";
        for (Vertice u : vertices) {
            r += u.nomeVertice + " -> ";
            for (Arestas e : u.adj) {
                Vertice v = e.destino;
                r += v.nomeVertice + ", ";
            }
            r += "\n";
        }
        return r;
    }

}