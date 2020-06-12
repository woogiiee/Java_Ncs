package ncs0612;

import java.util.HashSet;

public class HashLotto {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6){
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
}
}
