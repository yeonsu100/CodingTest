package string_and_array;

import java.util.*;

class Interval {
	int start;
	int end;
	Interval() {start=0; end=0;}
	Interval(int s, int e) {start=s; end=e;}
}

public class MergeInterval {
	public static void main(String[] args) {
		// int[] nums={{1,3}, {2,6}, {8,10}, {15,18}};
		// sorting해야 하기 때문에 순서 바꿔서 작성 
		Interval in2=new Interval(1,3);
		Interval in1=new Interval(2,6);
		Interval in3=new Interval(8,10);
		Interval in4=new Interval(15,18);
		
		List<Interval> intervals=new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);
		
		MergeInterval a=new MergeInterval();
		List<Interval> list=a.merge(intervals);
		
		a.print(list);
	}
	
	public List<Interval> merge(List<Interval> intervals){
		if(intervals.isEmpty()) return intervals;
		
		// 1
		List<Interval> result=new ArrayList<>();
		
		Collections.sort(intervals, (a,b)->a.start-b.start);	// 오름차순 (람다표현식 이용) 
	}
	
	void print(List<Interval> list) {
		for(int i=0; i<list.size(); i++) {
			Interval in=list.get(i);
			System.out.println(in.start+" "+in.end);
		}
	}
	
}
