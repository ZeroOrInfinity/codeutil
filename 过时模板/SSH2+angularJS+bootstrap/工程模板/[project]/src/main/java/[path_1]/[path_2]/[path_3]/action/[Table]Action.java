package [package].action;
import java.util.List;
import javax.annotation.Resource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;

import [package].biz.I[Table]Biz;
import [package].entity.[Table];

/**
 * [comment]Action类
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
@Namespace("/[table]")
public class [Table]Action extends BaseAction{
	@Resource
	private I[Table]Biz [table]Biz;
	
	@Action("list")
	public void list(){		
		List<[Table]> list = [table]Biz.getList();//得到理财产品列表
		String jsonString = JSON.toJSONString(list);//FASTJSON将集合转为json字符串
		write(jsonString);
	}
	
	private Long id;//主键
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	//删除
	@Action("delete")
	public void delete(){
		try {
			[table]Biz.delete(id);
			write(ajaxReturn(true, "删除成功"));
		} catch (Exception e) {
			e.printStackTrace();
			write(ajaxReturn(false, "删除失败"));
		}		
	}	
	
	
	
	private [Table] [table];//		
	public [Table] get[Table]() {
		return [table];
	}
	public void set[Table]([Table] [table]) {
		this.[table] = [table];
	}

	/**
	 * 保存
	 */
	@Action("save")
	public void save(){
		
		try {
			[table]Biz.save([table]);
			write(ajaxReturn(true, "保存成功"));
		} catch (Exception e) {
			e.printStackTrace();
			write(ajaxReturn(false, "保存失败"));
		}		
	}
	
	/**
	 * 获取实体
	 */
	@Action("get")
	public void get(){
		[Table] [table]2 = [table]Biz.get(id);
		String jsonString = JSON.toJSONString([table]2);
		write(jsonString);
	}
	
	
	/**
	 * 分页查询列表
	 */
	@Action("listPage")
	public void listPage(){
		Page<[Table]> list = [table]Biz.findAll(getPage(), getSize());
		String jsonString = JSON.toJSONString(list);
		write(jsonString);
	}
	
}
