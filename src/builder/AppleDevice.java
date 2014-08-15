package builder;

public class AppleDevice {
	protected AppleDevice(){
		
	}
	private String screen;
	private String microphone;
	private String CPU;
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getMicrophone() {
		return microphone;
	}
	public void setMicrophone(String microphone) {
		this.microphone = microphone;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	@Override
	public String toString() {
		return "Screen: " + screen + " Microphone: " + microphone + " CPU: " + CPU;
	}
}
