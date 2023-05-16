window.onload = function() {

    let x = +prompt(`Įveskite skaičių kurį norite pridėti`);
    console.log(suma(x));
}

function suma(x){
    let suma = 0;
    

    while(x >= 0){
        suma += x;
        x = +prompt(`Įveskite skaičių kurį norite pridėti`);
    }
    return suma;

}