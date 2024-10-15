/* 
 *
 * Grupo: G2ML
 * Autores: 
 *      - Gustavo Veríssimo			-   rm551244@fiap.com.br
 *      - Gabriel Pacheco     		-   rm550191@fiap.com.br
 *      - Murilo Henrique Obinata	-   rm99855@fiap.com.br
 *      - Leonardo Correia   		-   rm550413@fiap.com.br
 */

package br.com.fiap.twoespwx.libunclepresser;

import java.util.List;

import br.com.fiap.twoespwx.libunclepresser.input.Reader;
import br.com.fiap.twoespwx.libunclepresser.output.OutputWriter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("LIB UNCLE PRESSER - GRUPO G2ML");
        
        String inputFilename = "inputs/input1.txt";
        String outputFilename = "outputs/OUTPUT1.txt";
        
        Reader reader = new Reader();
        OutputWriter outw = new OutputWriter();
        
        List<String> lines = reader.readWithFileInputStream(inputFilename);
        System.out.println(lines);
        Counter counter = new Counter();
        
//        String line = reader.readFromKeyboard();
        String output = counter.countAll(lines);
        
        outw.writeWithPrintStream(outputFilename, output);
    }
}
