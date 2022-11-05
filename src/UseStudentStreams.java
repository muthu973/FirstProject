import java.util.*;
import java.util.stream.*;
import java.util.Collections;
public class UseStudentStreams {

	public static void main(String[] args) {
		StudentStreams s1=new StudentStreams(106,"Prabha",22,"Male",11,"B Sec",8765);
		StudentStreams s2=new StudentStreams(104,"Irfan",20,"Male",11,"A Sec",8765985);
		StudentStreams s3=new StudentStreams(103,"Abu",23,"Male",12,"D Sec",81335);
		StudentStreams s4=new StudentStreams(102,"Chinese",22,"Female",10,"A Sec",876786);
		StudentStreams s5=new StudentStreams(101,"Bomma",21,"Female",12,"B Sec",8765);
		StudentStreams s6=new StudentStreams(105,"Sow",22,"Female",11,"A Sec",8765);
		StudentStreams s7=new StudentStreams(107,"Prabu",24,"Male",12,"C Sec",8545);
		StudentStreams s8=new StudentStreams(108,"Nithish",22,"Male",11,"A Sec",845);
		StudentStreams s9=new StudentStreams(109,"Div",20,"Female",10,"A Sec",8745);
		StudentStreams s10=new StudentStreams(110,"Nag",22,"Male",11,"D Sec",8765);
		
		ArrayList<StudentStreams> stds=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10));
		List<String> names=stds.stream().filter(x->x.getSection().equals("B Sec")).map(y->y.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		List<StudentStreams> maleStudents=stds.stream().filter(y->y.getGender().equals("Male")).toList();
		System.out.println(maleStudents);
		
		long stdCount=stds.stream().filter(s->s.getSection().equals("A Sec")).count();
		System.out.println(stdCount);
		
		List<String> allNames=stds.stream().map(z->z.getName()).toList();
		System.out.println(allNames);
		
	}

}
