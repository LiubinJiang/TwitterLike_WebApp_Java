function check(form){
	var e=form.elements;
	for(var i=0;i<e.length;i++)
	{
		switch(e[i].name){
			case "usrname":
			if(checkNull(e[i].name)){
				alert("请输入用户名！");
				return false;
			}
			if(checkLength(e[i].name)){
				alert("用户名长度要小于等于20!");
				return false;
			}break;
			case "passwd":
				if(checkNull(e[i].name)){
					alert("请输入密码！");
					return false;
			}
			if(checkLength(e[i].name)){
				alert("密码长度要小于等于20!");
				return false;
			}break;
			case "repasswd":
				if(checkNull(e[i].name)){
					alert("请再一次输入密码！");
					return false;
			}
			if(checkLength(e[i].name)){
				alert("密码长度要小于等于20!");
				return false;
			}break;
			case "nicname":
				if(checkNull(e[i].name)){
					alert("请输入昵称");
					return false;
			}
			if(checkLength(e[i].name)){
				alert("昵称长度要小于等于20!");
				return false;
			}break;
			case "mailbox":
				if(checkNull(e[i].name)){
					alert("请输入邮箱名");
					return false;
			}break;
			case "price":
				if(checkNull(e[i].name)){
					alert("请输入菜品价格");
					return false;
			}
			if(checkPosNumber(e[i].name)){
				alert("菜品价格应为大于等于0的整数！");
				return false;
			}break;
			case "comment":
				if(checkNull(e[i].name)){
					alert("请输入菜品备注");
					return false;
			}
			if(checkComment(e[i].name)){
				alert("备注只能为-1、0或正整数!");
				return false;
			}break;
		}
	}

}
function checkNull(name)
{
	var ems=document.getElementsByName(name);
	if(ems[0].value=="")
	{
		return true;
	}
	return false;
}
function checkLength(name)
{
	var ems=document.getElementsByName(name);
	if(getLength(ems[0].value)>20)
	{
		return true;
	}
	return false;
}
function getLength(str)
{
	var len=0;
	var source=new String(str);
	var temp;
	for(var i=0;i<source.length;i++)
	{
		temp=source.charAt(i);
		if(temp.charCodeAt(0)>255||temp.charCodeAt(0)<0){
			len=len+2;
		}
		else{
			len=len+1;
		}
	}
	return(len);
}
function checkPosNumber(name)
{
	var ems=document.getElementsByName(name);
	var val=ems[0].value;
	for(var i=0;i<val.length;i++)
	{
		if(val.charAt(i)<'0'||val.charAt(i)>'9')
		{
			return true;
		}
	}
	return false;
}
function checkComment(name){
	if(checkPosNumber(name)){
		var ems=document.getElementsByName(name);
		var val=ems[0].value;
		if(val!="-1")
		{
			return true;
		}
	}
	return false;
}// JavaScript Document