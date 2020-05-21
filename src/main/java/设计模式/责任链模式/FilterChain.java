package 设计模式.责任链模式;

import 设计模式.责任链模式.FilterImpl.AppleFilter;
import 设计模式.责任链模式.FilterImpl.BananaFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Classname FilterChain
 * @Description TODO
 * @Date 2020/5/21 15:47
 * @Author ALexNi
 */
public class FilterChain {

    List<Filter> filters = new ArrayList<>();

    public FilterChain(){
        filters.add(new AppleFilter());
        filters.add(new BananaFilter());
    }

    public void processData(Set<String> strings){
        for (Filter filter : filters){
            filter.doFilter(strings);
        }
    }
}
