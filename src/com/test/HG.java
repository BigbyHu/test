package com.test;

import java.util.ArrayList;
import java.util.List;

public class HG {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("s");
		list.add("g");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
