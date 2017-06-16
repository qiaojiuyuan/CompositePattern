import java.util.ArrayList;
/**
 * 树枝节点
 * @author qiaojy
 *
 */
public class Branch extends Corp {

	private ArrayList<Corp> subordinateList = new ArrayList<Corp>();
	
	public Branch(String name,String position,int salary) {
		super(name, position, salary);
	}
	/**
	 * 可以添加自己的枝节点
	 * @param corp
	 */
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}
	
	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}

}
