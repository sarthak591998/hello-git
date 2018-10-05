import java.io.*;

public class a10q1
    {
        public static void main(String args[]){
        
        File f = new File("E:/abc.txt");
        
        File g = new File("E:/xyz.txt");
        
        try
            {
                FileInputStream fin = new FileInputStream(f);
            
                int i = fin.read();
                
                FileOutputStream fout = new FileOutputStream(g);
                
                while(i!=-1)
                {
                    fout.write((char)i);
                
                    i = fin.read();
                }
            
                fin = new FileInputStream(g);
            
                i = fin.read();
            
                while(i!=-1)
                {
                
                    System.out.print((char)i);
                
                    i = fin.read();
                }
            }
        
        catch(IOException e)
            {
            
                System.out.println(e);
            }
    }
}