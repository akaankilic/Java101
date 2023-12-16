package Worker;

public class Officer extends Worker {
    public Officer(String nameSurName, String phone, String email, String department, String shift) {
        super(nameSurName, phone, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    private String department;
    private String shift;

    public void work(){
        System.out.println(this.getNameSurName()+" işine başladı.");
    }
}
