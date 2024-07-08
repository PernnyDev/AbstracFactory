public class CartaoCreditoPagamento implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito.");
    }
}