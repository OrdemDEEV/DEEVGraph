/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;


public class GrafoNo extends NoVertice {
    private NoVertice lista_no_vertice;
    private NoAresta lista_no_arestas;

    public GrafoNo() {
        this.lista_no_arestas = null;
        this.lista_no_vertice = null;
    }
    
     public Vertice addVertice(String nome, int id) { //Adicona vertice e retorna para uma variavel vertice
        Vertice v = new Vertice(nome, id);
        return v;
    }
     
    public Arestas addAresta(String nome, Vertice origem, Vertice destino, int id) { //Adiciona aresta e retorna para uma variavel aresta
        Arestas e = new Arestas(nome, origem, destino, id);
        return e;
    }
    
    public NoVertice getListaVertice()
    {
        return lista_no_vertice;
    }
    
    public void setVertice_na_ListaVertice(Vertice vertice)
    { 
        System.out.println(vertice.getNomeVertice(vertice));
        lista_no_vertice = lista_no_vertice.insereVerticeNo(lista_no_vertice, vertice);
        
    }
    
    public NoAresta getListaAresta()
    {
        return lista_no_arestas;
    }
    
    public void setAresta_na_ListaAresta(Arestas aresta)
    {
        lista_no_arestas = lista_no_arestas.insereArestaNo(lista_no_arestas, aresta);
    }
    
    public Vertice encontrar_Vertice_ID(int id)
    {
        NoVertice lista = lista_no_vertice;
        
        while(lista != null)
        {
            if(id == lista.getVertice().id)
            {
             break;   
            }
            lista = lista.getNoProxVertice();
        }
        
        return lista.getVertice();
    }
    
    public void imprimirVertices()
    {
        NoVertice lista = lista_no_vertice;
        
        if (lista == null)
        {
            System.out.println("não a vertices");
        }else
        {
            while(lista != null)
            {
                System.out.println(lista.getVertice().nomeVertice);
                lista = lista.getNoProxVertice();
            }
        }
    }
    
    public void imprimirArestas()
    {
        NoAresta lista = lista_no_arestas;
        
        if (lista == null)
        {
            System.out.println("não a Arestas");
        }else
        {
            while(lista != null)
            {
                System.out.println(lista.getAresta().nomeAresta);
                lista = lista.getNoProxAresta();
            }
        }
    }
}
