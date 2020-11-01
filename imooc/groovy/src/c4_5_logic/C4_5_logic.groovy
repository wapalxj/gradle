package c4_5_logic

def x=1.23
def result
//switch (x.class){
switch (x){
    case 'foo':
        result='found foo'
        break
    case 'bar':
        result='found far'
        break
    case [1.23,4,5,6,'inlist']:
        //ArrayList
        result='list'
        break
    case 12..30:
        //范围
        result='range'
        break
    case Integer:
        //Integer
        result='Integer'
        break
    case BigDecimal:
        //BigDecimal
        result='BigDecimal'
        break
    default:
        //default
        result='default'
        break
}

println result

//for--范围循环
def sum=0
for (i in 0..9){
    sum+=i
}
println sum

//for--list循环
sum=0
for (i in[1,2,3,4,5,6,7,8,9]){
    sum+=i
}
println sum

//for--map循环
sum=0
for (i in['a1':1,'a2':2,'a3':3,'a4':4,'a5':5,'a6':6,'a7':7,'a8':8,'a9':9]){
    sum+=i.value
}
println sum

