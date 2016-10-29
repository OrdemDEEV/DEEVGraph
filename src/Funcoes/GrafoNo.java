/*
    Armazen todos os nós arestas e vertices em duas listas.
 */
package Funcoes;


public class GrafoNo extends NoVertice {
    private NoVertice lista_no_vertice = new NoVertice();
    private NoAresta lista_no_arestas = new NoAresta();
    
    
     public Vertice addVertice(String nome, int id) { //Adicona vertice e retorna para uma variavel vertice
        Vertice v = new Vertice();
        v.setVerdiceID(id);
        v.setVerticeNome(nome);
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
        //System.out.println(vertice.getNomeVertice());
        this.lista_no_vertice = lista_no_vertice.insereVerticeNo(lista_no_vertice, vertice);
        
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
        NoVertice lista = lista_no_vertice.getNoProxVertice();
        
        while(lista != null)
        {
            if(id == lista.getIdVertice())
            {
             break;   
            }
            lista = lista.getNoProxVertice();
        }
        
        return lista.getVertice();
    }
    
    public void imprimirVertices()
    {
        NoVertice lista = lista_no_vertice.getNoProxVertice();
       
        
        if (lista.getVertice() == null)
        {
            System.out.println("não a vertices");
        }else
        {
            while(lista != null)
            {
                
                System.out.println(lista.getNomeVertice());
                lista = lista.getNoProxVertice();
            }
        }
    }
    
    public void imprimirArestas()
    {
        NoAresta lista = lista_no_arestas.getNoProxAresta();
        
        if (lista == null)
        {
            System.out.println("não a Arestas");
        }else
        {
            while(lista != null)
            {
                System.out.println(lista.getNomeAresta() + " // Vertice Origem = " + lista.getAresta().getOrigem().getNomeVertice() + " // Vertice Destino = " + lista.getAresta().getDestino().getNomeVertice());
                lista = lista.getNoProxAresta();
            }
        }
    }
    public int verificar_Adjacencia(Vertice origem, Vertice destino)
    {
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        
         while(lista_aresta != null)
        {
           if(origem == lista_aresta.getAresta().getOrigem() && destino == lista_aresta.getAresta().getDestino())
           {
               return 1;
            }
           else if(destino == lista_aresta.getAresta().getOrigem() && origem == lista_aresta.getAresta().getDestino())
           {
               return 1;
           }
           lista_aresta = lista_aresta.getNoProxAresta();
           
         }
         return 0;
    }
    
    public void imprimirListaAdj()
    {
        NoVertice lista_vertice = lista_no_vertice.getNoProxVertice();
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        
        while(lista_vertice != null)
        {
            System.out.print(lista_vertice.getNomeVertice());
            
                while(lista_aresta != null)
                {
                    if(lista_aresta.getAresta().getDestino() == lista_vertice.getVertice())
                    {
                        System.out.print(" -> ");
                        System.out.print(lista_aresta.getAresta().getOrigem().getNomeVertice());
                    }
                    else if(lista_aresta.getAresta().getOrigem() == lista_vertice.getVertice())
                    {
                        System.out.print(" -> ");
                        System.out.print(lista_aresta.getAresta().getDestino().getNomeVertice());
                    }
                    lista_aresta = lista_aresta.getNoProxAresta();
                 }
                lista_vertice = lista_vertice.getNoProxVertice();
                lista_aresta = lista_no_arestas.getNoProxAresta();
                System.out.println();
        }
    }
    
    public void imprimirMatrizAdj()
    {
        NoVertice lista_verticeL = lista_no_vertice.getNoProxVertice();
        NoVertice lista_verticeC = lista_no_vertice.getNoProxVertice();
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();

        while(lista_verticeL != null)
        {
                
                while(lista_verticeC != null)
                {
                    //System.out.print("LINHA"+"COLUNA");
                    System.out.print(" " + verificar_Adjacencia(lista_verticeL.getVertice(),lista_verticeC.getVertice()));

                    
                    lista_verticeC = lista_verticeC.getNoProxVertice();
                }
            System.out.println();
            lista_verticeC = lista_no_vertice.getNoProxVertice();
            lista_verticeL = lista_verticeL.getNoProxVertice();
        }
    }
    
}
