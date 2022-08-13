
import java.io.*;
import java.net.*;

public class Client{

    // Initialize socket and input output stream
    private Socket socket = null;
    DataInputStream input;
    DataOutputStream out;
//    private DataInputStream = null;
//    private DataOutputStream = null;

    // contructor to put IP address and port
    public Client(String address, int port){
        //establish  a connection
        try{
            socket = new Socket(address,port);
            System.out.println("Connected");

            // takes input from terminal
            input = new DataInputStream(System.in);
            
            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        }catch(Exception e){
            System.out.println(e);
        }
        // String to read message from input tab
        String line = "";
        while(!line.equals("Over")){
            try{
                // line = input.readLine();
                out.writeUTF(line);
            } catch (Exception e){
                System.out.println(e);
            }
        }
        // close the connection
        try {
            input.close();
            out.close();
            socket.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        // Client client = new Client("localhost",4567);
    }
}
