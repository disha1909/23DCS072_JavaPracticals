import java.util.Scanner;
class Speed
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in metere:");
        double distance=sc.nextDouble();

        System.out.println("Enter the Time taken:");
        System.out.print("Enter hours:");
        int hours=sc.nextInt();

        System.out.print("Enter minutes:");
        int minutes=sc.nextInt();

        System.out.print("Enter seconds:");
        int seconds=sc.nextInt();

        double timeInseconds=hours*3600+minutes*60+seconds;

        double speedInMeterPersecond = (distance/timeInseconds);
        double speedInKmPerHour = ((distance/1000)/(timeInseconds/3600));
        double speedInMilesPerHour = ((distance/1609)/(timeInseconds/3600));

        System.out.println("speed:");
        System.out.println("Meters per second:"+speedInMeterPersecond);
        System.out.println("Kilometers per hour:"+speedInKmPerHour);
        System.out.println("Miles per hour:"+speedInMilesPerHour);

        sc.close();
    }
}
