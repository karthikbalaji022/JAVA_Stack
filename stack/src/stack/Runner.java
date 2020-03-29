package stack;

public class Runner {

	public static void main(String[] args) {
		Stack ob=new Stack();
		ob.push(5);
		ob.push(10);
		ob.push(15);
		ob.push(20);
		ob.push(25);
		ob.push(30);
		ob.pop();
		ob.push(5);

		ob.show();
System.out.println("---"+ob.top+"---");
	}

}
