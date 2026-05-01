import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        char menuCHAR;

        // MENU PRINCIPAL COM LOOP
        do {
            String menu = JOptionPane.showInputDialog("""
                                    XYZ COMERCIO DE PRODUTOS LTDA.
                                    SISTEMA DE CONTROLE DE ESTOQUE 
                                     
                                     MENU PRINCIPAL 
                                     
                                    1 - CADASTRO DE PRODUTOS
                                    2 - MOVIMENTAÇÃO
                                    3 - REAJUSTE DE PREÇOS
                                    4 - RELATÓRIOS
                                    0 - FINALIZAR
                                    
                                    DIGITE A OPÇÃO DESEJADA: """);

            menuCHAR = menu.charAt(0);

            switch (menuCHAR) {
                case '1':
                    menuCadastro();
                    break;

                case '2':
                    menuMovimentacao();
                    break;

                case '3':
                    reajuste();
                    break;

                case '4':
                    menuRelatorios();
                    break;
            }

        } while (menuCHAR != '0');
    }

    // ================= CADASTRO =================
    static void menuCadastro() {
        char cadastroCHAR;

        do {
            String cadastro = JOptionPane.showInputDialog("""
                                    CADASTRO DE PRODUTOS
                                    
                                    1 - INCLUSÃO 
                                    2 - ALTERAÇÃO 
                                    3 - CONSULTA 
                                    4 - EXCLUSÃO 
                                    0 - RETORNAR
                                    
                                    DIGITE A OPÇÃO: """);

            cadastroCHAR = cadastro.charAt(0);

            switch (cadastroCHAR) {
                case '1':
                    incluir();
                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, "Alteração ainda não implementada.");
                    break;
                case '3':
                    JOptionPane.showMessageDialog(null, "Consulta ainda não implementada.");
                    break;
                case '4':
                    JOptionPane.showMessageDialog(null, "Exclusão ainda não implementada.");
                    break;
            }

        } while (cadastroCHAR != '0');
    }

    // ================= INCLUSÃO =================
    static void incluir() {
        char newinclusaoCHAR;

        do {
            String nome = JOptionPane.showInputDialog("Informe o nome do produto:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço:"));
            int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));

            String confirma = JOptionPane.showInputDialog("""
                    Confirma a inclusão?
                    S - Sim
                    N - Não
                    """);

            char confirmaCHAR = confirma.charAt(0);

            if (confirmaCHAR == 's' || confirmaCHAR == 'S') {
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Inclusão cancelada!");
            }

            String newinclusao = JOptionPane.showInputDialog("""
                    Deseja nova inclusão?
                    S - Sim
                    N - Não
                    """);

            newinclusaoCHAR = newinclusao.charAt(0);

        } while (newinclusaoCHAR == 's' || newinclusaoCHAR == 'S');
    }

    // ================= MOVIMENTAÇÃO =================
    static void menuMovimentacao() {
        char op;

        do {
            String movimentacao = JOptionPane.showInputDialog("""
                                    MOVIMENTAÇÃO
                                    
                                    1 - ENTRADA 
                                    2 - SAÍDA 
                                    0 - RETORNAR
                                    
                                    DIGITE A OPÇÃO: """);

            op = movimentacao.charAt(0);

            switch (op) {
                case '1':
                    JOptionPane.showMessageDialog(null, "Entrada de produto.");
                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, "Saída de produto.");
                    break;
            }

        } while (op != '0');
    }

    // ================= REAJUSTE =================
    static void reajuste() {
        JOptionPane.showMessageDialog(null, "Reajuste de preços.");
    }

    // ================= RELATÓRIOS =================
    static void menuRelatorios() {
        char op;

        do {
            String relatorios = JOptionPane.showInputDialog("""
                                    RELATÓRIOS
                                    
                                    1 - LISTA DE PREÇOS 
                                    2 - BALANÇO FÍSICO-FINANCEIRO 
                                    0 - RETORNAR
                                    
                                    DIGITE A OPÇÃO: """);

            op = relatorios.charAt(0);

            switch (op) {
                case '1':
                    JOptionPane.showMessageDialog(null, "Lista de preços.");
                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, "Balanço físico-financeiro.");
                    break;
            }

        } while (op != '0');
    }
}
