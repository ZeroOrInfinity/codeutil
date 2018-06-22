package [package].controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import [path_1].[path_2].pojo.Tb[Table2];
import [path_1].[path_2].[path_3].service.[Table2]Service;

import entity.PageResult;
import entity.Result;
/**
 * [comment]controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/[table2]")
public class [Table2]Controller {

	@Reference
	private [Table2]Service [table2]Service;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Tb[Table2]> findAll(){			
		return [table2]Service.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return [table2]Service.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param [table2]
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Tb[Table2] [table2]){
		try {
			[table2]Service.add([table2]);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param [table2]
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Tb[Table2] [table2]){
		try {
			[table2]Service.update([table2]);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public Tb[Table2] findOne(Long id){
		return [table2]Service.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			[table2]Service.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Tb[Table2] [table2], int page, int rows  ){
		return [table2]Service.findPage([table2], page, rows);		
	}
	
}
