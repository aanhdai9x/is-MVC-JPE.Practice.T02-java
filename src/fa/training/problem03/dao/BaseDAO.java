package fa.training.problem03.dao;

public interface BaseDAO <T, K> {

	public void save(T obj);
	public void findAll(K str);
}
