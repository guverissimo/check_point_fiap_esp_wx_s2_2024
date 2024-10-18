# Título

## Seção 1 - Introdução

> A manipulação de dados biológicos, especialmente sequências de nucleotídeos (A, T, C, G), é essencial em bioinformática. Esse artigo apresenta uma aplicação Java chamada Lib Uncle Presser, que realiza a compressão e análise de frequências dessas sequências. Utilizamos o algoritmo de Run Length Encoding (RLE) para compactação e fornecemos estatísticas detalhadas sobre os nucleotídeos.

> Além disso, a aplicação é projetada para ser executada via linha de comando, permitindo que usuários especifiquem o caminho dos arquivos de entrada e saída, garantindo flexibilidade no uso e processamento de grandes conjuntos de dados.

## Seção 2 - Fundamentos
> A codificação por comprimento de execução (Run-Length Encoding, RLE) é uma forma de compressão de dados sem perda em que sequências repetidas de um mesmo valor (ocorrências consecutivas de um mesmo dado) são armazenadas como uma única ocorrência desse valor junto com a contagem das repetições, em vez de serem armazenadas na sequência original.

> Por exemplo, em uma aplicação imaginária, ao codificar uma imagem composta por pontos coloridos, a sequência "verde verde verde verde verde verde verde verde verde" seria abreviada para "verde x 9". Essa técnica é mais eficiente para dados que contêm muitas dessas sequências repetidas, como em imagens gráficas simples (ícones, desenhos lineares, jogos e animações).

## Seção 3 - Metodologia
> O projeto baseia-se em conceitos da compressão de dados, análise de string e manipulação de arquivos. 

    1. Manipulação de Strings:
        A sequências de nucleotídeos são tratadas como cadeia de texto. Cada letra da string representa um dos nucleotídeios:
            - A: Adenina
            - T: Timina
            - C: Citosina
            - G: Guanina
    
        A Manipulação permite:
            - Filtragem de caracteres não desejados.
            - Contagem de frequências de cada letra.
            - Compressão utilizando o Run-Length Encoding (RLE).

## Seção 4 - Experimentos
> A fim de experimentos vamos utilizar esse arquivo como base do nosso teste
 Nome do arquivo: 
    *italic* 
    input1.txt

Conteudo:
___
```
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
ACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAAACTGACTGACTGACTGAAAAAAAAAAAAAAAAAAAAAAAA
```
___
> O tamanho desse arquivo é de aproximadamente 1336KB

## Seção 5 - Resultados
> Após a compilação dos dados obtemos os seguintes resultados:
 Nome do arquivo: 
    *italic* 
    output1.txt

Conteudo:
___
```
ACTGACTGACTGACTGA24
ACTGACTGACTGACTGA24
ACTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA24
ACTGACTGACTGACTGA24
ACTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA24
ACTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA24
ACTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA24
ACTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA24
ACTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA25CTGACTGACTGACTGA24
```
___

> Neste exemplos tivemos uma compressão de aproximadamente 54% em relação ao arquivo original utilizando o algoritmo Run-Length Encoding (RLE). Diminuindo o tamanho do arquivo para aproximadamente 614KB

## Seção 6 - Conclusões
> O Lib Uncle Presser é uma aplicação eficiente para compressão e análise de sequências biológicas. Utilizando o algoritmo RLE, conseguimos reduzir o tamanho dos dados e fornecer informações estatísticas relevantes. A implementação em Java e a capacidade de aceitar entradas e saídas via linha de comando garantem flexibilidade e facilidade de uso para aplicações reais na área de bioinformática.

## Seção 7 - Referências
https://github.com/andrew-manzyk/markdown-guide
https://en.wikipedia.org/wiki/Run-length_encoding