window.onload = function() {

    let x = +prompt("Įveskite skaičių");
    let a = +prompt("Įveskite intervalo pradžią");
    let b = +prompt("Įveskite intervalo pabaigą");

    alert(x + " nėra intervale tarp " + a + " ir " + b + ": " + arNeraIntervale(x, a, b));
}

function arNeraIntervale(x, a, b) {
    return x < a || a > b;
}