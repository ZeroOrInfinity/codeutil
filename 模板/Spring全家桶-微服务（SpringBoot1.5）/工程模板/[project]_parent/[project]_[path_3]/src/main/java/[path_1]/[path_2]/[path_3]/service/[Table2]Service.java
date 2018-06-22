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

	public List<[Table2]> findAll() {

		return [table2]Dao.findAll();
	}

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<[Table2]> findPage(int page, int size) {
		PageRequest pageRequest = new PageRequest(page-1, size);
		return [table2]Dao.findAll(pageRequest);
	}

	private Specification<[Table2]> where(Map searchMap) {
		
		return new Specification<[Table2]>() {
          
			@Override
			public Predicate toPredicate(Root<[Table2]> root,CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
<条件查询.String.txt>
                return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));
                
            }
        };		
		
	}

	public Page<[Table2]> findSearch(Map whereMap, int page, int size) {
		Specification<[Table2]> specification = where(whereMap);
		PageRequest pageRequest = new PageRequest(page-1, size);
		return [table2]Dao.findAll(specification, pageRequest);
	}

	public [Table2] findOne(String id) {
		return [table2]Dao.findOne(id);
	}

	public void add([Table2] [table2]) {
		[table2].setId(idWorker.nextId()+""); //主键值
		[table2]Dao.save([table2]);
	}
	
	public void update([Table2] [table2]) {
		[table2]Dao.save([table2]);
	}

	public void delete(String id) {
		[table2]Dao.delete(id);
	}

	public void deleteList(String[] ids) {
		for (String id : ids) {
			[table2]Dao.delete(id);
		}
	}

}
