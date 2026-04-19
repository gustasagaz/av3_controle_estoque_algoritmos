
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                    XYZ COMERCIO DE PRODUTOS LTDA.
                                    SISTEMA DE CONTROLE DE ESTOQUE 
                                     
                                     MENU PRINCIPAL 
                                     
                                    1 - CADASTRO DE PRODUTOS
                                    2 - MOVIMENTAÇÃO
                                    3 - REAJUSTE DE PREÇOS
                                    4 - RELATÓRIOS
                                    0 - FINALIZAR \n
                                    DIGITE A OPÇÃO DESEJADA: """));
    
        if (menu == 0) {
            JOptionPane.showMessageDialog(null, """
                                    Sistema encerrado! 
                                    Vejo você na próxima""");
        }
        if (menu == 1) {
            int cadastro = Integer.parseInt(JOptionPane.showInputDialog("""
                                    XYZ COMERCIO DE PRODUTOS LTDA.
                                    SISTEMA DE CONTROLE DE ESTOQUE \n
                                            CADASTRO DE PRODUTOS \n
                                    1 - INCLUSÃO 
                                    2 - ALTERAÇÃO 
                                    3 - CONSULTA 
                                    4 - EXCLUSÃO 
                                    0 - RETORNAR \n
                                    DIGITE A OPÇÃO DESEJADA: """));
        }
        if (menu == 2) {
            int movimentacao = Integer.parseInt(JOptionPane.showInputDialog("""
                                    XYZ COMERCIO DE PRODUTOS LTDA.
                                    SISTEMA DE CONTROLE DE ESTOQUE \n
                                             MOVIMENTAÇÃO \n
                                    1 - ENTRADA 
                                    2 - SAÍDA 
                                    0 - RETORNAR \n
                                    DIGITE A OPÇÃO DESEJADA: """));
        }
        if (menu == 3) {
            int reajuste = Integer.parseInt(JOptionPane.showInputDialog("""
                                    XYZ COMERCIO DE PRODUTOS LTDA.
                                    SISTEMA DE CONTROLE DE ESTOQUE \n
                                               REAJUSTE"""));}
        if (menu == 3) {
            int relatorios = Integer.parseInt(JOptionPane.showInputDialog("""
                                    XYZ COMERCIO DE PRODUTOS LTDA.
                                    SISTEMA DE CONTROLE DE ESTOQUE \n
                                               RELATÓRIOS"""));
        }

    }

}
