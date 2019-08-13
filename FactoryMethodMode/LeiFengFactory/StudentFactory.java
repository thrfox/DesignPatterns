package FactoryMethodMode.LeiFengFactory;

import FactoryMethodMode.LeiFengMan.LeiFeng;
import FactoryMethodMode.LeiFengMan.Student;

public class StudentFactory implements LeiFengFactory {
    @Override
    public LeiFeng createNewCenturyLeiFeng() {
        return new Student();
    }
}
