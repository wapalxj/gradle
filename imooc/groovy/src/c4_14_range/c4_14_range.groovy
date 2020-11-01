package c4_14_range

def range=1..10
def range2=1..<10

//println "range[0]==${range[0]}"
//println "range.contains(10)==${range.contains(10)}"
//println "from==${range.from}"
//println "from==${range.to}"


//遍历
//range.each {
//    println it
//}


def getGrade(Number number){
    def result
    switch (number){
        case 0..<60:
            result='不及格'
            break
        case 60..<70:
            result='及格'
            break
        case 70..<80:
            result='良好'
            break
        case 80..<100:
            result='优秀'
            break
    }
    return result
}
def result=getGrade 85
println result
