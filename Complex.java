import java.util.Scanner;
class Complex{
    int r,i;
    Complex(int r1,int i2){
        this.r=r1;
        this.i=i2;
    }
    public static void add(Complex c1,Complex c2){
        int s1=c1.r+c2.r;
        int s2=c1.i+c2.i;
        System.out.println(s1+"+"+s2+"i");
    }
    public void print(){
        System.out.println(this.r+"+"+this.i+"i");
    }
    public static void main(String[] args) {
        System.out.print("Enter real part of 1st complex number: ");
        Scanner s=new Scanner(System.in);
        int r1=s.nextInt();
        System.out.print("Enter imaginary part of 1st complex number: ");
        int i1=s.nextInt();
        Complex c1=new Complex(r1,i1);
        System.out.print("Enter real part of 2nd complex number: ");
        int r2=s.nextInt();
        System.out.print("Enter imaginary part of 2nd complex number: ");
        int i2=s.nextInt();
        Complex c2=new Complex(r2,i2);
        System.out.print("First no: ");
        c1.print();
        System.out.print("Second no: ");
        c2.print();
        System.out.print("Sum: ");
        add(c1,c2);
        s.close();
    }
}