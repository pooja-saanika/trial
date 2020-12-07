<html>
<head>
    <title>create your table</title>

    <style>
        body
        {
            color: darkgreen;
            font-family: "Arial Rounded MT Bold";
        }
        table
        {
            border-width: thick;
            border-left: darkgreen;
            padding: 20px;
        }
        a
        {
            font-style: normal;
            color: darkgreen;
            font-size: x-large;
        }
        h1
        {
            color: darkorange;
            font-size: xx-large;
            font-family: "Arial Rounded MT Bold";
        }
        input[type="submit"]
        {
            color: darkgreen;
            border-style: solid;
            background: darkorange;
            border-color: darkgreen;
            font-size: large;
            border-radius: 20px;
        }
        input[type="text"]
        {
            color: darkgreen;
            border-style: solid;
            border-color: darkgreen;
            font-size: large;
            border-radius: 50px;

        }
    </style>
</head>
<body>
<center>
    <h1>Create Time Table</h1>
    <h3 style="color:darkorange">Add Class Here</h3>
    <table cellspacing="20">
        <tr>
            <th><a href="addStudent">Add Student</a></th>
            <th><a href="addKlass">Add Class</a></th>
            <th><a href="addSubject">Add Subjects</a></th>
            <th><a href="addExam">Add Exams</a></th>
            <th><a href="create">Create Your Time Table</a></th>
        </tr>
    </table>

<form action="addKlass" method="post">
<table cellpadding="20">
    <tr>
        <td>
        Class Code:
        </td>
        <td>
            <input type="text" name="klassCode" placeholder="VVC01">
        </td>
    </tr>
    <tr>
        <td>
        Class Name:
        </td>
        <td>
            <input type="text" name="klassName" placeholder="One">
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <center><input type="submit" name="submit"></center>
        </td>
    </tr>
</table>
<%--    Long klassId;--%>
<%--    String klassName;--%>
<%--    @Column(unique = true)--%>
<%--    String klassCode;--%>
</form>
</center>
</body>
</html>
