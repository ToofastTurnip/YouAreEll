import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThreadCall extends Thread{

    public void run(ProcessBuilder pb) throws IOException {
        Process process = pb.start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        //read output of the process
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }

}
