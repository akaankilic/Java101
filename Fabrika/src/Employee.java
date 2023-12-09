import java.time.LocalDateTime;
import java.time.Year;
import java.util.Date;
import java.util.Locale;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    int bonus;
    int yıl;
    double zam;
    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if (this.salary<1000){
            System.out.println("Vergisiz Dilimde Çalışıyor");
        } else if (this.salary>1000) {
            double vergi=this.salary*0.03;
            this.salary-=this.salary-vergi;
        }
        return vergi;
    }
    public int bonus(){
        if (this.workHours>=40){
            this.bonus=(this.workHours-40)*30;
        }
        return bonus;
    }

    public void raiseSalary(){
        LocalDateTime ldt = LocalDateTime.now();
        this.yıl=ldt.getYear()-this.hireYear;
        if (this.yıl>20){
                this.zam=this.salary*0.3;
        } else if (this.yıl<20&&this.yıl>10) {
            this.zam=this.salary*0.1;
        } else if (this.yıl<10) {
            this.zam=this.salary*0.05;
        }
    }
    public String toString(){
        System.out.println("Çalışan : "+this.name);
        System.out.println("Çalışan Maaşı : "+this.salary);
        System.out.println("Haftalık Çalışma Süresi : "+this.workHours);
        System.out.println("Çalışan işe giriş yılı : "+this.hireYear);
        System.out.println("Çalışan vergisi : "+this.vergi);
        System.out.println("Çalışan bonusu: "+this.bonus);
        System.out.println("Çalışan Maaş artışı : "+this.zam);
        System.out.println("Vergi ve bonuslar ile Maaş: "+(this.salary-this.vergi+this.bonus));
        System.out.println("Toplam Maaş : "+(this.salary-this.vergi+this.bonus+this.zam));
        return this.name;
    }


}
