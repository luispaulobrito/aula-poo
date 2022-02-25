import java.math.BigDecimal;

public class ExecutarTeste {
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.setDescricaoVenda("Venda Curso Formação Java");
        venda.setEnderecoEntrega("Entrega pelo E-mail");
        venda.setId(10L);
        venda.setNomeCliente("Luis");
        venda.setValorTotal(BigDecimal.valueOf(197.00));

        System.out.println("Descrição da Venda: "+venda.getDescricaoVenda());
    }
}
