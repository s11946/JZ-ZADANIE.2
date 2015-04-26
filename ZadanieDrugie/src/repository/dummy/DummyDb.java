package repository.dummy;

import java.util.HashMap;
import java.util.Map;
import entity.User;

public class DummyDb {

	private Map<Integer, User> usersDb;
	
	private DummyDb() {
		this.usersDb = new HashMap<>();
	}
	
	private static class LazyDbHolder {
		private static final DummyDb INSTANCE = new DummyDb();
	}
	
	public static synchronized DummyDb getInstance() {
		return LazyDbHolder.INSTANCE;
	}
	
	public Map<Integer, User> getUsersDb(){
		return usersDb;
	}
}
