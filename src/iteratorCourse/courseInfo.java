package iteratorCourse;

import decorarorCompare.courseLength;
import decorarorCompare.programLocation;
import decorarorCompare.programReview;

public class courseInfo {

	   public static void main(String[] args) {  
		   commonCourses cmpnyProducts = new commonCourses(); 
		   String newline = System.lineSeparator();
		   
		   System.out.println("ENGINEERING, COMPUTING AND MATHEMATICAL SCIENCES DEPARTMENT");
		   System.out.println("Review the courses avalible for each Program.");
		   System.out.println(" ");
	            
	          for(reviewCourses iter = cmpnyProducts.getcourseDirectory(); iter.hasNext();){  
	              String name = (String)iter.next(); 
	              System.out.println("Course Title : " + name + newline);  
	           }
	   }
	          
	     	 public String getCc() {
	          
			   commonCourses cmpnyProducts = new commonCourses();
			   
			   String cc=("ENGINEERING, COMPUTING AND MATHEMATICAL SCIENCES DEPARTMENT \n");
			   cc +=("Review the courses avalible for each Program. \n");
			   cc +=(" ");
		            
		          for(reviewCourses iter = cmpnyProducts.getcourseDirectory(); iter.hasNext();){  
		              String name = (String)iter.next(); 
		              cc +=("Course Title : " + name + "\n");  
		           }
				return cc;    
	    }  
	} 
