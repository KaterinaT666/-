public class Main {
    private static System system;

    public static void main(String[] args) {
        
        int elephantWeight = 2359;
        system.out.println("Значение переменной elephantWeight с типом int равно " + elephantWeight + " кг " );
        byte outDoorTemperature = -5;
        system.out.println("Значение переменной outdoorTemperature с типом byte равно " + outDoorTemperature + " градусов " );
        short giraffeHeight = 600;
        system.out.println("Значение переменной giraffeHeight с типом short равно " + giraffeHeight + " см " );
        long stonesInTheSea = 9223372036854775807L;
        system.out.println("Значение переменной stonesInTheSea с типом long равно " + stonesInTheSea + " шт " );
        float catWeight = 4.5F ;
        system.out.println("Значение переменной catWeight с типом float равно " + catWeight + " кг " );
        double dogWeight = 12.5 ;
        system.out.println("Значение переменной dogWeight с типом float равно " + dogWeight + " кг " );

        //Задача 2
        system.out.println( "//Задача 2");
        double scooterSpeed = 27.12 ;
        long leavesOnATree = 987_678_965_549L;
        float vegetablesWeight = 2.786F;
        boolean variable = false;
        char apartmentNumber = 569;
        short variable1 = -159;
       int variable2 = 27897;
        byte variable3 = 67;
        //Задача 3
        system.out.println( "//Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int students = class1 + class2 + class3;
        int sheetsOfPaper = 480;
        system.out.println(" На каждого ученика рассчитано " + sheetsOfPaper / students + " листов бумаги " );

        //Задача 4
        system.out.println( "//Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        int doneInAMinute = bottles/minutes;
        int firsTimeInMinutes = 20;
        system.out.println( " За " + firsTimeInMinutes + " минут машина произвела бутылок " + doneInAMinute * firsTimeInMinutes +  " штук ");
        int minutesInDay = 24 * 60;
        system.out.println( " За " + minutesInDay + " минут машина произвела бутылок " + doneInAMinute * minutesInDay +  " штук ");
int minutesInThreeDays = 3 * minutesInDay;
        system.out.println( " За " + minutesInThreeDays + " минут машина произвела бутылок " + doneInAMinute * minutesInThreeDays +  " штук ");
        int minutesInMonth = 30 * minutesInDay;
        system.out.println( " За " + minutesInMonth + " минут машина произвела бутылок " + doneInAMinute * minutesInMonth +  " штук ");
        //Задача 5
        system.out.println( "//Задача 5");
        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int totalClasses = totalCans / ( whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        system.out.println(" В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски " );
        //Задача 6
        system.out.println( "//Задача 6");
         int bananas = 5 * 80;
         int milk = 2 * 105;
         int iceCreamSundae = 2 * 100;
         int rawEggs = 4 * 70;
         float totalWeightBreakfastInKg = ( bananas + milk + iceCreamSundae + rawEggs ) / 1000F;
         system.out.println( totalWeightBreakfastInKg + " кг " );
        //Задача 7
        system.out.println( "//Задача 7");
        int totalLoseWeightKg = 7;
        int loseGrInADay = 250;
        int loseGrInADay2 = 500;
int totalLoseWeightGr = totalLoseWeightKg * 1000;
int loseWeightInAnyDays = totalLoseWeightGr / loseGrInADay;
system.out.println( " Сбрасывая по " + loseGrInADay + " грамм в день " + totalLoseWeightKg + " килограмм удасться сбросить через " + loseWeightInAnyDays + " дней " );
        int loseWeightInAnyDays2 = totalLoseWeightGr / loseGrInADay2;
        system.out.println( " Сбрасывая по " + loseGrInADay2 + " грамм в день " + totalLoseWeightKg + " килограмм удасться сбросить через " + loseWeightInAnyDays2 + " дней " );
        double averageNumberOfDays = loseWeightInAnyDays % loseWeightInAnyDays2;
        system.out.println(" Среднее колличество дней для сброса веса " + averageNumberOfDays);
        //Задача 8
        system.out.println( "//Задача 8");
int employee1SalaryInMonth = 67760;
        int employee2SalaryInMonth = 83690;
        int employee3SalaryInMonth = 76230;
        int employee1SalaryInMonth2 = ( 67760 * 10 / 100 ) + 67760;
        int employee2SalaryInMonth2 = ( 83690 * 10 / 100 ) + 83690;
        int employee3SalaryInMonth2 = (76230 * 10 / 100 ) + 76230;
        int employee1SalaryInEar = employee1SalaryInMonth * 12;
        int employee2SalaryInEar = employee2SalaryInMonth * 12;
        int employee3SalaryInEar = employee3SalaryInMonth * 12;
        int employee1SalaryInEar2 = employee1SalaryInMonth2 * 12;
        int employee2SalaryInEar2 = employee2SalaryInMonth2 * 12;
        int employee3SalaryInEar2 = employee3SalaryInMonth2 * 12;



        system.out.println("Маша теперь получает " + employee1SalaryInMonth2 + " рублей в месяц. Годовой доход вырос на " + employee1SalaryInEar2 % employee1SalaryInEar + " рублей ");
        system.out.println("Денис теперь получает " + employee2SalaryInMonth2 + " рублей в месяц. Годовой доход вырос на " + employee2SalaryInEar2 % employee2SalaryInEar + " рублей ");
        system.out.println("Кристина теперь получает " + employee3SalaryInMonth2 + " рублей в месяц. Годовой доход вырос на " + employee3SalaryInEar2 % employee3SalaryInEar + " рублей ");

    }
}