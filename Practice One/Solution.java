class ThreadOne implements Runnable{
	@Override
	public void run(){
		System.out.println("Abhay Maurya");
	}
}
class Solution{
	public static void main(String[] args) {
		Thread abhay=new Thread(new ThreadOne());
		abhay.start();
	}
}