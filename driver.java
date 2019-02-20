public class driver extends person{

    private String license;

    public driver(person newEmp, String cnh) {
        super(newEmp.getNome(), newEmp.getEmail(), newEmp.getCPF(), newEmp.getSalary(), newEmp.getPhone());
        this.license = cnh;
    }
}
