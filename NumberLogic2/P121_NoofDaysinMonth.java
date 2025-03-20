package NumberLogic2;

import java.util.Scanner;

public class P121_NoofDaysinMonth {
    static int checkyear(int year){
        if(year%400==0 || year%4==0 && year%100==0)
            return 1;
        else    
            return 0;
    }
    static int checkmonth(String month, int year){
        if(month=="April" || month=="June" || month=="September" || month=="November")
            return 30;
        else if(month=="February")
            return (checkyear(year)==1)?28:29;
        else
            return 31;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Month:");
        String month=sc.nextLine();
        System.out.println("Enter year:");
        int year=sc.nextInt();

        int res=checkmonth(month, year);
        System.out.println(res);
    }
}
