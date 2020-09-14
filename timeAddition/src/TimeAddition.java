import java.util.Scanner;

public class TimeAddition {

    public static void main(String[] args) {

        int y1,y2,yy,d1,d2,dd,h1,h2,hh,m1,m2,mm,s1,s2,ss;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Time Addition Program\n\n");
        System.out.println("Notes");
        System.out.print("1Y = 365D, 1D = 24H, 1H = 60M, 1M = 60S\n\n");

        System.out.println("Times1 Input");
        System.out.print("Years1   (Y1) = "); y1 = userInput.nextInt();
        System.out.print("Days1    (D1) = "); d1 = userInput.nextInt();
        System.out.print("Hours1   (H1) = "); h1 = userInput.nextInt();
        System.out.print("Minutes1 (M1) = "); m1 = userInput.nextInt();
        System.out.print("Seconds1 (S1) = "); s1 = userInput.nextInt();

        System.out.print("\n");

        System.out.print("Times2 Input\n");
        System.out.print("Years1   (Y2) = "); y2 = userInput.nextInt();
        System.out.print("Days2    (D2) = "); d2 = userInput.nextInt();
        System.out.print("Hours2   (H2) = "); h2 = userInput.nextInt();
        System.out.print("Minutes2 (M2) = "); m2 = userInput.nextInt();
        System.out.print("Seconds2 (S2) = "); s2 = userInput.nextInt();

        System.out.print("\n");
        System.out.printf("Times Format      = YY   :DD   :HH   :MM   :SS\n");
        System.out.printf("Your Times1 Input = %05d:%05d:%05d:%05d:%05d\n",y1,d1,h1,m1,s1);
        System.out.printf("Your Times2 Input = %05d:%05d:%05d:%05d:%05d\n",y2,d2,h2,m2,s2);

        //times calculation
        //seconds and minutes
        int bufferM = 0;
        if (s1 + s2 >= 60){
            ss = (s1 + s2) % 60;
            // System.out.println("ss " + ss);
            bufferM = (s1 + s2) / 60;
            // System.out.println("bufferM " + bufferM);
        } else {
            ss = s1 + s2;
            // System.out.println("ss " + ss);
        }

        //minutes and hours
        int bufferH = 0;
        if (bufferM + m1 + m2 >= 60){
            mm = (bufferM + m1 + m2) % 60;
            // System.out.println("mm " + mm);
            bufferH = (bufferM + m1 + m2) / 60;
            // System.out.println("bufferH " + bufferH);
        } else {
            mm = bufferM + m1 + m2;
            // System.out.println("mm " + mm);
        }

        //hours and days
        int bufferD = 0;
        if (bufferH + h1 + h2 >= 24){
            hh = (bufferH + h1 + h2) % 24;
            // System.out.println("hh " + hh);
            bufferD = (bufferH + h1 + h2) / 24;
            // System.out.println("bufferD " + bufferD);
        } else {
            hh = bufferH + h1 + h2;
            // System.out.println("hh " + hh);
        }

        //days and years
        int bufferY = 0;
        if (bufferD + d1 + d2 >= 365){
            dd = (bufferD + d1 + d2) % 365;
            // System.out.println("dd "+ dd);
            bufferY = (bufferD + d1 + d2) / 365;
            // System.out.println("bufferY "+ bufferY);
        } else {
            dd = bufferD + d1 + d2;
            // System.out.println("dd "+ dd);
        }

        //years
        yy = bufferY + y1 + y2;
        // System.out.println("yy " + yy);

        System.out.print("\n");
        System.out.printf("Times1 & Times2 Addition = \n");
        System.out.printf("YY   :DD   :HH   :MM   :SS\n");
        System.out.printf("%05d:%05d:%05d:%05d:%05d\n",yy,dd,hh,mm,ss);

        System.out.println("");

    }

}
