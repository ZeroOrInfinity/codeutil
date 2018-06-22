package [package].action;
import [package].biz.I[Table]Biz;
import [package].entity.[Table];

/**
 * [comment]Action 
 * @author Administrator
 *
 */
public class [Table]Action extends BaseAction<[Table]> {

	private I[Table]Biz [table]Biz;
	
	public void set[Table]Biz(I[Table]Biz [table]Biz) {
		this.[table]Biz = [table]Biz;
		setBaseBiz([table]Biz);
	}
	
	
}
