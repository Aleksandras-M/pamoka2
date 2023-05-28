window.onload = function() {

    let x = +prompt(`Įveskite skaičių`)
    console.log(skaiciausSkaitmenuSuma(x))
}

function skaiciausSkaitmenuSuma (x) {
    let suma = 0;
    for(let i = 0; i < x.toString().length; i++){
        suma += parseInt(x.toString().at(i));
    }
    return suma;

}