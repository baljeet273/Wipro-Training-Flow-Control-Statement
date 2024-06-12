
public class ToUppercase {
		public static void main(String[] args) {
			char ch = 'B';
			if (Character.isLowerCase(ch)) 
				System.out.println(ch + "->" + Character.toUpperCase(ch));
			else
				System.out.println(ch + "->" + Character.toLowerCase(ch));
		}
}
