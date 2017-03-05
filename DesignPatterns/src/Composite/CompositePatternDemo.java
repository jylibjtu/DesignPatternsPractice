package Composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee boss = new Employee("boss Li" , "董事会" , 400000);
		Employee e1 = new Employee("中层李1" , "技术部" , 30000);
		Employee e2 = new Employee("中层李2" , "市场部" , 30000);
		Employee e3 = new Employee("群众李1" , "市场部" , 8000);
		Employee e4 = new Employee("群众李2" , "技术部" , 9000);
		Employee e5 = new Employee("群众李3" , "技术部" , 9000);
		e1.add(e4);
		e1.add(e5);
		e2.add(e3);
		boss.add(e1);
		boss.add(e2);
		boss.showSubordinates(0);
	}

}
