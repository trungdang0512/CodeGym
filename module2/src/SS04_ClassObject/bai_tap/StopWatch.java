package SS04_ClassObject.bai_tap;

public class StopWatch {
    long startTime;
    long endTime;


    public StopWatch(long startTime,long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }


    public long start(){
        return this.startTime;
    }

    public long stop(){
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return stop() - start();
    }

    public String display(){
        return "All Time: " + getElapsedTime();
    }
}
