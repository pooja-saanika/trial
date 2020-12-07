<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        input[type="text"] ,input[type="date"]
        {
            color: darkgreen;
            border-style: solid;
            border-color: darkgreen;
            font-size: large;
            border-radius: 50px;

        }
        select
        {
            color: darkgreen;
            border-style: solid;
            border-color: darkgreen;
            border-radius: 50px;
        }
    </style>
</head>
<body>
<center>
    <h1>Create Time Table</h1>
    <h3 style="color:darkorange">Add Subjects Here</h3>
    <table cellspacing="20">
        <tr>
            <th><a href="addStudent">Add Student</a></th>
            <th><a href="addKlass">Add Class</a></th>
            <th><a href="addSubject">Add Subjects</a></th>
            <th><a href="addExam">Add Exams</a></th>
            <th><a href="create">Create Your Time Table</a></th>
        </tr>
    </table>

    <form action="addStudent" method="post">
        <table cellpadding="20">
            <tr>
                <td>
                    Student Name:
                </td>
                <td>
                    <input type="text" name="studentName" placeholder="pooja">
                </td>
            </tr>
            <tr>
                <td>
                    Student Roll No:
                </td>
                <td>
                    <input type="text" name="studentRollno" placeholder="VVS101">
                </td>
            </tr>
            <tr>
                <td>
                Student Date of Birth
                </td>
                <td>
                    <input type="date" name="studentDoB">
                </td>
            </tr>


            <tr>
                <td>Student Gender</td>
                <td>
                    <input type="radio" id="male" name="Gender" value="male">
                    <label for="male">Male</label><br>
                    <input type="radio" id="female" name="Gender" value="female">
                    <label for="female">Female</label><br>
                    <input type="radio" id="other" name="Gender" value="other">
                    <label for="other">Other</label>
                </td>
            </tr>

            <tr>
                <td>
                    Select Class
                </td>
                <td>
                    <select name="klass" id="Klass">
                        <c:forEach var="c" items="${allKlass}">
                            <option value=${c.klassId}>${c.klassName}</option>
                        </c:forEach>
                    </select>
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
