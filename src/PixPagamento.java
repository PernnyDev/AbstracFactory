public class PixPagamento implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado via Pix.");
    }
}