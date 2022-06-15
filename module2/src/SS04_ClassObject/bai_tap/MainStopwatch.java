package SS04_ClassObject.bai_tap;

public class MainStopwatch {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        System.out.println("Start!!! " + stopWatch.start());

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello!!");
        }

        System.out.println("Stop!!" + stopWatch.stop());

        System.out.println(stopWatch.display());
    }
}
