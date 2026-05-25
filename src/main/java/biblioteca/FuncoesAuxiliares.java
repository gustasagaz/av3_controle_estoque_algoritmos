package biblioteca;

import javax.swing.JOptionPane;

/**
 * Classe com funçoes auxíliares utilizadas no sistema.
 *
 * responsavel por: 
 * - Buscar produtos 
 * - Verificar se o estoque está vazio 
 * - Validar entradas numéricas 
 * - Validar respostas Sim/Não 
 * - Validar unidades de medida
 *
 * @author vicenteedu
 * @author douglas
 * @author DarthRuver007
 * @author linndev9
 *
 */
public class FuncoesAuxiliares {

    /**
     * Busca um produto pelo nome no vetor de produtos.
     *
     * @param nomes vetor contendo os nomes dos produtos
     * @param total quantidade total de produtos cadastrados
     * @param nomeBusca nome do produto a ser localizado
     * @return posição do produto no vetor ou -1 caso não encontrado
     */
    public static int buscarProduto(String[] nomes, int total, String nomeBusca) {

        for (int i = 0; i < total; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Verifica se o estoque está vazio.
     *
     * @param total quantidade total de produtos cadastrados
     * @return true se o estoque estiver vazio, false caso contrário
     */
    public static boolean estoqueVazio(int total) {

        if (total == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!");
            return true;
        }

        return false;
    }

    /**
     * Realiza a leitura de valores numéricos do tipo double.
     *
     * O método continua solicitando a entrada até que um valor válido seja informado.
     *
     * @param mensagem mensagem exibida ao usuário
     * @return valor double informado ou -1 em caso de cancelamento
     */
    public static double lerDouble(String mensagem) {

        boolean valido = false;
        double valor = -1;

        while (!valido) {
            String entrada = JOptionPane.showInputDialog(mensagem);
            if (entrada == null) {
                return -1;
            }
            entrada = entrada.trim();
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                valor = Double.parseDouble(entrada);
                valido = true;
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Digite apenas números válidos.");
            }
        }
        return valor;
    }

    /**
     * Lê e valida respostas do tipo Sim ou Não.
     *
     * @param mensagem mensagem exibida ao usuário
     * @return caractere correspondente à resposta informada
     */
    public static char lerSimNao(String mensagem) {

        boolean valido = false;
        char opcao = '\0';

        while (!valido) {
            String resposta = JOptionPane.showInputDialog(
                    mensagem + "\n\nS - Sim\nN - Não");
            if (resposta != null && resposta.length() == 1) {
                opcao = resposta.charAt(0);
                if (opcao == 'S' || opcao == 's'
                        || opcao == 'N' || opcao == 'n') {
                    valido = true;
                }
            }
            if (!valido) {
                JOptionPane.showMessageDialog(
                        null,
                        "Digite apenas S ou N.");
            }
        }
        return opcao;
    }

    /**
     * Lê e valida a unidade de medida do produto.
     *
     * As unidades aceitas são: Kg, Un, Cx, Pct e L.
     *
     * @param mensagem mensagem exibida ao usuário
     * @return unidade válida informada ou null em caso de cancelamento
     */
    public static String lerUnidade(String mensagem) {

        boolean valido = false;
        String unidade = "";

        while (!valido) {
            unidade = JOptionPane.showInputDialog(mensagem);
            if (unidade != null) {
                unidade = unidade.trim();
                if (unidade.equalsIgnoreCase("Kg")
                        || unidade.equalsIgnoreCase("Un")
                        || unidade.equalsIgnoreCase("Cx")
                        || unidade.equalsIgnoreCase("Pct")
                        || unidade.equalsIgnoreCase("L")) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Use apenas: Kg, Un, Cx, Pct ou L.");
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Digite uma unidade válida."
                );
            }
        }
        return unidade;
    }
}
