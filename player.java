public class player extends person{

    private String type;
    private boolean isHapit;

    public player(person newEmp, String type, boolean isHapit) {
        super(newEmp.getNome(), newEmp.getEmail(), newEmp.getCPF(), newEmp.getSalary(), newEmp.getPhone());
        this.type = type;
        this.isHapit = isHapit;
    }

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

}
