package main;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class main extends JFrame {
    public main() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("Hello World !!! ");
        panel.add(label);
    }
    public static void main(String[] args) {
       new main().setVisible(true);
    	
    }
}

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("I have randomly choosen a number between 1 and 100");
        System.out.println("Try to guess it");

        Scanner scanner = new Scanner(System.in);
       for (int i= 10 ;i>0;i--)
       {
           System.out.println("You have "+ i + " guess left. Choose again ! ");
            int guess = scanner.nextInt();

            if(randomNumber <guess )
            {
                System.out.println("It's smaller than "+ guess );
            }
           else if(randomNumber > guess )
            {
                System.out.println("It's greater than "+ guess );
            }
            else
            {
              hasWon = true;
              break;
            }
           // System.out.println("Your guess was : " + guess);
       }
       if(hasWon){
           System.out.println("Correct ..... You win");
       }
       else {
           System.out.println("Incorrect .... You lose");
           System.out.println("The number was : "+ randomNumber);
       }

    }

}
