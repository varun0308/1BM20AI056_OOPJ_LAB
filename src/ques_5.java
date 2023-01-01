import java.util.* ;

public class ques_5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int word_count = 0;
        String sentence;
        sentence = sc.nextLine();
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i) == ' ')
            {    
                word_count += 1;
            }
        }
        System.out.println("Word count in the sentence is "+ (word_count+1));
        sentence = sentence.toUpperCase();
        System.out.println("New sentence is " + sentence);
        sc.close();
    }
}
