package com.sorting;

import java.util.ArrayList;
import java.util.TreeSet;

import collection.program.list.arraylist.MyComparator;

public class Task {
	public static void main(String[] args) {
		//This is input
		//	[2016, Draft Abstracts, 2017, 2012, Abstracts - Appendix D, 2008, 2009, 2018, General, Administrative and Other Technical Matters from the Official Minutes, 2015, 2022, 2011, 2019, 2010, 2014, 2007, Abstracts - Appendices A-C, 2013, 2006 - 1984]

			
			ArrayList<String> l = new ArrayList<String>();
			
			l.add("2016");
			l.add("Draft Abstracts");
			l.add("2017");
			l.add("2012");
			l.add("Abstracts - Appendix D");
			l.add("2008");
			l.add("2009");
			l.add("2018");
			l.add("General");
			l.add("Administrative and Other Technical Matters from the Official Minutes");
			l.add("2015");
			l.add("2022");
			l.add("2011");
			l.add("2019");
			l.add("2010");
			l.add("2014");
			l.add("2007");
			l.add("Abstracts - Appendices A-C");
			l.add("2013");
			l.add("2006 - 1984");
		
			
			
			TreeSet<Integer> t = new TreeSet<>(new MyComparator());
			TreeSet<String> s = new TreeSet<>();
			for (int i = 0; i < l.size(); i++) {
				try {
					Integer I1= (Integer.parseInt(l.get(i)));
					t.add(I1);
					
				} catch (NumberFormatException e) {
					
					s.add(l.get(i));
				}
			}
			
			ArrayList<Object> al = new ArrayList<>();
			al.addAll(t);
			al.addAll(s);
			 
			System.out.println(al);
			 
			
			
//			Expected output
//			[2022, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006 - 1984, Abstracts - Appendices A-C, Abstracts - Appendix D, Administrative and Other Technical Matters from the Official Minutes, Draft Abstracts, General]

	}
}
