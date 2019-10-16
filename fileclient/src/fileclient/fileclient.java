/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileclient;

/**
 *
 * @author LENOVO
 */
import java.io.*;
import java.net.*;


public class fileclient {
 public static void main (String[] args)throws Exception {

    byte []b=new byte[20002];
    
    Socket sr= new Socket("192.168.1.33",2020); // ip adresim , ve actıgım port 
    
    InputStream is = sr.getInputStream();
    
    FileOutputStream fr=new FileOutputStream("D:\\deneme1.txt");
    
    is.read(b,0,b.length);
    fr.write(b,0,b.length);
}
}