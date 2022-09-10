import java.util.*;
import java.io.*;
class filing
{
    public static void main(String[] args)
    {
               try {  
            File file = new File("data.txt");  
            if (file.createNewFile()) {  
                System.out.println("File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        //BufferedReader cr=new BufferedReader(new FileReader()); 
          File f = new File("D:\\Summer 2021\\DS\\labs\\lab5 dsa\\object-wise-data");
            File[] files = f.listFiles();
         
          for (int i =0; i < files.length; i++) {
               // System.out.println(files[i].getName());

               BufferedReader csvReader = new BufferedReader(new FileReader(files[i]));
               while ((String row=csvReader.readLine()) != null) {
                   row.split(",");
                   
                 }

    //file = row.split(",");
   
  //    FileWriter myWriter = new FileWriter("data.txt");
    ///  myWriter.write(csvReader.readLine());
      //myWriter.close();
     // System.out.println("Successfully wrote to the file.");
    }
    
}
//csvReader.close();
    
//}

            







