/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

/**
 *
 * @author Alunoinf_2
 */
public class Hash {

    String hash1 = "abcdefghijklmnopqrstuvwxyz.,- !";
    String hash2 = "flqhjvnysbtwezxucokaridpmg.,- !";
    int contador;    

    public String descriptografar(String criptografado) {
        StringBuilder concat = new StringBuilder();

        for (char c : criptografado.toCharArray()) {
            contador = 0;
            for (char d : hash2.toCharArray()) {                                
                if(c == d){                                        
                    concat.append(this.hash1.toCharArray()[contador]);                      
                    break;
                }
                contador++;
            }                      
        }
        return concat.toString();
    }
}
