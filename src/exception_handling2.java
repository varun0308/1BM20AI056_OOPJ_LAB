// Calculator using switch statement
// Handle arithmetic excetions where ever necessary
import java.util.* ;

class exception_handling2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                try{
                System.out.println(a+b);
                }
                catch(ArithmeticException e){
                    System.out.println("Noooooooooo");
                }
                break;
            }
            case 2:
            {
                try{
                System.out.println(a-b);
                }
                catch(ArithmeticException e){
                    System.out.println("Noooooooooo");
                }
                break;
            }
            case 3:
            {
                try{
                System.out.println(a*b);
                }
                catch(ArithmeticException e){
                    System.out.println("Noooooooooo");
                }
                break;
            }
            case 4:
            {
                try{
                System.out.println(a/b);
                }
                catch(ArithmeticException e){
                    System.out.println("Noooooooooo");
                }
                break;
            }
            
        }
    }
}