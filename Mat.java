import java.util.Scanner;

class Mat{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("enter no of rows: ");
        int r=s.nextInt();
        System.err.println("enter no of rows: ");
        int c=s.nextInt();
        int m1[][] = new int[r][c];
        int m2[][]=new int[r][c];
        int m3[][]=new int[r][c];
        System.out.println("enter elements of first matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m1[i][j]=s.nextInt();
            }
        }
        System.out.println("enter elements of 2nd matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m2[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("New matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m3[i][j]  + " ");
            }
            System.out.println();
        }
        s.close();
    }
}