public class doctor extends person{

    private String CRM;

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public void isHapto(player p){
        p.setHapit(true);
    }

    public void notHapt(player p){
        p.setHapit(false);
    }


    public doctor(person newEmp, String crm) {
        super(newEmp.getNome(), newEmp.getEmail(), newEmp.getCPF(), newEmp.getSalary(), newEmp.getPhone());
        this.CRM = crm;
    }
}
