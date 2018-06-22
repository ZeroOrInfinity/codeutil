package [package].biz.impl;
import [package].biz.I[Table]Biz;
import [package].dao.I[Table]Dao;
import [package].entity.[Table];
/**
 * [comment]业务逻辑类
 * @author Administrator
 *
 */
public class [Table]Biz extends BaseBiz<[Table]> implements I[Table]Biz {

	private I[Table]Dao [table]Dao;
	
	public void set[Table]Dao(I[Table]Dao [table]Dao) {
		this.[table]Dao = [table]Dao;
		setBaseDao([table]Dao);
	}

	
}
