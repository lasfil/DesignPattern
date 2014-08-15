package builder;

public class IphoneBuilder implements AppleBuilder {
	private AppleDevice ipad ;
	
	public IphoneBuilder() {
		ipad = new AppleDevice();
	}

	@Override
	public void installScreen() {
		ipad.setScreen("6.5");
	}

	@Override
	public void installMicrophone() {
		ipad.setMicrophone("retina");
	}

	@Override
	public void isntallCPU() {
		ipad.setCPU("A5");
	}

	@Override
	public AppleDevice getAppleDevice() {
		return ipad;
	}

}
