package banking8.domain;
//�˻�
public class Account {
	protected double balance;//�˻����
	
	public Account(double init_balance){
		balance = init_balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	//��Ǯ
	public boolean deposit(double amt){//amt:Ҫ��Ķ��
		balance += amt;
		return true;
	}
	//ȡǮ
	public void withdraw(double amt) throws OverdraftException{//amt��Ҫȡ�Ķ��
		if(balance >= amt){
			balance -= amt;
			
		}else{
			throw new OverdraftException("�ʽ���",amt - balance);
		}
	}
}
