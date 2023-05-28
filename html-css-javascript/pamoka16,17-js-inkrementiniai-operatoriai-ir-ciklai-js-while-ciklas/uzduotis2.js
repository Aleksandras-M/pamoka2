window.onload = function() {

    let pradzia = +prompt(`Įveskite sekos pradžią`);
    let pabaiga = +prompt(`Įveskite sekos pabaigą`);
    let intervalas = +prompt(`Įveskite intervalą`)
    rastiSkaiciuSuma(pradzia, pabaiga, intervalas)
}

function rastiSkaiciuSuma(a, b, c) {
    let suma = 0
    for(let i = a; i <= b; i += c){
        suma += i;
    }
    console.log(suma);
}