package Worker;

public class SecurityGuard extends Officer {
    private String document;

    public SecurityGuard(String nameSurName, String phone, String email, String department, String shift, String document) {
        super(nameSurName, phone, email, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    public void surveillance(){
        System.out.println(this.getNameSurName()+" Nöbet tutuyor.");
    }
}
