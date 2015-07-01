function check(form){
	var e=form.elements;
	for(var i=0;i<e.length;i++)
	{
		switch(e[i].name){
			case "usrname":
			if(checkNull(e[i].name)){
				alert("�������û�����");
				return false;
			}
			if(checkLength(e[i].name)){
				alert("�û�������ҪС�ڵ���20!");
				return false;
			}break;
			case "passwd":
				if(checkNull(e[i].name)){
					alert("���������룡");
					return false;
			}
			if(checkLength(e[i].name)){
				alert("���볤��ҪС�ڵ���20!");
				return false;
			}break;
			case "repasswd":
				if(checkNull(e[i].name)){
					alert("����һ���������룡");
					return false;
			}
			if(checkLength(e[i].name)){
				alert("���볤��ҪС�ڵ���20!");
				return false;
			}break;
			case "nicname":
				if(checkNull(e[i].name)){
					alert("�������ǳ�");
					return false;
			}
			if(checkLength(e[i].name)){
				alert("�ǳƳ���ҪС�ڵ���20!");
				return false;
			}break;
			case "mailbox":
				if(checkNull(e[i].name)){
					alert("������������");
					return false;
			}break;
			case "price":
				if(checkNull(e[i].name)){
					alert("�������Ʒ�۸�");
					return false;
			}
			if(checkPosNumber(e[i].name)){
				alert("��Ʒ�۸�ӦΪ���ڵ���0��������");
				return false;
			}break;
			case "comment":
				if(checkNull(e[i].name)){
					alert("�������Ʒ��ע");
					return false;
			}
			if(checkComment(e[i].name)){
				alert("��עֻ��Ϊ-1��0��������!");
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