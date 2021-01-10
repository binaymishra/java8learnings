package java8forTheReallyImpatient.test.ch1;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;

public class Question2 {

    @Test
    public void q2UsingFileFilter(){
        File[] subDirs = new File(".").listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        return pathname.isDirectory();
                    }
                }
        );

        for (File file : subDirs){
            System.out.println(file.getName());
        }
    }


    @Test
    public void q2UsingLambda(){
        File[] subDirs = new File(".").listFiles(
                pathname -> pathname.isDirectory()
        );

        for (File file : subDirs){
            System.out.println(file.getName());
        }

    }
}
