import javax.swing.*;

public class Tabletes {
    public String imei1;
    public String imeil2;
    public String patrimonio;
    public boolean escolha = true;

    public void cadastarImei() {
        while (escolha == true) {
            imei1 = JOptionPane.showInputDialog("Digite o EMEI 1");
            int escolha1 = JOptionPane.showInternalConfirmDialog(null,
                    "Deseja Salvar? ",
                    "CADASTRO",
                    JOptionPane.YES_NO_OPTION,
                    0);
            if (escolha1 == 1){
                int escolha = JOptionPane.showConfirmDialog(null,
                        "Deseja cadastrar um novo IMEI?",
                        "Cadastro",
                        JOptionPane.YES_NO_OPTION,
                        0);
            }else {
                int escolha2 = JOptionPane.showConfirmDialog(null,
                            "Deseja sair do sistema?",
                            "CADASTRO",
                            JOptionPane.YES_NO_OPTION,
                            0);
                if (escolha2 == 1){
                    escolha = true;
                }
            escolha = false;
            }
        }
        escolha = true;
    }

    public void cadastrarImei2(){
        while (escolha == true) {
            imeil2 = JOptionPane.showInputDialog("Digite o IMEI 2");
            int escolha1 = JOptionPane.showConfirmDialog(null,
                    "Deseja salvar o IMEI 2",
                    "CADASTRO",
                    JOptionPane.YES_NO_OPTION,
                    0);
            if (escolha1 == 1) {
                int escolha = JOptionPane.showConfirmDialog(null,
                        "Deseja cadastrar um novo Imai 2",
                        "CADASTRO",
                        JOptionPane.YES_NO_OPTION,
                        0
                );
            } else {
                escolha = false;
            }
        }
        escolha = true;
    }
    public void cadastrarPatrimonio(){
        while (escolha == true){
            patrimonio = JOptionPane.showInputDialog("Digite o Patrimonio");
            int escolha1 = JOptionPane.showConfirmDialog(null,
                    "Deseja salvar ?",
                    "CADASTRO",
                    JOptionPane.YES_NO_OPTION,
                    0);
            if (escolha1 == 1){
                escolha1 = JOptionPane.showConfirmDialog(null,
                        "Deseja cadastrar um novo patrimonio",
                        "CADASTRO",
                        JOptionPane.YES_NO_OPTION,
                        0
                );
            }else {
                escolha = false;
            }
        } escolha = true;
    }
}
