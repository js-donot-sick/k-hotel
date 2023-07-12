$("#K-photo").on("change", function(){

    for (var image of event.target.files) {
        var reader = new FileReader();

        reader.onload = function (event) {
            var img = document.createElement("img");
            img.setAttribute("src", event.target.result);
            img.setAttribute("width","auto;")
            img.setAttribute("height","50px;")
            img.setAttribute("style","margin-right: 10px;")
            document.querySelector("#K-image-select").appendChild(img);
        };

        console.log(image);
        reader.readAsDataURL(image);
      }

      
      let input = $("#K-photo")[0].files;
      
      if(input.length>5){
          alert("파일 첨부는 최대 5개만 가능합니다.");
          $("#K-photo").val("");
          /* $("#K-image-select").detach(); */ /* 악 수정 중 */
      }
})
