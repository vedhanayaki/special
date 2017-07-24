package player;

public class SpecialCharactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="@hjgfhfh&vnhgg#";
int b=a.length()-a.replaceAll("\\@","").length();
System.out.println(b);
	}

}
