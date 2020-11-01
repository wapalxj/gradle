package c4_6_closure

import org.apache.tools.tar.TarUtils

/**
 * 字符串与闭包
 */

String str = 'the 2 and 3 is 5'

//String的遍历
println str.each {}

//str.each{
//    String temp->
////        if (!temp.allWhitespace) {//不为空串
//        if (temp?.trim()) {//不为空串
//            print temp+'--'
//            //让temp重复2次
//            println temp.multiply(2)
//        }
//}

//find-->查找第一个满足条件的String
println str.find {
    String temp ->
        temp.isNumber()
}

//findAll
def list = str.findAll {
    String temp ->
        temp.isNumber()
}
println list.toListString()




//any--->是否有一项符合条件
println str.any {
    String temp ->
        //是否包含数字
        temp.isNumber()
}




//every--->是否每一项都符合条件
println str.every() {
    String temp ->
        //每一项都是数字
        temp.isNumber()
}




//collect--->元素添加到list中
println str.collect {
//    it

    //变大写
    it.toUpperCase()

}