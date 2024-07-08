public class DinheiroPagamento implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado em dinheiro.");
    }
}