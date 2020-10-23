package decorarorCompare;

public class compileInformation implements programReview {

	protected programReview program;
	
	public compileInformation(programReview p){
		this.program=p;
	}
	
	public void assemble() {
		this.program.assemble();
	}

}