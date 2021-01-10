package java8forTheReallyImpatient.ch1;

public class LambdaClosures {

    public static void main(String[] args) {

        final String name = "Binay Mishra";

        System.out.println("Thread = ["+ Thread.currentThread().getName()+ "], name = " + name);

        new Thread(()->
            System.out.println("Thread : ["+ Thread.currentThread().getName()+ "], name = " + name) // Closure
        ).start();
  }

}
