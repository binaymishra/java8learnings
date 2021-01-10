package java8forTheReallyImpatient.test.ch1;

import org.junit.Test;

import java.io.File;


public class Question3 {

    @Test
    public void listFileNamesWithExtension(){
        String[] fileNames = new File("src/test/java/java8forTheReallyImpatient/test/ch1")
                .list((dir, name) -> name.endsWith(".java"));
        for(String name : fileNames){
            System.out.println(name);
        }
    }
}
