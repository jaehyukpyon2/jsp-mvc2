<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-11-17
  Time: 오후 2:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pass.jsp</title>
</head>
<body>
<h2>파일 첨부형 게시판 - 비밀번호 검증(Pass)</h2>
<form name="writeFrm" method="post" action="${pageContext.request.contextPath}/mvcboard/pass.do" onsubmit="return validateForm(this);">
    <input type="hidden" name="idx" value="${param.idx}" />
    <input type="hidden" name="mode" value="${param.mode}" />
    <table border="1" width="90%">
        <tr>
            <td>비밀번호 검증!</td>
            <td>
                <input type="password" name="pass" style="width:100px;" />
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit">[검증하기]</button>
                <button type="reset">[RESET]</button>
                <button type="button" onclick="location.href='${pageContext.request.contextPath}/mvcboard/list.do';">
                    [목록으로]
                </button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
