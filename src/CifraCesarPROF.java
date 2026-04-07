import java.util.Scanner;

public class CifraCesarPROF {

    // Método para cifrar a mensagem
    public static String cifrar(String mensagem, int k) {
        StringBuilder resultado = new StringBuilder();

        // Converte para maiúsculas para facilitar a manipulação
        for (char letra : mensagem.toUpperCase().toCharArray()) {
            // Verifica se o caractere é uma letra (ignora espaços e pontuação)
            if (Character.isLetter(letra)) {
                // Aplica a fórmula da Cifra de César: C = (P + k) mod 26
                int posicao = (letra - 'A' + k) % 26;

                // Tratamento especial para o Java lidar com módulo negativo na decifração
                if (posicao < 0) {
                    posicao += 26;
                }

                // Converte de volta para caractere e adiciona ao resultado
                resultado.append((char) (posicao + 'A'));
            } else {
                // Se não for letra, mantém o caractere original (ex: espaço)
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }

    // Método para decifrar a mensagem (reaproveita o método de cifrar com a chave negativa)
    public static String decifrar(String cifrado, int k) {
        return cifrar(cifrado, -k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Receber uma mensagem e um valor de k do usuário
        System.out.println("Caso queira decifrar, basta mandar k negativo.");
        System.out.print("Digite a mensagem a ser cifrada: ");
        String mensagem = scanner.nextLine();

        System.out.print("Digite o valor da chave (k): ");
        int k = scanner.nextInt();

        System.out.println("\n--- PROCESSANDO ---");

        // 2. Cifrar a mensagem e exibir o resultado
        String textoCifrado = cifrar(mensagem, k);
        System.out.println("Texto Cifrado  : " + textoCifrado);

        // 3. Decifrar o texto cifrado e confirmar a mensagem original
        String textoDecifrado = decifrar(textoCifrado, k);
        System.out.println("Texto Decifrado: " + textoDecifrado);

        scanner.close();
    }
}