package c5_2_json

import c4_15_oop.Person
import com.google.gson.Gson
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def list=[
        new Person(name: 'vero',age: 18),
        new Person(name: 'vnix',age: 17)
]

//对象--->字符串
def jsonStr=JsonOutput.toJson(list)
//println jsonStr

//按格式转换
//println JsonOutput.prettyPrint(jsonStr)

//字符串--->对象
def jsonSlpuer =new JsonSlurper()
def list2= jsonSlpuer.parseText("[\n" +
        "    {\n" +
        "        \"age\": 18,\n" +
        "        \"name\": \"vero\"\n" +
        "    },\n" +
        "    {\n" +
        "        \"age\": 17,\n" +
        "        \"name\": \"vnix\"\n" +
        "    }\n" +
        "]")

// list2.each {
//     println it.name
//}



//使用GSON
Gson gson=new Gson()
println gson.toJson(list)



//网络请求-->使用Java的
def getNetworkData(String url){
    //发送请求
    def connection =new URL(url).openConnection()
    connection.setRequestMethod('GET')
    connection.connect()
    def response=connection.content.text
    println response
    //字符串--->对象
//    def jsonSlpuer =new JsonSlurper()
//    return jsonSlpuer.parseText(response)
}

def response =getNetworkData("http://www.kuaidi100.com/query?type=yuantong&postid=11111111111")