package 设计模式.策略模式;

import 设计模式.策略模式.TraveStrategyimpl.PlaneStrategy;

/**
 * @Classname Traveler
 * @Description TODO
 * @Date 2020/5/21 16:56
 * @Author ALexNi
 */
public class Traveler {
    // 初始化策略
    TraveStrategy traveStrategy;

    // 设置出行策略
    public void setTraveStrategy(TraveStrategy traveStrategy){
        this.traveStrategy = traveStrategy;
    }
    // 为游客设置出行方式
    public void traveStyle(){
        this.traveStrategy.traveStyle();
    }

    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        // 设置出行方式
        traveler.setTraveStrategy(new PlaneStrategy());
        // 游客出行
        traveler.traveStyle();
    }
}
