/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reading.file.using.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class ReadingFileUsingScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        
        File file = new File("xanadu.txt");
        Scanner s = new Scanner(file);
        
        while (s.hasNextLine()) 
        {            
            System.out.println(s.nextLine());
        }
        
        
    }
    
}
