public class MatrixMultiplication
{  
   public static void main(String args[])
 {      
   int p[][]={{1,2,3},{4,5,6},{7,8,9}};    
   int q[][]={{10,11,12},{13,14,15},{16,17,18}};    
   int r[][]=new int[3][3];  
   for(int i=0;i<3;i++) 
   {    
     for(int j=0;j<3;j++){    
     r[i][j]=0;      
     for(int k=0;k<3;k++)      
   {      
     r[i][j]+=p[i][k]*q[k][j];      
   }
   System.out.print(r[i][j]+" ");  
  }
  System.out.println();  
  }    
 }
}  