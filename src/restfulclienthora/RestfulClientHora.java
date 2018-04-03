/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfulclienthora;

/**
 *
 * @author entrar
 */
public class RestfulClientHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient cliente = new NewJerseyClient();
        System.out.println(cliente.getJson());
    }
    
}
