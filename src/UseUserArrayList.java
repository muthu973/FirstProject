import java.util.ArrayList;
import java.util.Arrays;
public class UseUserArrayList {

	public static void main(String[] args) {
		UserArrayList u=new UserArrayList(101,"Prabha","Male","muthu@gmail.com",98765678);
		UserArrayList u1=new UserArrayList(102,"Irfan","Male","irfan@gmail.com",98765678);
		UserArrayList u2=new UserArrayList(103,"Abu","Male","abu@gmail.com",98765678);
		UserArrayList u3=new UserArrayList(104,"Chinese","Female","chinese@gmail.com",98765678);
		UserArrayList u4=new UserArrayList(105,"Siva","Male","siva@gmail.com",98765678);
		UserArrayList u5=new UserArrayList(106,"Ram","Male","ram@gmail.com",98765678);
		UserArrayList u6=new UserArrayList(107,"Nithish","Male","nithish@gmail.com",98765678);
		UserArrayList u7=new UserArrayList(108,"Subru","Male","subru@gmail.com",98763836);
		UserArrayList u8=new UserArrayList(109,"Chutti","Male","chutti@gmail.com",98768765);
		UserArrayList u9=new UserArrayList(110,"Mental","Male","mental@gmail.com",87654454);
		
		ArrayList<UserArrayList> al=new ArrayList<UserArrayList>(Arrays.asList(u,u1,u2,u3,u4,u5,u6,u7,u8,u9));
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
		for(UserArrayList a:al) {
			if(a.getGender().equals("Female")) {
				System.out.println(a);
			}
		}
		
		al.forEach(x->{
			if(x.getId()>105) {
				System.out.println(x);}});
	}

}
