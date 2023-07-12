const postbtn = document.getElementById("C-postWritebtn-clear");
const posttext = document.getElementById("C-postWritearea");
const posttitle = document.getElementById("C-postWrite-title");
var addPicture = document.getElementById("C-plus-picture");
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
            var newImageContainer = document.createElement("div");
            newImageContainer.className = "C-plus-img";
            newImageContainer.style.margin = "10px";
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

function inputcheck() {


    if (posttitle.value.trim().length == 0) {
        alert("제목을 입력해주세요");
        return false;
    }

    if (posttext.value.trim().length == 0) {
        alert("내용을 입력해주세요");
        return false;
    }


    return true;
}