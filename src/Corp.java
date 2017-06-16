/**
 * 所有节点的抽象
 * @author qiaojy
 *
 */
public abstract class Corp {

	// 名字
	private String name = "";
	// 职位
	private String position = "";
	// 薪水
	private int salary = 0;

	public Corp(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	/**
	 * 得到自己的信息
	 */
	public String getInfo() {
		String info = "";
		info = "名称:" + this.name;
		info = info + "\t职位:" + this.position;
		info = info + "\t薪水:" + this.salary;
		return info;
	}
}
