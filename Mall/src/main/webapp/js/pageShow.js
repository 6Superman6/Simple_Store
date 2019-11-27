(function(w,d,u){
	var showContent = util.get('showContent');
	if(!showContent){
		return;
	}
	var loading = new Loading();
	var layer = new Layer();
	var page = {
		init:function(){
			showContent.addEventListener('click',function(e){
				var ele = e.target;
				var buy = ele && ele.dataset.buy;
				if(buy){
					layer.reset({
						content:'确认购买本内容吗？',
						onconfirm:function(){
							layer.hide();
							loading.show();
							ajax({
								data:{id:buy},
								url:'/api/buy',
								success:function(result){
									loading.result('购买成功',function(){location.href = './account.html';});
								},
								error:function(message){
									loading.result(message||'购买失败');
								}
							});
						}.bind(this)
					}).show();
					return;
				}
			}.bind(this),false);
		}
	};
	page.init();
})(window,document);