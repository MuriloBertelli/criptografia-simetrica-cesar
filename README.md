# 🛡️ Laboratório: Criptografia Simétrica - Cifra de César

[cite_start]Este repositório contém a resolução das atividades práticas sobre Criptografia Simétrica[cite: 8], desenvolvidas para a disciplina de Segurança da Informação. [cite_start]O objetivo do laboratório é compreender o funcionamento do algoritmo de substituição mais antigo[cite: 158], suas vulnerabilidades a ataques de força bruta e implementar sua lógica programaticamente.

## 📁 Estrutura do Projeto

* `/src`: Contém a implementação do algoritmo em Java (`CifraCesar.java`).
* `/evidencias`: Armazena as capturas de tela (prints) das resoluções manuais exigidas pelo professor.
* `/docs`: Contém a exportação em PDF do relatório final consolidado no Notion.

## 🎯 Tarefas Desenvolvidas

### [cite_start]Parte 1: Cifração Manual [cite: 193]
* [cite_start]**Objetivo:** Cifrar a mensagem "SEGURANCA DA INFORMACAO" utilizando $k=7$[cite: 195, 196].
* **Evidência:** O print da execução e mapeamento do alfabeto encontra-se na pasta `/evidencias/tarefa1_cifracao.png`.

### [cite_start]Parte 2: Decifração Manual (Força Bruta) [cite: 204]
* [cite_start]**Objetivo:** Decifrar o criptograma "FULSWRJUDILD" testando os valores de $k$ de 1 a 25 até encontrar sentido em português[cite: 208, 209, 210, 211].

### [cite_start]Parte 3: Implementação em Java [cite: 214]
* [cite_start]**Objetivo:** Criar um programa capaz de receber uma mensagem e um valor $k$, realizando os processos de cifração e decifração de forma automatizada[cite: 217, 218, 219].
* **Como executar:**
    ```bash
    cd src
    javac CifraCesar.java
    java CifraCesar
    ```

### [cite_start]Parte 4: Reflexão [cite: 222]
Discussões teóricas respondidas no relatório final (disponível em `/docs`), englobando:
1. [cite_start]A insegurança da Cifra de César nos dias atuais[cite: 224].
2. [cite_start]Comparativo de esforço de força bruta entre AES-128 e Cifra de César[cite: 225, 226].
3. [cite_start]Classificação do algoritmo (substituição vs. transposição)[cite: 227].
4. [cite_start]Aplicações cotidianas da criptografia simétrica (AES)[cite: 228].

---
*Desenvolvido como requisito prático acadêmico.*