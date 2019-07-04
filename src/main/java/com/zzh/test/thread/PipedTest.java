package src.main.java.com.zzh.test.thread;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 管道输入输出
 * @author zzh
 * @date 2019/7/4
 */
public class PipedTest {


    public static void main(String[] args) throws IOException {

        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();
        //将输入流和输出流进行连接，否则使用的时候会抛出IOExpection
        out.connect(in);

        Print print = new Print(in);
        Thread thread = new Thread(print, "PrintThread");
        thread.start();

        int receive ;
        try {
            while ((receive = System.in.read()) != -1){
                out.write(receive);
            }
        } finally {
            out.close();
        }

    }


    static class Print implements Runnable{

        private PipedReader in;

        public Print(PipedReader in){
            this.in = in;
        }

        @Override
        public void run() {
            int receive ;

            try {
                while ((receive = in.read()) != -1){
                    System.out.print((char) receive);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
