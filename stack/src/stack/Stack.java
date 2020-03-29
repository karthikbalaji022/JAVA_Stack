package stack;

public class Stack  {
	
	int top=0;
	
	int[] stack=new int[5];
	public void push  (int data)
	{
		if(top>4)
		{
			expand();
		}
		stack[top]=data;
		
		top+=1;

	}
	
	public void show()
	{
		for(int i=0;i<top;i++) {
			System.out.println(stack[i]);
		}
	}
	
	 public void expand()
	{
		int[] extend=new int[top+1];
		System.arraycopy(stack, 0, extend, 0, top);
		stack=extend;
		
	}
	public void pop()
	{
		stack[top-1]=0;
		top-=1;
	}

}
