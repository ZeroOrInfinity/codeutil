package [package].dao.impl;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import [package].dao.I[Table]Dao;
import [package].entity.[Table];
/**
 * [comment]数据访问类
 * @author Administrator
 *
 */
public class [Table]Dao extends BaseDao<[Table]> implements I[Table]Dao {

	
	/**
	 * 构建查询条件
	 * @param dep1
	 * @param dep2
	 * @param param
	 * @return
	 */
	public DetachedCriteria getDetachedCriteria([Table] [table]1,[Table] [table]2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass([Table].class);
		if([table]1!=null){
<条件查询.String.txt>		
		}		
		return dc;
	}
	
	
}

