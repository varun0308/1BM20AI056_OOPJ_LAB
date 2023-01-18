package Lab_cycle;

class OutOfBoundException extends Exception{
    OutOfBoundException(String error)
    {
        super(error);
    }
}

public class Lab_Cycle5a {
    public static void main(String[] args) {
        int marks[] = {12,65,-23,98,45,11};
        for(int i=0;i<6;i++)
        {
            try{
                if(marks[i] >0 && marks[i]<50)
                {
                    System.out.println("Marks: "+marks[i]);   
                }
                else{
                    throw new OutOfBoundException("Error!");
                }
            }
            catch(OutOfBoundException e)
            {
                System.out.println("The marks is out of range :(");
            }
            // finally{
            //     System.out.println("THe code has ended successfully !!");
            // }
        }
    }
}
