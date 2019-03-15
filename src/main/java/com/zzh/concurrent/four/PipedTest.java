package src.main.java.com.zzh.concurrent.four;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.security.spec.ECField;

/**
 * 管道输入流，输出流，主要用于线程之间的数据传输，传输的媒介为内存
 *
 * @author zzh
 * @date 2019/3/15
 */
public class PipedTest {

    public static void main(String[] args) throws IOException {
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader();
        //将输入流和输出流连接起来，否则使用的时候会抛出IOException
        pipedWriter.connect(pipedReader);

        Thread printThread = new Thread(new Print(pipedReader), "PrintThread");
        printThread.start();

        int receive ;
        try {
            while ((receive = System.in.read()) != -1){
                pipedWriter.write(receive);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            pipedWriter.close();
        }
    }


    static class Print implements Runnable{

        private PipedReader pipedReader;

        public Print(PipedReader pipedReader){
            this.pipedReader = pipedReader;
        }

        @Override
        public void run() {
            int receive ;
            try {
                while ((receive = pipedReader.read()) != -1){
                    System.out.println((char) receive);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
