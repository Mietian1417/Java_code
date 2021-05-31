package Map接口;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-05-31
 * Time: 19:36
 */
public class MethodTest {
    public static void main(String[] args) {
        // V put(K key, V value)
        //将指定的 k-v放到 Map
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "张三");
        map.put(30, "李四");
        map.put(20, "王五");
        System.out.println(map);

        // V get(Object k)
        //根据指定的 k 值查找对应的 v
        String ret=map.get(10);
        System.out.println(ret);

        String ret11=map.get(40);
        System.out.println(ret11);
        // v getOrDefault（Object k, V defaultValue)
        //根据指定的 k 值查找对应的 v ，没有找到用默认值代替
        String ret1=map.getOrDefault(10,"陈二");
        System.out.println(ret1);

        String ret2=map.getOrDefault(40,"陈二");
        System.out.println(ret2);

        // boolean containsKey(Object key)
        //判断是否包含 key
        Map<Integer, String > map1=new HashMap<>();
        map1.put(10,"张三");
        System.out.println(map1.containsKey(10));
        System.out.println(map1.containsKey(50));

        // boolean containsValue(Object value)
        //判断是否包含 key
        System.out.println(map1.containsValue("张三"));
        System.out.println(map1.containsValue("李四"));

        // Set<Map.Entry><k,v>> entrySe()
        //将所有键值对返回 （将键值对放到set中）
        map1.put(20,"马先生");
        map1.put(30,"小海");
        map1.put(40,"占武");
        map1.put(50,"李夏");
        System.out.println(map1.entrySet());
        Set<Map.Entry<Integer,String>> entries=map1.entrySet();
        for (Map.Entry<Integer,String> x:entries) {
            System.out.print(x+"   ");
        }
        System.out.println();
        for (Map.Entry<Integer,String> x:entries) {
            System.out.print(x.getKey()+"-->"+x.getValue()+"  ");
        }
    }
}

