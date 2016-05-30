package nio.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

import org.junit.Test;

public class TestIO{

    @Test
    public void t1() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("/Users/liqqc/Desktop/test.txt"));
        String temp = "";
        while ((temp = reader.readLine()) != null) {
            System.err.println(temp);
        }
    }

    @Test
    public void t2() throws IOException {
        BufferedReader r1 = new BufferedReader(
                new InputStreamReader(new FileInputStream("/Users/liqqc/Desktop/test.txt")));
        String temp = "";
        while ((temp = r1.readLine()) != null) {
            System.err.println(temp);
        }
    }

    @Test
    public void t3() throws FileNotFoundException {
        FileReader reader = new FileReader("/Users/liqqc/Desktop/test.txt");
    }
    
    @Test
    public void t4() throws IOException {
        FileInputStream stream = new FileInputStream(new File("/Users/liqqc/Desktop/test.txt"));
        InputStreamReader reader =  new InputStreamReader(stream);
        BufferedReader r = new BufferedReader(reader);
        String tp = "";
        while((tp=r.readLine()) != null) {
            System.err.println(tp);
        }
        
    }
    
}
