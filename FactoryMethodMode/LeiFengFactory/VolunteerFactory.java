package FactoryMethodMode.LeiFengFactory;

import FactoryMethodMode.LeiFengMan.LeiFeng;
import FactoryMethodMode.LeiFengMan.Volunteer;

/**
 * 志愿者工厂
 */
public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng createNewCenturyLeiFeng() {
        return new Volunteer();
    }
}
