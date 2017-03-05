package Builder;
import java.util.ArrayList;
import Builder.I.*;
public class Meal {
	private ArrayList<Item> items = new ArrayList<Item>();
	public void addItem(Item item){//添加一样菜品
		items.add(item);
	}
	public float getCost(){//计算账单总花费
		float cost = 0.0f;
		for(int i = 0; i < items.size(); i++){
			cost += items.get(i).price();
		}
		return cost;
	}
	public void showItems(){//打印账单
		Item it = null;
		System.out.println("******************************");
		System.out.println("The meal list is as follow:");
		for(int i = 0; i < items.size(); i++){
			it = items.get(i);
			System.out.println(it.name() + ": $" + it.price() + "   packed with " + it.packing().name());
		}
		System.out.println("Totally cost:" + this.getCost());
		System.out.println("Thanks for coming!");
		System.out.println();
	}
}
