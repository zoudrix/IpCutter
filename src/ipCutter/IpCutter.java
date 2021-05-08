package ipCutter;

public class IpCutter {
    private String ip;

    public IpCutter(String ip) {
        this.ip = ip;
    }
    public int[] cut(){
        String[] parts = ip.split("\\.");
        int[] x= new int[parts.length];
        for(int i=0;i<parts.length;i++){
            x[i]=Integer.parseInt(parts[i]);


        }
        return x;
    }

}
