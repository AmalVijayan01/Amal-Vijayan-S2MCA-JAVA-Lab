 class student{
	int English=80;
	int Maths=88;
	int Physics=90;
	int Chemistry=89;
}
class sports extends student{
	String sports = "Cricket";
	int sixes=8;
	int fours=6;
	int wickets=3;
	int catches=1;

}
class result extends sports{
	public void display(){
		System.out.println("Academic results");
		System.out.println("*****************");
		System.out.println("English: "+this.English);
		System.out.println("Maths: "+this.Maths);
		System.out.println("Physics: "+this.Physics);
		System.out.println("Chemistry: "+this.Chemistry);
		
		
		System.out.println("\n");
		System.out.println("Sports results");
		System.out.println("Sports: "+this.sports);
		System.out.println("Sixes: "+this.sixes);
		System.out.println("Fours: "+this.fours);
		System.out.println("Wickets: "+this.wickets);
		System.out.println("Catches: "+this.catches);
	}
	
	public static void main(String[] args){
		result obj=new result();
		obj.display();
	}
}