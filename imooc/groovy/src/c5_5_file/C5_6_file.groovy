package c5_5_file

import c4_15_oop.Person

def saveObject(Object obj, String path) {
    try {
        def destFile = new File(path)
        if (!destFile.exists()) {
            destFile.createNewFile()
        }
        destFile.withObjectOutputStream {
            out ->
                out.writeObject(obj)
        }

    } catch (e) {
        e.printStackTrace()
    }
}

def readObject(String path) {
    def obj = null
    try {
        def destFile = new File(path)
        if (!destFile.exists()) {
            destFile.createNewFile()
        }
        destFile.withObjectInputStream {
            inputStream ->
                obj = inputStream.readObject()
        }
    } catch (e) {
        e.printStackTrace()
    }
}

//def person=new Person(name: 'vero',age: 20)
//saveObject(person,'../../person.bin')
//def result=readObject('../../person.bin')
//println result.age

/**
 * 字节读写
 */
def byteList = readByte('../../person.bin')
println byteList.toList()

def readByte(String path) {
    def file = new File(path)
    byte[] bytes = new byte[file.length()]
    file.withDataInputStream { input ->
        input.readFully(bytes)
    }
    return bytes
}



