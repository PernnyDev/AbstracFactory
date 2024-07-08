public class PagamentoFactoryConcreta implements PagamentoFactory {
    @Override
    public Pagamento criarPagamento(String tipo) {
        switch (tipo) {
            case "dinheiro":
                return new DinheiroPagamento();
            case "credito":
                return new CartaoCreditoPagamento();
            case "debito":
                return new CartaoDebitoPagamento();
            case "pix":
                return new PixPagamento();
            default:
                throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + tipo);
        }
    }
}