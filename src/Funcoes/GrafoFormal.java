/*
 * CLasse que realiza a leitura e interações dos grafos 
 * que estao na forma formal
 */
package Funcoes;

import Main.MainControllerInterface_Back_And_Front;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author eduardo
 */
public class GrafoFormal {
        
     MainControllerInterface_Back_And_Front dados;
    
    //realiza a separação dos dados pela vigula
    public int separa_dados(String grafo, int tamanho){
        
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
        
        /*String [] texto = grafo.split(",");
        System.out.println(texto[0]);
        System.out.println(texto[1]);
        String [] dadoss = texto[1].split("=");
        System.out.println(dadoss[0]);
        System.out.println(dadoss[1]);*/
        int quantidade_grafos = tamanho / 10;
        String [] texto = null;
        String [] vertices_lidos = null;
        String [] vertices_cadastro = null;
        for(int i=0;i<=quantidade_grafos;i++){
            
               texto =  grafo.split(",");
               System.out.println("Grafo" + i + ":\t" + texto[i]);
               
                   vertices_lidos = texto[i].split("=");
                   
              for(int j=0;j<vertices_lidos.length;j++){
                  System.out.println(vertices_lidos[j]);
                  
              }
               
        }
        return 0;
    }
    
    //envia os nos e arestas para a lista
    public void set_grafos(){
        
    }
}
