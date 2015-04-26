package repository.unitofwork;

import java.util.LinkedHashMap;
import java.util.Map;

import entity.Entity;
import entity.EntityState;

public class UnitOfWork implements IUnitOfWork{
	
	private Map<Entity, IUnitOfWorkRepository> entities;
	
	private UnitOfWork() {
		this.entities = new LinkedHashMap<>();
	}
	
	private static class LazyDbHolder {
		private static final UnitOfWork INSTANCE = new UnitOfWork();
	}
	
	public static synchronized UnitOfWork getInstance() {
		return LazyDbHolder.INSTANCE;
	}
	

	@Override
	public void commit() {
		for (Entity entity : entities.keySet()) {
			switch (entity.getEntityState()) {
			case ZMIENIONY:
				entities.get(entity).persistUpdate(entity);
				break;
			case USUNIETY:
				entities.get(entity).persistDelete(entity);
				break;
			case NOWY:
				entities.get(entity).persistAdd(entity);
				break;
			case NIEZMIENIONY:
				break;
			default:
				break;
			}
		}
		
	}

	@Override
	public void rollback() {
		entities.clear();	
		
	}

	@Override
	public void markAsNew(Entity entity, IUnitOfWorkRepository repository) {
		entity.setEntityState(EntityState.NOWY);
		entities.put(entity, repository);
	}

	@Override
	public void markAsDirty(Entity entity, IUnitOfWorkRepository repository) {
		entity.setEntityState(EntityState.ZMIENIONY);
		entities.put(entity, repository);
		
	}

	@Override
	public void markAsDeleted(Entity entity, IUnitOfWorkRepository repository) {
		entity.setEntityState(EntityState.USUNIETY);
		entities.put(entity, repository);
		
	}

}
