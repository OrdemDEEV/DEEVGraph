/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;


class NoAresta {
       private Arestas aresta;
       private NoAresta noProxAresta = null;
       private NoAresta noAntAresta = null;
    
   
    
    public void setAresta(Arestas aresta)
    {
        this.aresta = aresta;
    }
    
    public Arestas getAresta()
    {
        return aresta;
    }
    
    public void setNoProxAresta(NoAresta noprox)
    {
        this.noProxAresta = noprox;
    }
    
    public NoAresta getNoProxAresta()
    {
        return noProxAresta;
    }
    
    public void setNoAntAresta(NoAresta noant)
    {
        this.noAntAresta = noant;
    }
    
    public NoAresta getNoAntAresta()
    {
        return noAntAresta;
    }
}
