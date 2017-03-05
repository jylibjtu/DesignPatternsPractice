package Builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mb = new MealBuilder();
		
		Meal m = mb.prepareNonVegMeal();//�������߲��ײ�
		m.showItems();
		
		m = mb.prepareVegMeal();//�����߲��ײ�
		m.showItems();
	}

}
