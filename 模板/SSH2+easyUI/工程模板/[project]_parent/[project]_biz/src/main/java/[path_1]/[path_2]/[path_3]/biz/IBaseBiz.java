package [package].biz;

import java.util.List;



/**
 * 基本业务逻辑接口
 * @author Administrator
 *
 */
public interface IBaseBiz<T> {


	/**
	 * 条件查询列表
	 * @param t1
	 * @return
	 */
	public List<T> getList(T t1,T t2,Object param);
	
	/**
	 * 条件查询列表
	 * @param t1
	 * @return
	 */
	public List<T> getListByPage(T t1,T t2,Object param,int firstResult,int maxResults);
	
	/**
	 * 统计记录个数
	 * @param t1
	 * @param t2
	 * @param param
	 * @return
	 */
	public long getCount(T t1,T t2,Object param);
	
	
	/**
	 * 增加
	 * @param t
	 */
	public void add(T t);
	
	/**
	 * 修改
	 * @param t
	 */
	public void update(T t);
	
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(Long id);
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	public T get(Long id);
	
	
}
