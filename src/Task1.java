public class Task1 {

    public static void main(String[] args) {
        int age = 27;

        if (age <= 18 && age >= 27) {
            System.out.println("Вы подлежите призову на срочную службу или служить по контракту");
        } else {
            if (age <= 28 && age >= 59) {
                System.out.println("Вы можете служить по контракту");
            } else if (age > 0 && age <= 100) {
                System.out.println("Вы находитесь в непризывном возрасте");
            } else {
                System.out.println("Вы допустили ошибку, неверно указан возраст");
            }
        }
    }
}

