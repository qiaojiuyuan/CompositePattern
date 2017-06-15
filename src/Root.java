import java.util.ArrayList;import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class Root implements IRoot{

	//保存根节点下面的枝节点和叶节点
	private ArrayList subordinateList = new ArrayList();
	//名字
	private String name = "";
	//职位
	private String position = "";
	//薪水
	private int salary = 0;
	
	public Root(String name,String position,int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}
	
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}
	
	/**
	 * 得到自己的信息
	 */
	public String getInfo() {
		String info = "";
		info = "名称:"+this.name;
		info = info + "\t职位:"+ this.position;
		info = info + "\t薪水:" + this.salary;
		return info;
	}
	
	public ArrayList getSubordinateInfo() {
		return this.subordinateList;
	}
}
