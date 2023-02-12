import java.util.TreeMap;

public class KiemtraMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> check=new TreeMap<>();
        String str="Con cho dang ghet";
        String [] arr=str.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            if(check.containsKey(arr[i])){
                Integer value=check.get(arr[i]);
                value++;
                check.replace(arr[i],value);
            }else {
                check.put(arr[i],1);

            }

        }
        System.out.println(check.toString());

    }
}
