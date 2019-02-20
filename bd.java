import java.util.ArrayList;
import java.util.Scanner;

public class bd {
    //INFORMAÇÕES ARMAZENADAS
        //FUNCIONÁRIOS DO CLUBE
        //Presidente
        protected person president;

        //Médicos
        private ArrayList<doctor> doctors = new ArrayList<doctor>();

        //Técnico
        protected person tech;

        //Personal trainers
        private ArrayList<person> trainers = new ArrayList<person>();

        //Drivers
        private ArrayList<driver> drivers = new ArrayList<driver>();

        //Chefs
        private ArrayList<person> chefs = new ArrayList<person>();

        //Lawyers
        private ArrayList<person> lawyers = new ArrayList<person>();

        //Players
        private ArrayList<player> splayers = new ArrayList<player>();

        //FAN ASSOCIATES
        private ArrayList<fan> associates = new ArrayList<fan>();

        //RESOURCES


    //FUNÇÕES DE MANIPULAÇÃO
        public void addEmployee(){
            int option;

            Scanner keyboard = new Scanner(System.in);

            String nome;
            String email;
            String CPF;
            double salary;
            String phone;
            person newEmp;

            System.out.println("O funcionário pode ser cadastrado em uma das seguintes categorias: ");
            System.out.println("1 - Presidente");
            System.out.println("2 - Médico");
            System.out.println("3 - Técnico");
            System.out.println("4 - Preparador físico");
            System.out.println("5 - Motorista");
            System.out.println("6 - Cozinheiro");
            System.out.println("7 - Advogado");
            System.out.println("8 - Jogador");

            System.out.println("Digite o número correspondente à categoria escolhida: ");
            option = keyboard.nextInt();

            System.out.println("Agora digite as informações do funcionário conforme à ordem: ");
            System.out.println("Nome: ");
            nome = keyboard.nextLine();

            System.out.println("E-mail: ");
            email = keyboard.nextLine();

            System.out.println("CPF: ");
            CPF = keyboard.nextLine();

            System.out.println("Salário: ");
            salary = keyboard.nextDouble();

            System.out.println("Telefone: ");
            phone = keyboard.nextLine();

            newEmp = new person(nome, email, CPF, salary, phone);

            switch (option){
                case 1: //Presidente
                    president = newEmp;
                    break;

                case 2: //Médico
                    String crm;
                    System.out.println("CRM: ");
                    crm = keyboard.nextLine();

                    doctor newMed = new doctor(newEmp, crm);
                    doctors.add(newMed);
                    break;

                case 3: //Técnico
                    tech = newEmp;
                    break;

                case 4: //Preparador
                    trainers.add(newEmp);
                    break;

                case 5: //Motorista
                    String cnh;
                    System.out.println("CNH: ");
                    cnh = keyboard.nextLine();

                    driver newDriv = new driver(newEmp, cnh);
                    drivers.add(newDriv);
                    break;

                case 6: //Cozinheiro
                    chefs.add(newEmp);
                    break;

                case 7: //Advogado
                    lawyers.add(newEmp);
                    break;

                case 8: //Jogador
                    String type;
                    int aux;
                    boolean isHapit = true;

                    System.out.println("Posição: ");
                    type = keyboard.nextLine();

                    System.out.println("Está habilitado para jogar?\n1 - SIM, 2 - NÃO");
                    aux = keyboard.nextInt();

                    if(aux == 2){
                        isHapit = false;
                    }

                    player newPlayer = new player(newEmp, type, isHapit);
                    splayers.add(newPlayer);

                    break;
            }//End switch

        }//End addEmployee

        public void addFan(){
            Scanner keyboard = new Scanner(System.in);

            String nome;
            String email;
            String CPF;
            String phone;
            String address;
            double payment;
            int fanType; //0 - Júnior, 1 - Sênior, 2 - Elite
            fan newFan;

            System.out.println("Digite as informações do novo sócio: ");

            System.out.println("Nome: ");
            nome = keyboard.nextLine();

            System.out.println("E-mail: ");
            email = keyboard.nextLine();

            System.out.println("CPF: ");
            CPF = keyboard.nextLine();

            System.out.println("Endereço: ");
            address = keyboard.nextLine();

            System.out.println("Telefone: ");
            phone = keyboard.nextLine();

            System.out.println("Taxa de pagamento: ");
            payment = keyboard.nextDouble();

            System.out.println("O sócio-torcedor pode ser cadastrado em uma das seguintes categorias: ");
            System.out.println("0 - Júnior");
            System.out.println("2 - Sênior");
            System.out.println("3 - Elite");
            System.out.println("Favor, digite o número da categoria correspondente: ");
            fanType = keyboard.nextInt();

            newFan = new fan(nome, email, CPF, payment, phone, address, 1, fanType);

            associates.add(newFan);

        }

        public void addResource(){}

        public void generateStaffReport(){
            int option;
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Você deseja um relatório sobre:\n1 - Time\n2 - Serviços gerais");
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    System.out.println("TÉCNICO");
                    System.out.println(tech.toString());

                    for(int i=0;i<splayers.size();i++){
                        System.out.println(splayers.get(i).toString());
                    }
                    break;
                case 2:
                    break;
            }

        }
        public void generateFansReport(){}
        public void generateResourcesReport(){}

        public void registerNonPay(){}
        public void attFanValue(){}

}
