import java.net.*;
import java.io.*;

public class S1{
    public static void main(String[] args)throws Exception{
        ServerSocket s1 = new ServerSocket(12345);
        Socket s2 = s1.accept(); 

        DataInputStream din = new DataInputStream(s2.getInputStream());
        DataOutputStream dout = new DataOutputStream(s2.getOutputStream());

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str1="";
        String str2="";

        while(!str1.equals("stop")){
            str1=din.readUTF();
            System.out.println("client says : "+str1);

            str2=in.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }

        din.close();
        s1.close();
        s2.close();


    }
}