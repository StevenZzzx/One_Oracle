

principal_letters = ["a","e","i","o","u"]
change_letters = ["ai","enter","imes","ober","ufat"]


function encrypt(text){
    var encrypted = ""

    for (var i in text){
        var letra = text[i]

        if (principal_letters.includes(letra)){
            var posicion = principal_letters.indexOf(letra)
            encrypted += change_letters[posicion]
        }
        else{
            encrypted += letra
        } 
    }
    document.getElementById("workingText").value = encrypted
}

function desencrypt(text){
    var desencriptado = ""
    var i = 0

    while (i < text.length){
        var letra = text[i]

        if (principal_letters.includes(letra)){
            var posicion = principal_letters.indexOf(letra)
            desencriptado += principal_letters[posicion]
            i += change_letters[posicion].length
        }
        else{
            desencriptado += letra
            i++
        } 
    }
    document.getElementById("workingText").value = desencriptado
}

function encryptFunction() {
    text = document.getElementById("text").textContent;
    document.getElementById("text").innerText = ""
    document.getElementById("noText").style.display = "none";
    document.getElementById("withText").style.display = "flex";
    encrypt(text);
}

function decryptFunction() {
    text = document.getElementById("text").textContent;
    document.getElementById("text").innerText = ""
    document.getElementById("noText").style.display = "none";
    document.getElementById("withText").style.display = "flex";
    desencrypt(text);
}

function copyText(){
    var copyText = document.getElementById("workingText")

    copyText.select();
    copyText.setSelectionRange(0, 99999);

    navigator.clipboard.writeText(copyText.value);
}
