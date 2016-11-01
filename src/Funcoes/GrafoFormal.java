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
        //é preciso criar um for dinamico
        //cada texto tem 10 caracter
        //se contar quantos grupos de 10 nos encontramos a quantidade de grafos que deve ser criada
        //é preciso 2 for um para qtdade de grafose outro dentro com a quantidade de splits
        //basta fazer as repetiçoes e os splits seguidos
        //cada grafo lido deve ser inserido imediatamento se nao so ira inserir o ultimo
        
        //possivelmente vai ficar lento verificar barra de progresso!!
        
        String [] texto = grafo.split(",");
        System.out.println(texto[0]);
        System.out.println(texto[1]);
        String [] dadoss = texto[1].split("=");
        System.out.println(dadoss[0]);
        System.out.println(dadoss[1]);
        return 0;
    }
    
    //envia os nos e arestas para a lista
    public void set_grafos(){
        
    }
}
