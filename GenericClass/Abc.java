package GenericClass;

public class Abc<X,Y> {

	private X f1;
	private Y f2;
	public Abc(X f1,Y f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	public X getf1() {
		return this.f1;
	}
	public Y getf2() {
		return this.f2;
	}
	public void setf1(X f1) {
		this.f1 = f1;
	}
	public void setf2(Y f2) {
		this.f2 = f2;
	}
}
