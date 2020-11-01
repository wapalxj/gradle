package file

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import objectorention.Person

def reponse =
        getNetworkData(
                'http://yuexibo.top/yxbApp/course_detail.json')

println reponse.data.head.name

def getNetworkData(String url) {
    //发送http请求
    def connection = new URL(url).openConnection()
    connection.setRequestMethod('GET')
    connection.connect()
    def response = connection.content.text
    //将json转化为实体对象
    def jsonSluper = new JsonSlurper()
    return jsonSluper.parseText(response)
}


