import java.util.Scanner;
class Matrix{
        public static void main(String[] args) {
            int flag=0;

        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r=s.nextInt();
        System.out.print("Enter number of columns: ");
        int c=s.nextInt();
        int m[][]=new int[r][c];
        int m1[][]=new int[r][c];
        System.out.println("Enter numbers");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=s.nextInt();
            }
        }
        System.err.println("Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.err.print(m[i][j]);
            }
            System.err.println("");
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m1[i][j]=m[j][i];
            }
        }
        System.out.println("Transpose");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.err.print(m1[i][j]);
            }
            System.err.println("");
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]!=m1[i][j]){
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.println("Matrix is asymmetric");
        }
        else{
            System.out.println("Matrix is symmetric");
        }
    }
}