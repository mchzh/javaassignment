import java.util.Scanner; 

//prime is a natural number，except 1 and itself，it cannot been divided by other natural numbers   
public class JudgeIfPrime {

  public static void main(String[] args) {  

      Scanner scan = new Scanner(System.in);// scanner，receive the input info of control station  

      System.out.print("Input a int number ：");  

      try {  
          int num = scan.nextInt();// get the imput info  
          if (isPrime(num)) {// call isPrime() method  

              System.out.println(num + " is prime！");// if isPrime() return true,output  

          } else {  

              System.out.println(num + " is not prime！");// if isPrime() return false,output  
          }  
      } catch (Exception e) {  
          System.out.println("please input a int");// catch exception，if input number not int，ouput exception  
      }  
  }  

  /** 
   * <pre> 
   * if the number is prime or not，is，return true,not return false 
   * </pre> 
   *  
   * @param a 
   *            input value 
   * @return true、false 
   */  
  public static boolean isPrime(int a) {  

      boolean flag = true;  

      if (a < 2) {// prime is not < 2  
          return false;  
      } else {  

          for (int i = 2; i <= Math.sqrt(a); i++) {  

              if (a % i == 0) {// if been divided，verify not prime，return false  

                  flag = false;  
                  break;// jump loop  
              }  
          }  
      }  
      return flag;  
  }  
}  

/*素数是指只有1和本身能整除的数。
判断一个数是不是素数从2到平方根来除，用例子来说就是假定n为17
平方根为四点几，如果他是不是素数他必定能化为两个数的乘积（1和本身外）
而且因为都是正整数那么肯定是两个小于17的正整数，如果一个数小于4（平方根取整）那么另一个乘除一定大余平方根取整
应为平方根*平方根=17>平方根*小于平方根的数，所以另一个数一定大于平方根，也就是说如果一个数不是素数，他一定能找到两个数化成乘积，如果其中一个大于平方根，那么必定能找到一个小于平方根的数和它成对，所以检查一个数是不是素数只要看它是否能被2到n的平方根之间的某个数整除就行了。*/