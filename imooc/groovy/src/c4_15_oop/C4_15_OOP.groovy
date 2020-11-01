package c4_15_oop

def person1 =new Person(name: 'vero')
def person2 =new Person(age: 18)

def person =new Person(name: 'vero',age: 18)

person.increaseAge(2)

//println "the name is ${person.name},"+
//        "the age is ${person.age}"



//meta元编程
def person3=new Person(name: 'vero',age: 18)
//println person3.cry()//没有在类中定义的方法

//为类动态添加一个属性sex
Person.metaClass.sex = 'male'
def person4 = new Person(name: 'vero', age: 18)
//println person4.sex
//person4.sex = 'female'
//println person4.sex

//为类动态添加一个方法
Person.metaClass.sexUpperCase = { -> sex.toUpperCase() }
//println person4.sexUpperCase()

//为类动态添加一个静态方法
Person.metaClass.static.createPerson = {
    String name, int age ->
        new Person(name:name,age:age)
}
def person5 = Person.createPerson('vvvvv', 17)
println person5.name + " and " + person5.age
