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

        System.out.println();

        int population = 12_000_000;
        int populationKf = population/1000;
        int fertility = populationKf*17;
        int mortality = populationKf*8;
        int totalGrowthPerYear = fertility+mortality;
        int totalPopulation = 0;
        for (int year = 0; year <=10; year++){
            totalPopulation = totalPopulation+population+totalGrowthPerYear;
            System.out.println(year);
        }

    }
}
