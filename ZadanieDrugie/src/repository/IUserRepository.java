package repository;

import entity.User;

public interface IUserRepository extends IRepository<User>{

	User get(String login, String password);
	
	boolean isUserNameFree(String login);
}
