package [package].controller;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import [package].pojo.[Table2];
import [package].service.[Table2]Service;
import entity.PageResult;
import entity.Result;
/**
 * [comment]-控制器类
 * @author [author]
 *
 */
@RestController
@RequestMapping("/[table2]")
public class [Table2]Controller {

	@Autowired
	private [Table2]Service [table2]Service;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<[Table2]> findAll(){			
		return [table2]Service.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){		
		Page<[Table2]> page_[table2] = [table2]Service.findPage(page, rows);		
		return new PageResult<[Table2]>(page_[table2].getTotalElements(), page_[table2].getContent());
	}
	
	/**
	 * 增加
	 * @param [table2]
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody [Table2] [table2]){	
		[table2]Service.add([table2]);
		return new Result(true, "新增成功");
	}
	
	/**
	 * 修改
	 * @param [table2]
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody [Table2] [table2]){	
		[table2]Service.update([table2]);
		return new Result(true, "修改成功");		
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public [Table2] findOne(Long id){
		return [table2]Service.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		
		[table2]Service.deleteList(ids);
		return new Result(true, "删除成功"); 
		
	}
	
	/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Map whereMap, int page, int rows  ){
		Page<[Table2]> page_[table2] = [table2]Service.findSearch(whereMap, page, rows);
		return new PageResult<[Table2]>(page_[table2].getTotalElements(), page_[table2].getContent());
	}
	
}
