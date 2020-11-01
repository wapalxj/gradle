package c4_2_variable

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory

int x=10
//println x.class

double y=3.14
//println y.class


def x1=11

def d2=3.1415

def name='vero'

println x1.class
println d2.class
println name.class

x1='vnix'
println x1.class


def a = "I am A"
def printA(b){
    println b
}

def printA(){
    println a
}
printA(a)
