public class IT26102775Lab2Q3{
 public static void main(String[] args){
  double hypotenuse, side_A, side_B, side_C;
  
  //Assigning values 
  side_A = 3;
  side_B = 4;
  
  hypotenuse = Math.sqrt(Math.pow(side_A,2) + Math.pow(side_B,2));
  
  //Expected output 
  System.out.println("Length of the hypotenuse : " + hypotenuse);
 }
}
