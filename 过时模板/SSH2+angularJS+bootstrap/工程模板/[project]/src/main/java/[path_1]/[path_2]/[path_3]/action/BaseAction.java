package [package].action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
/**
 * 基本Action类
 * @author Administrator
 *
 */
public class BaseAction {

	private int page;//页码
	private int size;//每页记录数
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	//标准结构返回{'success':true,'message':'成功'}
	public String ajaxReturn(boolean success,String message){
		Map map=new HashMap();
		map.put("success", success);
		map.put("message", message);
		return JSON.toJSONString(map);
	}
	
	/**
	 * 输出json字符串
	 * @param jsonString
	 */
	public void write(String jsonString){
		//将json字符串直接输出
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		try {
			response.getWriter().println(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
