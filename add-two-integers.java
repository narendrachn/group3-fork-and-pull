import java.util.scanner;
class Main {

   // create a function for adding to numbers
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);

      int first = sc.nextInt();
      int second = sc.nextInt();
  
      // add two numbers
      int sum = first + second;
      System.out.println(first + " + " + second + " = "  + sum);
      sc.close();
    }
  }