package OtherJWT;

class OuterClass {
	interface Inner1 {
		void d();

		interface Inner2 {
			void d1();
		}
	}

	public class InnerClass1 implements Inner1.Inner2{

		@Override
		public void d1() {
			// TODO Auto-generated method stub
			
		}
	}

	public interface Inner3 {
		void d();
	}

	private interface Inner4 {
		void d();
	}

	private class InnerClass2 implements Inner4 {
		public void d() {
		}
	}

	public class InnerClass3 implements Inner4 {
		public void d() {
		}
	}

	public Inner4 getInner4() {
		return new InnerClass3();
	}

	private Inner4 i4;

	public void getInner4(Inner4 in4) {
		i4 = in4;
		i4.d();
	}
}

interface Outer1 {
	void x();

	interface Outer2 {
		void d();
	}
	// Invalid identifier. Can only be public
	// within interface
	// ! private interface Outer3 { }
}

public class NestingInterfaces {
	public class Class1 implements OuterClass.Inner1.Inner2 {
		public void d1() {
		}
	}

	class Class2 implements OuterClass.Inner3 {
		public void d() {
		}
	}

	// private interface not visible
	// from outside implementing class
	// ! class Class3 implements OuterClass.Inner4 {
	// ! public void d() { }
	// ! }
	class Class3 implements Outer1 {
		public void x() {
		}

		class Class4 implements Outer1.Outer2 {
			public void d() {
			}
		}
	}

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		// Error can't access private interface
		// ! OuterClass.Inner4 = oc.getInner4();
		// Error can't access private interface members
		// ! oc.getInner4().d();
		// To get to a nested private interface
		// use another OuterClass
		OuterClass oc2 = new OuterClass();
		oc2.getInner4(oc.getInner4());
	}
}
