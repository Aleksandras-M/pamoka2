window.onload = function() {

    let pirmas = +prompt("Įveskite pirmajį sekos skaičių:");
    let antras = +prompt("Įveskite antrąjį sekos skaičių:");
    let kelintas = +prompt("Įveskite kelintą sekos skaičių norite rasti:");

    alert(kelintas + "-as sekos skaičius yra " + nthNumber(pirmas, antras, kelintas));
}

function nthNumber (a, b, c){
    return a + ((c - 1) * (b - a));
}