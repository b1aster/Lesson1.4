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

        int passengerCountId = 101;

        if (passengerCountId <= seatPlaces)
            System.out.println("В вагоне осталось " + (seatPlaces - passengerCountId) + " сидячих и " + standPlaces + " стоячих мест");

        if (passengerCountId > seatPlaces && passengerCountId < totalPlaces)
            System.out.println("В вагоне осталось 0 сидячих и " + (totalPlaces - passengerCountId) + " стоячих мест");

        if (passengerCountId >= totalPlaces)
            System.out.println("К сожалению мест не осталось");
    }
}