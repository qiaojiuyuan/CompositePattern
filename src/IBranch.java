import java.util.ArrayList;

/**
 * 枝节点
 * @author qiaojy
 *
 */
public interface IBranch {

	public String getInfo();
	public void add(IBranch branch);
	public void add(ILeaf leaf);
	//获得下级信息
	public ArrayList getSubordinateInfo();
}
