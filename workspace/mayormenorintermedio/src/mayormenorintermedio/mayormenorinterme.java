package mayormenorintermedio;
public class mayormenorinterme {
	static double A=10,B=4,C=8,a,b,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	a=A%2;
	b=B%2;
	c=C%2;
		if (a==0 && b==0 && c==0){
			System.out.println("los numeros son pares");
	
			if(Math.sqrt(A) * Math.sqrt(A) == A);
				System.out.println(A+" en una raiz exacta");
			if(Math.sqrt(B) * Math.sqrt(B) == B);
				System.out.println(B+" en una raiz exacta");
			if(Math.sqrt(C) * Math.sqrt(C) == C);
				System.out.println(C+" en una raiz exacta");
		}
		else			
			System.out.println("Algun numero no es par");
			if (A>B)
				if(A>C)
					if (B>C)
						System.out.println(""+A+" "+B+" "+C);
					else
						System.out.println(""+A+" "+C+" "+B);
				else
					System.out.println(""+C+" "+A+" "+B);
			else
				if(B>C)
					if(A>C)
						System.out.println(""+B+" "+A+" "+C);
					else
						System.out.println(""+B+""+C+" "+A);
				else
					System.out.println(""+C+" "+B+" "+A);
							
		}
		
			

	}


