package basic;

public class ArrayDemo {
public static void main(String[] args) {
		
		System.out.println("Single Dimensional Array");
		int	a[] = {10,20,30,40,50};
		
		for(int i=4; i>=0; i--) {
			
		System.out.println(a[i]);
		}
		
		System.out.println("Multi Dimensional Array");
	
		int  s[][]= {{12, 14, 16},{22, 24, 26},{32,34,36}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
				System.out.println("Array1 :"+ s[i][j]);
				System.out.println("**************");
				System.out.println("Array2 :"+ s[j][k]);
				System.out.println("**************");
				System.out.println("Array3 :"+ s[k][i]); 
				
			}
		}
	}
	}
}


