import java.util.ArrayList;

public class ClientMain {

	public static void main(String[] args) {
		Branch ceo = compositeCorpTree();
		System.out.println(ceo.getInfo());
		System.out.println(getTreeInfo(ceo));
	}
	
	public static Branch compositeCorpTree(){
		Branch ceo = new Branch("王总裁","总裁",100000);
		Branch developDep = new Branch("刘一", "研发经理", 10000);
		Branch salesDep = new Branch("赵三", "销售经理", 15000);
		Branch financeDep = new Branch("王五", "财务经理", 12000);
		Leaf a = new Leaf("a","开发人员",2000);
		Leaf b = new Leaf("b","开发人员",2000);
		Leaf c = new Leaf("c","开发人员",2000);
		ceo.addSubordinate(developDep);
		ceo.addSubordinate(financeDep);
		ceo.addSubordinate(salesDep);
		developDep.addSubordinate(a);
		salesDep.addSubordinate(b);
		financeDep.addSubordinate(c);
		return ceo;
	}
	
	public static String getTreeInfo(Branch root) {
		ArrayList<Corp> subordinateList = root.getSubordinate();
		String info = "";
		for(Corp s : subordinateList) {
			if(s instanceof Leaf) {
				info = info + s.getInfo()+"\n";
			} else {
				info = info + s.getInfo() +"\n" + getTreeInfo((Branch)s);
			}
		}
		return info;
	}
}
