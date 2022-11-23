package behavioral.iterator.tvChannel.before;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.searchAvailableChannels();

		for(int i = 1; i < 30; i++) {
			tv.accessChannel(i);
		}
	}
}
