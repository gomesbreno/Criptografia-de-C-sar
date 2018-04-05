/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Breno
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws FileNotFoundException,
            UnsupportedEncodingException {
        Hash hash = new Hash();

        File arquivo = new File("criptografado.txt");
        File arquivo2 = new File("descriptografado.txt");

        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(arquivo2, false);
            BufferedWriter bw = new BufferedWriter(fw);

            String linha;
            String linhaDescriptografada;
            while ((linha = br.readLine()) != null) {
                linhaDescriptografada = hash.descriptografar(linha);                
                bw.write(linhaDescriptografada);
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Descriptografado!!!");
        } catch (IOException ex) {
            System.out.println("Algo de errado não esta nada certo!!!");
            System.out.println(ex);
        }
    }

}
