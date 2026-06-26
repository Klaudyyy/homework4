//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно подождать");
        }
            int temperature = 6;
            if (temperature < 5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }

            int speed = 75;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
            } else {
                System.out.println(" Если скорость " + speed + " , можно ездить спокойно");
            }

            int age2 = 27;
            if (age2 > 1 && age2 < 7) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
            }
            if (age2 > 7 && age2 < 18) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
            }
            if (age2 >= 18 && age2 <= 24) {
                System.out.println("Если возраст человека равен " + age2 + ", то он должен учиться в университете");
            }
            if (age2 > 24) {
                System.out.println("Если возраст человека " + age2 + ", то ему надо ходить на работу");
            }

            int age3 = 15;
            if (age3 < 5) {
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
            }  if ( age3 > 4 && age3 <= 14) {
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
            } if (age3 > 14) {
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }

            int place = 107;
            if (place <60) {
                System.out.println("Сидячие места есть");
            } if (place >=60 && place < 103) {
                System.out.println("Стоячие места есть");
            } if (place >102) {
                System.out.println("Мест нет");
            }
        }
}



