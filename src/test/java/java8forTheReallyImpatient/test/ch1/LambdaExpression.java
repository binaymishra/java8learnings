package java8forTheReallyImpatient.test.ch1;

import java.util.function.Consumer;
import java.util.function.Supplier;
import org.junit.Test;

public class LambdaExpression {

  @Test
  public void legalLambdaExpression() {
    Supplier<String> helloThere = () -> "Hello lamda !";
    System.out.println(helloThere.get());
  }

  @Test
  public void testConsumer() {
    Consumer<String> consumer = (s) -> System.out.println("Print it:  my name is " + s);
    consumer.accept("Binay Mishra");
  }


  @Test
  public void legalLambdaExpression2() {
    Consumer<String> consumer = (name) -> System.out.println(name);
    consumer.accept("Binay Mishra");
  }

}
