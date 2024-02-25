<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>注册</title>
		<!-- bootstrap样式，地图插件使用 -->
		<link rel="stylesheet" href="../../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<style>
		html::after {
			position: fixed;
			top: 0;
			right: 0;
			left: 0;
			bottom: 0;
			content: '';
			display: block;
			background-attachment: fixed;
			background-size: cover;
			background-position: center;
			z-index: -1;
		}
		#swiper {
			overflow: hidden;
			margin: 0 auto;
		}
		#swiper .layui-carousel-ind li {
			width: 50px;
			height: 2px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(255, 255, 255, 1);
			border-radius: 0px;
			background-color: rgba(255, 255, 255, 1);
			box-shadow: 0 0 0px rgba(110,22,64,.8);
		}
		#swiper .layui-carousel-ind li.layui-this {
			width: 50px;
			height: 6px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 0;
			background-color: rgba(255, 255, 255, 1);
			box-shadow: 0 0 6px rgba(110,22,64,.8);
		}
		
		button, button:focus {
			outline: none;
		}
		
		.data-add-container .add .layui-select-title .layui-unselect {
			padding: 0 12px;
			height: 40px;
			font-size: 15px;
			color: #333;
			border-radius: 4px;
			border-width: 1px;
			border-style: solid;
			border-color: rgba(240, 86, 84, 1);
			background-color: #fff;
			box-shadow: 0 0 0px rgba(110,22,64,.8);
			text-align: left;
		}
		.data-add-container .add .layui-form-item {
			display: flex;
			align-items: center;
			justify-content: center;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-form-label {
			margin: 0;
			position: inherit;
			background: transparent;
			border: 0;
		}
		.data-add-container .add .layui-input-block {
			margin: 0;
			flex: 1;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-input-inline {
			margin: 0;
			flex: 1;
			display: flex;
		}
	</style>
	<body>


		<div id="app">
		
			<!-- 轮播图 -->
			<!-- <div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div> -->
			<div class="layui-carousel" id="swiper" :style='{"boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0 auto","borderColor":"rgba(255, 255, 255, 1)","borderRadius":"0px","borderWidth":"0","width":"100%","borderStyle":"solid"}'>
			  <div carousel-item id="swiper-item">
				<div v-for="(item,index) in swiperList" :key="index">
					<img style="width: 100%;height: 100%;object-fit:cover;" :src="item.img" />
				</div>
			  </div>
			</div>
			<!-- 轮播图 -->
		
			<div class="data-add-container">
		
				<form class="layui-form layui-form-pane" lay-filter="myForm">
					
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">收费时间：</label>
						<div class="layui-input-block">
							<input type="text" name="shoufeishijian" id="shoufeishijian" autocomplete="off" class="layui-input" >
						</div>
					</div>
		            <div class="layui-form-item" pane>
		                <label class="layui-form-label">住户账号</label>
		                <div class="layui-input-block">
		                    <select name="zhuhuzhanghao" id="zhuhuzhanghao" lay-filter="zhuhuzhanghao"  >
		                        <option value="">请选择</option>
		                        <option v-for="(item,index) in zhuhuzhanghao" v-bind:key="index" :value="item">{{item}}</option>
		                    </select>
		                </div>
		            </div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">住户姓名：</label>
						<div class="layui-input-block">
							<input v-model="detail.zhuhuxingming" type="text" :readonly="ro.zhuhuxingming" name="zhuhuxingming" id="zhuhuxingming" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">住户号：</label>
						<div class="layui-input-block">
							<input v-model="detail.zhuhuhao" type="text" :readonly="ro.zhuhuhao" name="zhuhuhao" id="zhuhuhao" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">物业费：</label>
						<div class="layui-input-block">
							<input v-model="detail.wuyefei" type="text" :readonly="ro.wuyefei" name="wuyefei" id="wuyefei" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">绿化养护：</label>
						<div class="layui-input-block">
							<input v-model="detail.lvhuayanghu" type="text" :readonly="ro.lvhuayanghu" name="lvhuayanghu" id="lvhuayanghu" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">清洁卫生：</label>
						<div class="layui-input-block">
							<input v-model="detail.qingjieweisheng" type="text" :readonly="ro.qingjieweisheng" name="qingjieweisheng" id="qingjieweisheng" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">设施维护：</label>
						<div class="layui-input-block">
							<input v-model="detail.sheshiweihu" type="text" :readonly="ro.sheshiweihu" name="sheshiweihu" id="sheshiweihu" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">其它收费：</label>
						<div class="layui-input-block">
							<input v-model="detail.qitashoufei" type="text" :readonly="ro.qitashoufei" name="qitashoufei" id="qitashoufei" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">总金额：</label>
						<div class="layui-input-block">
							<input v-model="zongjine"  type="text" name="zongjine" id="zongjine" disabled="disabled"  autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">物业账号：</label>
						<div class="layui-input-block">
							<input v-model="detail.wuyezhanghao" type="text" :readonly="ro.wuyezhanghao" name="wuyezhanghao" id="wuyezhanghao" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">物业姓名：</label>
						<div class="layui-input-block">
							<input v-model="detail.wuyexingming" type="text" :readonly="ro.wuyexingming" name="wuyexingming" id="wuyexingming" autocomplete="off" class="layui-input">
						</div>
					</div>
		            
		
					<div class="layui-form-item">
						<div class="layui-input-block" style="text-align: right;margin-right: 30px;">
							<button class="layui-btn btn-submit" lay-submit lay-filter="*">提交</button>
							<button type="reset" class="layui-btn layui-btn-primary">重置</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<!-- 校验格式工具类 -->
		<script src="../../js/validate.js"></script>
		<!-- 地图 -->
		<script type="text/javascript" src="../../js/jquery.js"></script>
		<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
		<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

		<script>
			var jquery = $;
			
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					baseurl: '',
					dataList: [],
					ro:{
                                        shoufeishijian : false,
                                        zhuhuzhanghao : false,
                                        zhuhuxingming : false,
                                        zhuhuhao : false,
                                        wuyefei : false,
                                        lvhuayanghu : false,
                                        qingjieweisheng : false,
                                        sheshiweihu : false,
                                        qitashoufei : false,
                                        zongjine : false,
                                        wuyezhanghao : false,
                                        wuyexingming : false,
                                        ispay : false,
					},
                    detail: {
                        shoufeishijian: '',
                        zhuhuzhanghao: '',
                        zhuhuxingming: '',
                        zhuhuhao: '',
                        wuyefei: '',
                        lvhuayanghu: '',
                        qingjieweisheng: '',
                        sheshiweihu: '',
                        qitashoufei: '',
                        zongjine: '',
                        wuyezhanghao: '',
                        wuyexingming: '',
                        ispay: '',
                    },
					zhuhuzhanghao: [],
					centerMenu: centerMenu
				},
				updated: function() {
					layui.form.render('select', 'myForm');
				},
                computed: {
                    zongjine: {
                    get: function () {
                        return 0+parseFloat(this.detail.wuyefei)+parseFloat(this.detail.lvhuayanghu)+parseFloat(this.detail.qingjieweisheng)+parseFloat(this.detail.sheshiweihu)+parseFloat(this.detail.qitashoufei) || ''
                    }
                    },
                },
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})


			layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate','tinymce'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var form = layui.form;
				var upload = layui.upload;
				var laydate = layui.laydate;
				var tinymce = layui.tinymce;
				vue.baseurl = http.baseurl;

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img style="width: 100%;height: 100%;object-fit:cover;" class="swiper-item" src="' + http.baseurl+item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						vue.$nextTick(() => {
						  carousel.render({
						  	elem: '#swiper',
							width: '100%',
						  	height: '500px',
						  	arrow: 'hover',
						  	anim: 'default',
						  	autoplay: 'true',
						  	interval: '3150',
						  	indicator: 'inside'
						  });
						
						})
					}
				});

				laydate.render({
					elem: '#shoufeishijian'
				});
				http.request(`option/zhuhu/zhuhuzhanghao`,'get',{},(res)=>{
					vue.zhuhuzhanghao = res.data
				});
				form.on('select(zhuhuzhanghao)', (data) => {
					console.log(data.value);
					http.request('follow/zhuhu/zhuhuzhanghao', 'get', {
						columnValue: data.value
					}, function(res) {
						vue.detail.zhuhuzhanghao=res.data.zhuhuzhanghao
						vue.detail.zhuhuxingming=res.data.zhuhuxingming
						vue.detail.zhuhuhao=res.data.zhuhuhao
					})
				});
				
                // session独取
				let table = localStorage.getItem("userTable");
				http.request(`${table}/session`, 'get', {}, function(data) {
					// 表单赋值
					//form.val("myForm", data.data);
					data = data.data
					for(var key in data){
                        if(key=='wuyezhanghao'){
                                vue.detail['wuyezhanghao'] = data[`${key}`]
                                vue.ro.wuyezhanghao = true;
                                continue;
                        }
                        if(key=='wuyexingming'){
                                vue.detail['wuyexingming'] = data[`${key}`]
                                vue.ro.wuyexingming = true;
                                continue;
                        }
					}
				});

                // 跨表计算
                if(http.getParam('corss')){
					var obj = JSON.parse(localStorage.getItem('crossObj'));
					//form.val("myForm", obj);
					for(var o in obj){
                                        if(o=='shoufeishijian'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.shoufeishijian = true;
                                                jquery('#shoufeishijian').val(obj[o]);
                                                continue;
                                        }
                                        if(o=='zhuhuzhanghao'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zhuhuzhanghao = true;
                                                continue;
                                        }
                                        if(o=='zhuhuxingming'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zhuhuxingming = true;
                                                continue;
                                        }
                                        if(o=='zhuhuhao'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zhuhuhao = true;
                                                continue;
                                        }
                                        if(o=='wuyefei'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.wuyefei = true;
                                                continue;
                                        }
                                        if(o=='lvhuayanghu'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.lvhuayanghu = true;
                                                continue;
                                        }
                                        if(o=='qingjieweisheng'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.qingjieweisheng = true;
                                                continue;
                                        }
                                        if(o=='sheshiweihu'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.sheshiweihu = true;
                                                continue;
                                        }
                                        if(o=='qitashoufei'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.qitashoufei = true;
                                                continue;
                                        }
                                        if(o=='zongjine'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.zongjine = true;
                                                continue;
                                        }
                                        if(o=='wuyezhanghao'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.wuyezhanghao = true;
                                                continue;
                                        }
                                        if(o=='wuyexingming'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.wuyexingming = true;
                                                continue;
                                        }
					}
				}
				

				// 提交
				form.on('submit(*)', function(data) {
					data = data.field;
					
                    // 数据校验
                    if(!isNumber(data.wuyefei)){
                        layer.msg('物业费应输入数字', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isNumber(data.lvhuayanghu)){
                        layer.msg('绿化养护应输入数字', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isNumber(data.qingjieweisheng)){
                        layer.msg('清洁卫生应输入数字', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isNumber(data.sheshiweihu)){
                        layer.msg('设施维护应输入数字', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isNumber(data.qitashoufei)){
                        layer.msg('其它收费应输入数字', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                    if(!isNumber(data.zongjine)){
                        layer.msg('总金额应输入数字', {
							time: 2000,
							icon: 5
						});
                        return false
                    }

					// 跨表计算判断
					
                    // 比较大小

                //更新跨表属性
               var crossuserid;
               var crossrefid;
               var crossoptnum;
                if(http.getParam('corss')){
                        var statusColumnName = localStorage.getItem('statusColumnName');
                        var statusColumnValue = localStorage.getItem('statusColumnValue');
                        if(statusColumnName!='') {
                                var obj = JSON.parse(localStorage.getItem('crossObj'));
				if(!statusColumnName.startsWith("[")) {
					for (var o in obj){
						if(o==statusColumnName){
							obj[o] = statusColumnValue;
						}
					}
					var table = localStorage.getItem('crossTable');
					http.requestJson(`${table}/update`,'post',obj,(res)=>{});
				} else {
                                       crossuserid=Number(localStorage.getItem('userid'));
                                       crossrefid=obj['id'];
                                       crossoptnum=localStorage.getItem('statusColumnName');
                                       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
				}
                        }
                }
                        if(crossrefid && crossuserid) {
                                data.crossuserid=crossuserid;
                                data.crossrefid=crossrefid;
                                http.request('wuyeshoufei/list', 'get', {
                                        page: 1,
                                        limit: 10,
                                        crossuserid:crossuserid,
                                        crossrefid:crossrefid,
                                }, function(res) {
                                        if(res.data.total>=crossoptnum) {
                                                layer.msg(localStorage.getItem('tips'), {
                                                        time: 2000,
                                                        icon: 6
                                                })
                                             return false;
                                        } else {
                                            // 跨表计算
                                            // 提交数据
                                            http.requestJson('wuyeshoufei' + '/add', 'post', data, function(res) {
                                                    layer.msg('提交成功', {
                                                            time: 2000,
                                                            icon: 6
                                                    }, function() {
                                                            back();
                                                    });
                                             });
                                        }
                                });
                        } else {
                                // 跨表计算
                                // 提交数据
                                http.requestJson('wuyeshoufei' + '/add', 'post', data, function(res) {
                                        layer.msg('提交成功', {
                                                time: 2000,
                                                icon: 6
                                        }, function() {
                                                back();
                                        });
                                 });
                        }
			return false
			});
		});
		</script>
	</body>
</html>
