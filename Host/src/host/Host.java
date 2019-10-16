/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package host;

/**
 *
 * @author LENOVO
 */
import java.io.*;
import java.net.*;

public class Host {
     public static void main (String[] args)throws Exception
     {
         ServerSocket s=new ServerSocket(2020);
         
         Socket sr= s.accept();
         
         FileInputStream fr=new FileInputStream("D:\\deneme.txt");
         
         byte b[]= new byte[2002];
         
         fr.read(b,0,b.length);
         
         OutputStream os = sr.getOutputStream();
         
         os.write(b,0,b.length);

     }
}