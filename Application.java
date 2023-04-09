// importing the File class
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }

  #feature202 changes by Sathish on Mar2023-REports Module-HDFC Project
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {

      // method call
      int result = getSquare(i);
      System.out.println("Square of " + i + " is: " + result);
    }
  }

  #feature201 code changes by Farha on Mar2023 on Module Services-HDFC Project
  public void sampleMethod(int a,int b) throws ArithmeticException{
      System.out.println("Hello, this is sample method");
      int c = a/b;
      System.out.println("c:"+c);
 }
  
 public static void main (String[] args){
    new DemoClass().sampleMethod(4,2);     
 }

}