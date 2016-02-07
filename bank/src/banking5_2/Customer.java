package banking5_2;

public class Customer {
	private String firstName;
	private String lastName;
	private SavingAccount savingAccount;//�����˻�
	private CheckingAccount checkingAccount;//���ÿ��˻�
	
	public Customer(String f,String l){
		firstName = f;
		lastName = l;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}

	public SavingAccount getSaving() {
		return savingAccount;
	}

	public void setSaving(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	public CheckingAccount getChecking() {
		return checkingAccount;
	}

	public void setChecking(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	
}
