package Worker;

public class LabAsistants extends Assistant{
    public LabAsistants(String nameSurName, String phone, String email, String section, String title, String workingHours) {
        super(nameSurName, phone, email, section, title, workingHours);
    }
    public void inLab(){
        System.out.println(this.getNameSurName()+" Laboratuvara giriş yaptı.");
    }
   @Override
    public void makeQuiz(){
        System.out.println(this.getNameSurName()+" laboratuvarda test yapıyor.");
    }
}
