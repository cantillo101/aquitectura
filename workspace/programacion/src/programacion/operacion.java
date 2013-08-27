package programacion;

public class operacion {
		int x,y;  
		public static void main (String m[]){
				operacion t=new operacion(); 
				t.x=5;
				t.y=10;
				t.suma(); 
				t.resta();
				t.multiplicacion();
				t.divicion();
				
			}
				
			

		
	
		public void suma () {
			int r; 
			r= x+y; 
			System.out.println("la suma es" + r);
		}
		public void resta () {
			int r; 
			r= x-y; 
			System.out.println("la resta es" + r);
		}
		

		public void multiplicacion () {
			int r; 
			r= x*y; 
			System.out.println("la multiplicacio es" + r);
		}
		

		public void divicion () {
			int r; 
			r= x/y; 
			System.out.println("la divicion es" + r);
		}
		
		
		
		
		
		
		
		
		
		
}
