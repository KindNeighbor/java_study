import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Practice3 {
    public static void sol(int[] arr, int k, int x) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(x - arr[i]);
            System.out.println("diff = " + diff);

            ArrayList<Integer> cur = map.get(diff);
            System.out.println("cur: " + cur);
            if(cur == null) {
                map.put(diff, new ArrayList<>(Arrays.asList(arr[i])));
                System.out.println("map: " + map);
            } else {
                int idx = cur.size();
                System.out.println("cur.size(): " + cur.size());
                for (int j = 0; j < cur.size(); j++) {
                    System.out.println("cur.get(j): " + cur.get(j));
                    System.out.println("arr[i] = " + arr[i]);
                    if(cur.get(j) > arr[i]) {
                        idx = j;
                        break;
                    }
                }
                cur.add(idx, arr[i]);
                System.out.println("cur = " + cur);
                System.out.println("map = " + map);
                System.out.println("====cur loop=====");
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        int cnt = 0;
        while(map.size() > 0) {
            int minDiff = map.keySet().stream().min((a,b) -> a - b).get();
            System.out.println("minDiff = " + minDiff);
            System.out.println("map = " + map);
            ArrayList<Integer> cur = map.get(minDiff);
            map.remove(minDiff);
            System.out.println("map = " + map);

            while(cur.size() > 0) {
                System.out.println("cur = " + cur);
                result.add(cur.get(0));
                System.out.println("result = " + result);
                cur.remove(0);
                cnt++;

                if(cnt == k) {
                    break;
                }
            }

            if(cnt == k) {
                break;
            }
        }

        Collections.sort(result);
        System.out.println(result);
        System.out.println("=============");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sol(arr, 4, 3);

        arr = new int[]{1, 2, 3, 4, 5 ,6, 7, 8, 9 ,10};
        sol(arr, 5, 5);

        arr = new int[]{2, 4};
        sol(arr, 1, 3);

        arr = new int[]{2, 4};
        sol(arr, 3, 3);
        System.out.println("=====4=====");

        arr = new int[]{5, 4, 3, 2, 1};
        sol(arr, 4, 3);
    }
}
