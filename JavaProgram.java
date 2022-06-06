

 class JavaProgram {

	public static void main(String[] args) {
         
                int a=5;
		int b=100;
		int c=150;
		int d=900;
		
		if(a>b && a>c && a>d)
		{
			System.out.println("a is greater:"+a);
		}
		else if(b>c && b>d)
		{
			System.out.println("b is greater:"+b);
		}
		else if(c>d)
		{
			System.out.println("c is greater:"+c);
		}
		
		else
		{
			System.out.println("d is greater:"+d);
		}
		
	}

}
