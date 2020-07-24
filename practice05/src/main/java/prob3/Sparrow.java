package prob3;

public class Sparrow extends Bird {

	public String toString(){
		String duck = "참새의 이름은 " + super.getName() + " 입니다.";
		return duck;

	}
	@Override
	public void fly() {
		System.out.println("참새(" + super.getName() + ")가 날아다닙니다.");// TODO Auto-generated method stub
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("참새(" + super.getName() + ")가 소리내어 웁니다.");// TODO Auto-generated method stub
	}
}
