/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Week9 {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);
    public static String readContentFromFile(String path) throws FileNotFoundException, IOException
    {
        File file = new File(path);
        if(file.exists()==false) file.createNewFile();
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String temp;
        String result="";
        while((temp=br.readLine())!=null)
        {
            result +=temp+"\n";
        }
        return result;
    }
    public static void writeContentToFile(String path) throws IOException
    {
        File file = new File(path);
        if(file.exists()==false) file.createNewFile();
        file.delete();
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        String s;
        s=input.nextLine();
        bw.write(s);
        bw.close();
        
    }
    public static void writeContinueFile(String path) throws IOException
    {
        File file = new File(path);
        if(file.exists()==false) file.createNewFile();
        FileWriter fw = new FileWriter(path,true);
        BufferedWriter bw = new BufferedWriter(fw);
        String s;
        s="\r\n"+input.nextLine();
        bw.write(s);
        bw.close();
    }
    public static File findFileByName(String folderPath, String fileName)
    {
        File file = new File(folderPath);
        File file1=null;
        String list[]=file.list();
        for(String s:list)
        {
            if(s.equals(fileName)==true)
            {
                file1=new File(s);
                break;
            }
        }
        return file1;
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        String s=readContentFromFile("C:/Users/Admin/Desktop/doc.txt");
//        
//        System.out.println(s);
//        writeContentToFile("C:/Users/Admin/Desktop/doc1.txt");
 //       writeContinueFile("C:/Users/Admin/Desktop/doc1.txt");
        findFileByName("C:/Users/Admin/Desktop/myproject", "hihi");
    }
    
}
