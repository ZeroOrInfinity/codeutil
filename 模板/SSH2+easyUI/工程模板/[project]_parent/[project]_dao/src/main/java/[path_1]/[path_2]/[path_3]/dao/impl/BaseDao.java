package [package].dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;


/**
 * 基本数据访问类
 * @author Administrator
 *
 */
public class BaseDao<T> extends HibernateDaoSupport {

	private Class<T> entityClass;
	
	public BaseDao(){
		Type type = getClass().getGenericSuperclass();
		ParameterizedType ptype=(ParameterizedType)type;
		Type[] types = ptype.getActualTypeArguments();
		entityClass=(Class<T>) types[0];		
	}
	
	/**
	 * 条件查询列表
	 * @param t1
	 * @return
	 */
	public List<T> getList(T t1,T t2,Object param){
				
		DetachedCriteria dc = getDetachedCriteria(t1, t2, param);		
		return (List<T>) getHibernateTemplate().findByCriteria(dc);
	}
	
	/**
	 * 条件查询列表
	 * @param t1
	 * @return
	 */
	public List<T> getListByPage(T t1,T t2,Object param,int firstResult,int maxResults){
				
		DetachedCriteria dc = getDetachedCriteria(t1, t2, param);		
		return (List<T>) getHibernateTemplate().findByCriteria(dc, firstResult, maxResults);
	}
	
	/**
	 * 统计记录个数
	 * @param t1
	 * @param t2
	 * @param param
	 * @return
	 */
	public long getCount(T t1,T t2,Object param){
		DetachedCriteria dc = getDetachedCriteria(t1, t2, param);
		dc.setProjection(Projections.rowCount());
		List<Long> list= (List<Long>)getHibernateTemplate().findByCriteria(dc);
		return list.get(0);		
	}
	
	/**
	 * 构建查询条件
	 * @param t1
	 * @param t2
	 * @param param
	 * @return
	 */
	public DetachedCriteria getDetachedCriteria(T t1,T t2,Object param){
		
		return null;
	}
	
	/**
	 * 增加
	 * @param t
	 */
	public void add(T t){
		getHibernateTemplate().save(t);		
	}

	/**
	 * 修改
	 * @param t
	 */
	public void update(T t){
		getHibernateTemplate().update(t);		
	}
	
	
	/**
	 * 删除
	 */
	public void delete(Long id) {
		getHibernateTemplate().delete(
			getHibernateTemplate().get(entityClass, id));			
	}
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	public T get(Long id){
		return getHibernateTemplate().get(entityClass, id);
	}
	
	
}
