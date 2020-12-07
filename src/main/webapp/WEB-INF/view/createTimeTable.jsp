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
        input[type="text"] , input[type="date"]
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

        #timetable
        {
            border: darkorange;
            border-style: dot-dot-dash;
            border-radius: 30px;
        }
    </style>
</head>
<body>
<center>
    <h1>Create Your Table</h1>
    <table cellspacing="20">
        <tr>
            <th><a href="addStudent">Add Student</a></th>
            <th><a href="addKlass">Add Class</a></th>
            <th><a href="addSubject">Add Subjects</a></th>
            <th><a href="addExam">Add Exams</a></th>
            <th><a href="create">Create Your Time Table</a></th>
        </tr>
    </table>

    <form action="createtimetable" method="post">
        <table cellpadding="10">

            <tr>
                <td>
                    Select Exam
                </td>
                <td>
                    <select name="texamName" id="texamName">
                        <c:forEach var="e" items="${allExam}">
                            <option value=${e.examName}>${e.examName}
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>


            <tr>
                <td>
                    Select Class
                </td>
                <td>
                    <select name="tklassId" id="tklassName">
<%--                        <select name="klassName" id="tklassName">--%>
                        <c:forEach var="c" items="${allKlass}">
                            <option value=${c.klassId}>${c.klassName}
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    Select Start Date
                </td>
                <td>
                    <input type="date" name="startDate" >
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <center><input type="submit" name="submit"></center>
                </td>
            </tr>
        </table>
    </form>

    <hr>
    <hr>
    <h3 style="color:darkorange">Time Table Generated</h3>
    <table cellpadding="20" border="solid" class="timetable">
        <tr>
            <th>exam Dates</th>
                <c:forEach var="d" items="${examdates}">
                    <td>${d}</td>
                </c:forEach>
        </tr>

        <tr>
            <th>Subject Code</th>
            <c:forEach var="t" items="${timetable}">
                <td>${t.subjectCode}</td>
            </c:forEach>
        </tr>

        <tr>
            <th>Subject Name</th>
            <c:forEach var="t" items="${timetable}">
                <td>${t.subjectName}</td>
            </c:forEach>
        </tr>

        <tr>
            <th>Examinor Sgin </th>
            <c:forEach var="t" items="${timetable}">
                <td></td>
            </c:forEach>
        </tr>
    </table>
</center>
</body>
</html>
