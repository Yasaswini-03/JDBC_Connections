package generics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

class User {
	private String name;
	public User(String name) {
		this.name = name;
		
	}
	public String User_Name() {
		return name;
	}
}
public class Optional {
	static Map<Integer, User> M = new HashMap<Integer, User>();
	static {
		M.put(1, new User("yasaswini"));
		M.put(2, new User("meera"));
	}
	public static java.util.Optional<User> GetById(int id) {
		return java.util.Optional.ofNullable(M.get(id));
		
	}
	public static void main(String[] args) {
		int Search_id = 1;
		java.util.Optional<User> u1 = GetById(Search_id);
		String Message = u1.map(u2 -> "User Found" + u2.User_Name()).orElse("User not Found");
		System.out.println(Message);
		LocalTime LT = LocalTime.now();
		DateTimeFormatter DT = DateTimeFormatter.ofPattern("hh::mm::ss a");
		String str = LT.format(DT);
		System.out.println(str);
	}

}
