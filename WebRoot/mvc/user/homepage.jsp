<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>homepage</title>
<link href="../../css/text.css" rel="stylesheet" type="text/css" />

</head>

<body>
<%@page import="com.bean.*"  %>
<center >

  <!--标题行-->
  <p style="margin-left:0px" style="margin_top:0px" style="margin-right:0px" style="margin-bottom:0px">
  	<img src="../images/banner.jpg" width="1000" height="100" /></br><a href="homepage.html"><img src="../images/ahp.png" width="100" height="50" border="0" /></a><a href="links/personalpage.html"><img src="../images/personalpage.jpg" width="200" height="50" border="0" /></a><a href="links/albumpage.html"><img src="../images/photoalbumpage.jpg" width="100" height="50" border="0" /></a><img src="../images/else.jpg" width="500" height="50" /><a href="links/login.html"><img src="../images/exit.jpg" width="100" height="50" border="0" /></a></br>
  </p>
  
 <!-- 正文段-->
  <p>
  		<!--主边框,边框隐藏-->
  <table>
			<tr>
				
				<td>
				<!--侧边栏，右边框avisible-->
					<table class="hometable">
					    <!--头像区-->
						<tr>
							<td align="right">
							<img src="../images/originface.jpg" width="150" height="150" /></br>
							欢迎回来：<a href="links/personalpage.html">小罐</a></br>							</td>
						</tr>
						
						<!--链接区-->
						<tr>
							<td>
							<img src="../images/home.png" width="40" height="40" /><a href="homepage.html"><img src="../images/hp.jpg" width="150" height="40" border="0" /></a></br>
							<img src="../images/personal.png" width="40" height="40" /><a href="links/personalpage.html"><img src="../images/afterpp.png" width="150" height="40" border="0" /></a></br>
							<img src="../images/album.png" width="40" height="40" /><a href="links/albumpage.html"><img src="../images/afteralbum.png" width="150" height="40" border="0" /></a></br>
							<img src="../images/collection.png" width="40" height="40" /><a href="links/collection.html"><img src="../images/afterc.png" width="150" height="40" border="0" /></a></br>
							<img src="../images/fans.png" width="40" height="40" /><a href="links/fans.html"><img src="../images/afterfans.png" width="150" height="40" border="0" /></a></br>
							<img src="../images/focus.png" width="40" height="40" /><a href="links/focus.html"><img src="../images/afterfocus.png" width="150" height="40" border="0" /></a><br />
							<img src="../images/mention.png" width="40" height="40" /><a href="links/refermepage.html"><img src="../images/aftermm.png" width="150" height="40" border="0" /></a><br />
						  </td>
							
					  </tr>
					  <tr>
					  	<td>
						 
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
					    <p>&nbsp; </p></td>
					  
					  </tr>
						
					</table>
				</td>
				
				<!--正文区边框隐藏-->
				<td>
				<form action="sayingsServlet" method="post"">
					<table class="statustable">
						<!--微博发布区-->
						<tr>
						  <td align="right">
								<img src="../images/sayit.png" /></br>
							  <textarea name="sayinginfo" cols="40" rows="5"></textarea></br>
							  <input type="hidden" name="action" value="add">
							  <input type="submit" value="添加">
						  </td>
						</tr>
						
						<!--微博汇集去-->
						<tr>
							<td>
								<table>
									<%
										List<Saying>list=(List<Saying>)request.getAttribute("sayings");
										for(Saying s:list){
									%>
									<tr>
										<td><%=s.getUser_id()%></td>
									  	<td><%=s.getSayinginfo()%></td>
									</tr>
									<%}%>
								</table>
							</td>
							
						</tr>
						
						<tr>
							<td>
								<table>
									<tr>
										<td><img src="../face/169204d32dfad006960a16c1.jpg" width="60" height="60" /><br /><a href="links/personal1.html">Bambie</a></td>
										<td>【下电影最潮方式】：你还在迅雷上苦苦寻找电影资源吗？你还在百度一遍又遍的搜索，却碰的头破血流吗？如果是，你就OUT啦！ 要看电影，电视剧当然要到制作的论坛去下啦。下面，为大家推荐电影电视剧下载的最好去处。大家抓紧收藏啦。。。</td>
									</tr>
								</table>
							</td>
						</tr>
						
						<tr>
							<td>
								<table>
									<tr>
										<td><img src="../face/52230291201171286.jpg" width="60" height="60" /><br />
									  <a href="links/personal2.html">Henry</a></td>
										<td>第三套全国中学生广播体操，提速1.44921倍后。。再配上Bad Apple这首歌 绝对可以参加国际性的街舞大赛了，1分55秒的黯然销魂转笑屎人了~！http://t.cn/SZLAXu</td>
									</tr>
								</table>
							</td>
							
						</tr>
						
						<tr>
							<td>
								<table>
									<tr>
										<td><img src="../face/5204449201186594.jpg"  width="60" height="60" /><br /><a href="links/personal1.html">Zoey</a></td>
										<td>冬天来了，需要有一家这样的鞋铺，时尚大气</td>
									</tr>
								</table>
							</td>
							
						</tr>
						
						<tr>
							<td>
								<table>
									<tr>
										<td><img src="../face/52213429201142336.jpg"  width="60" height="60" /><br /><a href="links/personal3.html">Serina</a></td>
										<td>计算女生价格的方法，2800以上就赶紧娶吧，一犹豫就没啦</td>
									</tr>
								</table>
							</td>
							
						</tr>
					</table>
					</form>
			  </td>
			  <!--右侧系统推荐区-->
			  <td>
			  	<table class="sidebar">
					<!--推荐好友-->
					<tr>
						<td>
							<h2>推荐好友：</h2></br>
							<table>
								<tr>
									<td><img src="../face/5205580201158936.jpg" width="80" height="80" /></td>
									<td><img src="../face/5228301201157715.jpg" width="80" height="80" /></td>
									<td><img src="../face/52025449201174943.jpg" width="80" height="80" /></td>
								</tr>
								<tr>
									<td>Exa</td>
									<td>Eric</td>
									<td>Barbie</td>
								</tr>
							</table>
						</td>
					</tr>
					<!--天气预报-->
					<tr>
						<td>
							<h2>天气预报：</h2></br>
							<table>
								<tr>
									<td><img src="../weather/super-mono-3d-101.png"width="80" height="80" /></td>
									<td><img src="../weather/super-mono-3d-110.png" width="80" height="80"/></td>
									<td><img src="../weather/super-mono-3d-104.png"width="80" height="80" /></td>
								</tr>
								<tr>
									<td>&nbsp;&nbsp;Mon</td>
									<td>&nbsp;&nbsp;Tues</td>
									<td>&nbsp;&nbsp;Wed</td>
								</tr>
							</table>
						</td>
					</tr>
					<!--热门话题-->
					<tr>
						<td>
							<h2>热门话题：</h2></br>
								<a href="#">你那里下雪了吗(6325950)</br>
								华北多地迎来入冬初雪</br>
								你需要被扶贫吗(440965)</br>
								免费萝卜万人抢(163792)</br>
								杰克逊之死医生获刑(73702)</br>
								天价内存条事件(64011)</br>
								第48届金马奖揭晓(1091805)</br>
								100元在辽宁花多久</a></br>
						</td>
					</tr>
					<!--占位符-->
					<tr>
						<td>
					   
					    <p>&nbsp;</p>
					    <p>&nbsp;</p>
						<p>&nbsp;</p>
						<p>&nbsp;</p>
						<p>&nbsp;</p>
						<p>&nbsp;</p>
						<p>&nbsp;</p>
						<p>&nbsp;</p>
					    <p>&nbsp;</p>
						<p>&nbsp;</p>
						<p>&nbsp;</p>
						<p>&nbsp;</p>
						
						</td>
					</tr>
				</table>
					
			  </td>
			</tr>
  </table>
  </p>
  
 <!--尾部段-->
 <p align="right">友情链接：<a href="http://www.weibo.com.cn">新浪微博</a>|<a href="http://www.qq.com">腾讯微博</a>|<a href="http://www.renren.com">人人网</a>|<a href="http://www.taobao.com">淘宝网</a>|</p>
  
</center>

</body>
</html>