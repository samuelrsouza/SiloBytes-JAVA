
package com;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author joser
 */
public class MenuController {

    
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    }
    
    @FXML
    private void listarUsuario() throws IOException{
        App.setRoot("listarUsuario");
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
}
