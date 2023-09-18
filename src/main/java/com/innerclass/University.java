package com.innerclass;

//Outer class
public class University {

	// OuterClass Method
	public void getfacultyname() {// Writing a method which returns
		String[] facName = new String[5];

		facName[0] = "Mike";
		facName[1] = "Igor";
		facName[2] = "Scott";
		facName[3] = "Baljeet";
		facName[4] = "pinkesh";
		System.out.println("Below are faculties :  ");

		for (int i = 0; i < facName.length; i++) {

			System.out.println(facName[i]);
		}
	}

	// Inner Class
	public class MechanicalDep {

		// Inner Class Method
		public void facultyName() {
			System.out.println("Mechanical Department");
			System.out.println();
			
			University uni = new University();
			uni.getfacultyname(); // Calling OuterClass Method
		}
	}

	public class Civil {
		// Inner Class Method
		public void facultyName() {
			System.out.println("Civil Department");
			System.out.println();
			
			University uni = new University();
			uni.getfacultyname(); // Calling OuterClass Method
		}
	}

}
