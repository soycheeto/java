class Overload{
	public static void main(String[] args){
	    
	public void print(int a){
		System.out.println(a);
	}
	public void print(int a, int b){
		System.out.println("Overloaded");
		System.out.println(a);
		System.out.println(b);
	}
		Overload o = new Overload();
		o.print(10);
		o.print(10,20);
	}
}
