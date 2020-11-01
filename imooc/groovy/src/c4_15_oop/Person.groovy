package c4_15_oop

class Person implements DefaultAction,Serializable {
    String name
    int age
    def increaseAge(int years) {
        this.age += years
    }

    @Override
    void eat() {
    }

    @Override
    void drink() {

    }

    @Override
    void play() {

    }


    /**
     *
     * 当找不到一个方法时，调用此方法代替
     * @param name-->方法名
     * @param args
     * @return
     */
    @Override
    Object invokeMethod(String name,Object args){
        return "the name is ${name},the params is ${args}"
    }

    /**
     * 当找不到一个方法时，调用此方法代替
     * @param name-->方法名
     * @param args
     * @return
     */
    def methodMissing(String name, def args) {
        return null
    }
}
