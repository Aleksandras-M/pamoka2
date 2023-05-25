window.onload = function() {

    let x = +prompt("Įveskite skaičių");
    let a = +prompt("Įveskite intervalo pradžią");
    let b = +prompt("Įveskite intervalo pabaigą");

    arSkaiciusYraIntervaleIsvedimas(x, a, b);
}

function arSkaiciusYraIntervale(x, a, b) {
    return x >= a && x <= b;
}

function arSkaiciusYraIntervaleIsvedimas(x, a, b) {
    if (arSkaiciusYraIntervale(x, a, b) == true) {
        alert(x + " yra intervale tarp " + a + " ir " + b);
    } else {
        alert(x + " nėra intervale tarp " + a + " ir " + b);
    }
}