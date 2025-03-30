public class Main {
    public static void main(String[] args) {
        int age = 43;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperature = 13;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        int speed = 47;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
        int yearsOld = 25;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        }
        if (yearsOld >= 7 && yearsOld <= 17) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        }
        if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        }
        if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора ходить на работу");
        }
        int childAge = 19;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        int passengers = 113;
        int seatPlase = 60;
        int totalPlase = 102;
        if (passengers < seatPlase) {
            System.out.println("В вагоне есть " + (seatPlase - passengers) + " сидячих мест и " + (totalPlase - seatPlase) + " стоячих мест");
        }
        if (passengers >= seatPlase && passengers < totalPlase) {
            System.out.println("Сидячих мест нет, но осталось " + (totalPlase - passengers) + " стоячих мест");
        }
        if (passengers == totalPlase) {
            System.out.println("В вагоне не осталось мест");
        }
        if (passengers > totalPlase) {
            System.out.println((passengers - totalPlase) + " пассажиров не смогут уехать");
        }
        int one = 79;
        int two = 43;
        int three = 11;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        }
        if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        }
        if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }

    }
}