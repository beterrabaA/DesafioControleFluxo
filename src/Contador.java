import model.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException("O primeiro parâmetro é maior que o segundo");
        int contagem = parametroDois - parametroUm;
        // if (contagem < 0) throw new ParametrosInvalidosException("O primeiro parâmetro é maior que o segundo");
        for (int i = 1; i < contagem; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}