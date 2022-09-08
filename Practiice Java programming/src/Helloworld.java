
public class Helloworld 
{
	int x=10;                        //non static 
	static int y=20;                 //static
	

	public static void main(String[] args)
	{
		Helloworld h1=new Helloworld();
		h1.x=100;
		h1.y=200;
		
//		Helloworld h2=new Helloworld();	
//		h2.x=500;
//     	h2.y=999;
//     	
//     	Helloworld h3=new Helloworld();	
//		h3.x=500;
//     	h3.y=340;
     	
		System.out.println(h1.x);		
		System.out.println(h1.y);
		
	}
}
