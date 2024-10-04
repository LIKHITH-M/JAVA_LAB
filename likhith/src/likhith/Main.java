package likhith;
import java.util.Arrays;
class cust{
	String id;
	int age;
	String place;
	long phone;
	cust(String id,int age,String place,long phone){
		this.id=id;
		this.age=age;
		this.place=place;
		this.phone=phone;
	}
	void display() {
		System.out.println("id: "+this.id);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cust obj = new cust("asdfas",34,"sdfj",987397329l);
		obj.display();
	}

}
