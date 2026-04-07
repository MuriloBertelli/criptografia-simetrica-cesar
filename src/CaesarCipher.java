import java.util.Scanner;

public class CaesarCipher {

    // Método único que serve tanto para cifrar quanto para decifrar
    public static String processarTexto(String texto, int chave) {
        StringBuilder textoFinal = new StringBuilder();

        // Otimização: normaliza a chave antes do loop para sempre ser um deslocamento positivo (0-25).
        // Isso evita fazer o "if" de número negativo a cada iteração de caractere.
        int deslocamento = chave % 26;
        if (deslocamento < 0) {
            deslocamento += 26;
        }

        // Percorre a string usando índice
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Aplica a regra matemática apenas para caracteres alfabéticos
            if (Character.isLetter(c)) {
                
                // Define a base ASCII dependendo se a letra é maiúscula ou minúscula
                char baseLetra = Character.isUpperCase(c) ? 'A' : 'a';

                // Aplica o deslocamento modular e converte de volta para caractere
                char letraCifrada = (char) (baseLetra + (c - baseLetra + deslocamento) % 26);
                textoFinal.append(letraCifrada);
            } else {
                // Caracteres especiais, números e espaços são mantidos intactos
                textoFinal.append(c);
            }
        }

        return textoFinal.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== LABORATÓRIO: CIFRA DE CÉSAR ===");
        
        // 1. Receber mensagem e valor de k
        System.out.print("Digite o texto alvo: ");
        String textoBase = entrada.nextLine();

        System.out.print("Informe o deslocamento (k): ");
        int deslocamentoK = entrada.nextInt();

        System.out.println("\n--- PROCESSAMENTO ---");

        // 2. Cifrar e exibir
        String textoEncriptado = processarTexto(textoBase, deslocamentoK);
        System.out.println("[+] Texto Cifrado    -> " + textoEncriptado);

        // 3. Decifrar e confirmar original (usando a mesma função com chave negativa)
        String textoRestaurado = processarTexto(textoEncriptado, -deslocamentoK);
        System.out.println("[-] Texto Restaurado -> " + textoRestaurado);

        entrada.close();
    }
}