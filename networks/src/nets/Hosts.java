package nets;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class Hosts {
void AllHosts(){


    try {
        Enumeration<?> e = NetworkInterface.getNetworkInterfaces();

        while(e.hasMoreElements()) {
           NetworkInterface ni = (NetworkInterface) e.nextElement();

           Enumeration<?> e2 = ni.getInetAddresses();

           while (e2.hasMoreElements()){
              InetAddress ip = (InetAddress) e2.nextElement();
              System.out.println("IP address: "+ ip.toString());
           }
        }
     }
     catch (Exception e) {
        e.printStackTrace();
     }
}
public static void main(String[] args) {
    Hosts hosts= new Hosts();
    hosts.AllHosts();
}
}
