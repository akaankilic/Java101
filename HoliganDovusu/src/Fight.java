import java.util.Random;

public class Fight {
    Holigan h1;
    Holigan h2;
    int minWeight;
    int maxWeight;
    Random b = new Random();
    int a = b.nextInt(1,100) ;


    Fight(Holigan h1, Holigan h2, int maxWeight, int minWeight) {
        this.h1 = h1;
        this.h2 = h2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        System.out.println(a);
    }




    void dovus() {
        if (a>50){
            System.out.println("Dövüşe "+this.h1.name+ " Başlıyor");
            if (isCheck()) {
                System.out.println("Çatışma Başladı..");
                for (int i = 1; this.h1.health >= 0 && this.h2.health >= 0; i++) {
                    System.out.println(i + " . Round ");
                    Random d = new Random();
                    System.out.println("Saldıran--" + this.h1.name);
                    this.h1.damage = d.nextInt(this.h1.damage + 5);
                    System.out.println("Vurulan Hasar = " + this.h1.damage);
                    int hasar1 = this.h1.damage;
                    this.h2.health -= hasar1;
                    System.out.println(this.h2.name + " Kalan canı " + this.h2.health);
                    System.out.println("=============");
                    System.out.println("      ");
                    Random s = new Random();
                    System.out.println("Saldıran--" + this.h2.name);
                    this.h2.damage = s.nextInt(this.h2.damage + 5);
                    System.out.println("Vurulan Hasar = " + this.h2.damage);
                    int hasar2 = this.h2.damage;
                    this.h1.health -= hasar2;
                    this.h1.health = this.h1.health - this.h2.damage;
                    System.out.println(this.h1.name + " Kalan canı " + this.h1.health);
                    System.out.println("=============");
                    System.out.println("      ");
                    if (this.h1.health < 0 || this.h2.health < 0) {
                        System.out.println("Dövüş Sona Erdi");
                        if (this.h1.health < 0) {
                            System.out.println("Kazanan = " + this.h2.name);
                        }
                        if (this.h2.health < 0) {
                            System.out.println("Kazanan = " + this.h1.name);
                        }


                    }
                }
            } else {
                System.out.println("Holiganlar Birbirine eş değil..");
            }

        }else {
            System.out.println("Dövüşe "+this.h2.name+" Başlıyor");
            if (isCheck()) {
                System.out.println("Çatışma Başladı..");
                for (int i = 1; this.h1.health >= 0 && this.h2.health >= 0; i++) {
                    System.out.println(i + " . Round ");
                    Random d = new Random();
                    System.out.println("Saldıran--" + this.h2.name);
                    this.h2.damage = d.nextInt(this.h2.damage + 5);
                    System.out.println("Vurulan Hasar = " + this.h2.damage);
                    int hasar2 = this.h2.damage;
                    this.h2.health -= hasar2;
                    System.out.println(this.h1.name + " Kalan canı " + this.h1.health);
                    System.out.println("=============");
                    System.out.println("      ");
                    Random s = new Random();
                    System.out.println("Saldıran--" + this.h1.name);
                    this.h1.damage = s.nextInt(this.h1.damage + 5);
                    System.out.println("Vurulan Hasar = " + this.h1.damage);
                    int hasar1 = this.h1.damage;
                    this.h2.health -= hasar1;
                    this.h2.health = this.h2.health - this.h1.damage;
                    System.out.println(this.h2.name + " Kalan canı " + this.h1.health);
                    System.out.println("=============");
                    System.out.println("      ");
                    if (this.h2.health < 0 || this.h1.health < 0) {
                        System.out.println("Dövüş Sona Erdi");
                        if (this.h2.health < 0) {
                            System.out.println("Kazanan = " + this.h1.name);
                        }
                        if (this.h1.health < 0) {
                            System.out.println("Kazanan = " + this.h2.name);
                        }


                    }
                }
            } else {
                System.out.println("Holiganlar Birbirine eş değil..");
            }
        }


    }

    boolean isCheck() {
        return (this.h1.weight <= this.maxWeight && this.h1.weight >= this.minWeight) &&
                (this.h2.weight <= this.maxWeight && this.h2.weight >= this.minWeight);
    }
}
