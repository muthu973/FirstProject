import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class UseIntArrayListEx {
	public static void main(String[] args) {
		IntArrayListEx a=new IntArrayListEx(78);
		IntArrayListEx a1=new IntArrayListEx(92);
		IntArrayListEx a2=new IntArrayListEx(84);
		IntArrayListEx a3=new IntArrayListEx(86);
		IntArrayListEx a4=new IntArrayListEx(85);
		IntArrayListEx a5=new IntArrayListEx(95);
		IntArrayListEx a6=new IntArrayListEx(100);
		IntArrayListEx a7=new IntArrayListEx(76);
		IntArrayListEx a8=new IntArrayListEx(88);
		IntArrayListEx a9=new IntArrayListEx(90);
		
		ArrayList<IntArrayListEx> iale=new ArrayList<IntArrayListEx>();
		iale.add(a);
		iale.add(a1);
		iale.add(a2);
		iale.add(a3);
		iale.add(a4);
		iale.add(a5);
		iale.add(a6);
		iale.add(a7);
		iale.add(a8);
		iale.add(a9);
		
		for(int i=0;i<iale.size();i++) {
			System.out.println(iale.get(i));
		}
		for(IntArrayListEx in:iale){
			if(in.getMark()>90) {
			System.out.println(in);
		}
		}
		iale.forEach(x->{
			if(x.getMark()>75&&x.getMark()<=100) {
				System.out.println(x);
			}
		});
		
		
	}

}
