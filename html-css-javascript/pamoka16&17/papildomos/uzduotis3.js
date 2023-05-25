window.onload = function() {

    console.log(suma(x));
}

function suma(x){
    let suma = 0;
    let x = +prompt(`Įveskite skaičių kurį norite pridėti`);
    while(x >= 0){
        suma += x;
        x = +prompt(`Įveskite skaičių kurį norite pridėti`);
    }

    return suma;
}