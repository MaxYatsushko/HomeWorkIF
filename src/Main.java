public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Демонстрация задачи 1");
        int age = 19;

        if (age >= 18){
            System.out.println("Возраст человека " + age + ", человеку 18 или больше лет");
        }
        else {
            System.out.println("Возраст человека " + age + ", возраст совершеннолетия еще не наступил и нужно немного подождать");
        }
    }

    public static void task2(){
        System.out.println("Демонстрация задачи 2");
        int temperature = 10;

        if (temperature >= 5){
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");
        }
    }

    public static void task3(){
        System.out.println("Демонстрация задачи 3");
        int speed = 70;

        if (speed >= 60){
            System.out.println("Ваша скорость " + speed + " км/ч. Скорость превышена, придется заплатить штраф");
        }
        else {
            System.out.println("Ваша скорость " + speed + " км/ч. Превышения скорости нет, можно ездить спокойно");
        }
    }

    public static void task4(){
        System.out.println("Демонстрация задачи 4");
        int age = 70;

        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age > 18 && age < 24){
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        else if (age >= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        else {
            System.out.println("Судя по всему рано куда-то еще ходить");
        }
    }

    public static void task5(){
        System.out.println("Демонстрация задачи 5");
        int age = 5;

        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        }
        else if (age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if (age >= 14){
            System.out.println("Если возраст ребенка равен " + age + ", то может кататься без сопровождения взрослого");
        }
        else {
            System.out.println("Все кейсы покрыты");
        }
    }

    public static void task6(){
        System.out.println("Демонстрация задачи 6");
        int carriageCapacity = 102, passengers = 40;
        int seats = 60;

        if (passengers < carriageCapacity){
            System.out.println("В вагоне есть места, осталось свободных " + (carriageCapacity - passengers));

            if (passengers < seats){
                System.out.println("В наличии сидячие свободные места " + (seats - passengers));
            }
            else {
                System.out.println("Остались только стоячие места");
            }
        }
        else {
            System.out.println("Вагон уже заполнен");
        }
    }

    public static void task7(){
        System.out.println("Демонстрация задачи 7");
        int one = 12, two = 13, three = 5;

        if (one >= two){
            if (one >= three){
                System.out.println("Самое большое число в переменной one = " + one);
            }
            else {
                System.out.println("Самое большое число в переменной three = " + three);
            }
        }
        else if (two >= three){
            System.out.println("Самое большое число в переменной two = " + two);
        }
        else {
            System.out.println("Самое большое число в переменной three = " + three);
        }
    }
}