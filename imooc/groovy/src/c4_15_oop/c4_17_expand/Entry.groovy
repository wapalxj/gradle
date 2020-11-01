package c4_15_oop.c4_17_expand

/**
 * 全局注入
 */
class Entry {
    static void main(args) {
        println '应用程序正在启动...'
        //初始化
        ApplicationManager.init()
        println '应用程序初始化完成...'
        def person=PersonManeger.createPerson('vero',16)
        println "the person name is ${person.name} and age is ${person.age}"



        //翻转字符串
        def str='vero'
        println str.reversed()
    }
}
