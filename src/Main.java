public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 7 ");
        int yearsOld = 25;
        if (yearsOld>= 2 && yearsOld<=6){
            System.out.println("Если возраст человека равен " +yearsOld + " то ему нужно ходить десткий сад ");
        } else if (yearsOld>=7 && yearsOld<=18){
            System.out.println("Если возраст человека равен " +yearsOld + " то ему нужно ходить школу ");
        }else if (yearsOld>=18 && yearsOld<=24){
            System.out.println("Если возраст человека равен " +yearsOld + " то ему нужно ходить институт ");
        }else if (yearsOld>24){
            System.out.println("Если возраст человека равен " +yearsOld + " то ему нужно ходить на работу ");
        }
    }
}