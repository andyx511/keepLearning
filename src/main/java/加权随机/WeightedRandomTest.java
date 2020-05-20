package 加权随机;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname WeightedRandomTest
 * @Description TODO
 * @Date 2020/5/20 16:24
 * @Author ALexNi
 */
public class WeightedRandomTest {

    public static void main(String[] args) {
        ArrayList<Atom> atomList = new ArrayList<Atom>();
        atomList.add(new Atom("0000001", 10));
        atomList.add(new Atom("0000002", 20));
        atomList.add(new Atom("0000003", 30));
        atomList.add(new Atom("0000004", 40));
        //atomList.add(new Atom("0000005", 50));
        Atom atom;
        atom = WeightedRandom.getWeightedRandomAtom(atomList);
        System.out.println("单个实例：" + atom.toString());
        //累积记录某种对象出现的次数
        Map<String, Integer> countAtom = new HashMap<String, Integer>();
        for (int i = 0; i < 100000; i++) {
            atom = WeightedRandom.getWeightedRandomAtom(atomList);
            if (countAtom.containsKey(atom.getId())) {
                countAtom.put(atom.getId(), countAtom.get(atom.getId()) + 1);
            } else {
                countAtom.put(atom.getId(), 1);
            }
        }
        System.out.println("概率统计：");
        for (String id : countAtom.keySet()) {
            System.out.println(" " + id + " 出现了 " + countAtom.get(id) + " 次");
        }
    }
}