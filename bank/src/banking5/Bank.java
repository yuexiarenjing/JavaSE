package banking5;

public class Bank {
	private Customer[] customers;//���ڴ�ſͻ�
	private int numberOfCustomers;//��¼Customer�ĸ���
	
	public Bank(){
		customers = new Customer[5];
	}
	//���һ��Customer��������
	public void addCustomer(String f,String l){
		Customer cust = new Customer(f, l);
		customers[numberOfCustomers] = cust;
		numberOfCustomers++;
	}
	//��ȡCustomer�ĸ���
	public int getNumOfCustomers(){
		return numberOfCustomers;
	}
	//����ָ������λ�õ�Customer
	public Customer getCustomer(int index){
		return customers[index];
	}
}
