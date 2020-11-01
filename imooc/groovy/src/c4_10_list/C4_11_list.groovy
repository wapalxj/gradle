package c4_10_list

/**
 * 添加
 */

def list = [1, 2, 3, 4, 5]
list.add(6)//小
list.add(1, 10)
list.leftShift(7)//<<对应的方法
list << 8 //即leftShift()的操作符
//println list.toListString()
//def plusList = list + 9
//println plusList.toListString()

/**
 * list的删除操作
 */
list.remove(7)
list.remove((Object) 10)
list.removeAt(7)
list.removeElement(6)
list.removeAll { return it % 2 == 0 }
//println list - [6, 7]
//println list.toListString()



/**
 * 排序
 */
def sortList = [6, -3, 9, 2, -7, 1, 5]

//java排序
//简单排序
//Collections.sort(sortList)
//println sortList

//自定义Comparator排序
//按绝对值大小排序
Comparator mc = {
    a, b ->
        a == b ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1
}
//Collections.sort(sortList,mc)



//Groovy扩展的排序
//sortList.sort//简单排序
sortList.sort mc//自定义Comparator排序
//println sortList



//字符串list
def sortStringList = ['zaa', 'a', 'groovy', 'java']
sortStringList.sort { it -> return it.size() }//按长度排序
//println sortStringList


/**
 * 列表的查找
 */

def findList = [-3, 9, 6, 2, -7, 1, 5, 1]
def isOdd = { return it % 2 != 0 }//奇数

//def result=findList.find isOdd  //find第一个奇数

//def result=findList.findAll isOdd  //findAll奇数

//def result=findList.any isOdd  //是否有一项是奇数

//def result=findList.every isOdd  //是否每一项是奇数

//def result=findList.min()  //最小值

//def result = findList.min { return Math.abs(it) }  //绝对值最小值

def result = findList.count isOdd //统计奇数个数

println result