package string_and_array;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 1. Sorting
 * 2. Priority Queue로 우선순위 비교 
 * 3. End<=start 합치기
 */
class Interval{
	int start;
	int end;
	
	Interval(){
		this.start=0;
		this.end=0;
	}
	
	Interval(int s, int e){
		this.start=s;
		this.end=e;
	}
}

public class MeetingRoom2 {
	public static void main(String[] args) {
		MeetingRoom2 a=new MeetingRoom2();
		// sorting을 직접 구현하기 위해 순서 재정렬 
		Interval in1=new Interval(5,10);
		Interval in2=new Interval(15,20);
		Interval in3=new Interval(0,30);
		Interval[] intervals= {in1, in2, in3};
		System.out.println(a.solve(intervals));
	}
	
	public int solve(Interval[] intervals) {
		// null check
		if(intervals==null || intervals.length==0) {
			return 0;
		}
		Arrays.parallelSort(intervals, Comp);
	}
	
	Comparator<Interval> Comp=new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
}
