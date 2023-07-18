<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bingo</title>

    <link rel="stylesheet" href="resources/css/Bingo.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>

</head>
<body>

    <main>

        <div class="J-1">

            <img src="https://media.istockphoto.com/id/1254770023/ko/%EB%B2%A1%ED%84%B0/%EC%95%84%EC%BC%80%EC%9D%B4%EB%93%9C-%EB%A8%B8%EC%8B%A0-%EC%8A%A4%ED%81%AC%EB%A6%B0-%EB%B3%B5%EA%B3%A0%ED%92%8D-%EB%B2%A1%ED%84%B0-%EB%B0%B0%EA%B2%BD.jpg?s=612x612&w=0&k=20&c=QtzUGG7fd4d6ciSpFfHqJogUQJBqKD_rs37QRmAtRpQ=">
 
           <div class="J-game">New Game</div> 

           <div class="J-2">
               <table id="J-bingo">
                   <tr>
                       <td>1</td>
                       <td>2</td>
                       <td>3</td>
                       <td>4</td>
                       <td>5</td>
                   </tr>
   
                   <tr>
                       <td>1</td>
                       <td>2</td>
                       <td>3</td>
                       <td>4</td>
                       <td>5</td>
                   </tr>
   
                   <tr>
                       <td>1</td>
                       <td>2</td>
                       <td>3</td>
                       <td>4</td>
                       <td>5</td>
                   </tr>
   
                   <tr>
                       <td>1</td>
                       <td>2</td>
                       <td>3</td>
                       <td>4</td>
                       <td>5</td>
                   </tr>
   
                   <tr>
                       <td>1</td>
                       <td>2</td>
                       <td>3</td>
                       <td>4</td>
                       <td>5</td>
                   </tr>
                   
               </table>

               <button id="J-bingo2">랜덤뽑기</button>
               <button id="J-main">메인으로</button>
           </div>
        </div>


    </main>

    <script src="resources/js/Bingo.js"></script>
</body>
</html>