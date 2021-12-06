/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.goldenteam;
import java.io.File; 
import java.io.IOException; 
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author goldenteam
 */
public class File_dn {
    public String filename ="C:\\Users\\user\\Documents\\NetBeansProjects\\Goldenteam\\file1.txt";
    int saldo;
    
    public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }
    public int getSaldo()
    {
        return this.saldo;      
    }
    
    public boolean createFile() {
        boolean success = false;
        try {
          File myObj = new File(this.filename);
          if(myObj.createNewFile())
          {            
              success = true;
              return success;
          }
          else
          {
              return false;
          }
        } catch (IOException e) {
          return false;
        }
    }
    
    public boolean writeFile()
    {
        boolean success = false;
        try{
            File myObj = new File(this.filename);
            success = true;
            
            if(!myObj.exists())
            {
                success = createFile();
            }
            if(success)
            {
                FileWriter myWriter = new FileWriter(this.filename);
                myWriter.write(String.valueOf(this.getSaldo()));
                myWriter.close();
            }
            return success;
        } catch (IOException e){
            return false;
        } 
    }
    
    public String readFile()
    {
        String oldsaldo = "";
        try{
            File myObj = new File(this.filename);
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine())
            {
                oldsaldo = myReader.nextLine();
            }
                
            myReader.close();
                
            return oldsaldo;
        } catch (FileNotFoundException e)
        {
            return null;
        }
    }
  }
    

