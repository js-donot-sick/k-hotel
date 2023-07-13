$("#K-photo").on("change", function(){

  var result;

    $("#K-image-select").empty(); // 전에 있던 img 미리보기 파일들 삭제

    let input = $("#K-photo")[0].files; // 인덱스 안 쓰면 오류남(files가 FileList 객체 속성이라서)
      
    if (input.length > 5) {
        alert("파일 첨부는 최대 5개만 가능합니다.");
        $("#K-photo").val("");
        $("#K-image-select").empty();
    }

    for (var image of this.files) {
        var reader = new FileReader();

        reader.onload = function (event) {
            var img = document.createElement("img");
            img.setAttribute("src", event.target.result);
            img.setAttribute("width","auto;")
            img.setAttribute("height","50px;")
            img.setAttribute("style","margin-right: 10px;")
            document.querySelector("#K-image-select").appendChild(img);

            var binary = event.target.result.split(',')[1];

            console.log(binary)
            
        };

        console.log(image);
        reader.readAsDataURL(image);
      }
      
      /* 
        미래의 나를 위한 설명 

        FileReader가 비동기 어쩌구 방식.... 암튼 onload를 사용해서 가 장 마 지 막 에 실행됨!!!
        (첫 시간에 window.onload 수업했던 거 기억해바ㅑ)
        (코드가 위에 있든 밑에 있든 위치와 상관없이 실행 순서가 가장 마지막)

        그래서 우선 사진 파일의 개수를 구하는 코드를 먼저 작성 후 
        개수가 5개 초과일 때(조건에 만족할 때)
        input의 value값들을 비워준 다음에
        reader.onload를 실행해야 됨...  겁나 삽질했네
      */
      
})

/* function displayImage(binaryData) {
  // 이미지 요소 생성
  var img = document.createElement("img");
  img.setAttribute("src", "data:image/jpeg;base64," + binaryData); // 이진 데이터를 Data URL로 변환하여 src 속성에 설정

  // 이미지를 출력할 요소 선택 (예: <div id="image-container"></div>)
  var imageContainer = document.querySelector("#sample");

  // 이미지 요소를 선택한 요소에 추가
  imageContainer.appendChild(img);
}

// 이진 데이터를 화면에 출력
displayImage(binaryImageData); */