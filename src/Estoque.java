import javax.swing.*;

public class Estoque {
    public static void main(String[]args)throws Exception{
        Tabletes tablete = new Tabletes();
        tablete.cadastarImei();
        tablete.cadastrarImei2();
        tablete.cadastrarPatrimonio();

        System.out.println(tablete.imei1);

    }
}
