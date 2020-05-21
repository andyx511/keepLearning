package 设计模式.策略模式.TraveStrategyimpl;

import 设计模式.策略模式.TraveStrategy;

/**
 * @Classname TrainStrategy
 * @Description TODO
 * @Date 2020/5/21 16:53
 * @Author ALexNi
 */
public class TrainStrategy implements TraveStrategy {
    @Override
    public void traveStyle() {
        System.out.println("坐火车");
    }
}
