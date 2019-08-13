package FactoryMethodMode.LeiFengFactory;

import FactoryMethodMode.LeiFengMan.LeiFeng;

/**
 * 雷锋工厂，（简单工厂模式中的工厂类）
 */
public interface LeiFengFactory {

    /**
     * 创建一个雷锋
     */
    LeiFeng createNewCenturyLeiFeng();
}
