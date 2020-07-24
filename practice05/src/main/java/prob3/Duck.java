package prob3;

public class Duck extends Bird {
	
	public String toString(){
		String duck = "오리의 이름은 " + super.getName() + " 입니다.";
		return duck;

	}
	@Override
	public void fly() {
		System.out.println("오리(" + super.getName() + ")는 날지 않습니다.");// TODO Auto-generated method stub
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("오리(" + super.getName() + ")가 소리내어 웁니다.");// TODO Auto-generated method stub
	}
	
	
}
