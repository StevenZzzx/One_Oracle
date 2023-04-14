
principal_letters = ["a", "e", "i", "o", "u"]
change_letters = ["ai", "enter", "imes", "ober", "ufat"]

texto = "gato"
text = "gaitober"

def encriptar(palabra): 
    encrypted_text = ""
    
    for letra in palabra:
        if letra in principal_letters:
            posicion = principal_letters.index(letra)
            encrypted_text += change_letters[posicion]
        else:
            encrypted_text += letra
    return (encrypted_text)

def desencriptar(palabra2):
    dencrypted_text = ""
    i = 0

    while i < len(palabra2):
        letra = palabra2[i]

        if letra in principal_letters:
            posicion = principal_letters.index(letra)
            dencrypted_text += principal_letters[posicion]
            i += len(change_letters[posicion])
        else:
            dencrypted_text += letra
            i += 1 
    return (dencrypted_text)


print(encriptar(texto))

print(desencriptar(text))



