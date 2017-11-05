package sam;
/**
@author Harikrishna Recharla SDET II
@date 05-Nov-2017 12:33:24 PM
*/
public class phone {

	//UNlock ur phone
	private int phonelock = 123456;
	public void unlockPhone(){
		this.phonelock=phonelock;
		System.out.println(phonelock);
		
	}
	
	public void whatsapp(){
		System.out.println(phonelock);
		int lock = 4321;
	}
	
	
	public void facebook(){
		int fblock = 5432;
	}
}
