public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 7 ");
        int yearsOld = 15;
        if (yearsOld>= 2 && yearsOld<=6){
            System.out.println("Если возраст человека равен " +yearsOld + " то ему нужно ходить десткий сад ");
        } else if (yearsOld>=7 && yearsOld<=18){
            System.out.println("Если возраст человека равен " +yearsOld + " то ему нужно ходить школу ");
        }else if (yearsOld>=18 && yearsOld<=24){
            System.out.println("Если возраст человека равен " +yearsOld + " то ему нужно ходить институт ");
        }else if (yearsOld>24){
            System.out.println("Если возраст человека равен " +yearsOld + " то ему нужно ходить на работу ");
        }
        System.out.println("Задание 8");
        if (yearsOld < 5){
            System.out.println(" Если ребенку меньше 5 лет, то он не может кататься на аттракционе ");
        }else if(yearsOld<=14){
            System.out.println(" Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя ");
        }else {
            System.out.println(" сли ребенок старше 14 лет, то он может кататься без сопровождения взрослого ");
        }
        System.out.println(" Финальное задание ");
        int one= 3;
        int two =3;
        int three=3;
        if (one> two) {
            if (one >= three) {
                System.out.println(" Максимальное число " + one);
            } else {
                System.out.println(" Максимальное число " + three);
            }
        }else if(two>one) {
            if (two >= three) {
                System.out.println(" Максимальное число " + two);
            } else {
                System.out.println(" Максимальное число " + three);
            }
        }else{
            if (one>three) {
                System.out.println(" Максимальное число  " + one);
            }else if(three>one) {
                System.out.println(" Максимальное число " + three);
            }else{
                System.out.println(" Все числа равны ");
            }
        }
    }
}