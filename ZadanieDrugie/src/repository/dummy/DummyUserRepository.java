package repository.dummy;

import java.util.List;

import repository.unitofwork.IUnitOfWork;
import repository.IUserRepository;
import repository.unitofwork.IUnitOfWorkRepository;
import entity.User;

public class DummyUserRepository implements IUserRepository, IUnitOfWorkRepository<User>{
	
	private final IEntityBuilder<User> builder;
	private final IUnitOfWork unitOfWork;
	private final DummyDb dummyDb;
	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void persistAdd(User entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void persistUpdate(User entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void persistDelete(User entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User get(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isUserNameFree(String login) {
		// TODO Auto-generated method stub
		return false;
	}

}
