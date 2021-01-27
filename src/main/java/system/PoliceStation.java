package system;

public class PoliceStation {
    int numberOfPoliceCars;
    int numberOfPhone;
    String address;
    //@ToDo zrobić 2x ArrayList przechowujące radiowozy oraz policjantów

    public void useCarToWork() {
        numberOfPoliceCars--;
    };
    public void crashCar()
    {
        numberOfPoliceCars--;
    }
    public void buyCar()
    {
        numberOfPoliceCars++;
    }
    public void reportFault() throws InterruptedException {
        numberOfPoliceCars--;
        Thread.sleep(20000);
        numberOfPoliceCars++;
    }
}
