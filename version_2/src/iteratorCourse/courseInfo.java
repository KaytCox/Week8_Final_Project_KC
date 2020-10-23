package iteratorCourse;

public class courseInfo {

	   public static void main(String[] args) {  
		   commonCourses cmpnyProducts = new commonCourses();  
		   
		   System.out.println("ENGINEERING, COMPUTING AND MATHEMATICAL SCIENCES DEPARTMENT");
		   System.out.println("Review the courses avalible for each Program.");
		   System.out.println(" ");
	            
	          for(reviewCourses iter = cmpnyProducts.getcourseDirectory(); iter.hasNext();){  
	              String name = (String)iter.next(); 
	              System.out.println("Course Title : " + name);  
	           }      
	    }  
	} 