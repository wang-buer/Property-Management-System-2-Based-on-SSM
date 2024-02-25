
var projectName = '物业管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
]


var indexNav = [

{
	name: '房产信息',
	url: './pages/fangchanxinxi/list.jsp'
}, 
{
	name: '小区概况',
	url: './pages/xiaoqugaikuang/list.jsp'
}, 
{
	name: '开发商',
	url: './pages/kaifashang/list.jsp'
}, 
{
	name: '工程文件',
	url: './pages/gongchengwenjian/list.jsp'
}, 
{
	name: '小区规章',
	url: './pages/xiaoquguizhang/list.jsp'
}, 
{
	name: '收费标准',
	url: './pages/shoufeibiaozhun/list.jsp'
}, 
{
	name: '物业公司',
	url: './pages/wuyegongsi/list.jsp'
}, 

{
	name: '公告信息',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspmtbr18/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除"],"menu":"物业","menuJump":"列表","tableName":"wuye"}],"menu":"物业管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"住户","menuJump":"列表","tableName":"zhuhu"}],"menu":"住户管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"房产信息","menuJump":"列表","tableName":"fangchanxinxi"}],"menu":"房产信息管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除"],"menu":"小区概况","menuJump":"列表","tableName":"xiaoqugaikuang"}],"menu":"小区概况管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"开发商","menuJump":"列表","tableName":"kaifashang"}],"menu":"开发商管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"小区规章","menuJump":"列表","tableName":"xiaoquguizhang"}],"menu":"小区规章管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"收费标准","menuJump":"列表","tableName":"shoufeibiaozhun"}],"menu":"收费标准管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"物业公司","menuJump":"列表","tableName":"wuyegongsi"}],"menu":"物业公司管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"房产信息列表","menuJump":"列表","tableName":"fangchanxinxi"}],"menu":"房产信息模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"小区概况列表","menuJump":"列表","tableName":"xiaoqugaikuang"}],"menu":"小区概况模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"开发商列表","menuJump":"列表","tableName":"kaifashang"}],"menu":"开发商模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"工程文件列表","menuJump":"列表","tableName":"gongchengwenjian"}],"menu":"工程文件模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"小区规章列表","menuJump":"列表","tableName":"xiaoquguizhang"}],"menu":"小区规章模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"收费标准列表","menuJump":"列表","tableName":"shoufeibiaozhun"}],"menu":"收费标准模块"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"物业公司列表","menuJump":"列表","tableName":"wuyegongsi"}],"menu":"物业公司模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"住户","menuJump":"列表","tableName":"zhuhu"}],"menu":"住户管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除"],"menu":"工程文件","menuJump":"列表","tableName":"gongchengwenjian"}],"menu":"工程文件管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"物业收费","menuJump":"列表","tableName":"wuyeshoufei"}],"menu":"物业收费管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","审核","删除","修改"],"menu":"住户投诉","menuJump":"列表","tableName":"zhuhutousu"}],"menu":"住户投诉管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"客户接待","menuJump":"列表","tableName":"kehujiedai"}],"menu":"客户接待管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"停车场","menuJump":"列表","tableName":"tingchechang"}],"menu":"停车场管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"住房需求","menuJump":"列表","tableName":"zhufangxuqiu"}],"menu":"住房需求管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除"],"menu":"综合经营","menuJump":"列表","tableName":"zonghejingying"}],"menu":"综合经营管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除","审核"],"menu":"住户报修","menuJump":"列表","tableName":"zhuhubaoxiu"}],"menu":"住户报修管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"房产信息列表","menuJump":"列表","tableName":"fangchanxinxi"}],"menu":"房产信息模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"小区概况列表","menuJump":"列表","tableName":"xiaoqugaikuang"}],"menu":"小区概况模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"开发商列表","menuJump":"列表","tableName":"kaifashang"}],"menu":"开发商模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"工程文件列表","menuJump":"列表","tableName":"gongchengwenjian"}],"menu":"工程文件模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"小区规章列表","menuJump":"列表","tableName":"xiaoquguizhang"}],"menu":"小区规章模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"收费标准列表","menuJump":"列表","tableName":"shoufeibiaozhun"}],"menu":"收费标准模块"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"物业公司列表","menuJump":"列表","tableName":"wuyegongsi"}],"menu":"物业公司模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"物业","tableName":"wuye"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","支付"],"menu":"物业收费","menuJump":"列表","tableName":"wuyeshoufei"}],"menu":"物业收费管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","删除"],"menu":"住户投诉","menuJump":"列表","tableName":"zhuhutousu"}],"menu":"住户投诉管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除","新增"],"menu":"住户报修","menuJump":"列表","tableName":"zhuhubaoxiu"}],"menu":"住户报修管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"房产信息列表","menuJump":"列表","tableName":"fangchanxinxi"}],"menu":"房产信息模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"小区概况列表","menuJump":"列表","tableName":"xiaoqugaikuang"}],"menu":"小区概况模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"开发商列表","menuJump":"列表","tableName":"kaifashang"}],"menu":"开发商模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"工程文件列表","menuJump":"列表","tableName":"gongchengwenjian"}],"menu":"工程文件模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"小区规章列表","menuJump":"列表","tableName":"xiaoquguizhang"}],"menu":"小区规章模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"收费标准列表","menuJump":"列表","tableName":"shoufeibiaozhun"}],"menu":"收费标准模块"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"物业公司列表","menuJump":"列表","tableName":"wuyegongsi"}],"menu":"物业公司模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"住户","tableName":"zhuhu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
