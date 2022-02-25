import java.math.BigDecimal;

public class ExecutarTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Modulo Orientação a Objeto");
        produto1.setValor(BigDecimal.valueOf(100.00));

        Produto produto2 = new Produto();
        produto2.setId(2L);
        produto2.setNome("Módulo de Sptring Boot API Rest");
        produto2.setValor(BigDecimal.valueOf(300.00));

        Produto produto3 = new Produto();
        produto3.setId(3L);
        produto3.setNome("Módulo de Angula 8");
        produto3.setValor(BigDecimal.valueOf(100.00));

        Produto produto4 = new Produto();
        produto4.setId(4L);
        produto4.setNome("Módulo de Hibernate");
        produto4.setValor(BigDecimal.valueOf(100.00));

        Venda venda = new Venda();
        venda.setDescricaoVenda("Venda Curso Formação Java");
        venda.setEnderecoEntrega("Entrega pelo E-mail");
        venda.setId(10L);
        venda.setNomeCliente("Luis");
        //venda.setValorTotal(BigDecimal.valueOf(197.00));

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);
        venda.getListaProdutos().add(produto3);
        venda.getListaProdutos().add(produto4);

        for (Produto produto: venda.getListaProdutos()) {
            System.out.println("Descrição produto: "+ produto);
        }
        System.out.println("Valor total: "+venda.getValorTotal());
        System.out.println("Descrição da Venda: "+venda);
    }
}
