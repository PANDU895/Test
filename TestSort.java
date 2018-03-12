package org.apache.commons.net.ftp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class TestSort {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		
		list.add(new Emp("Srikanth", "Parimi", 29, "Cap"));
		list.add(new Emp("manoj", "prabhakar", 28, "infi"));
		Collections.sort(list, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.getFirstName().compareTo(o1.getFirstName());
			}
		});
		System.out.println("based on first name->"+list.toString());
		Collections.sort(list, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				if(o1.getAge() >o2.getAge()) {
					return 1;
				} else if(o1.getAge() <o2.getAge()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println("based on age name->"+list.toString());
		
		
		Collections.sort(list, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				if(o1.getAge() >o2.getAge()) {
					return 1;
				} else if(o1.getAge() <o2.getAge()) {
					return -1;
				} else {
					return o1.getFirstName().compareTo(o1.getFirstName());
				}
			}
		});
		System.out.println("based on age and first name name->"+list.toString());
	}

}
