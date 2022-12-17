import com.manoelcampos.exportador.ColunaHtml;
import com.manoelcampos.exportador.ExportadorListaProduto;
import com.manoelcampos.exportador.Produto;

import java.util.List;

/**
 * Executa a aplicação Exportador Simple Factory.
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) {
        final List<Produto> produtos = List.of(
            new Produto("TV", "LG", "132-A", 120),
            new Produto("Notebook", "Asus", "New age", 341),
            new Produto("Smartphone", "Samsung", "Galaxy S10", 214)
        );

        ExportadorListaProduto exportadorPadrao = ExportadorListaProduto.newInstance();
        exportadorPadrao.addColuna("Descrição", Produto::getDescricao).addColuna("Marca", Produto::getMarca);
        System.out.println("Lista de Produtos em HTML\n");
        System.out.println(exportadorPadrao.exportar(produtos));

        ExportadorListaProduto exportadorMarkdown = ExportadorListaProduto.newInstance("md");
        exportadorMarkdown.addColuna("Descrição", Produto::getDescricao).addColuna("Marca", Produto::getMarca);
        System.out.println("Lista de Produtos em Markdown\n");
        System.out.println(exportadorMarkdown.exportar(produtos));
    }
}
