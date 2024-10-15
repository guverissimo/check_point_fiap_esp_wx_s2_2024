package br.com.fiap.twoespwx.libunclepresser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {

    // Processa uma lista de strings e retorna um relatório consolidado
    public String countAll(List<String> inputs) {
        StringBuilder result = new StringBuilder();
        StringBuilder rleOutput = new StringBuilder();

        result.append("\n\n-----------------------------------------------------------\n");
        result.append("  :: Lib Uncle Presser - Nucleotidio Presser Algorithm ::\n");
        result.append("-----------------------------------------------------------\n");

        // Mapa para armazenar as frequências consolidadas
        Map<Character, Integer> totalFrequencies = new HashMap<>();
        int totalLength = 0;

        // Processa cada sequência e acumula frequências e tamanho
        for (String input : inputs) {
            if (!input.isEmpty()) {
                totalLength += input.length();  // Soma o tamanho total
                accumulateFrequencies(totalFrequencies, input);  // Acumula frequências
                rleOutput.append(count(input)).append("\n");  // Gera a saída RLE
            }
        }

        // Exibe as frequências consolidadas
        result.append(" Frequências Totais:\n");
        for (Map.Entry<Character, Integer> entry : totalFrequencies.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        result.append("                                                           \n");
        result.append(" Tamanho Total das Sequências :: ").append(totalLength).append("\n");
        result.append("                                                           ");

        // Imprime o relatório no console
        System.out.println(result.toString());

        // Retorna a saída RLE das sequências
        return rleOutput.toString();
    }

    // Gera a compressão RLE para uma sequência
    private String count(String input) {
        StringBuilder rleOutput = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                appendRLE(rleOutput, currentChar, count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        appendRLE(rleOutput, currentChar, count);  // Adiciona o último caractere

        return rleOutput.toString();
    }

    // Acumula as frequências de caracteres de uma sequência no mapa fornecido
    private void accumulateFrequencies(Map<Character, Integer> frequencies, String input) {
        for (char c : input.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
    }

    // Adiciona um caractere e sua contagem ao RLE, mas só se a contagem for maior que 1
    private void appendRLE(StringBuilder rleOutput, char c, int count) {
        if (count > 1) {
            rleOutput.append(c).append(count);
        } else {
            rleOutput.append(c);
        }
    }
}
