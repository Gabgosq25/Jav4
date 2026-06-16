import java.util.Scanner;

public class ExUcsal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int windows = 0;
        int unix = 0;
        int linux = 0;
        int netware = 0;
        int mac = 0;
        int outro = 0;

        do {

            System.out.println("Qual a melhor opção de sistemas operacionais para servidores? ");
            System.out.println("1 - Windows Server.");
            System.out.println("2 - Unix.");
            System.out.println("3 - Linux.");
            System.out.println("4 - Netware.");
            System.out.println("5 - Mac OS.");
            System.out.println("6 - Outro.");
            i = sc.nextInt();

            if (i == 1) {
                windows = windows + 1;
            } else if (i == 2) {
                unix = unix + 1;

            } else if (i == 3) {
                linux = linux + 1;

            } else if (i == 4) {
                netware = netware + 1;

            } else if (i == 5) {
                mac = mac + 1;

            } else if (i == 6) {
                outro++;
            } else if (i < 0 || i > 6) {
                System.out.println("Opção inválida!");
            } else {
                System.out.println("Fim da leitura de dados! Calculando...");
            }
        } while (i != 0);
        double tot = windows + unix + linux + netware + mac + outro;
        double percwindows = ((double) windows / tot) * 100;
        double percunix = ((double) unix / tot) * 100;
        double perclinux = ((double) linux / tot) * 100;
        double percnetware = ((double) netware / tot) * 100;
        double percmac = ((double) mac / tot) * 100;
        double percoutro = ((double) outro / tot) * 100;

        if (tot > 0) {
            System.out.println(windows + "Votaram para windows!");
            System.out.printf("%.2f%% dos participantes escolheram Windows como melhor sistema para servidores.\n",
                    percwindows);
            System.out.println(unix + "Votaram para unix!");
            System.out.printf("%.2f%% dos participantes escolheram Unix como melhor sistema para servidores.\n",
                    percunix);
            System.out.println(linux + "Votaram para linux!");
            System.out.printf("%.2f%% dos participantes escolheram Linux como melhor sistema para servidores.\n",
                    perclinux);
            System.out.println(netware + "Votaram para netware!" );
            System.out.printf("%.2f%% dos participantes escolheram Netware como melhor sistema para servidores.\n",
                    percnetware);
            System.out.println(mac + "Votaram para Mac Os");
            System.out.printf("%.2f%% dos participantes escolheram Mac OS como melhor sistema para servidores.\n",
                    percmac);
            System.out.println(outro + "Votaram para outro!");
            System.out.printf("%.2f%% dos participantes escolheram outro como melhor sistema para servidores.\n",
                    percoutro);
        } else {
            System.out.println("Nenhum voto foi computado no sistema!");

        }

        sc.close();
    }

}
