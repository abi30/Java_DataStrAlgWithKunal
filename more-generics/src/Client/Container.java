package Client;

public class Container<I1, I2,I3> {
	I1 item1;
	I2 item2;
	I3 item3;

	public Container(I1 item1, I2 item2 ,I3 item3 ) {
		super();
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}

	public void printsItem() {
		System.out.println("contents of the container : ");
		System.out.println("item1 : " + item1);
		System.out.println("item2 : " + item2);
		System.out.println("item3 : " + item3);
	}

	public I1 getItem1() {
		return item1;
	}

	public void setItem1(I1 item1) {
		this.item1 = item1;
	}

	public I2 getItem2() {
		return item2;
	}

	public void setItem2(I2 item2) {
		this.item2 = item2;
	}
	public I3 getItem3() {
		return item3;
	}

	public void setItem3(I3 item3) {
		this.item3 = item3;
	}

}
