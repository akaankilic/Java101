public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;



    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    public void addVerbalNote(int matSozlu,int kimyaSozlu,int fizikSozlu){
        if (matSozlu<=100&&matSozlu>=0){
            this.mat.verbalNote=matSozlu;
        }
        if (fizikSozlu<=100&&fizikSozlu>=0){
            this.fizik.verbalNote=fizikSozlu;
        }
        if (kimyaSozlu<=100&&kimyaSozlu>=0){
            this.kimya.verbalNote=kimyaSozlu;
        }


    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double matNot = (this.mat.note * 0.80) + (this.mat.verbalNote * 0.20);
        double fizikNot = (this.fizik.note * 0.75) + (this.fizik.verbalNote * 0.25);
        double kimyaNot = (this.kimya.note * 0.70) + (this.kimya.verbalNote * 0.30);
        this.avarage=(matNot+fizikNot+kimyaNot)/3;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
