package Worker;

public class Computing extends Officer {
    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    private String duty;

    public Computing(String nameSurName, String phone, String email, String department, String shift, String duty) {
        super(nameSurName, phone, email, department, shift);
        this.duty = duty;
    }
    public void networkInstallation(){
        System.out.println(this.getNameSurName()+" Sistem kurulumu yapıyor.");
    }
}
