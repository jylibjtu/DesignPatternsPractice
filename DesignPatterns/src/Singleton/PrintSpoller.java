package Singleton;
import java.util.ArrayList;
public class PrintSpoller {
	public static final int HIGH_LEVEL = 100;
	public static final int NORMAL_LEVEL = 10;
	public static final int LOW_LEVEL = 1;
	
	private ArrayList<PrintJob> task_list = null;//�����б�
	private static PrintSpoller instance = null;
	private PrintSpoller(){
		task_list = new ArrayList<PrintJob>();
	}
	public static PrintSpoller getInstance(){
		if(instance == null){//���һ���Ƿ�Ϊ��
			synchronized(PrintSpoller.class){
				if(instance == null){//���̰߳�ȫǰ�����ڽ��м��
					instance = new PrintSpoller();
				}
			}
		}
		return instance;
	}
	public void addJob(PrintJob p){
		task_list.add(p);
	}
	public void work(){
		for(int i = 0; i < task_list.size();){
			int max_pos = 0;
			int max_level = task_list.get(0).getPriority_level();
			for(int  j = 0; j < task_list.size(); j++){
				if(task_list.get(j).getPriority_level() > max_level){
					max_pos = j;
					max_level = task_list.get(j).getPriority_level(); 
				}
			}
			PrintJob job = task_list.get(max_pos);
			task_list.remove(max_pos);
			job.print();
			
			
			try{
				Thread.sleep((long)(Math.random() * 500) + 500);
			} catch (Exception e){
				e.printStackTrace();
				System.out.println("��ӡ������");
				continue;
			}
		}
	}
	
	public static void main(String args[]){
		PrintSpoller psa = PrintSpoller.getInstance();
		PrintSpoller psb = PrintSpoller.getInstance();
		PrintSpoller psc = PrintSpoller.getInstance();
		if(psa == psb && psb == psc){
			System.out.println("Singleton:\n");
		}
		for(int i = 1; i < 20; i++){
			PrintJob p = null;
			String data = new String();
			data += "����������ҵ" + i;
			switch(i % 3){
			case 0:
				p = new PrintJob(data , PrintSpoller.HIGH_LEVEL);
				break;
			case 1:
				p = new PrintJob(data , PrintSpoller.NORMAL_LEVEL);
				break;
			case 2:
				p = new PrintJob(data , PrintSpoller.LOW_LEVEL);
				break;
			}
			psa.addJob(p);
		}
		try{
			psa.work();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}

class PrintJob{
	private String dataToPrint;
	private int priority_level;
	
	public PrintJob(String data , int level){//����Ҫ������data��Ϊ�����ݲ�Ϊ��
		this.dataToPrint = data;
		this.priority_level = level;
	}
	public void print(){//ģ���ӡ����ӡĳ����
		System.out.println("Priority level: " + priority_level + " --" + dataToPrint);
	}
	
	public String getDataToPrint() {
		return dataToPrint;
	}
	public void setDataToPrint(String dataToPrint) {
		this.dataToPrint = dataToPrint;
	}
	public int getPriority_level() {
		return priority_level;
	}
	public void setPriority_level(int priority_level) {
		this.priority_level = priority_level;
	}
	
}