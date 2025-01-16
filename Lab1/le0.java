class set_name {
	private String name;
	public void setName(String N) {
		this.name = N;
	}
	public String getName() {
		return name;
	}
}
class set_age {
	private String age;
	public void setAge(String Num) {
		this.age = Num;
	}
	public String getAge() {
		return age;
	}
}
public class le0
{
	public static void main(String[] args) {
		set_name obj = new set_name();
		obj.setName("Rahul");
		System.out.println(obj.getName());
		set_age obj_1 = new set_age();
		obj_1.setAge("18");
	    System.out.println(obj_1.getAge());
	}
}
