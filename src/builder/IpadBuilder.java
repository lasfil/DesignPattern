package builder;

public class IpadBuilder implements AppleBuilder {
	private AppleDevice ipad ;
	
	public IpadBuilder() {
		ipad = new AppleDevice();
	}

	@Override
	public void installScreen() {
		ipad.setScreen("9.7");
	}

	@Override
	public void installMicrophone() {
		ipad.setMicrophone("HD");
	}

	@Override
	public void isntallCPU() {
		ipad.setCPU("A7");
	}

	@Override
	public AppleDevice getAppleDevice() {
		return ipad;
	}

}
