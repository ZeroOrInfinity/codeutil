package [package].biz.impl;

import java.util.List;

import [package].dao.IBaseDao;
/**
 * 基本业务逻辑类
 * @author Administrator
 *
 * @param <T>
 */
public class BaseBiz<T> {

	private IBaseDao baseDao;
	
	public void setBaseDao(IBaseDao baseDao) {
		this.baseDao = baseDao;
	}

	/**
	 * 条件查询
	 */
	public List<T> getList(T t1,T t2,Object param) {
		return baseDao.getList(t1,t2,param);
	}

	/**
	 * 分页条件查询
	 */
	public List<T> getListByPage(T t1, T t2, Object param, int firstResult, int maxResults) {
		
		return baseDao.getListByPage(t1, t2, param, firstResult, maxResults);
	}

	/**
	 * 统计记录个数
	 */
	public long getCount(T t1, T t2, Object param) {
		
		return baseDao.getCount(t1, t2, param);
	}

	/**
	 * 增加
	 */
	public void add(T t) {
		baseDao.add(t);		
	}
	
	/**
	 * 修改
	 */
	public void update(T t) {
		baseDao.update(t);		
	}

	/**
	 * 删除
	 */
	public void delete(Long id) {
		baseDao.delete(id);		
	}

	/**
	 * 查询实体
	 */
	public T get(Long id) {		
		return (T) baseDao.get(id);
	}
	
}
