

principal_letters = ["a","e","i","o","u"]
change_letters = ["ai","enter","imes","ober","ufat"]

var decrypted_text = "hola como esta"
var encrypted_text = "hoberlai cobermober enterstai"

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
    return (encrypted);
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
    return (desencriptado);
}

console.log(encrypt(decrypted_text))
console.log(desencrypt(encrypted_text))

