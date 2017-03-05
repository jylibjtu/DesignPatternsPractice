package Composite;
import java.util.List;
import java.util.ArrayList;
/**
 * 
 * @author junyi
 * 2017-3-5 16:41:46
 */
public class Employee {
	private String name;//unique
	private String dept;
	private int salary;//£¤ per month
	List<Employee> subordinates;
	
	public Employee(String m_name , String m_dept , int m_salary){
		name = m_name;
		dept = m_dept;
		salary = m_salary;
		subordinates = null;
	}
	
	@Override
	public String toString(){
		return name + "--" + dept + "--" + salary + "Ôª/ÔÂ";
	}
	
	public void add(Employee e){
		if(subordinates == null){
			subordinates = new ArrayList<Employee>();
		}
		subordinates.add(e);
	}
	
	public void remove(String name){
		if(subordinates != null){
			for(int i = 0; i < subordinates.size(); i++){
				if(subordinates.get(i).getName().equals(name)){
					subordinates.remove(i);
					System.out.println(name + "is not " + this.getName() + "'s subordinates now.");
					break;
				}
			}
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	
	public void showSubordinates(int n){
		for(int i = 0; i < n; i++){
			System.out.print("  ");
		}
		System.out.println(this);
		if(subordinates == null){
			return;
		}
		for(int j = 0; j < subordinates.size(); j++){
			subordinates.get(j).showSubordinates(n + 1);
		}
	}
	
}
