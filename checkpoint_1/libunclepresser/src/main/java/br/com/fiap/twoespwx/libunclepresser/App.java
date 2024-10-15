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
        System.out.println("LIB UNCLE PRESSER - GRUPO G2ML%-40s");
        
        String inputFilename = "inputs/input1.txt";
        String outputFilename = "outputs/OUTPUT1.txt";
        
        System.out.println(""
        		+ "|-----------------------------------------------------------|\r\n"
        		+ "|                                                           |\r\n"
        		+ "| INPUT  FILENAME: INPUT1.TXT                               |\r\n"
        		+ "| OUTPUT FILENAME: OUTPUT1.TXT                              |\r\n"
        		+ "|-----------------------------------------------------------|\r\n");
             
        Reader reader = new Reader();
        OutputWriter outw = new OutputWriter();
        
        List<String> lines = reader.readWithFileInputStream(inputFilename);
        Counter counter = new Counter();
        
//        String line = reader.readFromKeyboard();
        String output = counter.countAll(lines);
        
        outw.writeWithPrintStream(outputFilename, output);
        
        Long sizeInput 	= reader.getFileSize(inputFilename);
        Long sizeOutput = reader.getFileSize(outputFilename);
        double calc = calculatePercentageGain(sizeInput, sizeOutput);
        
        System.out.println(
        					   "|-----------------------------------------------------------|");
        	System.out.println("|                                                           |");
            System.out.printf ("| INPUT  SIZE (KB): %-40s|\n", sizeInput);
            System.out.printf ("| OUTPUT SIZE (KB): %-40s|\n", sizeOutput);
            System.out.println("|                                                           |");
            System.out.println("| ALGORITHM: Run-Length Encoding (RLE)                      |");
            System.out.println("| TEXT-CODIFICATION: UTF-8                                  |");
            System.out.printf ("| COMPRESSION  RATE:=~ %-37s|\n", calc + "%");
            System.out.println("|-----------------------------------------------------------|");

    }
    
    public static int calculatePercentageGain(double initialValue, double finalValue) {
        double percentage = Math.abs(((finalValue - initialValue) / initialValue) * 100);
        return (int) Math.round(percentage);
    }
}


