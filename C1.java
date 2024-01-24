import java.net.*;
import java.io.*;

public class C1{
    public static void main(String[] args)throws Exception{
        Socket s1 = new Socket("localhost",12345);

        DataInputStream din = new DataInputStream(s1.getInputStream());
        DataOutputStream dout = new DataOutputStream(s1.getOutputStream());

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str1="";
        String str2="";

        while(!str1.equals("stop")){
            str1 = in.readLine();
            dout.writeUTF(str1);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("Server says : " + str2);
        }

        dout.close();
        s1.close();
    } 
}
