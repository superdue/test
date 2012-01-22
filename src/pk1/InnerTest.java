package pk1;

public class InnerTest {

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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerTest t = new InnerTest();
		InnerTest.InnerClass tin = t.innerClass();
		tin.initInnerStr();
		System.out.println(tin.readInnerStr());
		tin.setInnerStr("modified");
		InnerTest.InnerClass tt = t.new InnerClass();
		System.out.println(tt.readInnerStr());
	}

}
