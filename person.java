public class person {
    private String nome;
    private String email;
    private String CPF;
    private double salary;
    private String phone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Construtor para funcionários
    public person(String nome, String email, String CPF, double salary, String phone) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.salary = salary;
        this.phone = phone;
    }

    //Construtor para torcedores
    public person(String nome, String email, String CPF, String phone) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.phone = phone;
    }
}
