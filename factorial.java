import	java.util.Scanner;
public class factorial {
	public	static	void	main(String[] args)	{
		Scanner	sc	=	new	Scanner(System.in);
		System.out.println("Enter the factorial value=");
		int	number	=	sc.nextInt();
		sc.close();
		int	factorial	=	1;
		for	(int i = 1;i<=number;i++) {
			factorial	=	factorial	*	i;			
		}
		System.out.println("Factorial of a number " + number + " = " + factorial);
	}
	

}
