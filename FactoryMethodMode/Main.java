package FactoryMethodMode;

import FactoryMethodMode.LeiFengFactory.LeiFengFactory;
import FactoryMethodMode.LeiFengFactory.VolunteerFactory;
import FactoryMethodMode.LeiFengMan.LeiFeng;

public class Main {
    public static void main(String[] args) {
        // 雷锋工厂的实现类
        LeiFengFactory factory = new VolunteerFactory();
        // 志愿者雷锋
        LeiFeng volunteer = factory.createNewCenturyLeiFeng();
        volunteer.helpFriend();
        volunteer.takeCareOfGrandFather();
        volunteer.withGrandMontherThroughStreet();
    }
}
