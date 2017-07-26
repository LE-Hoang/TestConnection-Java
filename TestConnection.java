/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconnection;

import java.io.*;
import java.io.IOException;
import java.net.*;
import java.util.Arrays;

/**
 *
 * @author LEHoang
 */
public class TestConnection {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        // Open the connection on Port 555
        ServerSocket server = new ServerSocket(555);
        
        Socket connection =server.accept();
        // Setup DataOut
        System.out.println("Client has connected !");
        DataOutputStream os  = new DataOutputStream(connection.getOutputStream());
        //OutputStreamWriter osw = new OutputStreamWriter(os);
        //BufferedWriter bw = new BufferedWriter(osw);
        String MessOut ="Send me one pictruce!";
       // System.out.println(MessOut.length());
         // Send Messsage
        //bw.writeInt(MessOut);
        //bw.flush();
        os.writeUTF(MessOut);
       
        // get DataIn
       DataInputStream is = new DataInputStream(connection.getInputStream());
       //InputStreamReader isr = new InputStreamReader(is);
       //BufferedReader br = new BufferedReader(isr);
       
       String a = is.readLine();
       System.out.println( "size of buff = " +a);
       
       /*if(( size_buff > 0){
          
          os.writeUTF("send me array pixel");
          byte[] mess = new byte[size_buff];
          is.readFully(mess,0,mess.length);
          System.out.println(Arrays.toString(mess));
       }*/
       //String MessIn = br.readLine();
       
   
       
      
    
        // TODO code application logic here
    }
    
}
