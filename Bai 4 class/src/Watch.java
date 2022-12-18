import java.util.Scanner;
class StopWatch{
    private long startTime,endTime;
    StopWatch(){
        this.startTime=System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start(){
        long a=System.currentTimeMillis();
        this.setStartTime(a);
    }
    public void stop(){
        long b=System.currentTimeMillis();
        this.setEndTime(b);
    }
    public long getElapsedTime(){
        long distime=this.getEndTime()-this.getStartTime();
        return distime;
    }
}
public class Watch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StopWatch test=new StopWatch();
        test.start();
        try {
            Thread.sleep(7*60*9);
        }catch (InterruptedException d) {
            throw new RuntimeException(d);
        }
        test.stop();
        System.out.println("The Elapsed time is: "+ test.getElapsedTime()+" milisec");
    }
}
