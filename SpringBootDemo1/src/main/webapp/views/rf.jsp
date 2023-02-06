<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Registration form 2</title>
    <style>
        .myDiv {
            color: rgb(255, 72, 0);
            background-color: aqua;
        }
    </style>
</head>

<body>
    <h1 style="color: rgb(249, 6, 6); text-align: center; font-size: 60px; ">Registration <span
            style="color: rgb(143, 136, 153);">Form</span></h1>
    <form style="text-align: center; font-size: 30px; margin-left:  -100px;">
        <label for="name"><b>name <span style="color: rgb(250, 16, 16);">*</span>:</b></label>
        <input type="text" style="color:black;  " placeholder="name" required><br><br>
        <label for="pass" style="margin-left: -50px;"><b>password:</b></label>
        <input type="text"><br><br>

        <label for="gender" style="margin-left:  -100px;"><b>Gender:</b></label>
        <select id="cars" name="cars">
            <option value="">select...</option>
            <option value="male">male</option>
            <option value="female">female</option>
            <option value="trasgender">trasgender</option>
        </select><br><br>

        <label for="email" style="margin-left: -34px;"><b>EmailId:</b></label>
        <input type="email" style="border-radius: 1px;"><br><br>
        <label for="number" style="margin-left: -50px;"><b>mobile no:</b></label>
        <input type="number"><br><br>

        <label for="Address" style="margin-left: -250px;"><b>Address:</b></label> <br>
        <textarea name="" id="" cols="50" rows="8"></textarea> <br><br>
        <!-- <input type="textarea"  style="width: 300px; height: 100px;"><br><br> -->
        <label for="course" style="margin-left:-130px ;"> <b>course:</b></label>
        <input type="radio" value="course" name="id">
        <label for="">html</label><br>
        <input type="radio" value="course" name="id">
        <label for="">html2</label><br>
        <input type="radio" value="course" name="id">
        <label for="">html3</label><br>
        <input type="radio" value="course" name="id">
        <label for="">html4</label> <br>

        <input type="checkbox" name="" id="" value="registration form" style="margin-left: -100px ;" >
        <label for="" style="font-size: large; ">I Agree</label><br><br>
        <button
            style="background-color: rgba(221, 232, 11, 0.282); border-radius: 20px; font-size: x-large; text-decoration: solid; " type="submit">
            

        </button>
    </form>



    <div class="myDiv">
        <h2>This is a heading in a div element</h2>
        <h3>sunil</h3>
        <p>This is some text in a div element.</p>
    </div>
</body>
</html>