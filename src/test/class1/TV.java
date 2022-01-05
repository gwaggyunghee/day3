package test.class1;

public class TV {

	//public static void main(String[] args) {
		private String color, producer;
		private int size, channel, volume;
		
		public void setColor(String color) {
			this.color=color;
		}
		
		public  String getColor() {
			return color;
		}

		public String getProducer() {
			return producer;
		}

		public void setProducer(String producer) {
			this.producer = producer;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public int getChannel() {
			return channel;
		}

		public void setChannel(int channel) {
			this.channel = channel;
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}
		
		public void powerOn() {
			System.out.println(producer+" TV ���� ����.");
		}
		
		public void powerOff() {
			System.out.println(producer+" TV ���� ����.");
		}
		
		public void upChannel() {
			channel++;
			System.out.println("���� ä�� "+channel+"��");
		}
		
		public void downChannel() {
			channel--;
			System.out.println("���� ä�� "+channel+"��");
		}
		
		public void upVolum() {
			volume++;
			System.out.println("���� ����: "+volume);
		}
		
		public void downVolum() {
			volume--;
			System.out.println("���� ����: "+volume);
		}


		@Override
		public String toString() {
			return "TV [color=" + color + ", producer=" + producer + ", size=" + size + ", channel=" + channel
					+ ", volume=" + volume + "]";
		}
		
}
