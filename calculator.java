import java.util.Scanner;
   public class calculator
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first value");
		double a=s.nextDouble();
		System.out.println("enter operator");
		char b=s.next().charAt(0);
		System.out.println("enter second value");
		double c=s.nextDouble();
		switch (b)
		{
		case'+':
			{
			   add(a,c);
			   break;
		    }			
		case'-':
		    {
			   sub(a,c);
			   break;
			}			
		case'*':
			{
			   mut(a,c);
			   break;
			}			
	    case '/':
		   {
		       div(a,c);
			    break;
		   }	  
		 default :System.out.println("choose correct operator");
		}
	}	
        static void add(double a,double c)
		{
			double res=a+c;
			System.out.println("result :"+a+" + "+c+" = "+res);
	}
	 static void sub(double a,double c)
	{
		    double res=a-c;
			System.out.println("result :"+a+" - "+c+" = "+res);
	}
	 static void mut(double a,double c)
	{
		    double res=a*c;
			System.out.println("result :"+a+" * "+c+" = "+res);
	}
	 static void div(double a,double c)
	{
		    double res=a/c;
			System.out.println("result :"+a+" / "+c+" = "+res);
	}

}
