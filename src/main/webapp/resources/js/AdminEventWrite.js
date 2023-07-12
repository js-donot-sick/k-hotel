$("#K-photo").on("change", function(){

    for (var image of event.target.files) {
        var reader = new FileReader();

        reader.onload = function (event) {
            var img = document.createElement("img");
            img.setAttribute("src", event.target.result);
            $("img").addClass("K-photo-img");
            document.querySelector("#K-image-select").appendChild(img);
        };

        console.log(image);
        reader.readAsDataURL(image);
      }
})