public class Main {
    public static void main(String[] args) {

        // Задача 1
        int age = 18;

        if (age >= 18)
            System.out.println("Поздравляю с совершеннолетием!");

        if (age < 18)
            System.out.println("Возраст совершеннолетия ещё не наступил.");


        // Разделитель
        System.out.println();

        // Задача 2
        int studentAge = 19;

        if (studentAge >= 7 && studentAge < 18)
            System.out.println("Ребенок ходит в школу");

        if (studentAge >= 18 && studentAge < 24)
            System.out.println("Человек уже закончил школу и может отправляться в университет");

        if (studentAge >= 24)
            System.out.println("Человек окончил университет и ему пора искать первую работу");

        // Разделитель
        System.out.println();

        // Задача 3
        int totalPlaces = 102;
        int seatPlaces = 60;
        int standPlaces = totalPlaces - seatPlaces;

        int passengerCountId = 25;

        if (passengerCountId <= seatPlaces)
            System.out.println("В вагоне осталось " + (seatPlaces - passengerCountId) + " сидячих и " + standPlaces + " стоячих мест");

        if (passengerCountId > seatPlaces && passengerCountId < totalPlaces)
            System.out.println("В вагоне осталось 0 сидячих и " + (totalPlaces - passengerCountId) + " стоячих мест");

        if (passengerCountId >= totalPlaces)
            System.out.println("К сожалению мест не осталось");

        // Разделитель
        System.out.println();

        // Задача 4
        int newAge = 18;

        if (newAge >= 18)
            System.out.println("Поздравляю с совершеннолетием!");
        else
            System.out.println("Возраст совершеннолетия ещё не наступил.");

        // Разделитель
        System.out.println();

        // Задача 5
        if (studentAge >= 7 && studentAge < 18) {
            System.out.println("Ребенок ходит в школу");
        } else {

            if (studentAge >= 18 && studentAge < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            }
        }

        // Разделитель
        System.out.println();

        // Задача 6
        if (passengerCountId <= seatPlaces) {
            System.out.println("В вагоне осталось " + (seatPlaces - passengerCountId) + " сидячих и " + standPlaces + " стоячих мест");
        } else {

            if (passengerCountId > seatPlaces && passengerCountId < totalPlaces) {
                System.out.println("В вагоне осталось 0 сидячих и " + (totalPlaces - passengerCountId) + " стоячих мест");
            } else {
                System.out.println("К сожалению мест не осталось");
            }
        }

        // Разделитель
        System.out.println();

        // Задача 7
        int personAge = 19;

        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge <= 18){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        } else if (personAge > 18 && personAge < 24){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        } else if (personAge > 24){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу");
        }

        // Разделитель
        System.out.println();

        // Задача 8
        int childAge = 15;
        boolean hasParent = true;

        if (childAge < 5){
            System.out.println("Нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14){

            if (hasParent) {
                System.out.println("Можно кататься на аттракционе (с сопровождением взрослого)");
            } else {
                System.out.println("Нельзя кататья на аттракционе (без сопровождения взрослого)");
            }

        } else {
            System.out.println("Можно кататься на аттракционе");
        }

        // Разделитель
        System.out.println();

        // Задача 9
        int one = 7;
        int two = 8;
        int free = 9;

        if (one > two && one > free){
            System.out.println("Число (one) " + one + " больше");
        } else {

            if (two > one && two > free) {
                System.out.println("Число (two) " + two + " больше");
            } else {
                System.out.println("Число (free) " + free + " больше");
            }
        }
    }
}