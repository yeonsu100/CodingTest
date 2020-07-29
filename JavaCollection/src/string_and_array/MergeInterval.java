package string_and_array;

import java.util.*;

class Interval2 {
	int start;
	int end;

	Interval2() {
		start = 0;
		end = 0;
	}

	Interval2(int s, int e) {
		start = s;
		end = e;
	}
}

public class MergeInterval {
	public static void main(String[] args) {
		// int[] nums={{1,3}, {2,6}, {8,10}, {15,18}};
		// sorting해야 하기 때문에 순서 바꿔서 작성
		Interval2 in1 = new Interval2(1, 3);
		Interval2 in2 = new Interval2(2, 6);
		Interval2 in3 = new Interval2(8, 10);
		Interval2 in4 = new Interval2(15, 18);

		List<Interval2> intervals = new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);

		MergeInterval a = new MergeInterval();
		List<Interval2> list = a.merge(intervals);
		System.out.println("=== result ===");
		a.print(list);
	}

	public List<Interval2> merge(List<Interval2> intervals) {
		if (intervals.isEmpty())
			return intervals;

		// 1
		List<Interval2> result = new ArrayList<>();

		Collections.sort(intervals, comp2); 
		// Collections.sort(intervals,(a,b) -> a.start-b.start);

		List<Interval2> ans = new LinkedList<Interval2>();
		Interval2 hold = intervals.get(0);
		for(int i = 1; i < intervals.size(); i++) {
			Interval2 current = intervals.get(i);
			if(hold.end >= current.start) {
				System.out.println("hold.end: " + hold.end);
				hold.end = Math.max(current.end, hold.end);
			}else{
				System.out.println("22hold.end: " + hold.end);
				ans.add(hold);
				hold = current;
			}
		}

		if(!ans.contains(hold)) {
			System.out.println("333hold.end: " + hold.end);
			ans.add(hold);
		}

		return ans;
	}
	
		// 2
//		Interval before = intervals.get(0); // [1,3]
//		for (int i = 1; i < intervals.size(); i++) {
//			Interval current = intervals.get(i);
//			if (before.end >= current.start) {
//				before.end = Math.max(before.end, current.end);
//			} else {
//				result.add(before);
//				before = current;
//			}
//		}
//
//		if (!result.contains(before)) {
//			result.add(before);
//		}
//
//		return result;
//	}

	Comparator comp = new Comparator<Interval2>() {
		public int compare(Interval2 a, Interval2 b) {
			// TODO Auto-generated method stub
			return a.start - b.start;
		}
	};
	
	Comparator<Interval2> comp2 = new Comparator<Interval2>() {
		@Override
		public int compare(Interval2 o1, Interval2 o2) {
			if(o1.start > o2.start) {
				return 1;
			}else if(o1.start < o2.start) {
				return -1;
			}else{
				return 0;
			}
		}
	};
	
	void print(List<Interval2> list) {
		for (int i = 0; i < list.size(); i++) {
			Interval2 in = list.get(i);
			System.out.println(in.start + " " + in.end);
		}
	}
}
