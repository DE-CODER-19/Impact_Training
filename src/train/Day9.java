package train;

public class Day9 {

	

		public static void main(String[] args) {
			// Arithmetic exception handling
			System.out.println("program started");
			String s = "a";
			
			try {
				int  i = Integer.valueOf(s);
				System.out.println(i);
			}
			catch(NumberFormatException nfe) {
				nfe.printStackTrace();
				System.out.println(nfe.getMessage());
			}
			System.out.println("program ended");
		}

	}