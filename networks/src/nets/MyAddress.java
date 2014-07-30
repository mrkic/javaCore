package nets;

import java.net.InetAddress;

public class MyAddress {
void myadd(){
    try {
//        InetAddress ia = InetAddress.getLocalHost();
//        System.out.println(ia.toString());
        
        InetAddress inetAddr = InetAddress.getLocalHost(); 
        byte[] addr = inetAddr.getAddress();
        // Convert to dot representation

        String ipAddr = "";

        for (int i = 0; i < addr.length; i++) {

            if (i > 0) {

                ipAddr += ".";

            }

            ipAddr += addr[i] & 0xFF;

        }
        String hostname = inetAddr.getHostName();
        System.out.println("IP Address: " + ipAddr);

        System.out.println("Hostname: " + hostname);
        
      }
      catch (Exception ex) {
        System.err.println(ex);
      } 
}
    public static void main(String[] args) {
        MyAddress ma = new MyAddress();
        ma.myadd();
    }

}
