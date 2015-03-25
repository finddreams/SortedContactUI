package com.finddreams.sortedcontact;

import java.util.Comparator;

import com.finddreams.sortedcontact.sortlist.SortModel;

/**
 * @Description:拼音的比较器
 * @author http://blog.csdn.net/finddreams
 */ 
public class PinyinComparator implements Comparator<SortModel> {

	public int compare(SortModel o1, SortModel o2) {
		if (o1.getSortLetters().equals("@")
				|| o2.getSortLetters().equals("#")) {
			return -1;
		} else if (o1.getSortLetters().equals("#")
				|| o2.getSortLetters().equals("@")) {
			return 1;
		} else {
			return o1.getSortLetters().compareTo(o2.getSortLetters());
		}
	}

}
