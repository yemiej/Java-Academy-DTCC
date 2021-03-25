package assignment_4.com.dtcc;

import java.net.*;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main (String args[]) throws Exception {
        String host = "127.0.0.1";
        short port = 8080;
        ServerSocket server = null;

        try {
            server = new ServerSocket(port, 0, InetAddress.getByName(host));

            System.err.println("Server listening on " + host + ":" + port + "\n");
            int read = 0;
            byte[] buffer = new byte[8192];

            while(true) {
                PrintWriter out = null;
                try {
                    Socket client = server.accept();
                    System.out.println("Connection accepted from " + client.getRemoteSocketAddress());
                    out = new PrintWriter(client.getOutputStream(), true);
                    InputStream in = client.getInputStream();
                    System.out.write(buffer, 0, (read = in.read(buffer)));
                    System.out.println("");
                    String output = "Hello Moto";
                    out.println("HTTP/1.1 200 OK " + output.length() + " " + output);
                    out.close();
                    in.close();
                    client.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                finally {
                    if (out != null) {
                        out.flush();
                    }
                }
            }
        }
        finally {
            System.out.println("Closing");
            if(server != null)
                server.close();
        }
    }
}
