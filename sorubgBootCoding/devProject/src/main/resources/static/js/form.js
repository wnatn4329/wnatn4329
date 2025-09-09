$("#exam02Btn").on("click", ()=>{
	$("#exam03Form").attr({
		method:"post",
		action:"/example/exam04"
	});
	$("#exam03Form").submit();
});