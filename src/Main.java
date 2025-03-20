public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 16;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то  он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задача 2
        int temperature = 0;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        // Задача 3
        int speed = 60;
        if (speed <= 60){
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        // Задача 4
        int agee = 6;
        if (agee >= 2 && agee <= 6){
            System.out.println( "Если человеку " + agee + " лет, то ему нужно ходить в сад.");
        } if (agee >= 7 && agee <= 17){
            System.out.println( "Если человеку " + agee + " лет,  то ему нужно ходить в школу.");
        } if (agee >= 18 && agee <= 24){
            System.out.println( "Если человеку " + agee + " лет,  то его место в университете.");
        } if (agee > 24){
            System.out.println( "Если человеку " + agee + " лет,  то ему пора ходить на работу.");
        }
        // Задача 5
        int kidsAge = 14;
        if (kidsAge < 5){
            System.out.println("Если ребенку "+ kidsAge + " лет, то кататься на аттракционах нельзя.");
        } if (kidsAge >= 5 && kidsAge < 14){
            System.out.println("Если ребенку "+ kidsAge + " лет, то кататься на аттракционах можно в сопровождении взрослого.");
        } if (kidsAge <= 14){
            System.out.println("Если ребенку "+ kidsAge + " лет, то кататься на аттракционах можно без сопровождения.");
        }
        // Задача 6
        int place = 6;
        if (place < 60){
            System.out.println("Если в вагоне занято " + place + " мест,  сидячие места еще есть.");
        }if (place >= 60 && place <102){
            System.out.println("Если в вагоне занято " + place + " мест, то остались только стоячие места.");
        }if (place >=102){
            System.out.println("Мест нет");
        }
        //Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Первое число большее");
        }else if (two > three && two > one){
            System.out.println("Второе число большее");
        } else {
            System.out.println("Третье число большее");
        }

    }
}