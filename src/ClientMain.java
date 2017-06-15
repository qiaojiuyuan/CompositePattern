import java.util.ArrayList;

public class ClientMain {

	public static void main(String[] args) {
		IRoot ceo = new Root("王总裁","总裁",100000);
		IBranch developDep = new Branch("刘一", "研发经理", 10000);
		IBranch salesDep = new Branch("赵三", "销售经理", 15000);
		IBranch financeDep = new Branch("王五", "财务经理", 12000);
		ILeaf a = new Leaf("a","开发人员",2000);
		ILeaf b = new Leaf("b","开发人员",2000);
		ILeaf c = new Leaf("c","开发人员",2000);
		ceo.add(developDep);
		ceo.add(financeDep);
		ceo.add(salesDep);
		developDep.add(a);
		salesDep.add(b);
		financeDep.add(c);
		
		System.out.println(ceo.getInfo());
		getAllSubordinateInfo(ceo.getSubordinateInfo());
	}
	
	private static void getAllSubordinateInfo(ArrayList subordinateList) {
		int length = subordinateList.size();
		for(int m = 0;m <length;m++) {
			Object s = subordinateList.get(m);
			if(s instanceof Leaf) {
				ILeaf employee = (ILeaf)s;
				System.out.println(employee.getInfo());
			} else {
				IBranch branch = (IBranch)s;
				System.out.println(branch.getInfo());
				getAllSubordinateInfo(branch.getSubordinateInfo());
			}
		}
	}
}
