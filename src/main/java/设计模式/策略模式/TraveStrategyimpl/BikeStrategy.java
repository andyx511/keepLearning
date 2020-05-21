package 设计模式.策略模式.TraveStrategyimpl;

import 设计模式.策略模式.TraveStrategy;

/**
 * @Classname BikeStrategy
 * @Description TODO
 * @Date 2020/5/21 16:54
 * @Author ALexNi
 */
public class BikeStrategy implements TraveStrategy {
    @Override
    public void traveStyle() {
        System.out.println("骑车去");
    }
}
