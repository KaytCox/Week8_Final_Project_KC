package decorarorCompare;

public class programCompare {

	public static void main(String[] args) {
		System.out.println("\nMaster's of Science in Computer Science");
		programReview msCs = new programLocation(new courseLength());
		msCs.assemble();
		System.out.println("\n------------------");
		
		System.out.println("\nMaster's of Science in Data Science");
		programReview msDs = new programLocation(new courseLength());
		msDs.assemble();
	}

}

