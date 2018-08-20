$(function() {
	var doc = $(document);
	var win = $(window);

	/* 自定义内容区域滚动条 */
    $('#lxcy-container').mCustomScrollbar({
        scrollInertia: 350,
        autoHideScrollbar: true
    });

	// 所有点击body触发的行为都放在此
	doc.on('click', function() {
		// 隐藏头部个人中心、退出登录
		
	});

	// 打开主体块，关闭侧边栏目
	doc.on('click', '#js-showBody', function(){
		$('#js-lxcySide').animate({width:0}, 200);
		$('#js-lxcyBody').animate({left:20}, 200);
		$('#js-showLeftNav').fadeIn(200);
	});

	// 打开侧边栏目，关闭主体块
	doc.on('click', '#js-showLeftNav', function(){
		$('#js-lxcySide').animate({width:211}, 200);
		$('#js-lxcyBody').animate({left:240}, 200);
		$('#js-showLeftNav').fadeOut(200);
	});
})

	/***
	 * 查询条件限制起止日期
	 * @param startDateId 开始日期id
	 * @param endDateId  结束日期id
	 */
	function restrictionQueryDate(startDateId,endDateId){
		var laydate = layui.laydate;
	 	var start = laydate.render({
			elem: '#'+startDateId, //指定元素
			max: currentTime(),
			done: function (value, date) {
		            startMax = end.config.min;
		            end.config.min = date;
		            end.config.min.month = date.month - 1;
		        }
		});
	 	var end = laydate.render({
			elem: '#'+endDateId, //指定元素
			max: currentTime(),
		    done: function (value, date) {
		            if ($.trim(value) == '') {
		                var curDate = new Date();
		                date = {
		                    'date': curDate.getDate(),
		                    'month': curDate.getMonth() + 1,
		                    'year': curDate.getFullYear()
		                };
		            }
		            endMin = start.config.max;
		            start.config.max = date;
		            start.config.max.month = date.month - 1;
		        }
		});
	}

	//获取当前时间
	function currentTime() {
	    // 获取当前时间
	    var myDate = new Date();
	    //获取当前年
	    var year=myDate.getFullYear();
	    //获取当前月
	    var month=myDate.getMonth()+1;
	    if(month<10) {
	        month='0'+month;
	    }
	    //获取当前日
	    var date=myDate.getDate();
	    if(date<10) {
	        date='0'+date;
	    }

	    return year+'-'+month+'-'+date;
	}