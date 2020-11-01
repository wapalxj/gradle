package c5_3_xml

import groovy.xml.MarkupBuilder

/**
 * 生成xml格式数据
    <veroLangs type='current' count='3' mainstream='true'>
        <language flavor='static' version='1.5'>Java</language>
        <language flavor='dynamic' version='1.6.0'>Groovy</language>
        <language flavor='dynamic' version='1.9'>JavaScript</language>
    </veroLangs>
 */

def sw = new StringWriter()
def xmlBuilder = new MarkupBuilder(sw)//用来生成XML的核心类

//创建根节点
//xmlBuilder.veroLangs(type: 'current', count: 3, mainstream: true) {
//    //创建子节点
//    language(flavor: 'static', version: '1.5', 'java'){
//        age(16)
//    }
//    language(flavor: 'dynamic', version: '1.6.0', 'Groovy')
//    language(flavor: 'dynamic', version: '1.9', 'JavaScript')
//}
//println sw



//根据对象---->xml
class VeroLangs{//根节点
    String type='current'
    int count=3
    boolean mainstream
    def language=[
            new Language(flavor: 'static',version: 1.5,value: 'java'),
            new Language(flavor: 'dynamic',version: 1.3,value: 'Groovy'),
            new Language(flavor: 'dynamic',version: 1.6,value: 'JavaScript'),
    ]
}

class Language{
    String flavor
    String version
    String value
}

def langs = new VeroLangs()
xmlBuilder.veroLangs(type: langs.type, count: langs.count, mainstream: langs.mainstream) {
    langs.language.each {
        lang->
            language(flavor: lang.flavor,version:lang.version,value: lang.value)
    }
}

println sw