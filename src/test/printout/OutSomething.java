import com.example.demo.myThread.MyThread;
import com.example.demo.pojo.Users;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class OutSomething {
    @Test
    public void outSome() throws IOException {
        System.out.println();
        MyThread myThread=new MyThread();
        Users users=new Users();
        users.setUserName("倍轻松");
        users.setPwd("123456");
       /* myThread.setUser(users);*/
        Thread thread=new Thread(myThread);
        thread.start();
     /*   myThread.s*/
       /* URL url=new URL("http://localhost:8088/user");
        InputStream is=url.openStream();
        InputStreamReader isr= new InputStreamReader(is,"utf-8");
        BufferedReader br=new BufferedReader(isr);
        String str=br.readLine();
        while (str!=null){
            System.out.println(str);
           str= br.readLine();
        }
        br.close();
        isr.close();
        is.close();*/
    }
}
