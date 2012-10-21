public class Delitelji{
	public static void main(String[] args){
	
		System.out.print("Vnesi stevilo: ");
		int a=BranjePodatkov.preberiInt();
		System.out.print("Delitelji stevila "+a+" so: ");
		for(int i=1;i<=a;i++)
		{
			if(a%i==0){System.out.print(i+" ");}
		}
	}
}