package c4_6_closure
//闭包的使用
//1.求阶乘
int x=10

int fab(int number){
    int result=1
    //upte-->从1增加到number
    //闭包表示每次增加的动作，num每次增加后的结果
    1.upto(number,{num->result*=num})
    return result
}

int fab2(int number){
    int result=1
    //downto-->从number递减到1

    //第3种写法---闭包放括号里面和外面都是一样的
    //通常的写法--闭包放括号外面
    number.downto (1){
        num->
            result*=num
    }

    //第1种写法
//    number.downto(1,{ num-> result*=num })

    //第2种写法---省略括号
//    number.downto 1,{
//        num->
//            result*=num
//    }

    return result
}
//x=fab(5)
x=fab2(5)
println x

//2.累加
int cal(int number){
    int result=0
    //-->times方法，number为开区间
    number.times {
            num->result+=num
    }
    result
}

x=cal(5)
println x