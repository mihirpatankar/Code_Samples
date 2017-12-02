import java.math.BigInteger;

class RecMultInt{
  public static BigInteger RecMult(BigInteger x, BigInteger y){
    int digits = x.toString().length();
    int N = Math.max(x.bitLength(), y.bitLength());
    N=(N/2)+(N%2);
    //System.out.println("bits "+bits);
    if(digits==1){
      return x.multiply(y);
    }

    //Split the numbers into two parts
    BigInteger a = x.shiftRight(N);
    BigInteger b = x.subtract(a.shiftLeft(N));
    BigInteger c = y.shiftRight(N);
    BigInteger d = y.subtract(c.shiftLeft(N));

    //Compute the products recursively
    BigInteger ac = RecMult(a,c);
    BigInteger bd = RecMult(b,d);
    BigInteger ad = RecMult(a,d);
    BigInteger bc = RecMult(b,c);

    //Return result
    BigInteger c1=ac.shiftLeft(2*N);
    BigInteger temp = ad.add(bc);
    BigInteger c2=temp.shiftLeft(N);
    BigInteger temp2=c1.add(c2);
    return temp2.add(bd);
  }

  public static BigInteger Karatsuba(BigInteger x,BigInteger y){
    int digits = x.toString().length();
    int N = Math.max(x.bitLength(), y.bitLength());
    N=(N/2)+(N%2);
    //System.out.println("bits "+bits);
    if(digits==1){
      return x.multiply(y);
    }

    //Split the numbers into two parts
    BigInteger a = x.shiftRight(N);
    BigInteger b = x.subtract(a.shiftLeft(N));
    BigInteger c = y.shiftRight(N);
    BigInteger d = y.subtract(c.shiftLeft(N));

    //Compute the products recursively
    BigInteger ac = Karatsuba(a,c);
    BigInteger bd = Karatsuba(b,d);
    BigInteger pq = Karatsuba(a.add(b),c.add(d));
    BigInteger mid = pq.subtract(ac).subtract(bd);
    //Return result
    BigInteger c1=ac.shiftLeft(2*N);
    BigInteger c2=mid.shiftLeft(N);
    BigInteger temp2=c1.add(c2);
    return temp2.add(bd);
  }
  public static void main(String args[]){
    BigInteger x=new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
    BigInteger y=new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");
    //BigInteger x=new BigInteger("9999");
    //BigInteger y=new BigInteger("9999");
    BigInteger ans1=Karatsuba(x,y);
    BigInteger ans2=RecMult(x,y);
    System.out.println("Karatsuba Algorithm : "+ans1.toString());
    System.out.println("RecMult Algorithm : "+ans2.toString());
    System.out.println("Actual : "+x.multiply(y).toString());
  }
}
