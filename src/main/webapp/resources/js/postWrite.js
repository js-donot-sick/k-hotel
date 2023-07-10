
var addPicture = document.getElementById("C-addPicture");
var picture = document.getElementById("C-picture");
var imageCount = 1;

addPicture.addEventListener("click", function() {
    var fileInput = document.createElement("input");
    fileInput.type = "file";
    fileInput.accept = "image/*";
    fileInput.style.display = "flex";

    fileInput.addEventListener("change", function(e) {
        var selectedFile = e.target.files[0];
        if (selectedFile) {
            var newImageContainer = document.createElement("span");
            newImageContainer.className = "image-container";
            newImageContainer.style.display = "flex";



            var newImage = document.createElement("img");
            newImage.className = "C-postWrite-img";
            newImage.src = URL.createObjectURL(selectedFile);
            newImage.style.display="flex";
            newImage.alt = "사진 " + imageCount;

            newImageContainer.appendChild(newImage);
            picture.appendChild(newImageContainer);

            imageCount++;
        }
    });

    fileInput.click();
});