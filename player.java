public class player extends person{

    private String type;
    private boolean isHapit;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHapit() {
        return isHapit;
    }

    public void setHapit(boolean canPlay) {
        this.isHapit = canPlay;
    }

    public player(String nome, String email, String CPF, double salary, String phone) {
        super(nome, email, CPF, salary, phone);
    }
}
