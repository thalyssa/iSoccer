public class fan extends person {

    private String address;
    private double payment;
    private int status; //0 - Inadimplente, 1 - Adimplente
    private int fanType; //0 - Júnior, 1 - Sênior, 2 - Elite

    public fan(String nome, String email, String CPF, double payment, String phone, String address, int status, int type) {
        super(nome, email, CPF, phone);
        this.payment = payment;
        this.address = address;
        this.status = status;
        this.fanType = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFanType() {
        return fanType;
    }

    public void setFanType(int fanType) {
        this.fanType = fanType;
    }

    public String toString(){
        String format = "Nome: " + this.getNome() + "\nE-mail: " + this.getEmail() + "\nCPF: " + this.getCPF() + "\nContribuição: " + this.getPayment() + "\nTelefone: " + this.getPhone() + "\nEndereço: " + this.address + "\n";
        if(this.status ==  1){
            format.concat("O torcedor está adimplente\n");
        }else{
            format.concat("O torcedor está inadimplente\n");
        }

        switch (this.fanType){
            case 0:
                format.concat("Este é um torcedor tipo Júnior");
                break;
            case 1:
                format.concat("Este é um torcedor tipo Sênior");
                break;
            case 2:
                format.concat("Este é um torcedor tipo Elite");
                break;
        }
        return (format);
    }
}
