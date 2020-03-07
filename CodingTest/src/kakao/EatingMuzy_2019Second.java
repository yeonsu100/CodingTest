package kakao;

import java.util.*;

class EatingMuzy_2019Second {
	class Food{
		int time;
		int idx;
		Food(int t, int i){
			time=t;
			idx=i;
		}
	};
	
	Comparator<Food> CompTime=new Comparator<Food>() {
		public int compare(Food a, Food b) {
			return a.time - b.time;
		}
	};
	
	Comparator<Food> CompIdx=new Comparator<Food>() {
		public int compare(Food a, Food b) {
			return a.idx - b.idx;
		}
	};
	
	public int solution(int[] food_times, long k) {
		List<Food> foods=new LinkedList<Food>();
		int n=food_times.length;
		for(int i=0; i<n; ++i)
			foods.add(new Food(food_times[i], i+1));
		
		foods.sort(CompTime);
		
		int pretime=0;
		int i=0;
		for(Food f:foods) {
			long diff=f.time-pretime;
			if(diff != 0) {
				long spend=diff*n;
				if(spend <= k) {
					k -= spend;
					pretime=f.time;
				}else {
					k %= n;
					foods.subList(i, food_times.length).sort(CompIdx);
					return foods.get(i+(int)k).idx;
				}
			}
			++i;
			--n;
		}
		
		return -1;
	}
}
