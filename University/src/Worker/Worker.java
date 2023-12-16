package Worker;

public class Worker {
    private String nameSurName;
    private String phone;
    private String email;


    public Worker(String nameSurName, String phone, String email) {
        this.nameSurName = nameSurName;
        this.phone = phone;
        this.email = email;
    }

    public java.lang.String getNameSurName() {
        return nameSurName;
    }

    public void setNameSurName(java.lang.String nameSurName) {
        this.nameSurName = nameSurName;
    }

    public java.lang.String getPhone() {
        return phone;
    }

    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }
    public void userİn(){
        System.out.println(this.nameSurName+" Universiteye giriş yaptı. ");

    }
    public void userOut(){
        System.out.println(this.nameSurName+" Universiteden çıkış yaptı. ");
    }
    public void eating(){
        System.out.println(this.nameSurName+" öğün ihtiyacını karşıladı.");
    }
}
