/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;


class NoVertice {
        private Vertice vertice;
        private NoVertice noProxVertice;
        private NoVertice noAntVertice;
    
        public void setVertice(Vertice vertice)
        {
            this.vertice = vertice;
        }
        
        public Vertice getVertice()
        {
            return vertice;
        }
        
        public void setNoProxVertice(NoVertice noprox)
        {
            this.noProxVertice = noprox;
        }
        
        public NoVertice getNoProxVertice()
        {
            return noProxVertice;
        }
        
        public void setNoAntVertice(NoVertice noant)
        {
            this.noAntVertice = noant;
        }
        
        public NoVertice getNoAntVertice()
        {
            return noAntVertice;
        }
    
}
