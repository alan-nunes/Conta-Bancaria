import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Alan";
        String tipoConta = "Corrente";
        double saldo = 1500.00;

        int opcao = 0;
        int numeroConta = 0;
        double valorTransferencia = 0;
        double valorRecebido = 0;

        System.out.println("*********************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("*********************************");

       String menu = """
                ** ESCOLHA SUA OPÇÃO **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair do Sistema
               """;

        while(opcao != 4){
            System.out.println(menu );
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("Seu saldo é: " + saldo);
            }

            else if(opcao == 2){
                System.out.println("Informe o valor que deseja transferir: ");
                valorTransferencia = sc.nextDouble();

                if(saldo <= valorTransferencia){
                    System.out.println("Você não tem saldo suficiente para transferir!");
                    System.out.println("Seu saldo é: " + saldo);
                } else {
                    System.out.println("Informe o numero do conta: ");
                    numeroConta = sc.nextInt();

                    saldo -= valorTransferencia;
                    System.out.println("Tranferência efetuada com sucesso para  a conta: " + numeroConta);
                }
            }

            else if(opcao == 3){
                System.out.println("Informe o valor recebido: ");
                valorRecebido = sc.nextDouble();

                saldo+=valorRecebido;
                System.out.println("Novo saldo: " + saldo);
            }

            else if(opcao != 4){
                System.out.println("Informe uma opção válida");
            }
        }
    }
}