class StringReverse{
	public static void main(String []args){
	  String str = "hello world";
	  // StringBuffer revStr = new StringBuffer(str);
	  StringBuilder revStr = new StringBuilder(str);
	  revStr.reverse();
	  System.out.println(revStr);
	}
}
