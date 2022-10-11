public class Main {
    public static void main (String[] args){
        int salary = 15000;
        int total = 0;
        int months = 0;
        while (total< 2_459_000){
            total = total + salary;
            months = months +1;
            System.out.println("Понадобится " + months + " месяцев, что бы накопить " + total + " рублей");}



        int f = 0;
        while (f<10){
            f++;
            System.out.print(f +" " );
        }
        System.out.println();
        for(int i=10; i>0; i-- ){
            System.out.print(i+ " ");
        }

    }
}
