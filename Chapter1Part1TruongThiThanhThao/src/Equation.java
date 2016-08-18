
public class Equation {
	int a;
	int b;
	public Equation(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Equation() {
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public void calculate(int a, int b){
		if(a==0){
			if(b==0){
				System.out.println("Numerous solution");
			}else{
				System.out.println("No solution");
			}
		}else{
			double x=-b/a;
			System.out.println("Root is : "+x);
		}
	}
}
