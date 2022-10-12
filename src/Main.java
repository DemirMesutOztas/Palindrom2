import java.util.*;

public class Main {
    static boolean palindrom(int a)
    {
        int orj=a;
        int b = a;

        int ters=0;
        while(a>0)
        {
            b=a%10;
            ters=ters*10+b;
            a = a/10;


        }

        if(ters==orj)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int a =  input.nextInt();

        boolean durum =  palindrom(a);

        if (durum)
            System.out.println("Palindrom");
        else
            System.out.println("Palindrom değil");
    }

}