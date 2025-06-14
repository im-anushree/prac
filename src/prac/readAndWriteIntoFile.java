package prac;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class readAndWriteIntoFile{
    public static void main(String[] args){
        try{
            int data;
            FileInputStream input = new FileInputStream("src/prac/fileToRead.txt");
            FileOutputStream output = new FileOutputStream("fileToWrite.txt");

            while((data =input.read()) != -1){
                output.write(data);
            }
            input.close();
            output.close();}
        catch(IOException e){
            e.printStackTrace();
        }
    }}
