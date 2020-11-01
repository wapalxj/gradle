package c4_3_string

import org.codehaus.groovy.runtime.StringGroovyMethods

//def name = 'vero\'aaaaaaa\''
//def doubleName = "vero"
//def thupleName = '''\
//line one
//line two
//line three
//'''
//
//println name+"---->"+name.class
//println doubleName+"---->"+doubleName.class
//println thupleName+"---->"+thupleName.class


def name = "vero"
def sayHello = "hello:${name}"

//println sayHello
//println sayHello.class

def sum = "The sum of 2 and 3 equals ${2 + 3}"
//println sum

def result=echo(sum)
println result

String echo(String message){
    return message
}
