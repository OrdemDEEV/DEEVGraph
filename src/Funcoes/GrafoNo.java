/*
    Armazen todos os nós arestas e vertices em duas listas.
 */
package Funcoes;
import Interfaces.VizualizarMatris;

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
    
    public void limpar_dados_grafo()
    {
        NoVertice lista_vertice = lista_no_vertice;
        NoAresta lista_aresta = lista_no_arestas;
        
        while(lista_vertice != null)
        {
            System.out.println("preso no vertice");
            NoVertice excluir = lista_no_vertice;
            lista_vertice = lista_vertice.getNoProxVertice();
            excluir = null;
        }
        System.out.println("Agora os Vertices estão vazios");
        while(lista_aresta != null)
        {
            System.out.println("preso na aresta");
            NoAresta excluir = lista_aresta;
            lista_aresta = lista_aresta.getNoProxAresta();
            excluir = null;
        }
        
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
    
    public void imprimirMatrizInc()
    {
        NoVertice lista_vertice = lista_no_vertice.getNoProxVertice();
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        
        while(lista_vertice != null)
        {
            while(lista_aresta != null)
            {
                if(lista_vertice.getVertice() == lista_aresta.getAresta().getOrigem() || lista_vertice.getVertice() == lista_aresta.getAresta().getDestino() )
                {
                    System.out.print(" 1");
                }
                else
                {
                    System.out.print(" 0");
                }
                lista_aresta = lista_aresta.getNoProxAresta();
            }
            System.out.println();
            lista_vertice = lista_vertice.getNoProxVertice();
            lista_aresta = lista_no_arestas.getNoProxAresta();
        }
        
    }
    
    
    public String retornarListaAdj()
    {
        String texto = null;
        NoVertice lista_vertice = lista_no_vertice.getNoProxVertice();
        NoAresta lista_aresta = lista_no_arestas.getNoProxAresta();
        int verifica_primeiro = 0;
        
        
        while(lista_vertice != null)
        {
            if(verifica_primeiro == 0)
            {
                texto = lista_vertice.getNomeVertice();
                verifica_primeiro = 1;
            }else
            {
                texto += lista_vertice.getNomeVertice();
            }
            
            System.out.print(lista_vertice.getNomeVertice());
            
                while(lista_aresta != null)
                {
                    if(lista_aresta.getAresta().getDestino() == lista_vertice.getVertice())
                    {
                        System.out.print(" -> ");
                        System.out.print(lista_aresta.getAresta().getOrigem().getNomeVertice());
                        texto += "->" + lista_aresta.getAresta().getOrigem().getNomeVertice();
                    }
                    else if(lista_aresta.getAresta().getOrigem() == lista_vertice.getVertice())
                    {
                        System.out.print(" -> ");
                        System.out.print(lista_aresta.getAresta().getDestino().getNomeVertice());
                        texto += "->" + lista_aresta.getAresta().getDestino().getNomeVertice();
                    }
                    lista_aresta = lista_aresta.getNoProxAresta();
                 }
                lista_vertice = lista_vertice.getNoProxVertice();
                lista_aresta = lista_no_arestas.getNoProxAresta();
                System.out.println();
                texto += "\n";
        }
        return texto;
               
    }
    
    public String retornarMatrizADJ()
    {
        NoVertice lista_verticeL = lista_no_vertice.getNoProxVertice();
        NoVertice lista_verticeC = lista_no_vertice.getNoProxVertice();
        String texto = null;
        int verifica_primeiro = 0, valor;


        while(lista_verticeL != null)
        {
                
                while(lista_verticeC != null)
                {
                                if(verifica_primeiro == 0)
                                {
                                    if(verificar_Adjacencia(lista_verticeL.getVertice(),lista_verticeC.getVertice()) == 1)
                                    {
                                        texto = " 1";
                                    }else
                                    {
                                        texto = " 0"; 
                                    }
                                        
                                        verifica_primeiro = 1;
                                }else
                                {
                                    if(verificar_Adjacencia(lista_verticeL.getVertice(),lista_verticeC.getVertice()) == 1)
                                    {
                                        texto += " 1";
                                    }else
                                    {
                                        texto += " 0"; 
                                    }
                                }
                    //System.out.print("LINHA"+"COLUNA");
                    System.out.print(" " + verificar_Adjacencia(lista_verticeL.getVertice(),lista_verticeC.getVertice()));

                    
                    lista_verticeC = lista_verticeC.getNoProxVertice();
                }
            texto += "\n";
            System.out.println();
            lista_verticeC = lista_no_vertice.getNoProxVertice();
            lista_verticeL = lista_verticeL.getNoProxVertice();
        }
        
        return texto;
    }
    
}
