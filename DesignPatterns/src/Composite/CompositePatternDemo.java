package Composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee boss = new Employee("boss Li" , "���»�" , 400000);
		Employee e1 = new Employee("�в���1" , "������" , 30000);
		Employee e2 = new Employee("�в���2" , "�г���" , 30000);
		Employee e3 = new Employee("Ⱥ����1" , "�г���" , 8000);
		Employee e4 = new Employee("Ⱥ����2" , "������" , 9000);
		Employee e5 = new Employee("Ⱥ����3" , "������" , 9000);
		e1.add(e4);
		e1.add(e5);
		e2.add(e3);
		boss.add(e1);
		boss.add(e2);
		boss.showSubordinates(0);
	}

}
