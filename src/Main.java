import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Escolha o método de pagamento:");
            System.out.println("1 - Dinheiro");
            System.out.println("2 - Crédito");
            System.out.println("3 - Débito");
            System.out.println("4 - Pix");
            System.out.print("Digite o número da opção desejada: ");
            int opcao = scanner.nextInt();

            PagamentoFactory pagamentoFactory = new PagamentoFactoryConcreta();
            Pagamento pagamento = null;

            switch (opcao) {
                case 1:
                    pagamento = pagamentoFactory.criarPagamento("dinheiro");
                    break;
                case 2:
                    pagamento = pagamentoFactory.criarPagamento("credito");
                    break;
                case 3:
                    pagamento = pagamentoFactory.criarPagamento("debito");
                    break;
                case 4:
                    pagamento = pagamentoFactory.criarPagamento("pix");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            if (pagamento != null) {
                pagamento.processarPagamento();
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        } finally {
            scanner.close();
        }
    }
}