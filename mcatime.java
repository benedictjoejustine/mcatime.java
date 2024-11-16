import java.util.*;
class time
{
    int hour ,min,sec;
    time(int h,int m, int s)
    {
        hour=h;
        min=m;
        sec=s;
    }
public time()
{
    hour=0;
    min=0;
    sec=0;
}
public time sum(time t2)
{
    time t3=new time ();
    t3.sec=sec+t2.sec;
    t3.min=min+t2.min;
    t3.hour=hour+t2.hour;

    if(t3.sec>=60)
    {
        t3.sec=t3.sec%60;
        t3.min++;
    }
    if(t3.min>=60)
    {
        t3.min=t3.min%60;
        t3.hour++;
    }
    return(t3);
    }
    public void display()
    {
        System.out.println(hour+":"+min+":"+sec);
    }

}
class mcatime
{
    public static void main(String[] args) {
        time t1=new time(3,30,50);
        time t2=new time(3,30,50);
        time t3=new time();
        t3=t1.sum(t2);
        t1.display();
        t2.display();
        System.out.println("sum of two times");
        t3.display();

    }
}
