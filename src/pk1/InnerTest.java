package pk1;

import java.util.*;

public class InnerTest {
/*
	public InnerTest() {
		// TODO Auto-generated constructor stub
	}

	private class InnerClass
	{
		private String innerstr = "init";
		public String readInnerStr(){return innerstr;}
		public void initInnerStr(){innerstr = "init innerstrl";}
		public void setInnerStr(String str){innerstr = str;};
	}

	public InnerClass innerClass()
	{
		return new InnerClass();
	}
	*/
	public static void subListTest()
	{
		Random rand = new Random(47);
		//List<Integer> testList = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> testList = new ArrayList<Integer>();
		testList.addAll(Arrays.asList(1,2,3,4,5,6,7));
		Integer i = new Integer(2);
		System.out.print(testList.contains(i)+"\n");
		System.out.print(testList.indexOf(i)+"\n");
		Collections.sort(testList);
		System.out.print("str:"+testList+"\n");
		List<Integer> subList = testList.subList(1, 4);
		System.out.print(testList.containsAll(subList)+"\n");
		
		testList.add(2,100);
		subList = testList.subList(1, 4);
		System.out.print("substr:"+subList+"\n");
		Collections.shuffle(subList, rand);
		System.out.print("\nafter shuffle\n");
		//testList.set(2,99);
		
		System.out.print("str:"+testList);
		//System.out.print("substr:"+subList);
	}
	/**
	 * @param args
	 */
	
	static void f() {
		// Generate an exception to fill in the stack trace
		try {
		throw new Exception();
		} catch (Exception e) {
		for(StackTraceElement ste : e.getStackTrace())
		System.out.println(ste.getMethodName());
		}
		}
		static void g() { f(); }
		static void h() { g(); }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		InnerTest t = new InnerTest();
		InnerTest.InnerClass tin = t.innerClass();
		tin.initInnerStr();
		System.out.println(tin.readInnerStr());
		tin.setInnerStr("modified");
		InnerTest.InnerClass tt = t.new InnerClass();
		System.out.println(tt.readInnerStr());
		System.out.println(tin.readInnerStr());
		System.out.println(tt.readInnerStr());
		 */
		
		f();
		System.out.println("--------------------------------");
		g();
		System.out.println("--------------------------------");
		h();
		//subListTest();
	}

}
