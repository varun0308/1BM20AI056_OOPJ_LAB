package questions;
import java.util.*;

public class ques_6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String sentence;
        sentence = sc.nextLine();
        int vowel = 0, consonants = 0, digits = 0, white_spaces = 0;
        for(int i=0;i<sentence.length();i++)
        {
            char ele = sentence.charAt(i);
            if(ele == ' ')
            {
                white_spaces += 1;
            }
            
            if(Character.isDigit(ele))
            {
                digits += 1;
            }
            
            if(ele == 'a' || ele == 'e' || ele == 'o' || ele == 'i' || ele == 'u' )
            {
                vowel += 1;
            }
            
            else
            {
                consonants += 1;
            }
        }

        System.out.println(vowel +" " + consonants +" " + digits +" " + white_spaces);
        sc.close();
    }
}
