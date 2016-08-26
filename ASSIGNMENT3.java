
public class ASSIGNMENT3 {

	public static void main(String[] args) {
		char c;
		
		//for upper diamond
		for(int i=1;i<=3;++i)        
		{
		c='a';
		for(int j=i;j<3;++j)        
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;++k)      
		{
		System.out.print(c);
		++c;
		}
		c-=2;
		for(int l=1;l<i;++l)     
		{
		System.out.print(c);
		--c;
		}
		System.out.println();   
		}
		
		//for lower diamond
		for(int i=1;i<3;++i)        
		{
		c='a';
		for(int j=1;j<=i;j++)        
		{
		System.out.print(" ");
		}
		for(int k=1;k<=3-i;++k)      
		{
		System.out.print(c);
		++c;
		}
		c-=2;
		for(int l=1;l<3-i;++l)     
		{
		System.out.print(c);
		--c;
		}
		System.out.println();   
		}
	}
	
}
