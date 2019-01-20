package [package].biz;

import [package].entity.[Table];
import java.util.*;

import org.springframework.data.domain.Page;

/**
 * [comment]业务逻辑接口
 * @author Administrator
 *
 */
public interface I[Table]Biz {
	/**
	 * 查询列表
	 * @return
	 */
	public List<[Table]> getList();
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(Long id);
	
	
	/**
	 * 保存
	 * @param [table]
	 */
	public void save([Table] [table]);
	
	/**
	 * 读取实体
	 * @param id 编号
	 * @return
	 */
	public [Table] get(Long id);
	
	/**
	 * 分页查询全部记录
	 */
	public Page<[Table]> findAll(int page, int size) ;

}
