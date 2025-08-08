
import java.io.*;
import java.net.Socket;


public class ClientFactorial {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",2022);
            DataInputStream r = new DataInputStream(client.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintStream w = new PrintStream(client.getOutputStream());
            System.out.println("Enter a number");
            int num = Integer.parseInt(br.readLine());
            w.println(num);
            String fact = r.readLine();
            System.out.println("Factorial of number is"+fact);
            client.close();
            System.exit(0);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
