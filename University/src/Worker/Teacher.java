package Worker;

public class Teacher extends Academician {
    public Teacher(String nameSurName, String phone, String email, String section, String title, String classRoom) {
        super(nameSurName, phone, email, section, title);
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    private String classRoom;
    public void takeExam(){
        System.out.println(this.getNameSurName()+" Sınav yapıyor.");
    }
    public void meet(){
        System.out.println("Toplantı yapıyor.");
    }
}
