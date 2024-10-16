/* 
 *
 * Grupo: G2ML
 * Autores: 
 *      - Gustavo Veríssimo			-   rm551244@fiap.com.br
 *      - Gabriel Pacheco     		-   rm550191@fiap.com.br
 *      - Murilo Henrique Obinata	-   rm99855@fiap.com.br
 *      - Leonardo Correia   		-   rm550413@fiap.com.br
 *      
 */

package br.com.fiap.twoespwx.libunclepresser;

import java.util.List;
import java.util.Scanner;

import br.com.fiap.twoespwx.libunclepresser.input.Reader;
import br.com.fiap.twoespwx.libunclepresser.output.OutputWriter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("LIB UNCLE PRESSER - GRUPO G2ML");
        
//        String inputFilename;
//        String outputFilename;
//        if (args.length >= 0 ) {
//        	System.out.println("Dados carregados..."); 
//        	inputFilename = args[0];
//        	outputFilename = args[1];
//        } else {	
//        	System.out.println("Arquivos nao encontrados");     
//        	inputFilename = "inputs/input1.txt";
//        	outputFilename = "outputs/OUTPUT1.txt";
//        }
//        
//      inputFilename = "inputs/input1.txt";
//      outputFilename = "outputs/OUTPUT1.txt";
        
        if (args.length < 2) {
            System.err.println("Erro: É necessário fornecer os caminhos do arquivo de entrada e saída.");
            System.err.println("Uso: java -jar <path/to/jar> <path/to/input> <path/to/output>");
            System.exit(1); 
        }

        String inputFilename = args[0];
        String outputFilename = args[1];
        
        System.out.println(""
        		+ "|-----------------------------------------------------------|\r\n"
        		+ "|                                                           |\r\n"
        		+ "| INPUT  FILENAME: INPUT1.TXT                               |\r\n"
        		+ "| OUTPUT FILENAME: OUTPUT1.TXT                              |\r\n"
        		+ "|                                                           |\r\n"
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
        	System.out.println("|                                                           |");
            System.out.println("|-----------------------------------------------------------|");

    }
    
    public static int calculatePercentageGain(double initialValue, double finalValue) {
        double percentage = Math.abs(((finalValue - initialValue) / initialValue) * 100);
        return (int) Math.round(percentage);
    }
}


