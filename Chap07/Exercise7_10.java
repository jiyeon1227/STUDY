package Chap07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setChannel(int channel) {
		// channel이 max보다 크거나, min보다 작으면 return
		if (MAX_CHANNEL < channel || MIN_CHANNEL > channel) {
			System.out.println("채널을 다시입력해주세요.");
		} else {
			this.channel = channel; // void써서 return 없이
		}
	}

	public void setVolume(int volume) {
		// volume이 max보다 크거나, min보다 작으면 return
		if (MAX_VOLUME < volume || MIN_VOLUME > volume) {
			return;
		} else {
			this.volume = volume;
		}
	}
}

public class Exercise7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTv2 t = new MyTv2();

		// 7-10번 문제
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());

		// 7-11번 문제
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}

}
