package Worker;

public class Academician extends Worker {
    private String section;
    private String title;

    public Academician(String nameSurName, String phone, String email,String section,String title) {
        super(nameSurName, phone, email);
        this.section=section;
        this.title=title;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void inStudy(){
        System.out.println(this.getNameSurName()+" Derse giriş yaptı.");
    }
}
