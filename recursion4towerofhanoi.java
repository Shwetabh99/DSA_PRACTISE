public class Main
{
    public static void toh(int n,String src, String hel, String dest){
        if(n==1){
            System.out.println("transfer disk" + n + "from" + src +"to" + dest);
            return;
        }
        toh(n-1,src,dest,hel);   // to transfer n-1 disks from source to helper using dest as helper
        System.out.println("transfer disk" + n + "from" + src + "to" + dest);
        toh(n-1,hel,src,dest);  // transfer n-1 disks from helper to dest using src as helper
    }
	public static void main(String[] args) {
		System.out.println("TOWER OF HANOI");
		int n=3;
		toh(n,"S","H","D");    // S IS SOURCE H IS HELPER D IS DESTINATION
	}
}
