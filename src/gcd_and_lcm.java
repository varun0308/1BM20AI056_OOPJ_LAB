import Gcd.gcd;
import Lcm.lcm;

class gcd_and_lcm{
 public static void main(String args[])
 {
  int a=5,b=10;
  gcd g=new gcd(a,b);
  lcm l=new lcm(a,b);
  System.out.println("GCD= "+ g.cal_gcd());
  System.out.println("LCM= "+ l.cal_lcm());
 }
}