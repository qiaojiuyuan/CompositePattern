import java.util.ArrayList;

/**
 * 根节点接口
 * @author qiaojy
 *
 */
public interface IRoot {

	//得到总经理的信息
	public String getInfo();
	//总经理下属，树枝节点
	public void add(IBranch branch);
	//增加树叶节点
	public void add(ILeaf leaf);
	//获取所有节点
	public ArrayList getSubordinateInfo();
}
