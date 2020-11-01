package c4_12_map

/**
 * map操作
 */
def students=[
        1:[number:'0001',name:'vero',score:95,sex:'male'],
        2:[number:'0002',name:'vnix',score:99,sex:'female'],
        3:[number:'0003',name:'vvvv',score:73,sex:'female'],
        4:[number:'0004',name:'eeee',score:36,sex:'male']
]

//遍历
//1.简单遍历
//students.each {
//    def student ->
//        println "key== ${student.key},"+
//                "value== ${student.value}"
//}
////2.遍历key-value
//students.each {
//    key,value ->
//        println "key== ${key},"+
//                "value== ${value}"
//}

//3.带索引的遍历
//students.eachWithIndex{
//    def student,int index ->//参数顺序不能改变
//        println "index is ${index }," +
//                "key== ${student.key},"+
//                "value== ${student.value}"
//}
//
////4.带索引的key-value遍历
//students.eachWithIndex{
//    key,value,index ->//参数顺序不能改变
//        println "index is ${index }," +
//                "key== ${key},"+
//                "value== ${value}"
//}








//查找
//find
def entry=students.find {
    def student->
        return student.value.score>=60
}
//println entry


//findAll
def entrys=students.findAll {
    def student->
        return student.value.score>=60
}
//println entrys



//count
def count=students.count {
    def student->
        return student.value.score>=60 && student.value.sex=='male'
}
//println count


//复合查找----获取所有大于60的人的名字
def names=students.findAll {
    def student->
        return student.value.score>=60
}.collect {
    return it.value.name
}
//println names


//groupBy--->返回 Map<G, Map<K, V>>
def group = students.groupBy {
    def student ->
        return student.value.score >= 60 ? '及格' : '不及格'
}
//println group





//排序,返回值Map<K, V>
def sort = students.sort {
    def student1, def student2 ->
        Number score1 = student1.value.score
        Number score2 = student2.value.score
        score1 - score2
//        score1 == score2 ? 0 : score1 < score2 ? -1 : 1
}

println sort





