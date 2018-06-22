package [package].service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import util.IdWorker;

import [package].dao.[Table2]Dao;
import [package].pojo.[Table2];

/**
 * [comment]服务层
 * 
 * @author Administrator
 *
 */
@Service
public class [Table2]Service {

	@Autowired
	private [Table2]Dao [table2]Dao;
	
	@Autowired
	private IdWorker idWorker;

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<[Table2]> findAll() {
		return [table2]Dao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<[Table2]> findSearch(Map whereMap, int page, int size) {
		Specification<[Table2]> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return [table2]Dao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<[Table2]> findSearch(Map whereMap) {
		Specification<[Table2]> specification = createSpecification(whereMap);
		return [table2]Dao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public [Table2] findById(String id) {
		return [table2]Dao.findById(id).get();
	}

	/**
	 * 增加
	 * @param [table2]
	 */
	public void add([Table2] [table2]) {
		[table2].setId( idWorker.nextId()+"" );
		[table2]Dao.save([table2]);
	}

	/**
	 * 修改
	 * @param [table2]
	 */
	public void update([Table2] [table2]) {
		[table2]Dao.save([table2]);
	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(String id) {
		[table2]Dao.deleteById(id);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<[Table2]> createSpecification(Map searchMap) {

		return new Specification<[Table2]>() {

			@Override
			public Predicate toPredicate(Root<[Table2]> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
<条件查询.String.txt>				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
