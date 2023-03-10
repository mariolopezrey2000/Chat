import java.io.*;
import java.net.*;

public class Client{

    

    public Client(){

    }

    public void sender(String mensaje, String ip, int port) throws UnknownHostException, IOException{
        // Realiza la conexión
        Socket socket = new Socket(ip, port);
        // System.out.println("C. Conectado al servidor");
    
        // PrintWriter es el encargado de enviar un mensaje al servidor
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        // BufferedReader es el encargado de recibir la respuesta del servidor tras enviar el mensaje
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
        // Aquí se envía el mensaje, y se recibe la respuesta
        out.println(mensaje);

        // Aquí se muestra la respuesta del servidor
        // System.out.println("C. Respuesta del servidor: " + in.readLine());
    
        // Aquí se cierran los flujos de datos y el socket
        out.close();
        in.close();
        socket.close();
    }
}
