package c5_5_file

def file = new File('../../testFile.xml')

//遍历每行
//file.eachLine{
//    line ->
//        println line
//}

//获取文本
//def text=file.getText()
//println text

//获取文本-返回一个List
//def text=file.readLines()
//println text

//只读取前10个字符
//def readerText =file.withReader {
//    reader->
//        char [] buffer=new char[10]
//        reader.read(buffer)
//        return  buffer
//}
//
//println readerText

//writer
//file.withWriter {
//    writer->
//        writer.append('writer')
//}

//copy
def copy(String sourcePath, String destPath) {
    try {
        def destFile = new File(destPath)
        if (!destFile.exists()) {
            destFile.createNewFile()
        }

        def sourceFile = new File(sourcePath)
        if (!sourceFile.exists()) {
            return
        }

        //copy
        sourceFile.withReader {
            reader ->
                def lines = reader.readLines()
                destFile.withWriter {
                    writer ->
                        lines.each {
                            line ->
                                writer.append(line+'\r\n')
                        }
                }
        }
    } catch (e) {
        e.printStackTrace()
    }
}

copy('../../groovy.iml','../../testFile.xml')