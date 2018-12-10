/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Andresa
 */
public class Kelompok {
    public static void buffered() throws IOException  {
        try {
            BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
            
            String nama;
            
            System.out.print("Masukkan nama : ");
            nama = m.readLine();
            System.out.print("masukkan angka : ");
            double angka = Double.parseDouble(m.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Kelompok.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void stream() throws IOException{
        byte[] dt = new byte[5];
        System.out.print("Masukkan kalimat :");
        System.in.read(dt);
        System.out.println("kalimat :");
        for(int i=0; i<dt.length;i++){
            System.out.println((char)dt[i]);
            }
        }

    public static void read_web() throws MalformedURLException, IOException {
        URL url = new URL("http://youtube.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
 
        String inputLine;
        while ((inputLine = br.readLine()) != null) {            
            System.out.println(inputLine);
        }
        br.close();
    }
    public static void write_txt() {
        FileOutputStream out = null;
        String data;
        System.out.print("Masukkan Kalimat = ");
        Scanner s = new Scanner(System.in);
        data = s.nextLine();
        try{
            out = new FileOutputStream("E:/abc.txt");
        }catch(FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        }
        try{
            for (int i = 0; i<data.length(); i++){
                out.write((int)data.charAt(i));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            out.close();
        }catch(IOException e){
        }
    }
    public static void read_txt() {
        FileInputStream input = null ;
        int data ;  
        try
        {
            input = new FileInputStream("E:/abc.txt") ;
            
        }catch(FileNotFoundException e)
        {
            System.out.println("File Tidak ada ");
        }
        
        try
        {
            while((data = input.read())!= -1)
            {
                System.out.print((char)data);
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        try{
            input.close();
            
        }
        catch(IOException E)
        {
            
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        int pilih =0;
        do{
        System.out.println("Masukkan menu ");
        System.out.println("1. Bufeered");
        System.out.println("2. Input Stream");
        System.out.println("3. Membaca file web");
        System.out.println("4. Menulis txt");
        System.out.println("5. membaca txt");
        System.out.println("0. keluar");
        System.out.print("Masukkan pilihan : ");
        pilih = Integer.parseInt(m.readLine());
        switch(pilih){
            case 1:
                buffered();
                break;
            case 2:
                stream();
                break;
            case 3:
                read_web();
                break;
            case 4:
                write_txt();
                break;
            case 5:
                read_txt();
                break;
            default : System.out.println("Inputan salah");
                
        }
        }while (pilih!=0);
        
    }
    
}
