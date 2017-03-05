package Builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mb = new MealBuilder();
		
		Meal m = mb.prepareNonVegMeal();//生成无蔬菜套餐
		m.showItems();
		
		m = mb.prepareVegMeal();//生成蔬菜套餐
		m.showItems();
	}

}
