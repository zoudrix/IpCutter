package ipCutter;

public class main {
    public static void main(String[] args) {
        String ip = "192.168.15.17";
        IpCutter net = new IpCutter(ip);
//    System.out.println(net.cut());
        for (int i : net.cut()) {
            System.out.println(i);
        }
    }
}

