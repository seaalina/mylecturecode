package lv.alina.users;

import java.util.Arrays;

public class Teachers extends Person{
private int numCourses;
private String[] courses;
private static final int MAX_COURSES=4;

	public Teachers(String name, String address) {
		super(name, address);
		this.numCourses=0;
		this.courses=new String[MAX_COURSES];
	}
public void addCourse(String course){
	courses[numCourses]=course;
			++numCourses;
			System.out.println(Arrays.toString(this.courses));
}
public boolean addCourses(String course){
	for (int i=0; i<numCourses; i++){
if (courses[i].equals(course)){
	return false;
}
	
}
	courses[numCourses]=course;
	numCourses++;
	return true;
}
	public boolean removeCourses(String course){
		boolean found=false;
		int courseIndex=-1;
		for(int i=0; i<numCourses; i++){
			if(courses[i].equals(course)){
				courseIndex=i;
				found = true;
				break;
			}
		}
		if(found){
			for (int i=courseIndex;i<numCourses-1;i++){
				courses[i]=courses[i+1];
			}
			numCourses--;
			return true;
		}else{
			return false;
	
		}
}	
public String toString(){
	return "Teacher: "+ super.toString();
	
}

}
