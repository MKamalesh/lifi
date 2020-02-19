package kamal;

public class ElectronicShop {
	String name,mobileno;
	int price;
	float discount;
	int total;
	static float amount;
	float pay;
	public ElectronicShop(String string,String string2, int j, float k, int l) {
	    name=string;
	    mobileno=string2;
	    price=j;
	    discount=k;
		this.total=l;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ElectronicShop ES=new ElectronicShop("Kamal","9876543219" ,65000,(float) 10.0,150000);
	    amount=ES.discount();
		ES.display();
		// TODO Auto-generated method stub

	}

	private void display() {
		System.out.println("Name:"+name);
		System.out.println("Discount:"+discount);
		System.out.println("Total:"+amount);
		
		// TODO Auto-generated method stub
		
	}

	private float discount() {
		
		if(price<=25000)
		{
			pay=(float) (total-(total*0.05));
			return pay;
		}
		else if(price>=25001 && price<=50000)
		{
			pay=(float)(total-(total*0.075));
			return pay;
		}
		else if(price>=50001 && price<=100000)
		{
			
			pay=(float)(total-(total* 0.1));
			
			return pay;
		}
		else if(price>100001)
		{
			pay=(float)(total-(total*0.15)); //0
			return pay;
		}
		return 0;
		// TODO Auto-generated method stub
		
	}

}
