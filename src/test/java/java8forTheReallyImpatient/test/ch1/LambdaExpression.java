package java8forTheReallyImpatient.test.ch1;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.junit.Assert;
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

  @Test
  public void sortCollection(){
    List<String> names = Arrays.asList("xxxx", "xxx", "xx", "x");
    System.out.println("Before sort: " + names);
    //Collections.sort(names, (first, second) -> Integer.compare(first.length(), second.length()));
    Collections.sort(names,Comparator.comparingInt(String::length));
    System.out.println("After  sort: " + names);
  }

  @Test
  public void sortArray(){
    String[] names = {"xxxx", "xxx", "xx", "x"};
    System.out.println("Before sort: " + Arrays.toString(names));
    //Arrays.sort(names, (first, second) -> Integer.compare(first.length(), second.length()));
    Arrays.sort(names,Comparator.comparingInt(String::length));
    System.out.println("After  sort: " + Arrays.toString(names));
  }

  @Test
  public void constructorReference(){
    List<String> labels = Arrays.asList("Submit", "Cancel", "Ok");
    List<Button> buttons = labels.stream().map(Button::new).collect(Collectors.toList());
    Assert.assertTrue(buttons.size() == 3);
  }

}
