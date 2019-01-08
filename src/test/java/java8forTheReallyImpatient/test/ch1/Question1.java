package java8forTheReallyImpatient.test.ch1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Binay Mishra <binaymishramca@gmail.com> 1. Is the comparator code in the Arrays.sort
 *         method called in the same thread as the call to sort or a different thread?
 *
 */
public class Question1 {

  private final Random random = new Random();

  private IntStream numbers;

  private int[] arr;

  @Before
  public void setUp() {

    numbers = random.ints(10, 10, 50);
    arr = numbers.toArray();
  }

  @Test
  public void q1() {

    System.out.println("Before Sort : " + Arrays.toString(arr));
    System.out.println("Thread : " + Thread.currentThread());
    Arrays.sort(arr);
    System.out.println("After  Sort : " + Arrays.toString(arr));
  }

}
