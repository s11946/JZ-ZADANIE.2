package repository.unitofwork;

import entity.Entity;

public interface IUnitOfWorkRepository<TEntity extends Entity> {
	
	public void persistAdd(TEntity entity);
	
	public void persistUpdate(TEntity entity);
	
	public void persistDelete(TEntity entity);
	

}
