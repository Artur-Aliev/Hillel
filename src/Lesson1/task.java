package Lesson1;

public class task {
    public static void main(String[] args) {
        int age = 100;

        if (age >= 18 && age <= 27) {
            System.out.println("Вы подлежите призыву на срочную службу или можете служить по контракту");
        } else if (age >= 28 && age <= 59) {
                System.out.println("Вы можете служить по контракту");
        } else if  ((age >= 0 && age <= 17) || (age >= 60 && age <= 100)) {
                System.out.println("Вы находитесь в непризывном возрасте");
        } else {
                System.out.println("Вы допустили ошибку, неверно указан возраст");
            }
        }
    }


