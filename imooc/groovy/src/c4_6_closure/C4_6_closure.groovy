package c4_6_closure
//闭包

def closure = {
    println 'hello closure!'
}
closure.call()//调用
//closure()//调用





//参数为null
def closure2 = {
    -> println 'hello closure!'
}
closure2.call()//调用
closure2()//调用






//参数列表
def closure3 = {
    String name, int age -> println "hello ${name},${age}!"
}
closure3.call('vero', 18)//调用
closure3('vero', 18)//调用






//隐式参数
def closure4 = {
    println "hello ${it}!"
}
closure4('vero')//调用





//返回值
def closure5 = {
    String name->
    println "hello ${name}!"
    name
}
def result=closure5('closure5')//调用
println result






//闭包作为参数
void test(Closure closure){
    closure.call()
}

def closure6 = {
        println "hello argument!"
}
test closure6




