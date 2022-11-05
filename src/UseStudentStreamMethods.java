import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
public class UseStudentStreamMethods {

	public static void main(String[] args) {
		StudentStreamMethods s1=new StudentStreamMethods(101,"Prabha",26,"Male",87654765l);
		StudentStreamMethods s2=new StudentStreamMethods(102,"Chinese",23,"Female",876598l);
		StudentStreamMethods s3=new StudentStreamMethods(103,"Bomma",22,"Female",874765);
		StudentStreamMethods s4=new StudentStreamMethods(104,"Paithiyam",20,"Female",87654);
		StudentStreamMethods s5=new StudentStreamMethods(105,"Siva",24,"Male",876575);
		StudentStreamMethods s6=new StudentStreamMethods(106,"Prabha",22,"Male",876765);
		StudentStreamMethods s7=new StudentStreamMethods(107,"Prabu",22,"Male",87665);
		StudentStreamMethods s8=new StudentStreamMethods(108,"Rakesh",21,"Male",87655);
		StudentStreamMethods s9=new StudentStreamMethods(109,"Ram",25,"Male",8754765);
		StudentStreamMethods s10=new StudentStreamMethods(110,"Abu",21,"Male",874765);
		
		ArrayList<StudentStreamMethods> students=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10));	
		StudentStreamMethods maxAge=students.stream().max((a,b)->a.getAge()>b.getAge()? 1 : -1).get();
		System.out.println(maxAge);
		StudentStreamMethods minAge=students.stream().min((a,b)->a.getAge()>b.getAge()? 1: -1).get();
		System.out.println(minAge);
		int ageSum=students.stream().collect(Collectors.summingInt(c->c.getAge()));
		System.out.println(ageSum);
		double sumAge=students.stream().collect(Collectors.summingDouble(d->d.getAge()));
		System.out.println(sumAge);
		long sumPhnNo=students.stream().collect(Collectors.summingLong(e->e.getPhnNo()));
		System.out.println(sumPhnNo);
		List<StudentStreamMethods> ageSortedList=students.stream().sorted((x,y)->x.getAge()-(y.getAge())).collect(Collectors.toList());
		System.out.println(ageSortedList);
		List<StudentStreamMethods> genderSortedList=students.stream().sorted((x,y)->x.getGender().compareTo(y.getGender())).collect(Collectors.toList());
		System.out.println(genderSortedList);
		students.stream().sorted((x,y)->y.getAge()-(x.getAge())).forEach(System.out::println);
		System.out.println(ageSortedList);
		students.stream().sorted((x,y)->y.getGender().compareTo(x.getGender())).forEach(System.out::println);
		
		
		
		
	}

}
