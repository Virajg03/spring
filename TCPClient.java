import java.net.*;
import java.io.*;

public class TCPClient{
    public static void main(String[] args){
        try{
            Socket s1 = new Socket("localhost", 12345);

            PrintWriter out = new PrintWriter(s1.getOutputStream(),true);

            String me = "Hello world";

            out.println(me);

            out.close();

            s1.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}