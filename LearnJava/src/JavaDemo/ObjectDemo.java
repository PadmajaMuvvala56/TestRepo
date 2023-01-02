package JavaDemo;


class Calc
{
	//int num1=1;
	//int num2=3;
	int result;
	int perform(int num1,int num2)
	{
		return result=num1+num2;
		//System.out.println(result);
	}
}
public class ObjectDemo {

	public static void main(String[] args) {

		Calc obj = new Calc();
		System.out.println(obj.perform(4,5));
	}

}
