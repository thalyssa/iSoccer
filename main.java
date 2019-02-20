import java.util.Scanner;

public class main {

    public static bd database = new bd();

    public static boolean validate(String login, String password){
        if(login.equals("admin")){
            return password.equals("0000");
        }

        return false;
    }

    public static void init(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Bem vindo ao iSoccer!\nDigite seu login: ");
        String login = keyboard.nextLine();

        System.out.println("\nDigite sua senha: ");
        String password = keyboard.nextLine();

        if(validate(login, password)){
            menu();
        }else{
            System.out.printf("Login ou senha incorretos!");
        }
    }

    public static void menu(){
        int option;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("PAINEL DE ADMINISTRADOR\n");
        System.out.println("Favor escolha a opção desejada: ");
        System.out.println("1 - Gerenciamento de funcionários\n2 - Gerenciamento de sócio-torcedores\n3 - Gerenciamento de recursos");

        option = keyboard.nextInt();

        switch (option){
            case 1:
                employeeManagment();
                break;
            case 2:
                fanManagment();
                break;
            case 3:
                resourcesManagment();
                break;
            default:
                System.out.println("Opção inválida! Por favor, tente novamente");
        }

    }

    public static void employeeManagment(){
        int option;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("GERENCIAMENTO DE FUNCIONÁRIOS");
        System.out.println("1 - Adicionar funcionário\n2 - Gerar relatório");

        option = keyboard.nextInt();

        switch (option){
            case 1:
                database.addEmployee();
                break;
            case 2:
                database.generateStaffReport();
                break;
            default:
                System.out.println("Opção inválida! Por favor, tente novamente");
        }
    }

    public static void fanManagment(){
        int option;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("GERENCIAMENTO DE SÓCIO-TORCEDORES");
        System.out.println("1 - Adicionar sócio\n2 - Registrar inadimplência\n3 - Atualizar contribuição\n4 - Gerar relatório");

        option = keyboard.nextInt();

        switch (option){
            case 1:
                database.addFan();
                break;
            case 2:
                database.registerNonPay();
                break;
            case 3:
                database.attFanValue();
                break;
            case 4:
                database.generateFansReport();
                break;
            default:
                System.out.println("Opção inválida! Por favor, tente novamente");
        }
    }

    public static void resourcesManagment(){
        int option;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("GERENCIAMENTO DE RECURSOS");
        System.out.println("1 - Adicionar novo recurso\n2 - Gerar relatório");

        option = keyboard.nextInt();

        switch (option){
            case 1:
                database.addResource();
                break;
            case 2:
                database.generateResourcesReport();
                break;
            default:
                System.out.println("Opção inválida! Por favor, tente novamente");
        }
    }

    public static void main(String args[]){
        init();
    }
}
