package banking7.domain;

public class OverdraftException extends Exception{
	static final long serialVersionUID = -33875169229948L;
	private double deficit;//��ʾ��ȡ��Ǯ�����Ĳ��

	public double getDeficit() {
		return deficit;
	}
	
	public OverdraftException(String msg,double deficit){
		super(msg);
		this.deficit = deficit;
	}
}
