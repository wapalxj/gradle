package c4_6_closure

import com.sun.java.util.jar.pack.Package

/**
 *
 * this,owner,delegate
 */


def scriptClosure = {
    println "scriptClosure this:" + this//代表闭包定义处的类
    println "scriptClosure owner:" + owner//代表闭包定义处的类或者对象
    println "scriptClosure delegate:" + delegate//代表任意对象，默认与owner一致
}
//scriptClosure.call()


//Script中定义一个内部类
class Person{
    def classClosure={
        println "classClosure this:" + this//Person
        println "classClosure owner:" + owner//Person
        println "classClosure delegate:" + delegate//Person
    }

    def say(){
        def classClosure={
            println "method-classClosure this:" + this//Person
            println "method-classClosure owner:" + owner//Person
            println "method-classClosure delegate:" + delegate//Person
        }
        classClosure.call()
    }
}
Person person=new Person()
//person.classClosure.call()
//person.say()




//闭包中定义一个闭包
def nestClosure={
    def innerClosure={
        println "innerClosure this:" + this//Script类
        println "innerClosure owner:" + owner//nestClosure对象
        println "innerClosure delegate:" + delegate//nestClosure对象
//        say();//修改delegate为person后，可以直接调用person的方法
    }
//    innerClosure.delegate=person//修改delegate为person
//    innerClosure.say()//可以调用person的方法

    innerClosure.call()
}
//nestClosure.call()




/**
 * 闭包委托策略
 */
class Student{
    String name
    def pretty={"My name is ${name}"}

    String toString(){
        pretty.call()
    }
}

class Teacher{
    String name
}

def stu=new Student(name:'Vero')
def tea=new Teacher(name:'Vnix')

//println stu

//改变delegate
stu.pretty.delegate=tea
//改变闭包委托策略
stu.pretty.resolveStrategy=Closure.DELEGATE_FIRST
//println stu
