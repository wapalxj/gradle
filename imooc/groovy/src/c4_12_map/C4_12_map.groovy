package c4_12_map
/**
 * map
 */

//HashMap map=[a:'vero',b:'vnix'] as HashMap
//println map.getClass()


//key默认是带单引号的
def colors = [red: 'ff0000',
              green: '00ff00',
              blue: '0000ff']
println colors.getClass()

//空map
def nullMap=[:]

//索引
println colors['red']
println colors.blue

//添加
colors.yellow='ffff00'
colors.leftShift(black:'000000')
colors.complex=[a:1,b:2]
println colors.toMapString()

//删除
colors.remove('yellow')
println colors.toMapString()