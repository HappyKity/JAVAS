package day2_5;

import java.util.ArrayList;

public class GuestBookService {

	private static ArrayList<GuestBook> list = new ArrayList<>();
	
	public static void save (GuestBook gb) {
		list.add(gb);
	}
	
	public static ArrayList<GuestBook> findAll(){
		return list;
	}
	
	public static GuestBook findById(Long gno) {
		for(GuestBook gb : list) {
			if(gb.getGno().equals(gno)) {
				return gb;
			}
		}
		return null;
	}
	
	public static Boolean delete(Long gno) {
		return false;
	}
}
