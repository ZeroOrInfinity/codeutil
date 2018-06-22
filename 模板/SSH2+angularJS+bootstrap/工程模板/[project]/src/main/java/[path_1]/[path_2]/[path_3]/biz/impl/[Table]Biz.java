package [package].biz.impl;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import [package].biz.I[Table]Biz;
import [package].dao.I[Table]Dao;
import [package].entity.[Table];

/**
 * [comment]业务类
 * @author Administrator
 *
 */
@Service
public class [Table]Biz implements I[Table]Biz {

	@Resource
	private I[Table]Dao [table]Dao;//注入理财产品数据访问层
	
	public List<[Table]> getList() {		
		return [table]Dao.findAll();
	}

	/**
	 * 删除
	 */
	public void delete(Long id) {
		[table]Dao.delete(id);
	}

	/**
	 * 保存
	 */
	public void save([Table] [table]) {
		[table]Dao.save([table]);		
	}

	/**
	 * 获取实体
	 */
	public [Table] get(Long id) {
		// TODO Auto-generated method stub
		return [table]Dao.findOne(id);
	}
	
	
	/**
	 * 分页查询全部记录
	 */
	public Page<[Table]> findAll(int page, int size) {
		PageRequest pageRequest=new PageRequest(page-1, size);
		return [table]Dao.findAll(pageRequest);
	}

}
