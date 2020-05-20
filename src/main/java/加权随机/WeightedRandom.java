package 加权随机;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Classname WeightedRandom
 * @Description TODO
 * @Date 2020/5/20 16:17
 * @Author ALexNi
 */
public class WeightedRandom {

    /**
     * 获取加权随机对象
     * @param atomList
     * @return Atom
     */
    public static Atom getWeightedRandomAtom(ArrayList<Atom> atomList){
        if(atomList.isEmpty()){
            return null;
        }
        int weightSum = 0;//总权值
        for(Atom atom : atomList){
            weightSum += atom.getWeight();
        }
        //获取总权值之间任意一随机数
        int random = new Random().nextInt(weightSum);  //random in [0, weightSum)
        //{.},{..},{...},{....}...根据权值概率区间，获得加权随机对象
        for(Atom atom : atomList){
            random -= atom.getWeight();
            if (random < 0) {
                return atom;
            }
        }
        return null;
    }
}