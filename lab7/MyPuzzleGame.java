import  java.util.*;
class PuzzleWord
{
  public static void main(String[] args) {

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    // int row = rand.nextInt(7)+3;
    // int col = rand.nextInt(7)+3;
    // System.out.print(row);
    // System.out.print(col);
    int row = 10;
    int col = 10;
    char Array[][] = new char[row][col];

    for(int i=0; i<row; i++)
    {
      for(int j=0; j<col; j++)
      {
        int index = rand.nextInt(26);
        Array[i][j] = alphabet.charAt(index);
      }
    }
    System.out.println();

    for(int i=0; i<row; i++)
    {
      for(int j=0; j<col; j++)
      {
        System.out.print(Array[i][j]+"  ");
      }
              System.out.println();
    }
String word ;
    System.out.print("\n\nEnter the  word that you find in the puzzle:  ");
    word = input.nextLine();
int counter = 0;
int index=0;
int length = 0;
boolean isFound=false;
String temp = "";
    for(int i =0; i<word.length(); i++)
    {
          if(word.charAt(i)>=90 && word.charAt(i)<=122)
          {
            temp = temp+(char)(word.charAt(i)-32);
          }
          else
          {
            temp = temp + (char)(word.charAt(i));
          }

    }

    word = temp;
  for(int i=0; i<row; i++)
  {
    index=0;
    for(int j=0; j<col; j++)
    {
      if(Array[i][j]==word.charAt(index))
      {
        index++;
        length++;
        if(length==word.length())
        {
          isFound=true;
          break;
        }
      }
      else
      {
        index=0;
        length=0;
      }
    }
    if(isFound)
    break;
  }

  for(int i=0; i<row; i++)
  {
    index=0;
    for(int j=0; j<col; j++)
    {
      if(Array[j][i]==word.charAt(index))
      {
        index++;
        length++;
        if(length==word.length())
        {
          isFound=true;
          break;
        }
      }
      else
      {
        index=0;
        length=0;
      }
    }
    if(isFound)
    break;
  }



    if(isFound)
    System.out.print("\n\nYes the word is in the Puzzle.\n\n");
    else
    System.out.print("\n\nNo, the word is in not the Puzzle.\n\n");



 }
}
