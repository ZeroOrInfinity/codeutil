package [package].controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import [package].pojo.[Table2];
import [package].service.[Table2]Service;

import entity.PageResult;
import entity.Result;
/**
 * [comment]控制器层
 * @author Administrator
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/[table2]")
public class [Table2]Controller {

	@Autowired
	private [Table2]Service [table2]Service;
	
	/**
	 * 查询全部数据
	 * @return
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public Result findAll(){
		return new Result(true,1000,"查询成功",[table2]Service.findAll());
	}
	
	/**
	 * 根据ID查询
	 * @param id ID
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Result findOne(@PathVariable String id){
		return new Result(true,1000,"查询成功",[table2]Service.findOne(id));
	}
	
	/**
	 * 分页查询全部数据
	 * @param page
	 * @param size
	 * @return
	 */
	@RequestMapping(value="/{page}/{size}",method=RequestMethod.GET)
	public Result findPage(@PathVariable int page,@PathVariable int size){		
		Page<[Table2]> pageList = [table2]Service.findPage(page, size);		
		return new Result(true,1000,"查询成功",new PageResult<[Table2]>(pageList.getTotalElements(), pageList.getContent() ) );	
	}
	
	/**
	 * 分页+多条件查询 
	 * @param searchMap 查询条件封装
	 * @param page 页码
	 * @param size 页大小
	 * @return 分页结果
	 */
	@RequestMapping(value="/{page}/{size}",method=RequestMethod.POST)
	public Result findSearch(@RequestBody Map searchMap ,@PathVariable int page,@PathVariable int size){		
		Page<[Table2]> pageList = [table2]Service.findSearch(searchMap, page, size);
		return  new Result(true,1000,"查询成功",  new PageResult<[Table2]>(pageList.getTotalElements(), pageList.getContent()) );		
	}
	
	/**
	 * 增加
	 * @param [table2]
	 */
	@RequestMapping(value="/",method=RequestMethod.POST)
	public Result add(@RequestBody [Table2] [table2]  ){
		[table2]Service.add([table2]);			
		return new Result(true,1000,"增加成功");
	}
	
	/**
	 * 修改
	 * @param [table2]
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Result update(@RequestBody [Table2] [table2],@PathVariable String id ){
		[table2].setId(id);
		[table2]Service.update([table2]);		
		return new Result(true,1000,"修改成功");
	}
	
	/**
	 * 删除
	 * @param id
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public Result delete(@PathVariable String id ){
		[table2]Service.delete(id);
		return new Result(true,1000,"删除成功");
	}
	
}
