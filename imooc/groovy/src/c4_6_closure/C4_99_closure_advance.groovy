package c4_6_closure


/**
 * //闭包委托策略
 * 模拟buildScript的repositories
 */

class MyHandler{
    String name
    int age
}

void testClosure(Closure closure){
    MyHandler myHandler=new MyHandler(name: "vvvvvvvv",age: 18)
    closure.delegate=myHandler//闭包委托策略
    closure.call(myHandler)//作为参数传递
}

testClosure{
    //新创建闭包可以通过入参myHandler调用name,age
//    MyHandler myHandler->
//        println myHandler.name
//        println myHandler.age

    //闭包委托策略--->新创建闭包可以直接调用name,age
        println name
        println age
}