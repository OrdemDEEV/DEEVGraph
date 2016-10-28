/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import Interfaces.ControleSoVisual;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 * classe para salvar os grafos em txt
 * @author Eduardo
 */
public class SalvaDados {
    
    //função capaz de abrir a tela para usuario escolher local onde salva os dados, e criar o txt
    //depois chama a função que escreve os dados dentro do mesmo txt criado
    //acredito que trabalharemos com apenas 1 txt certo?
    public void cria_arquvos(){
        
    }
    
    //função para abrir arquivo, carrega tela para selecionar o arquivo também
    public void abrir_arquivo(){
        ControleSoVisual visual = new ControleSoVisual();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file" + selectedFile.getAbsolutePath());
            try {
                //manda txt para codigo de importação
                func.importa_txt(selectedFile.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(ControleSoVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
