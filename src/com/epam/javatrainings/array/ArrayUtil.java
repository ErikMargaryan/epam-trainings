import java.util.Scanner;
class StopWatch implements Runnable
{
    Thread t;
    private int minutes;
    private int seconds;
    StopWatch(int min,int sec)
    {
        minutes =min;
        seconds=sec;
        t=new Thread(this," Demothread ");
        t.start();
    }

    public void run()
    {
        int total=minutes*60+seconds;
        while(total >0)
        {
            total-=1;
            minutes=total/60;
            seconds=total%60;
            System.out.println(minutes+":"+seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadDemo
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int Mins;
        int Seconds;
        System.out.println("please enter the minutes than seconds: ");
        Mins=scan.nextInt();
        Seconds=scan.nextInt();
        StopWatch ob=new StopWatch(Mins,Seconds);
    }
}
