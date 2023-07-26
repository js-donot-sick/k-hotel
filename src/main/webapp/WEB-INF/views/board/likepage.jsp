<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>

  <link rel="stylesheet" href="../resources/css/likePage.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <script src="https://kit.fontawesome.com/7bc7245179.js" crossorigin="anonymous"></script>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


  <script>
    $(document).ready(function() {
      $(".H-side-bar .H-side-item").click(function(e) {
        e.preventDefault();
        var $this = $(this);
        var $parent = $this.closest('li');
        var $siblings = $this.siblings('dl');

        if ($siblings.length && !$siblings.is(':visible')) {
          $parent.addClass('H-active').siblings('li').removeClass('H-active').find('dl').removeClass('H-block').addClass('none');
          $siblings.removeClass('H-none').addClass('H-block');
        } else {
          $parent.removeClass('H-active');
          $siblings.removeClass('H-block').addClass('H-none');
        }
      });
    });
  </script>

</head>
<body>

    <jsp:include page="/WEB-INF/views/common/header.jsp"/>    

    <section class="content">
      <div class="columns">
        <div class="main">

          <div class="list"><h2>찜 목록</h2></div>
          <div class="body1">
            <img class="body1img" src="https://th.bing.com/th/id/R.59b7789889c3a4e4e07351137dc09b6f?rik=8wocKE96P%2baJhQ&riu=http%3a%2f%2fnewsroom.etomato.com%2fuserfiles%2f%eb%a1%af%eb%8d%b0%ed%98%b8%ed%85%94%ec%a0%9c%ec%a3%bc_%ed%95%b4%ec%98%a8(%ec%95%bc%ea%b2%bd).jpg&ehk=Hyl3MZWh0EKA5lJ6o3u6xE32HH6eE328uK%2fPcIl1qwA%3d&risl=&pid=ImgRaw&r=0">

            <div class="H-info-text">
              <pre>
                K 호텔 역삼 스탠다드룸
              </pre>
              <ul>
                  <li>
                    5~9층에 위치한 스탠다드룸은 편안함과 쾌적함
                    이 인상적인 최상의 휴식 공간을 제공합니다.
                  </li>
                  <br>
                  <li>
                    전망 : 시티뷰 | 침대 : 더블,트윈
                  </li>
                  <br>
                  <li>
                      구성 : 침실,욕실1
                  </li>
                  <br>
                  <button>객실 어메니터 보기</button>
                  <button>예약</button>
              </ul>
  

          </div>

          </div>
          <div class="body2">

            <img class="body2img" src="https://image.hotelpass.com/KAKYJ0022.jpg">

            <div class="H-info-text">
              <pre>
                K 호텔 역삼 스탠다드룸
              </pre>
              <ul>
                  <li>
                    5~9층에 위치한 스탠다드룸은 편안함과 쾌적함
                    이 인상적인 최상의 휴식 공간을 제공합니다.
                  </li>
                  <br>
                  <li>
                    전망 : 시티뷰 | 침대 : 더블,트윈
                  </li>
                  <br>
                  <li>
                      구성 : 침실,욕실1
                  </li>
                  <br>
                  <button>객실 어메니터 보기</button>
                  <button>예약</button>
              </ul>
  
          </div>
          </div>
          <nav aria-label="Page navigation example" class="P-pg">
            <ul class="pagination">
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Previous" style="color: black;">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li class="page-item"><a class="page-link" href="#" style="color: black;">1</a></li>
                <li class="page-item"><a class="page-link" href="#" style="color: black;">2</a></li>
                <li class="page-item"><a class="page-link" href="#" style="color: black;">3</a></li>
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Next" style="color: black;">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
          </div>
        </div>
       
          
        </div>
      </div>
    </section>
    <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
  </div>
  

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  <script src="Semi.js"></script>
</body>
</html>