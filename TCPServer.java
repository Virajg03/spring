import java.net.*;
import java.io.*;

public class TCPServer{
    public static void main(String[] args){
        try{

            ServerSocket s1 = new ServerSocket(12345);
            Socket s2 = s1.accept(); 

            BufferedReader in = new BufferedReader(new InputStreamReader(s2.getInputStream()));

            String me = in.readLine();

            System.out.println("Recive : " + me);


            s1.close();
            s2.close();
            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}