package mysol03;

import java.util.Arrays;
import java.util.Comparator;

public class Student03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = new Student [5];
		arr[0] = new Student(3, "Nilesh","Nashik",50);
		arr[1] = new Student(1, "Sarang", "Pune",40);
		arr[2] = new Student(4, "Prashant", "Pune",40);
		arr[3] = new Student(5, "Prashant", "Nashik",90);
		arr[4] = new Student(2, "Nitin", "Karad",70);
		
		System.out.println("Before Sort: ");
		for (Student e : arr)
			System.out.println(e);
		
		class StudCityMarksComparator implements Comparator<Student> {
			@Override
			public int compare(Student e1, Student e2) {
				int diff = -e1.getCity().compareTo(e2.getCity());
				if(diff == 0)
					diff = -Double.compare(e1.getMarks(), e2.getMarks());
				if(diff == 0)
					diff = e1.getName().compareTo(e2.getName());
				
				return diff;
			}
		}
		
		StudCityMarksComparator comparator = new StudCityMarksComparator();
		Arrays.sort(arr, comparator);
		System.out.println("After Sort by Name, Sal: ");
		for (Student e : arr)		
			System.out.println(e);

	}

}
