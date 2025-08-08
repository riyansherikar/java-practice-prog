
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerFactorial{
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2022);
            System.out.println("Server started successfully");
            Socket client = server.accept();
            DataInputStream r = new DataInputStream(client.getInputStream());
            PrintStream w = new PrintStream(client.getOutputStream());
            DataInputStream in = new DataInputStream(System.in);

            String data = r.readLine();
            int num = Integer .parseInt(data);
            System.out.println("number recived from client"+num);
            int fact = 1;
            while(num>0){
                fact = fact*num--;
            }
            w.println(fact);
            System.out.println("Factorial is cslculsted and sent back to client");
            server.close();
            System.exit(0);

        } catch (Exception e) {
           e.getMessage();
        }
    }
}