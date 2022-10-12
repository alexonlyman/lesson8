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
        int totalGrowthPerYear = fertility-mortality;
        int totalPopulation = 0;
        for (int year = 1; year <=10; year++){
            totalPopulation = totalPopulation+population+totalGrowthPerYear;
            System.out.println("год " + year + " численгость "+ totalPopulation);
        }


        System.out.println("задание 2.1");

        int salary1 = 15_000;
        int totalCash = 0;
        for (int i=0 ; totalCash<=12_000_000; i++){
            totalCash = totalCash + totalCash*7/100;
            totalCash = totalCash + salary1;
            if ( i % 6 == 0 )

            System.out.println("месяц " + i + " ,денег на счете "+ totalCash);


        }

        System.out.println("задание 2.3");

        int salary2= 15000;
        int totalcash1 = 0;
        int nineYears = 9*12;
        for (int a=0; a<=nineYears; a++){
            totalcash1 = totalcash1 + totalcash1*7/100;
            totalcash1 = totalcash1 + salary2;
            if( a%6==0)
                System.out.println("месяц " + a + " ,денег на счете "+ totalcash1);

        }

        System.out.println("задание 2.4");



        for( int friday = 5; friday<31; friday=friday+7 ){

                System.out.println("Сегодня пятница "+ friday + "-e число, нужно подготовить отчет");
        }


        System.out.println("задание 3.1");

     /* Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно
      будет увидеть. Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
       Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
        Условия задачи:
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
        (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        В результате решения задачи в консоль должен вывестись следующий результат:
        1896
        1975
        2054*/

        int year = 2022;
        int lastYear = year - 201;
        int futureYear = year + 100;
        for (int d = 0; d<futureYear; d=d+79 ){
            if (d>lastYear && d<futureYear)
            System.out.println(d);
        }

        System.out.println("задание 3.2");
        int two = 1;
        int num = 2;

        for (int q=2; q<22; q=q+2){

            System.out.println(two++ + "*" + num + " = " + q);}










    }
}
