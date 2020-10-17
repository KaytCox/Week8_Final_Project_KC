package iteratorCourse;

public class commonCourses implements courseDirectory {  
	public String name[]={"Cyber Security Essentials", "Encryption and Authentication","Distributed Computing Systems","Pervasive Application Development","Semantic Web"};   
    
	@Override  
	    public reviewCourses getcourseDirectory() {  
	        return new commonCoursesDirectory() ;  
	    }  
	    private class commonCoursesDirectory implements reviewCourses{  
	        int i;  

	        public boolean hasNext() {  
	            if (i<name.length){  
	                return true;  
	            }  
	            return false;  
	        }  
	 
	        public Object next() {  
	            if(this.hasNext()){  
	                return name[i++];  
	            }  
	            return null;      
	        }  
	    }  
	}