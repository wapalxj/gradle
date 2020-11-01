package c4_15_oop.c4_17_expand

import c4_15_oop.Person

/**
 * 模拟一个应用的管理类
 */
class ApplicationManager {
    static void init() {
        ExpandoMetaClass.enableGlobally()
        //为第三方类添加方法
        Person.metaClass.static.createPerson = {
            String name, int age ->
                new Person(name: name, age: age)
        }



        //为String 添加反转方法
        String.metaClass.static.reversed = {
            ->
            def rl = []
            for (int i in (delegate.size() - 1..0)) {
                rl << delegate.getAt(i)
            }
            rl
        }
    }
}
