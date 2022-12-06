import java.util.Scanner;
public class Elmas {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number,indexOfNumber;
        System.out.print("Ust ucgen yuksekligi:");
        number=in.nextInt();

        for(indexOfNumber=0;indexOfNumber<number;indexOfNumber++)
        {
            for (int index2=1;index2<(number-indexOfNumber);index2++)
            {
                System.out.print(" ");
            }

            for(int index3=0;index3<(2*indexOfNumber+1);index3++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }

            for(indexOfNumber=number-1;indexOfNumber>0;indexOfNumber--)
            {

                for(int index2=number-indexOfNumber;index2>0;index2--)
                {
                    System.out.print(" ");
                }
               for (int index3=2*indexOfNumber-1;index3>0;index3--)
               {
                   System.out.print("*");
               }
                System.out.println("");
            }





    }
}
