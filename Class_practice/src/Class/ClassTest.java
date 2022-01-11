package Class;

import java.lang.reflect.Constructor;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("Class.Person");
        
        Person person = (Person)c1.newInstance();
        person.setName("Lee");
        System.out.println(person);
        
        Class c2 = person.getClass();
        Person p = (Person)c2.newInstance();
        System.out.println(p);

        Class<String> parameterTypes = (String.class);
        Constructor cons = c2.getConstructor(parameterTypes);
        Object[] initargs = {"Kim"};
        Person kim = (Person) cons.newInstance(initargs);
        System.out.println(kim);
    }
}
