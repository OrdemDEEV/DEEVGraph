/*
 * CLasse que realiza a leitura e interações dos grafos 
 * que estao na forma formal
 */
package Funcoes;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author eduardo
 */
public class GrafoFormal {
    
    //realiza a separação dos dados pela vigula
    public int separa_dados(String grafo){
        
        String vertice;
        String aresta;
        
        //g(a1) = 1 – 2,(a1) = 1 – 2,
        //System.out.println(grafo);
        String [] texto = grafo.split("[,]");
        System.out.println(Arrays.toString(texto));
        
        return 0;
    }
    
    //envia os nos e arestas para a lista
    public void set_grafos(){
        
    }
}
