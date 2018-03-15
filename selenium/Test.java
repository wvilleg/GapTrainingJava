import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please choose your fighter wisely: Chrome or IE");
        String answer = keyboard.nextLine();
        SeleniumBase objBase = new SeleniumBase(answer);
        System.out.println(objBase.chooseYourFighter(answer));



    }
}
