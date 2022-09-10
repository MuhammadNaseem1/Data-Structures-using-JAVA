import java.io.*;
import java.util.*;
//import java.util.Regex;


class task1{
String[] wordTokenize(String fileName) 
{
     String[] all;
  ArrayList<String> str=new ArrayList<String>();
//  LinkedList<String> str=new LinkedList<String>();
    String token="";
    String[] words;
    try{
   
        
      File obj=new File(fileName);
      Scanner sc=new Scanner(obj);
      while(sc.hasNextLine())
      {
          // for(character w:sc.next().toCharArray())
          // {
          //   if (character.isLetterOrDigit(w))
          // words+=w+" ";
          // }
           words = sc.next().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        //   token= sc.next();
        //     if(token== "." || token==":" || token=="," )
        //      {
        //         str.add(" ");
        //  }   
        //  else{
        //      str.add(token);
        //  }
         
        
            // else if( sc.next()==":")
            // {
            //       all=sc.next().replace(":"," ");

            // }     
            // else if( sc.next()==",")
            // {
            //     all=sc.next().replace(","," ");
            // }    
      }
 sc.close();  
 
    
  
}catch(Exception e){
    System.out.print("hello error");
}
  return words;
  all=  str.toArray(new String[0]); 
    
 return all;
}


String[] extractMail(String fileName)
{
   String[] all;
  ArrayList<String> str=new ArrayList<String>();
//  LinkedList<String> str=new LinkedList<String>();
    String token="";
    String s="[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
    try{
   
 Pattern p;     
      File obj=new File(fileName);
      Scanner sc=new Scanner(obj);
      while(sc.hasNextLine())
      {
        p = Pattern.compile(s);
        Matcher m=p.matcher(sc.next());  
        if(sc.next().matches(s))
        {
          token=sc.next();
        }
        else
        {
          token="";
        }
      }
      sc.close();
}catch(Exception e){
    System.out.print("hello error");
}
  return all=  str.toArray(new String[0]); 
    
 return all;
}
public static void main(String[] args)
{
    task1 a= new task1();
  String name="sample1_words.txt";
   String name1="sample2_emails.txt";
  
    String[] words=a.wordTokenize(name);
for(String w:words)
{
    System.out.print(w+" ");
}

     String[] email=a.extractMail(name);
     for(String e:email)
     {
       System.out.println(e+" ");
     }

}

}