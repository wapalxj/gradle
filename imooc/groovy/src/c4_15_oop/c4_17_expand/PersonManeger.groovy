package c4_15_oop.c4_17_expand

import c4_15_oop.Person

/**
 * Person的管理器
 */
class PersonManeger {
    static Person createPerson(String name, int age) {
        return Person.createPerson(name, age)
    }
}
