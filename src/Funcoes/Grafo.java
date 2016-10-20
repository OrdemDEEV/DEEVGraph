
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
    
    public void printarMatrizAdjacente(Vertice v[], Arestas a[], int tamVertices)
    {
        int i;
        int j;
        
         System.out.println("Matriz de Adjacencia"); 
      for(i = 0; i < tamVertices; i++)
      {
          
          for (j = 1; j < tamVertices-1;j++) //Este for deve ir até o tamanho de vértices -1
          {
              System.out.print(" V[" + i + "][" + j + "] " + a[0].pegarMatrizAdj(a, v[i], v[j], 4));
              
          }
          System.out.println(" V[" + i + "][" + j + "] " + a[0].pegarMatrizAdj(a, v[i], v[j], 4));
      }
      
        System.out.println();
    }

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