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
}
