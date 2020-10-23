package decorarorCompare;

public class programCompare {

	public static void main(String[] args) {
		System.out.println("\n Master's of Science in Computer Science");
		programReview msCs = new programLocation(new courseLength());
		msCs.assemble();
		System.out.println("\n ------------------");
		
		System.out.println("\n Master's of Science in Data Science");
		programReview msDs = new programLocation(new courseLength());
		msDs.assemble();
	}
	String newline = System.lineSeparator();
	
	 public String getCs() {
		 String cs = ("\n Master's of Science in Computer Science");
			programReview msCs = new programLocation(new courseLength());
			msCs.assemble();
			cs +=("\n ------------------");
			return cs;
			
	 }
			
	 public String getDs() {
			String ds=("\n Master's of Science in Data Science");
			programReview msDs = new programLocation(new courseLength());
			msDs.assemble();
			ds +=("\n ------------------");
			return ds;
	 }

}

