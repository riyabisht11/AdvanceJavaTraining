<body bgcolor="pink">
<%
  String name=(String)request.getAttribute("kyname");
  String pwd=(String)request.getAttribute("kypwd");
  out.println("Welcome to "+name);
  out.print("\nYour Password is "+pwd);
  %>
  <h2>welcome: ${kyname}</h2>
  <h2>your password: ${kypwd}</h2>
  <h1>Save your password carefully</h1>
</body>