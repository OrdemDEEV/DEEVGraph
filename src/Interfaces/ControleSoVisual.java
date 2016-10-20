/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.UIManager;

/**
 *
 * @author eduardo
 */
public class ControleSoVisual {
    /*
    *Codigo que realiza a submissao do look and fell ao so, 
    *deixando o sistema com a cara do sistema operacional 
    *que o usuario utiliza
    */
    public void carregaVisualSistema(){
             {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Erro Critico // não foi possivel carregar o look and fell");
            e.printStackTrace();
        }
    }
    }
}
