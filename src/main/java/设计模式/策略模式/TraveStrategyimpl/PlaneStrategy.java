package 设计模式.策略模式.TraveStrategyimpl;

import 设计模式.策略模式.TraveStrategy;

/**
 * @Classname PlaneStrategy
 * @Description TODO
 * @Date 2020/5/21 16:55
 * @Author ALexNi
 */
public class PlaneStrategy implements TraveStrategy {
    @Override
    public void traveStyle() {
        System.out.println("坐飞机去");
    }
}
