package Worker;

public class Assistant extends Academician{
    private String workingHours;
    public Assistant(String nameSurName, String phone, String email, String section, String title,String workingHours) {
        super(nameSurName, phone, email, section, title);
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
    public void makeQuiz(){
        System.out.println(this.getNameSurName()+" test yapıyor.");
    }





}
