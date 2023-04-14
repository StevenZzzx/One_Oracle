
principal_letters = ["a","e","i","o","u"]
change_letters = ["ai","enter","imes","ober","ufat"]

texto = "gato"
encrypted_text = ""

for letra in texto:
    if letra in principal_letters:
            posicion = principal_letters.indexOf(letra)
            encrypted_text += change_letters[posicion]
    else:
        encrypted_text += letra
        
print(encrypted_text)

